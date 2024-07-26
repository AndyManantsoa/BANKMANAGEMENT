import java.util.Scanner;


public class Management{
    Scanner scan = new Scanner(System.in);
    Account [] accounts = new Account[100];
    Account temp = new Account();
    int i=0;


    public Account validation(String number){
        for(int a=0; a<i; a++)
        {
            if(accounts[a].accountNumber.equals(number))
            {
                return accounts[a];
            }
        }
        return null;
    }

    public void add()
    {
        Account newAccount = new Account();
        newAccount.addAccount();
        accounts[i++] = newAccount;
    }

    public void display(String number)
    {
        Account temp = validation(number);
        if(temp!=null){
            temp.displayDetails();
        }else{
            System.out.println("Account not found\n");
        }

    }

    public void display(){
        if(i==0){
            System.out.println("There is no account registered");
        }
        for(int x =0 ; x<i;x++){
            System.out.println("Account "+(x+1)+": ");
            accounts[x].displayDetails();
            System.out.println();
        }
    }

    public void update(String number){
        Account temp = validation(number);
        if(temp!=null){
            temp.update();
        }else{
            System.out.println("Account not found\n");
        }
    }


    public void delete()
    {
        System.out.println("Enter the number of the account to delete \n");
        String number = scan.next();
        int temp=0;
        for(int a=0; a<i; a++){
            if(accounts[a].accountNumber.equals(number))
            {
                temp=1;
            }
            accounts[a]=accounts[a+temp];;
        }
        if(temp==0) {
            System.out.println("Account not found");
        }
        else{
            i--;
            System.out.println("Account deleted successfully");
        }

    }



    public void transaction(String number){
        Account temp = validation(number);
        if(temp!=null){
            temp.displayDetails();
            System.out.println(
                    """
                    Enter the type of transaction:\
                    \t1- Credit
                    \t2- Debit
                    \t3- View balance
                    """);
            int trans= scan.nextInt();

            while(!(trans ==1|| trans ==2|| trans ==3)){
                System.out.println("Invalid choice! Enter 1 or 2 or 3");
                trans = scan.nextInt();
            }

            if(trans == 1){
                temp.credit();
            }else if(trans ==2){
                temp.debit();
            }else{
                temp.displayBalance();
            }
        }else{
            System.out.println("Account not found\n");
        }

    }
}
