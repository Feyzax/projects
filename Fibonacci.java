import  java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
    Scanner q=new Scanner(System.in);
    System.out.print("Basamak sayısını giriniz :  ");
    int n =q.nextInt();
    
    int i=0,j=1,k=0,m;
    System.out.print(i+" ");
    System.out.print(j+" ");
    while((k+2)<n){
        
        System.out.print((i+j)+" ");
        m=i+j;
        i=j;
        j=m;
        k++;
    }
    }
}

