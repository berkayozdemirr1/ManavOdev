import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        double ak, ek, dk, mk, pk, toplamTutar, armutKg=2.14, elmaKg=3.67, domatesKg=1.11, muzKg=0.95, patlıcanKg=5.00;

        Scanner armut = new Scanner(System.in);
        System.out.print("Armut Kac Kg: ");
        ak = armut.nextDouble();

        Scanner elma = new Scanner(System.in);
        System.out.print("Elma Kac Kg: ");
        ek = elma.nextDouble();

        Scanner domates = new Scanner(System.in);
        System.out.print("Domates Kac Kg: ");
        dk = domates.nextDouble();

        Scanner muz = new Scanner(System.in);
        System.out.print("Muz Kac Kg: ");
        mk = muz.nextDouble();

        Scanner patlıcan = new Scanner(System.in);
        System.out.print("Patlican Kac Kg: ");
        pk = patlıcan.nextDouble();

        toplamTutar = ((armutKg*ak)+(elmaKg*ek)+(domatesKg*dk)+(muzKg*mk)+(patlıcanKg*pk));
        System.out.println("Odeme Tutari: " + toplamTutar);


    }


}