import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Management man = new Management();
        System.out.println("WELCOME TO MCB BANK\n");

        int choice, option;
        String number;

        do{
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
                break;

            case 2:
                System.out.println("CHECKING ACCOUNT INFORMATION: ");
                System.out.println("Enter the account number : ");
                number = scan.next();
                man.display(number);
                break;

            case 3:
                System.out.println("UPDATING ACCOUNT: ");
                System.out.println("Enter the account number : ");
                number = scan.next();
                man.update(number);
                break;

            case 4:

                break;

            case 5:
                System.out.println("DISPLAYING ALL THE ACCOUNTS: ");
                man.display();
                break;

            case 6:
                System.out.println("TRANSACTION: ");
                System.out.println("Enter the account number : ");
                number = scan.next();
                man.transaction(number);
                break;

            default:
                System.out.println("Out of range:");
                break;
            }


        System.out.println(
                    """
                    DO YOU WANT TO PERFORM ANY OTHER INFORMATION:
                        \tPress one (1) for YES
                        \tPress two (2) for NO
                    """
        );

        option = scan.nextInt();

        }while(option==1);

        System.out.println("THANK YOU! SEE YOU AGAIN");
        scan.close();
    }
}