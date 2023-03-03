import java.util.Scanner;

public class Pratik {
    public static void main(String[] args) {
        //degiskenleri olustur
        int mat,fizik,kimya,turkce,tarih,muzik;

        //scanner sinifini tanimla
        Scanner inp = new Scanner(System.in);

        //kullaniciden degerleri al
        System.out.print("matematik notunuz:");
        mat=inp.nextInt();
        
        System.out.print("fizik notunuz:");
        fizik=inp.nextInt();

        System.out.print("kimya notunuz:");
        kimya=inp.nextInt();

        System.out.print("türkçe notunuz:");
        turkce=inp.nextInt();

        System.out.print("tarih notunuz:");
        tarih=inp.nextInt();

        System.out.print("müzik notunuz:");
        muzik=inp.nextInt();

        int toplam =(mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("ortalamanız: " + sonuc); 

        
        boolean sonucKontrol = (sonuc>=60)? true:false;

        String b1 = (sonucKontrol==true)? "Sınıfı Geçtiniz..":"Sınıfta Kaldınız.." ;
        System.out.println(b1);
        




        
        
        








    


    }

    
}