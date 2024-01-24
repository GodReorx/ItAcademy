package Device;

public class Smartphone implements Telephon{
    @Override
    public void callUp() {
        System.out.println("Smartphone calls...");
    }

    public void doPhoto(){
        System.out.println("Smartphone do a photo");
    }
}
