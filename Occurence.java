public class Occurence{
    public static void calcOccurence(String str, char targetChar,int index, int first, int last) {
        if(index == str.length()){
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
            return;
        }
        if(str.charAt(index) == targetChar){
            if(first == -1){
                first = index;
            }
            last = index;
        }
        
        calcOccurence(str, targetChar, index + 1, first, last);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        char targetChar = 'a';
        calcOccurence(str, targetChar,0, -1,-1);
    }
}
