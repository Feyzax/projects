import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double armut=2.14 ,akilo, elma=3.67 ,ekilo, muz=0.95 ,mkilo, domates=1.11,dkilo , patlican=5.00,pkilo, tutar;
        Scanner kg=new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız? : ");
        akilo=kg.nextDouble();
        System.out.print("Kaç kilo elma aldınız? : ");
        ekilo= kg.nextDouble();
        System.out.print("Kaç kilo muz aldınız? : ");
        mkilo =kg.nextDouble();
        System.out.print("Kaç kilo domates aldınız? : ");
        dkilo =kg.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız? : ");
        pkilo =kg.nextDouble();

        tutar=((armut*akilo)+(muz*mkilo)+(domates*dkilo)+(patlican*pkilo)+(elma*ekilo));
        System.out.println("Toplam tutar : " + tutar );



    }
    
}
