package lab2;

import org.apache.hadoop.mapreduce.Reducer;
import org.w3c.dom.*;

import java.io.IOException;
import java.util.Iterator;

public class JoinReducer extends Reducer<TextPair, Text, Text, Text> {
    @Override
    protected void reduce(TextPair key, Iterable<Text> values, Context context) throws IOException, InterruptedException{
        Iterator<Text> iter = values.iterator();
        long count = 0;
        int correntTime;
        int maxTime = Integer.MIN_VALUE;
        int minTime = Integer.MAX_VALUE;
        int sum = 0;
        while (iter.hasNext()){
            String call = iter.next().toString();
            correntTime = Integer.parseInt(call);
            if (correntTime > maxTime)
                maxTime = correntTime;
            if (correntTime < minTime)
                minTime = correntTime;
            sum += correntTime;
            count++;
        }
        if (count != 0){
            context.write(key.getFirst(), new Text(String.join(", ", String.valueOf(minTime), String.valueOf(maxTime), String.valueOf(sum / count))) {
                @Override
                public String getNodeName() {
                    return null;
                }

                @Override
                public String getNodeValue() throws DOMException {
                    return null;
                }

                @Override
                public void setNodeValue(String nodeValue) throws DOMException {

                }

                @Override
                public short getNodeType() {
                    return 0;
                }

                @Override
                public Node getParentNode() {
                    return null;
                }

                @Override
                public NodeList getChildNodes() {
                    return null;
                }

                @Override
                public Node getFirstChild() {
                    return null;
                }

                @Override
                public Node getLastChild() {
                    return null;
                }

                @Override
                public Node getPreviousSibling() {
                    return null;
                }

                @Override
                public Node getNextSibling() {
                    return null;
                }

                @Override
                public NamedNodeMap getAttributes() {
                    return null;
                }

                @Override
                public Document getOwnerDocument() {
                    return null;
                }

                @Override
                public Node insertBefore(Node newChild, Node refChild) throws DOMException {
                    return null;
                }

                @Override
                public Node replaceChild(Node newChild, Node oldChild) throws DOMException {
                    return null;
                }

                @Override
                public Node removeChild(Node oldChild) throws DOMException {
                    return null;
                }

                @Override
                public Node appendChild(Node newChild) throws DOMException {
                    return null;
                }

                @Override
                public boolean hasChildNodes() {
                    return false;
                }

                @Override
                public Node cloneNode(boolean deep) {
                    return null;
                }

                @Override
                public void normalize() {

                }

                @Override
                public boolean isSupported(String feature, String version) {
                    return false;
                }

                @Override
                public String getNamespaceURI() {
                    return null;
                }

                @Override
                public String getPrefix() {
                    return null;
                }

                @Override
                public void setPrefix(String prefix) throws DOMException {

                }

                @Override
                public String getLocalName() {
                    return null;
                }

                @Override
                public boolean hasAttributes() {
                    return false;
                }

                @Override
                public String getBaseURI() {
                    return null;
                }

                @Override
                public short compareDocumentPosition(Node other) throws DOMException {
                    return 0;
                }

                @Override
                public String getTextContent() throws DOMException {
                    return null;
                }

                @Override
                public void setTextContent(String textContent) throws DOMException {

                }

                @Override
                public boolean isSameNode(Node other) {
                    return false;
                }

                @Override
                public String lookupPrefix(String namespaceURI) {
                    return null;
                }

                @Override
                public boolean isDefaultNamespace(String namespaceURI) {
                    return false;
                }

                @Override
                public String lookupNamespaceURI(String prefix) {
                    return null;
                }

                @Override
                public boolean isEqualNode(Node arg) {
                    return false;
                }

                @Override
                public Object getFeature(String feature, String version) {
                    return null;
                }

                @Override
                public Object setUserData(String key, Object data, UserDataHandler handler) {
                    return null;
                }

                @Override
                public Object getUserData(String key) {
                    return null;
                }

                @Override
                public String getData() throws DOMException {
                    return null;
                }

                @Override
                public void setData(String data) throws DOMException {

                }

                @Override
                public int getLength() {
                    return 0;
                }

                @Override
                public String substringData(int offset, int count) throws DOMException {
                    return null;
                }

                @Override
                public void appendData(String arg) throws DOMException {

                }

                @Override
                public void insertData(int offset, String arg) throws DOMException {

                }

                @Override
                public void deleteData(int offset, int count) throws DOMException {

                }

                @Override
                public void replaceData(int offset, int count, String arg) throws DOMException {

                }

                @Override
                public Text splitText(int offset) throws DOMException {
                    return null;
                }

                @Override
                public boolean isElementContentWhitespace() {
                    return false;
                }

                @Override
                public String getWholeText() {
                    return null;
                }

                @Override
                public Text replaceWholeText(String content) throws DOMException {
                    return null;
                }
            });
        }
    }
}
