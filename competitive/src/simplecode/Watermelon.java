package simplecode;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        byte var2 = var1.nextByte();
        var1.close();
        if (var2 > 2 && var2 % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
