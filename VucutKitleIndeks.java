import java.util.Scanner;

public class VucutKitleIndeks {
    
    public static void main(String[] args) {
        double boy, kilo, sonuc;
        

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz : ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz : ");
        kilo = input.nextDouble();

        //formül: kilo/boy*boy

        sonuc = kilo/(boy*boy);
        System.out.print("Vücut kitle indeksiniz : " + sonuc);




        

    }
}
