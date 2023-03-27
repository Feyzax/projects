import java.util.*;

public class Average {
    public static void main(String[] args) {
    
        int a,sum = 0,x = 0;
        Scanner q=new Scanner(System.in);
        System.out.print("Sayı giriniz : ");   
        a =q.nextInt();

        for (int i=1; i <= a; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                sum += i;
                x += 1;
                System.out.println(i);
            }
        } 
        if (x > 0){
            double ort = sum / x;
            System.out.println("Sayıların ortalaması : " + ort );

        }     
    }  
}
