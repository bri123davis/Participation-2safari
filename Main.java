import java.util.*;
import java.sql.Timestamp;

public class Main {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        comp1 ca1 = new comp1(101, 700);
        company cb1 = new Comp2(111, 800);
        company cc1 = new Comp3(121, 900);

        String chn;
        String cht;

        do {
            System.out.print("1 Company 1\n2 Company 2\n3 Company 3\n\n Enter Your choice: ");
            chn=scan.nextLine();
            cht=scan.nextLine();
            switch (chn) {
                case "1" -> {
                    System.out.println("This is CampA");
                    company Company = new comp1();
                    System.out.println("Company's interest is: " + Company.interestRate() + "\n" + "The minimum duration is 3years");
                    do{
                        System.out.print("1 Display\n2 Deposit\n3 Withdraw\n4 History\n\n Enter Your choice: ");
                        cht=scan.nextLine();
                        switch (cht){
                            case "1" -> {
                                System.out.println("This is CompA\n");
                                comp1.displayData();
                            }
                            case "2" -> {
                                System.out.println("You are going to deposit\n");
                                Comp2.deposit();
                            }
                            case "3" -> {
                                System.out.println("You are going to withdraw\n");
                                //CampA.withdraw();
                            }
                            case "4" -> {
                                System.out.println("You are going to display history\n");
                               // CampA.displayHistory();
                            }
                        }
                    }while(!cht.equals("0"));
                }
                case "2" -> {
                    System.out.println("This is CampB\n");
                    company Company = new Comp2();
                    System.out.println("Company's interest is: " + Company.interestRate() + "\n" + "The minimum duration is 3years");

                    do{
                        System.out.print("1 Display\n2 Deposit\n3 Withdraw\n4 History\n\n Enter Your choice: ");
                        cht=scan.nextLine();
                        switch (cht){
                            case "1" -> {
                                System.out.println("You are going to display\n");
                                Comp2.displayData();
                            }
                            case "2" -> {
                                System.out.println("You are going to deposit\n");
                                Comp2.deposit();
                            }
                            case "3" -> {
                                System.out.println("You are going to withdraw\n");
                                //CampB.withdraw();
                            }
                            case "4" -> {
                                System.out.println("You are going to display history\n");
                                Comp2.displayHistory();
                            }
                        }
                    }while(!cht.equals("0"));

                }
                case "3" -> {
                    System.out.println("This is CampC\n");
                    company Company = new Comp3();
                    System.out.println("Company's interest is: " + Company.interestRate() + "\n" + "The minimum duration is 3years");

                    do{
                        System.out.print("1 Display\n2 Deposit\n3 Withdraw\n4 History\n\n Enter Your choice: ");
                        cht=scan.nextLine();
                        switch (cht){
                            case "1" -> {
                                System.out.println("You are going to display\n");
                                Comp3.displayData();
                            }
                            case "2" -> {
                                System.out.println("You are going to deposit\n");
                                Comp3.deposit();
                            }
                            case "3" -> {
                                System.out.println("You are going to withdraw\n");
                                //CampC.withdraw();
                            }
                            case "4" -> {
                                System.out.println("You are going to display history\n");
                                Comp3.displayHistory();
                            }
                        }
                    }while(!cht.equals("0"));

                }
            }

        } while (!chn.equals("0"));

    }
    //static public void displayData() {
    //for (CampA campany : CampA.ctList) {
    //System.out.println(CampA);
    // }
    //}
}