import java.util.*;

public class Calculator{
    public static void main(String[] args){
        int select,a,b;
        Scanner q=new Scanner(System.in);

        System.out.println("Yapmak istediğinşiz işlemi sayı ile seçiniz    :    ");
        System.out.println("Toplama işlemi için----> 1 ");
        System.out.println("Çıkarma işlemi için----> 2 ");
        System.out.println("Bölme işlemi için----> 3 ");
        System.out.println("Çarpma işlemi için----> 4 ");
    
        select =q.nextInt();
        System.out.print("A sayısı :      ");
        a =q.nextInt();
        System.out.print("B sayısı :      ");
        b =q.nextInt();

        switch(select){
            case 1: 
                System.out.println("Sonuç---> " + (a+b));
                break;


            case 2:  
                System.out.println("Sonuç---> " + (a-b));
                break;
                
                
            case 3:
                System.out.println("Sonuç---> " + (a/b));
                break;


            case 4:
                System.out.println("Sonuç---> " + (a*b));
                break; 
            default:
                System.out.println("Geçersiz bir işlem yaptınız!!!");   
                break;
            
            
        }

        
        }

}
