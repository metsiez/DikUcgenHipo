import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input =new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz: ");
        a = input.nextInt();

        System.out.print("2.Kenarı Giriniz: ");
        b = input.nextInt();

        System.out.print("3.Kenarı Griniz: ");
        c = input.nextInt();

        int u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.print("Üçgenin alanı: " + alan);
    }
}