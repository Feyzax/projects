import java.util.*;

class FlightTicket{
    public static void main(String[] args) {
    Scanner fly=new Scanner(System.in);
    int yas,tip;
    double km,ticket;

    System.out.print("Mesafeyi km türünden giriniz---->");
    km=fly.nextDouble();
    System.out.print("Yaşınızı giriniz---->");
    yas=fly.nextInt();
    System.out.println("Yolculuk tipinizi giriniz :\n1->Tek Yön\n2->Gidiş Dönüş");
    tip=fly.nextInt();
    ticket=km*0.10;

    
        if(km>0&&yas>=0){
            if(tip==1||tip==2){
                if(tip==1){
                    if(yas<12){
                        ticket=ticket-ticket*0.5;
                    } else if(yas<12&&yas<24){
                        ticket=ticket-ticket*0.1;
                    } else if(yas>65){
                        ticket=ticket-ticket*0.3;
                    }
                }else{
                    if(yas<12){
                        ticket=(ticket-ticket*0.5)-((ticket-ticket*0.5)*0.2);
                    }else if(yas<12&&yas<24){
                        ticket=(ticket-ticket*0.1)-((ticket-ticket*0.1)*0.2);
                    } else if(yas>=24&&yas<=65){
                        ticket=ticket-(ticket*0.2);
                    } else if(yas>65){
                        ticket=(ticket-ticket*0.3)-((ticket-ticket*0.3)*0.2);
                    }
                }
            }else{
                System.out.println("Hatalı yolculuk tipi girdiniz.");
            }
        }else{
            System.out.println("Hatalı bilgi girdiniz.");
        }
        System.out.println("Bilet fiyatınız :  "+ticket+"TL");
    }
}
