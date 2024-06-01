import java.util.Scanner;
public class atm
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Welcome to CODSOFT Bank---");
        System.out.println("Please place your card.");
        System.out.println("Do not remove the card till the end of your transaction.");
        System.out.println("Please enter the 4-digit ATM Pin.");
        System.out.println("_ _ _ _");
        int pin=sc.nextInt();
        int balance=10000,withdraw,deposit;
        
        while(pin!=0)
        {
            System.out.println("The services provided here are: ");
            System.out.println("Press 1 for Withdrawal.");
            System.out.println("Press 2 for Deposit.");
            System.out.println("Press 3 to check Balance.");
            System.out.println("Press 4 to exit.");
            System.out.println("Press the key for the operation you want to perform");
            int ch=sc.nextInt();
            
            while(ch>4 || ch<1)
            {
                System.out.println("Press a valid number please--");
                ch=sc.nextInt();
            }
            
            switch(ch)
            {
                case 1:
                    System.out.println("Choose one option:");
                    System.out.println("1 Fast Cash");
                    System.out.println("2 Withdrawal");
                    int opt=sc.nextInt();
                    
                    while(opt>2 || opt<1)
                    {
                        System.out.println("Choose a valid option please--");
                        opt=sc.nextInt();
                    }
                    
                    if(opt==1)
                    {
                        System.out.println("You can withdraw 1000,2000 or 5000.");
                        System.out.println("Enter 1 for 1000\n2 for 2000\n5 for 5000");
                        int note=sc.nextInt();
                        if(note==1)
                        {
                            if(balance>=1000)
                            {
                            System.out.println("Take out 1000rs cash");
                            balance=balance-1000;
                            }
                            else
                            {
                                System.out.println("Insufficient Balance");
                            }
                        }
                        else if(note==2)
                        {
                            if(balance>=2000)
                            {
                            System.out.println("Take out 2000rs cash");
                            balance=balance-2000;
                            }
                            else
                            {
                                System.out.println("Insufficient Balance");
                            }
                        }
                        else if(note==5)
                        {
                            if(balance>=5000)
                            {
                            System.out.println("Take out 5000rs cash");
                            balance=balance-5000;
                            }
                            else
                            {
                                System.out.println("Insufficient Balance");
                            }
                        }
                        else
                        {
                            System.out.println("Sorry.Selected option was not available.");
                        }
                    }
                    else if(opt==2)
                    {
                        System.out.println("Enter the amount of cash you want to withdraw:");
                        withdraw=sc.nextInt();
                        if(balance>=withdraw)
                        {
                            balance=balance-withdraw;
                            System.out.println("Take the cash.");
                        }
                        else
                        {
                            System.out.println("Insufficient Balance");
                        }
                    }
                    System.out.println("Do you want the balance to be displayed?(Y/N)");
                    char optio=sc.next().charAt(0);
                    if(optio=='Y' || optio=='y')
                    {
                        System.out.println("Balance is Rs."+balance);
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount you want to deposit:");
                    deposit=sc.nextInt();
                    balance=balance+deposit;
                    System.out.println("Please place the cash.");
                    System.out.println("Do you want the balance to be displayed?(Y/N)");
                    char option=sc.next().charAt(0);
                    if(option=='Y' || option=='y')
                    {
                        System.out.println("Balance is Rs."+balance);
                    }
                    break;
                case 3:
                    System.out.println("Balance is Rs."+balance);
                    break;
                case 4:
                    System.out.println("Thanks for visiting.Have a good day!!");
                    System.exit(0);
            }
        }
    }
}
