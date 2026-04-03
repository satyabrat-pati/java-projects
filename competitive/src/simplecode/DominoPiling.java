package simplecode;
import java.util.Scanner;
public class DominoPiling {
    public DominoPiling() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        String var2 = var1.nextLine();
        int var3 = Integer.valueOf(var2.charAt(0)) * Integer.valueOf(var2.charAt(0)) / 2;
        System.out.println(var3);
    }
}
