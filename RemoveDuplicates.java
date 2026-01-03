public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int index, String newStr) {
        if(index == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        if(map[currChar - 'a'] == true) {
            removeDuplicates(str, index + 1, newStr);
        } else {
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, index + 1, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "abbcba";
        removeDuplicates(str, 0,"");

    }
}
