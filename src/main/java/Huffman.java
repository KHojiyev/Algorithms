
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Huffman {
    public static void main(String[] args) {

        String text = " Hello there is code for compress the text";

        TreeMap<Character, Integer> frequencies = countChar(text);

        ArrayList<CodeTreeNode> codeTreeNodes = new ArrayList<>();
        for (Character c : frequencies.keySet()) {
            codeTreeNodes.add(new CodeTreeNode(c, frequencies.get(c)));
        }

        CodeTreeNode treeNode = huffman(codeTreeNodes);

        TreeMap<Character, String> codes = new TreeMap<>();
        for (Character ch : frequencies.keySet()) {
            codes.put(ch, treeNode.getCodeForCharacter(ch, ""));
        }


        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            encoded.append(codes.get(text.charAt(i)));
        }
        System.out.println("pressed: " + encoded.length() + " byte");
        System.out.println("real: " + text.length() * 8 + " byte");
        System.out.println("code: " + encoded);

        String decoded = huffmanDecode(encoded.toString(),treeNode);
        System.out.println("decode: " + decoded);


    }

    private static CodeTreeNode huffman(ArrayList<CodeTreeNode> codeTreeNodes) {
        while (codeTreeNodes.size() > 1) {
            Collections.sort(codeTreeNodes);
            CodeTreeNode left = codeTreeNodes.remove(codeTreeNodes.size() - 1);
            CodeTreeNode right = codeTreeNodes.remove(codeTreeNodes.size() - 1);

            CodeTreeNode parent = new CodeTreeNode(null, left.weight + right.weight, left, right);
            codeTreeNodes.add(parent);


        }
        return codeTreeNodes.get(0);
    }

    private static String huffmanDecode(String encoded, CodeTreeNode treeNode) {

        StringBuilder decoded = new StringBuilder();

        CodeTreeNode node = treeNode;
        for (int i = 0; i < encoded.length(); i++) {
            node = encoded.charAt(i) == '0' ? node.left : node.right;
            if (node.character != null) {
                decoded.append(node.character);
                node = treeNode;
            }


        }
        return decoded.toString();

    }

    private static TreeMap<Character, Integer> countChar(String text) {

        TreeMap<Character, Integer> freqMap = new TreeMap<>();
        for (int i = 0; i < text.length(); i++) {
            Character c = text.charAt(i);
            Integer count = freqMap.get(c);
            freqMap.put(c, count != null ? count + 1 : 1);
        }
        return freqMap;
    }


    private static class CodeTreeNode implements Comparable<CodeTreeNode> {

        Character character;
        int weight;
        CodeTreeNode left;
        CodeTreeNode right;


        @Override
        public int compareTo(CodeTreeNode o) {
            return o.weight - weight;
        }

        public CodeTreeNode(Character character, int weight, CodeTreeNode left, CodeTreeNode right) {
            this.character = character;
            this.weight = weight;
            this.left = left;
            this.right = right;
        }

        public CodeTreeNode(Character character, int weight) {
            this.character = character;
            this.weight = weight;
        }

        public String getCodeForCharacter(Character c, String parentPath) {

            if (character == c) {
                return parentPath;
            } else {
                if (left != null) {
                    String path = left.getCodeForCharacter(c, parentPath + 0);
                    if (path != null) {
                        return path;
                    }
                }
                if (right != null) {
                    String path = right.getCodeForCharacter(c, parentPath + 1);
                    if (path != null) {
                        return path;
                    }
                }
            }
            return null;

        }

    }

}


