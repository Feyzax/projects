import java.awt.color.ICC_ColorSpace;
import java.util.*;

public class AdvancedCalculator {
    static int sum(int n1, int n2){
        int result=n1+n2;
        return result;
    }
    static int sub(int n1, int n2){
        int result=n1-n2;
        return result;
    }
    static int mult(int n1, int n2){
        int result=n1*n2;
        return result;
    }
    static double div(double n1, double n2){
        if (n2!=0){
            double result = n1/n2;
            return result;
        }else{
            return 0;
        }     
    }
    static int expo(int n1, int n2){
        int result=1;
        for (int i=1;i<=n2;i++){
            result *=n1;
        }
        return result;
    }
    static int mode(int n1, int n2){
        int result=n1%n2;
        return result;
    }


    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz---->  ");
        int n1= q.nextInt();
        System.out.print("2.Sayıyı giriniz---->  ");
        int n2= q.nextInt();
        System.out.println(
            "          1- Toplama işlemi\n"   +
            "          2- Çıkarma işlemi\n"  +
            "          3- Çarpma işlemi\n"  +
            "          4- Bölme işlemi\n"  +
            "          5- Üslü sayı hesaplama\n" +
            "          6- Faktöriyel hesaplama\n" +
            "          7- Mod alma\n" +
            "          8- Dikdörtgen alan ve çevre hesaplama\n");  
        System.out.print("BİR SEÇENEK SEÇİNİZ----->  "); 
        int selection= q.nextInt();  
        switch (selection){
            case 1:
                System.out.println("TOPLAMA SONUCU--->  " + sum(n1,n2));
                break;
            case 2:
                System.out.println("ÇIKARMA SONUCU--->  " + sub(n1,n2));
                break;
            case 3:
                System.out.println("ÇARPMA SONUCU--->  " + mult(n1,n2));
                break;
            case 4:
                System.out.println("BÖLME SONUCU--->  " + div(n1,n2));
                break;
            case 5:
                System.out.println("ÜS ALMA SONUCU--->  " + expo(n1,n2));
                break;
            case 6:
                System.out.println("MOD ALMA SONUCU--->  " + mode(n1,n2));
                break;
            default:{
                System.out.println("HATALI BİR GİRİŞ YAPTINIZ!!!");
            }    
        }
    }
}
