import java.util.*;

class ArtıkYıl{
    public static void main(String[] args) {
    Scanner w=new Scanner(System.in);
    int n;
    System.out.print("Yıl giriniz---->");
    n=w.nextInt();

    if(n%100==0 && n%400==0){
        System.out.print("Girdiğiniz yıl bir artık yıldır!");
    }else{
        System.out.print("Girdiğiniz yıl artık yıl değildir!");
    }   
    }
}
