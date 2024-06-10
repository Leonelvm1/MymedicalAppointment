import Model.Doctor;
import Model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Leonel", "leo@email.com");
        myDoctor.addAvailableAppoitment(new Date(), "4pm");
        myDoctor.addAvailableAppoitment(new Date(), "10am");
        myDoctor.addAvailableAppoitment(new Date(), "1pm");

        System.out.println(myDoctor);

//        for (Model.Doctor.AvailableApoitment aA : myDoctor.getAvailableAppoitment()) {
//            System.out.println(aA.getDate() + " " + aA.getTime());
//        }

         System.out.println();
         System.out.println();

         Patient patient = new Patient("alejandra", "alejandra@mail.com");
         System.out.println(patient);
    }
}
