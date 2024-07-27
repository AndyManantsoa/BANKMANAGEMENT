import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Management man = new Management();
        System.out.println("\n\tWELCOME TO MCB BANK\n");

        int choice, option;
        String number;

        do{
            System.out.println("***************************************************\n");
            System.out.println("""
                        CHOOSE ANY OPTION TO PERFORM:
                        \t1- CREATE ACCOUNT
                        \t2- CHECK ACCOUNT INFORMATION
                        \t3- UPDATE ACCOUNT
                        \t4- DELETE ACCOUNT
                        \t5- VIEW ALL ACCOUNT
                        \t6- TRANSACTION
                        """
            );

            choice= scan.nextInt();

        switch (choice){
            case 1:
                System.out.println("CREATING ACCOUNT: ");
                man.add();
                System.out.println("***************************************************\n");
                break;

            case 2:
                System.out.println("CHECKING ACCOUNT INFORMATION: ");
                System.out.println("Enter the account number : ");
                number = scan.next();
                man.display(number);
                System.out.println("***************************************************\n");
                break;

            case 3:
                System.out.println("UPDATING ACCOUNT: ");
                System.out.println("Enter the account number : ");
                number = scan.next();
                man.update(number);
                System.out.println("***************************************************\n");
                break;

            case 4:
                System.out.println("DELETING ACCOUNT: ");
                man.delete();
                System.out.println("***************************************************\n");
                break;

            case 5:
                System.out.println("DISPLAYING ALL THE ACCOUNTS: ");
                man.display();
                System.out.println("***************************************************\n");
                break;

            case 6:
                System.out.println("TRANSACTION: ");
                System.out.println("Enter the account number : ");
                number = scan.next();
                man.transaction(number);
                System.out.println("***************************************************\n");
                break;

            default:
                System.out.println("Out of range:");
                System.out.println("***************************************************\n");
                break;
            }


        System.out.println(
                    """
                    DO YOU WANT TO PERFORM ANY OTHER OPERATION::
                        \tPress one (1) for YES
                        \tPress two (2) for NO
                    """
        );

        option = scan.nextInt();

        }while(option==1);

        System.out.println("THANKS YOU! SEE YOU AGAIN");
        System.out.println("***************************************************");
        System.out.println("***************************************************\n");

        scan.close();
    }
}
