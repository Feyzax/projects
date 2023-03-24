import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class CinZodyagi{
    public static void main(String[] args) {
        int date,sonuc;
    
        Scanner q=new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz---> ");
        date=q.nextInt();
        sonuc=(date/12);
        
        if((date-(sonuc*12))==0){
            System.out.println("Çin zodyağı burcunuz---> Maymun");
        }
        else if((date-(sonuc*12))==1){
            System.out.println("Çin zodyağı burcunuz---> Horoz");
        }
        else if((date-(sonuc*12))==2){
            System.out.println("Çin zodyağı burcunuz---> Köpek");
        }
        else if((date-(sonuc*12))==3){
            System.out.println("Çin zodyağı burcunuz---> Domuz");
        }
        else if((date-(sonuc*12))==4){
            System.out.println("Çin zodyağı burcunuz---> Fare");
        }
        else if((date-(sonuc*12))==5){    
            System.out.println("Çin zodyağı burcunuz---> Öküz");
        }
        else if((date-(sonuc*12))==6){    
            System.out.println("Çin zodyağı burcunuz---> Kaplan");
        }
        else if((date-(sonuc*12))==7){    
            System.out.println("Çin zodyağı burcunuz---> Tavşan");
        }    
        else if((date-(sonuc*12))==8){
            System.out.println("Çin zodyağı burcunuz---> Ejderha");
        }
        else if((date-(sonuc*12))==9){    
            System.out.println("Çin zodyağı burcunuz---> Yılan");
        }
        else if((date-(sonuc*12))==10){
            System.out.println("Çin zodyağı burcunuz---> At");
        }    
        else if((date-(sonuc*12))==11){
            System.out.println("Çin zodyağı burcunuz---> Koyun");
        }
        else{
            System.out.println("Hatalı giriş yaptınız!!");
        }



       
        

       
        
    }
}
