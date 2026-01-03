import java.util.HashSet;
public class UniqueSubsequence {
    public static void calcSubSequences(String str,int idx, String newStr, HashSet<String> set) {
        if(idx == str.length()) {
            if(set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);
        calcSubSequences(str, idx+1, newStr+currChar,set);
        calcSubSequences(str, idx+1, newStr,set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        calcSubSequences(str ,0,"",set);
    }
}
