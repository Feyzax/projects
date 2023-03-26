import java.util.*;

public class Four{
    public static void main(String[] args) {
    
    int n,sum = 0;
    Scanner q=new Scanner(System.in);   
    
    do{
       System.out.print("Sayı giriniz : "); 
       n = q.nextInt();
       if ( n % 4 == 0){
        sum += n;
       }
    }while (n % 2 == 0);
        System.out.println("toplam : " + sum);
        
    }
}
