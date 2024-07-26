import java.util.Scanner;

public class Account{
    Scanner scan = new Scanner(System.in);
    int id, phone, balance;
    static int ifsc = 2024;
    String name, email, type, accountNumber;
    static String branchName ="BARODA";
    static int i = 0;

    public void addAccount()
    {
        System.out.println("Enter your name :");
        name = scan.next();
        System.out.println("Enter your email :");
        email = scan.next();
        System.out.println("Enter your phone number :");
        phone = scan.nextInt();
        System.out.println("Enter your account type :");

        System.out.println("""
                            \t1 - current
                            \t2 - saving
                            """);

        int choice=scan.nextInt();

        while(!(choice ==1||choice ==2)){
            System.out.println("Invalid choice! Enter 1 or 2");
            choice = scan.nextInt();
        }

        if(choice==1){
            type = "Current";
        }else {
            type = "Saving";
        }

        id = ++i;
        balance = 0;
        accountNumber = "0MCB"+(int)(24000000+id);

        displayDetails();

        System.out.println("Account created successfully :) ");
    }


    public void displayDetails()
    {
        System.out.println("Details for account number = "+this.accountNumber);
        System.out.println("Account id : "+this.id);
        System.out.println("Name : "+this.name);
        System.out.println("Email : "+this.email);
        System.out.println("Phone : "+this.phone);
        System.out.println("Type : "+this.type);
        System.out.println("Branch : "+branchName);
        System.out.println("IFSC : "+ifsc);
    }

    public void update(){
        System.out.println("Enter new name :");
        name = scan.next();
        System.out.println("Enter new email :");
        email = scan.next();
        System.out.println("Enter new phone number :");
        phone = scan.nextInt();

        System.out.println("Account updated successfully :) ");
        displayDetails();
        System.out.println("***************************************************");

    }

    public void displayBalance(){
        System.out.println("Balance in account number "+this.accountNumber+" = "+this.balance);
    }

    public void credit(){
        System.out.println("Enter the amount you want to credit:");
        int amount=scan.nextInt();
        this.balance += amount;
        System.out.println("Account number : "+this.accountNumber+" credited successfully with amount "+amount);
        displayBalance();
    }

    public void debit(){
        System.out.println("Enter the amount you want to debit:");
        int amount=scan.nextInt();
        if(amount<this.balance){
            this.balance -= amount;
            System.out.println("Account number : "+this.accountNumber+" debited successfully with amount "+amount);
            displayBalance();
        }else{
            System.out.println("Insufficient fund in your account");
        }
    }


}
