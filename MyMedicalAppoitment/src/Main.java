import Model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Leonel", "leo@email.com");
        myDoctor.addAvailableAppoitment(new Date(), "4pm");
        myDoctor.addAvailableAppoitment(new Date(), "10am");
        myDoctor.addAvailableAppoitment(new Date(), "1pm");

        System.out.println(myDoctor);
        User user = new Doctor("Leonel", "leo@gmail.com");
        user.showDataUser();
        User user1 = new User("leo","leo@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospita Cruz verde");
                System.out.println("Departamento: Pediatría");
            }
        };
        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };


//        for (Model.Doctor.AvailableApoitment aA : myDoctor.getAvailableAppoitment()) {
//            System.out.println(aA.getDate() + " " + aA.getTime());
//        }

         System.out.println();
         System.out.println();

         Patient patient = new Patient("alejandra", "alejandra@mail.com");
         System.out.println(patient);
    }
}
