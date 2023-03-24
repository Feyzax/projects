import java.util.*;

public class Circle{
    public static void main(String[] args) {
        double pi=3.14,a,r,alan;
        
        //daire diliminin alan formulü=𝜋*(r*r)*a/360
    
        Scanner q=new Scanner(System.in);
        System.out.print("r yarıçapını giriniz----> ");
        r=q.nextDouble();
        System.out.print("a derecesini giriniz----> ");
        a=q.nextDouble();

        alan=(pi*(r*r)*a/360);
        System.out.println("Daire diliminin alanı---->  " + alan);


        
    }
}
