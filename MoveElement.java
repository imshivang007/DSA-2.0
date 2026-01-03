public class MoveElement {
    public static void moveElementToEnd(String str, char toMove, int index, String left, String right) {
        if(index == str.length()) {
            System.out.println(left + right);
            return;
        }
        if(str.charAt(index) == toMove) {
            right += str.charAt(index);
        } else {
            left += str.charAt(index);
        }
        
        moveElementToEnd(str, toMove, index + 1, left, right);
    }
    public static void main(String[] args) {
        String original = "axbcxxd";
        char toMove = 'x';
        moveElementToEnd(original,toMove, 0, "","");
    }
}
