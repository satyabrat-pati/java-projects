package basics.thingstoknow;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int num;
        System.out.print("Enter num --> ");
        num=sc.nextInt();
        System.out.print(num);
    }
}
