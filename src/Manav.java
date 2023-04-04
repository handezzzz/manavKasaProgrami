import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00;
        double toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        int kilo1 = input.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        int kilo2 = input.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        int kilo3 = input.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        int kilo4 = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        int kilo5 = input.nextInt();

        toplam = (armut * kilo1) + (elma * kilo2) + (domates * kilo3) + (muz * kilo4) + (patlıcan * kilo5);
        System.out.println("Toplam Tutar : " + toplam);

    }
}
