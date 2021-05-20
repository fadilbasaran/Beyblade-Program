
import java.util.Scanner;


public class Test {
    
    public static void main(String[] args) {
        
        //Polymorphism Kullanırak Beyblade Programı
        
        System.out.println("Beyblade Programına Hoş Geldiniz...");
        
        System.out.println("Çıkış için q'ya basın...");
        
        Scanner scanner=new Scanner(System.in);
        
        
        while (true) {            
            System.out.println("Hangi Beyblade'ı üretmek istiyorsunuz ?");
            String islem=scanner.nextLine();
            
            if (islem.equals("q")) {
                System.err.println("Programdan Çıkılıyor...");
                break;
            }
            
            else{
                
                BeybladeFabrikasi fabrika=new BeybladeFabrikasi();
                
                Beyblade beyblade= fabrika.beybladeUret(islem);//new kullanıyor metotta
                /*Hangisine dönersek ona göre davranacak buna çok biçimlilik denir*/
                
                if (beyblade==null) {
                    
                    System.out.println("Lütfen geçerli bir beyblade ismi girin...");
                }
                
                else{
                    beyblade.bilgileriGoster();//Override
                    beyblade.saldir();//Override edilmediği için Beyblade içindenden çalışılacak.
                    beyblade.kutsalCanavarOrtayaCikar();//Override
                }
            }
        }
        
    }
    
}
