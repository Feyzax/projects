import java.util.Scanner;
public class OkekObeb{
    public static void main(String[] args) {
        int x,y,i,ebob=1,ekok=1;
        Scanner q = new Scanner(System.in);
        System.out.print("X SAYISINI GİRİNİZ :  ");
        x=q.nextInt();
        System.out.print("Y SAYISINI GİRİNİZ :  ");
        y=q.nextInt();
        if (x<y){
            i=x;
            while (i>=1){
                if((x%i==0)&&(y%i==0)){
                    ebob = i;
                    break;
                }
                i--;
            }
        }else if (y<x){
            i=y;
            while (i>=1){
                if ((x%i==0)&&(y%i==0)){
                    ebob = i;
                    break;
                }
                i--;
            }
        }
        i=1;
        while (i<=x*y){
            if((i%x==0)&&(i%y==0)){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("EBOB : " + ebob);
        System.out.println("EKOK : " + ekok);
    }
}
