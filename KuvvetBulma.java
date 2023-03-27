import java.util.*;

class KuvvetBulma{
    public static void main (String[] args) {
    Scanner q=new Scanner(System.in);
    int n;
    System.out.print("Sınır sayıyı giriniz : ");
    n=q.nextInt();

        for(int i=1; i<=n; i++){
            if((i%4==0)&&(i%5==0)){
            System.out.println(i);
            }else{
                System.out.println("Geçersiz sayı girdiniz!!");
            }break;
        }        
    }
}
