import java.util.*;

class ExponentialNumber{
    public static void main(String[] args) {
    Scanner q=new Scanner(System.in);
    int n,x;
    System.out.print("Üssü alınacak sayıyı giriniz---> ");
    n=q.nextInt();
    System.out.print("Üs olacak sayıyı giriniz---> ");  
    x=q.nextInt();
    int sum=1;

    for(int i=1; i<=x; i++){
        sum*=n;
        }
        System.out.print("Sonuç---> " + sum);
    }
}
