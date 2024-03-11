import java.util.Scanner;

public class InFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        boolean pertenceAFibonacci = verifyIfInFiboancci(n);
        System.out.println(pertenceAFibonacci);

    }

    private static boolean verifyIfInFiboancci(int n) {
        int last = 0;
        int current = 1;
        while(current < n){
            int next = last + current;
            last = current;
            current = next;
        }

        return current == n;
    }
}
