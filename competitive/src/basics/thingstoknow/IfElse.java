package basics.thingstoknow;

import java.util.Scanner;

/*
Given marks of a student, print on the screen:

Grade A if marks >= 90
Grade B if marks >= 70
Grade C if marks >= 50
Grade D if marks < 50
Fail, otherwise.
*/
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Student --> ");
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println('A');
        } else if (marks>=80) {
            System.out.println('B');
        } else if (marks>=70) {
            System.out.println('C');
        } else {
            System.out.println('D');
        }
    }
}
