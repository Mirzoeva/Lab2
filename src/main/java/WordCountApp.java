import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;
import java.util.StringTokenizer;

public class WordCountApp {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.err.println("Usage: WordCountApp <input path> <output path>");
            System.exit(-1);
        }
        Job job = Job.getInstance();
        job.setJarByClass(WordCountApp.class);
        job.setJobName("Word count");
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        job.setMapperClass(WordMapper.class);
        job.setReducerClass(WordReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        job.setNumReduceTasks(2);
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }

    public static class WordReducer extends Reducer<Text, IntWritable, Text, LongWritable> {

        private LongWritable result = new LongWritable();

        @Override
        protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws
                IOException, InterruptedException {
            int count = 0;
            for (IntWritable value : values){
                count += value.get();
            }
            result.set(count);
            context.write(key, result);
        }
    }

    public static class WordMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

        private final static IntWritable one = new IntWritable(1);
        private Text word = new Text();

        @Override
        protected void map(LongWritable key, Text value, Context context) throws IOException,
                InterruptedException {
            StringTokenizer tokens = new StringTokenizer(value.toString().replaceAll("[^а-яА-Яa-zA-Z0-9\\s+]", "").toLowerCase());
            while (tokens.hasMoreTokens()) {
                word.set(tokens.nextToken());
                context.write(word, one);
            }
        }
    }
}