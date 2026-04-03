package simplecode;
import java.util.Scanner;

public class LongWords {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        int var2 = var1.nextInt();
        String[] var3 = new String[var2];

        for(int var4 = 0; var4 < var2; ++var4) {
            var3[var4] = var1.next();
            int var5 = var3[var4].length();
            if (var3[var4].length() > 10) {
                String var6 = "";
                var6 = var3[var4].charAt(0) + Integer.toString(var5 - 2) + var3[var4].charAt(var5 - 1);
                var3[var4] = var6;
            }

            var1.nextLine();
        }

        for(String var7 : var3) {
            System.out.println(var7);
        }

        var1.close();
    }
}
