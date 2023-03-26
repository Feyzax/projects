import java.util.*;

public class Average {
    public static void main(String[] args) {
    
        int a;
        Scanner q=new Scanner(System.in);
        System.out.print("Sayı giriniz : ");   
        a =q.nextInt();

        for (int i=1; i <= a; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }      
    }  
}
