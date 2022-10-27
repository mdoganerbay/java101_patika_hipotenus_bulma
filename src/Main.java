import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a,b,c;
        double u,hipo,cevre,alan;

        Scanner girdi = new Scanner(System.in);
        System.out.print("lutfen a degerını gırınız: ");
        a = girdi.nextInt();
        System.out.print("lutfen b degerını gırınız: ");
        b = girdi.nextInt();
        System.out.print("lutfen c degerını gırınız: ");
        c = girdi.nextInt();

        u =  (a + b + c) / 2;

        cevre = u*2;
        alan = (u-a)* (u-b) * (u-c);
        hipo = Math.sqrt((a*a) +(b*b));

        System.out.println("hıpotenus : "+ hipo);
        System.out.println("cevresı : "+ cevre);
        System.out.println("alanı : "+ alan);

    }
}