import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println(reversedS(s));
    }

    private static String reversedS(String s) {
        String newS = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            newS += s.charAt(i);
            
        }
        return newS;
    }

}
