package Recursion;

public class Substr {
    public static void main(String[] args) {
//       String str = "bcaadef";
//       skip("",str);
        System.out.println(skip2("aabcdesaaa"));
        System.out.println(skipapple("abcappleef"));
        System.out.println(skipappnotapple(" appleappcdesf"));
    }

    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }

    public static String skip2(String up) {
        if (up.isEmpty()) {
            //System.out.println(p);
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip2(up.substring(1));
        } else {
            return ch + skip2(up.substring(1));
        }
    }

    public static String skipapple(String up) {
        if (up.isEmpty()) {
            //System.out.println(p);
            return "";
        }
       // char ch = up.charAt(0);
        if (up.startsWith("apple")) {
            return skipapple(up.substring(5));
        } else {
            return up.charAt(0) + skipapple(up.substring(1));
        }
    }
    public static String skipappnotapple(String up) {
        if (up.isEmpty()) {
            //System.out.println(p);
            return "";
        }
        // char ch = up.charAt(0);
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipappnotapple(up.substring(3));
        } else {
            return up.charAt(0) + skipappnotapple(up.substring(1));
        }
    }
}
