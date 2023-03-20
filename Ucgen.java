import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        int a, b, c, u;
        double x;
        //formül: 2u =üçgenin çevresi  u=(a+b+c)/2 ----------- alan= u*(u-a)*(u-b)*(u-c)  

        Scanner sayi=new Scanner(System.in);
        System.out.print("Üçgenin a kenarını giriniz : ");
        a = sayi.nextInt();
        System.out.print("Üçgenin b kenarını giriniz : ");
        b = sayi.nextInt();
        System.out.print("Üçgenin c kenarını giriniz : ");
        c = sayi.nextInt();

        u = (a+b+c)/2;
        System.out.println("Üçgenin çevresi : " + u );

       
        x = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı : " + x ); 

        
    }
    
}
