import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TrieImplementation {

    public static void main(String arg[]) {
        Trie t = new Trie();
       t.insertString("tims");
       t.insertString("timtocat");
       t.insertString("ti");
      
       
     //System.out.println(t.root.children.get('t').children.get('i').children.get('m').endOfString);
      System.out.println(t.searchStringinTrie("timtoca"));
     
       // System.out.println(t.root.children.get('t').children.get('i').children.get('m').children.get('s').endOfString);

    }


}

class Trie {
    TrieNode root;

    public Trie() {
        this.root = new TrieNode();
        this.root.children = new HashMap<>();
        this.root.endOfString = false;
        System.out.println("Trie created successfully");
    }

    public void deleteString(String word) {  // left this one to do later to progress fast.
        boolean isExist = searchStringinTrie(word);
       int wordLen=word.length();
        if(isExist)
        {



        }
        else{
            System.out.println("The string does not exist so cannot be deleted");
        }

    }

    public boolean searchStringinTrie(String s) {
        int slen = s.length();
        TrieNode t = root;
        Set<Character> sc = new HashSet<>();
        sc = t.children.keySet();
        if (sc.contains(s.charAt(0))) {
            for (int i = 0; i <= slen - 1; i++) {
                if (t.children.get(s.charAt(i)) != null) {
                    t = t.children.get(s.charAt(i));

                }
            }
            if (t.endOfString == true) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }

    public void insertString(String s) throws IndexOutOfBoundsException {
        int wordLen = s.length();

        if (wordLen == 0) {
            System.out.println("Please enter a string to insert");
        } else {
            TrieNode t = root;
            for (int i = 0; i <wordLen; i++) {
                TrieNode newNode = new TrieNode();
                //System.out.println(s.charAt(i));
                TrieNode test=t.children.get(s.charAt(i));
                if ( test== null) {
                    t.children.put(s.charAt(i), newNode);
                }
                t = t.children.get(s.charAt(i));

            }
            t.endOfString=true;
            System.out.println("String inserted successfully");
        }
    }

class TrieNode {
    HashMap<Character, TrieNode> children;
    boolean endOfString;

    public TrieNode() {
        this.children = new HashMap<>();
        this.endOfString = false;
    }

}
}