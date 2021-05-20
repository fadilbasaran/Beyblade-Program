
public class Draciel extends Beyblade{
    
    private String kutsalCanavar;

    public Draciel(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanaar) {//Override ve Türemiş Constuctor
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanaar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı : "+kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+" "+kutsalCanavar+" ortaya çıkarıyor...");
        System.out.println(getBeybladeci()+" ın Savunmsı : Kale Savunması");
    }
    
    
}
