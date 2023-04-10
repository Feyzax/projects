import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int limit,minN,maxN,number;
        Scanner q= new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz ?  : " );
        limit= q.nextInt();

        System.out.println("1. sayıyı giriniz---> ");
        number= q.nextInt();
        minN=number;
        maxN=number;

        for (int i =1 ;i < limit ;i++ ){
            System.out.println(i+1 + ". sayıyı giriniz---> ");
            number= q.nextInt();

            if(number < minN){
                minN=number;
            }else if (number > maxN){
                maxN=number;
            }

        }
        System.out.println("En büyük sayı---> " + maxN);
        System.out.println("En küçük sayı---> " + minN);

    }
}


