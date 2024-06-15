package UI;

import java.text.ParseException;
import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctorMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1 Add Available appointment");
            System.out.println("2 My Schedule appointment");
            System.out.println("0. Log out");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response != 0);
    }
    private static void showAvailableAppointmentsMenu() throws ParseException {
        int response = 0;
        do{
            System.out.println("\n");
            System.out.println("::Add available Appointment");
            System.out.println("Select a month");

            for (int i =0; i<3; i++){
                int j = i +1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response < 4){
                // 1,2,3
                int monthselected = response;
                System.out.println(monthselected + " ." + UIMenu.MONTHS[monthselected]);

                System.out.println("Insert the date available: [dd/mm/yyyy");
                String date = sc.nextLine();

                System.out.println("Your date is: " + date + "\n1. correct \n2. Change date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if (response == 2)continue;

                int responseTime = 0;
                String time = "";
                do{
                    System.out.println("Insert the time available for date: " + date + " [16:00]");
                    time = sc.nextLine();
                    System.out.println("Your time is: " + time + "\n1. correct \n2. Change date");
                    responseTime = Integer.valueOf(sc.nextLine());
                }while (responseTime == 2);
                UIMenu.doctorLogged.addAvailableAppointment(date,time);
            }else if(response == 0){
                showDoctorMenu();
            }

        }while(response !=0);
    }
}
