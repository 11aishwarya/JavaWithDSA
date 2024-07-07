package PYQTCS;

public class CountVowelCS {
    public static void main(String[] args) {
        String str = "I am awesome";
        str = str.toLowerCase();
        int vouwelCount = 0,Consonentcount = 0, whiitespacecount = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == 'a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||
            str.charAt(i) == 'u'){
                vouwelCount++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                Consonentcount++;
            }
            else if(str.charAt(i) == ' '){
                whiitespacecount++;
            }
        }
        System.out.println(vouwelCount + " " + Consonentcount + " " + whiitespacecount);
    }
}
