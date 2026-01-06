public class TrieDataStructure {

    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0;i<children.length;i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level=0;level<word.length();level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    //Search operation
    public static boolean search(String key){
        Node curr = root;
        for(int level=0;level<key.length();level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    //Word break problem
    public static boolean wordBreak(String s){
        if(search(s)){
            return true;
        }
        for(int i=1;i<s.length();i++){
            String first = s.substring(0,i);
            String second = s.substring(i);
            if(search(first) && wordBreak(second)){
                return true;
            }
        }
        return false;
    }

    //Start with problem
    public static boolean startWith(String prefix){
        Node curr = root;
        for(int level=0;level<prefix.length();level++){
            int idx = prefix.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    //Count unique substrings
    public static int countUniqueSubstrings(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            String suffix = s.substring(i);
            Node curr = root;
            for(int level=0;level<suffix.length();level++){
                int idx = suffix.charAt(level) - 'a';
                if(curr.children[idx] == null){
                    count++;
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx];
            }
        }        
        return count;
    }

    //Longest word with all prefixes present
    public static String longestWord(String words[]){
        String longestWord = "";
        for(int i=0;i<words.length;i++){
            String word = words[i];
            insert(word);
        }
        for(int i=0;i<words.length;i++){
            String word = words[i];
            boolean allPrefixPresent = true;
            for(int j=0;j<word.length();j++){
                String prefix = word.substring(0,j+1);
                if(!search(prefix)){
                    allPrefixPresent = false;
                    break;
                }
            }
            if(allPrefixPresent){
                if(word.length() > longestWord.length()){
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }



    public static void main(String[] args){
        String words[] = {"the","a","there","their","any"};

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        String key = "the";
        if(search(key)){
            System.out.println("Key is present");
        }
        else{
            System.out.println("Key is not present");
        }

        String s = "thereany";
        if(wordBreak(s)){
            System.out.println("Word break possible");
        }
        else{
            System.out.println("Word break not possible");
        }

        String prefix = "the";
        if(startWith(prefix)){
            System.out.println("Prefix is present");
        }
        else{
            System.out.println("Prefix is not present");
        }

        String str = "ababa";
        System.out.println("Count of unique substrings: " + countUniqueSubstrings(str));


        String words1[] = {"a","banana","app","appl","ap","apply","apple"};
        String longestWord = longestWord(words1);
        System.out.println("Longest word with all prefixes present: " + longestWord);
    

    }

}