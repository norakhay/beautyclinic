import model.Patient;
import model.Appointment;
import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {
        
        Patient nora = new Patient("9001", "Nora aaa", "nora@gmail.com", "000000000");

       
        Appointment app1 = new Appointment(nora, "Laser Skin Treatment", LocalDateTime.now(), 150.0);
        
        
        app1.displayReceipt();
        System.out.println(nora.toString());

        
        System.out.println("\nAttempting to use points for a discount...");
        nora.redeemPoints(10);
    }
}
