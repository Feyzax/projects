import java.util.*;

public class Heat{
    public static void main(String[] args) {
    int K;

    Scanner q=new Scanner(System.in);
    System.out.print("Sıcaklık derecesini giriniz----> ");
    K=q.nextInt();

    if(K<5){
        System.out.println("Kayak yapabilirsiniz.");
    }
    else if(5<=K && K<=15){
        System.out.println("Sinema izleyebilirsiniz.");
    }
    else if(15<K && K<=25){
        System.out.println("Piknik yapabilirsiniz.");
    }
    else if(25<K){
        System.out.println("Yüzme yapabilirsiniz.");
    }
    else{
        System.out.println("Geçersiz sıcaklık girdiniz!!");
    }



}   
    }
