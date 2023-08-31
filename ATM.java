import java.util.Scanner;
class userBank{
       public int pin=2003;
        int balance=300;
    public void checkpin()
    {
        System.out.println("Enter Your Pin");
        int p = sc.nextInt();
        if(p==pin) {
            menu();
        }

        else { System.out.println("Wrong Pin");
                System.out.println("Enter Correct Pin to continue Transactions");
                checkpin();
        }

    }
           Scanner sc=new Scanner(System.in);
            void checkBalance()
            { System.out.println("Account Balance="+balance); }
            void withdraw()
            {
                System.out.println("Enter the amount to be withdrawn");
                int a=sc.nextInt();
                if(a>balance)
                    System.out.println("Insufficient Balance");
                else
                {
                    balance=balance-a;
                    System.out.println("Amount Withdrawn Successfully");
                }
                checkBalance();

            }
            void deposit()
            {
                System.out.println("Enter the amount to be deposited");
                int a=sc.nextInt();
                balance=balance+a;
                checkBalance();
            }

    public void menu()
    {   System.out.println("Welcome To RJ Bank ATM");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw Amount");
        System.out.println("3.Deposit Amount");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
        int ch;
        ch=sc.nextInt();
            if (ch == 1) {
                checkBalance();
                menu();
            } else if (ch == 2) {
                withdraw( );
                menu();
            } else if (ch == 3) {
                deposit( );
                menu();
            } else if (ch==4)
                return;
                else {
                    System.out.println("Enter a Valid choice");
                    menu();
                }
    }

        }

        public class ATM {
            public static void main(String[] args) {
                System.out.println("This project is made by Rakesh Jha");
                Scanner sc = new Scanner(System.in);
                userBank a = new userBank();
                a.checkpin();
            }
        }












