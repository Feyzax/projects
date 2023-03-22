import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        int degisim;
        String userName,password,passwordTwo;

        Scanner input=new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("sosiaynoid") && password.equals("000555")){
            System.out.print("Giriş başarılı!");
        }   
            else if (userName.equals("sosiaynoid") && !password.equals("271201")){
            System.out.print("Bilgileriniz hatalı!");
            System.out.println("\nŞifrenizi sıfırlamak ister misiniz? \nistiyorsanız-->1 \nistemiyorsanız-->2");

            degisim =input.nextInt();

        switch(degisim){
            case 1: 
                System.out.print("Yeni şifrenizi giriniz :   ");
                passwordTwo = input.nextLine();
                if(passwordTwo.equals(password) || passwordTwo.equals("271201")){
                    System.out.print("Şifreniz oluşturulamadı tekrar deneyiniz!!");
                }else{
                    System.out.print("\nŞifreniz başarıyla oluşturuldu");
                }
                break;
            case 2:
                System.out.print("İşleminiz sonlandırıldı!");
                break;
                default:
                    System.out.print("Kullanıcı adı veya şifreyi hatalı girdiniz!\ntekrar deneyiniz..");
                
                
        }   

            

        }  
        

    }
    
}
