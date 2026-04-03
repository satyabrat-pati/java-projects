package simplecode;

import java.util.Scanner;

public class Team {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        int var2 = var1.nextInt();
        int var3 = 0;
        String[] var4 = new String[var2];

        for(int var5 = 0; var5 < var2; ++var5) {
            var4[var5] = var1.nextLine();
            var1.nextLine();
        }

        for(int var8 = 0; var8 < var2; ++var8) {
            int var6 = 0;

            for(int var7 = 0; var7 < var4[var8].length(); ++var7) {
                if (var4[var8].charAt(var7) == '1') {
                    ++var6;
                }
            }

            if (var6 > 1) {
                ++var3;
            }
        }

        System.out.println(var3);
        var1.close();
    }
}
