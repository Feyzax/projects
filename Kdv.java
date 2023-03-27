import java.util.Scanner;
class Kdv{
    public static void main(String[] args) {
        double tutar,kdvOran ,kdvliTutar, kdvTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("ücret tutarını giriniz : ");
        tutar = input.nextDouble();
        kdvOran=(tutar>1000)?  8 : 18;

        kdvTutar = tutar * (kdvOran/100);
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz tutar : " + tutar);
        System.out.println("KDV Oranı : %" + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li tutar : " + kdvliTutar);
            
        }
    }
