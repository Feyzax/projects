import java.util.*;

public class Diamond{
    public static void main(String[] args) {
    Scanner q=new Scanner(System.in);
    System.out.print("Basamak sayısını giriniz :  ");
    int n =q.nextInt();
  
    for(int k=1;k<=n;k++){
        for(int i=(n-k); i>=1;i--){
            System.out.print(" ");
            
        }
        for(int j=1;j<=(k*2)-1;j++){
            System.out.print("@");
        }
        System.out.println("");
    }for(int k=(n-1);k>=1;k--){
        for(int i=1; i<=(n-k);i++){
            System.out.print(" ");
            
        }
        for(int j=(k*2)-1;j>=1;j--){
            System.out.print("@");
        }
        System.out.println("");
    }
    }
}
