public class KeypadSequence {
    static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printSequence(String str, int idx, String ans){
        if(idx == str.length()){
            System.out.println(ans);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i<mapping.length(); i++){
            printSequence(str, idx+1, ans + mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printSequence(str,0, "");

    }
}
