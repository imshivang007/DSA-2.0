public class SubSequence {
    public static void calcSubSequences(String str,int idx, String newStr) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        calcSubSequences(str, idx+1, newStr+currChar);
        calcSubSequences(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        String str = "abc";
        calcSubSequences(str ,0,"");
    }
}
