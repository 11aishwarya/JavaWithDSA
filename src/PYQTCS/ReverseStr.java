package PYQTCS;

public class ReverseStr {
    public static void main(String[] args) {
        String str = "abba";
        str = str.toLowerCase();
        for(int i = 0 ;i<str.length()/2;i++){
            char ch = str.charAt(i);
            char e = str.charAt(str.length()-i-1);
            if(ch != e){
                System.out.println("Not pallindrome");
                break;
            }
            else{
                System.out.println("pallindroem");
            }
        }

    }
}
