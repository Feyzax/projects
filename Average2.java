import java.util.*;

class Average2{
    public static void main(String[] args) {
        Scanner w=new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        double sum=0;

        System.out.print("Matematik notunuz : ");
        mat=w.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik=w.nextInt();
        System.out.print("Turkce notunuz : ");
        turkce=w.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya=w.nextInt();
        System.out.print("Müzik notunuz : ");
        muzik=w.nextInt();

        if((mat<0) || (mat > 100)){
            System.out.println("Hatalı bir not girdiniz matematik notunuz ortalamaya dahil olmayacak!");
        }else{
            sum += mat;
        }
        if((fizik<0) || (fizik > 100)){
            System.out.println("Hatalı bir not girdiniz fizik notunuz ortalamaya dahil olmayacak!");
        }else{
            sum += fizik;
        }
        if((turkce<0) || (turkce > 100)){
            System.out.println("Hatalı bir not girdiniz türkçe notunuz ortalamaya dahil olmayacak!");
        }else{
            sum += turkce;
        }
        if((kimya<0) || (kimya > 100)){
            System.out.println("Hatalı bir not girdiniz kimya notunuz ortalamaya dahil olmayacak!");
        }else{
            sum += kimya;
        }
        if((muzik<0) || (muzik > 100)){
            System.out.println("Hatalı bir not girdiniz müzik notunuz ortalamaya dahil olmayacak!");
        }else{
            sum += muzik;
        }

        double average = (mat+fizik+turkce+kimya+muzik)/5;
        System.out.println("Ortalamanız : " + average);

        if(average <= 55){
            System.out.print("Sınıfta kaldınız!!geçmiş olsun..");
        }else{
            System.out.print("Sınıfı geçtiniz!");
        }
    }
}
