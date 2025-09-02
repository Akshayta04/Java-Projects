import java.util.*;
class atm{
    //create a scanner object for input from the user
    static Scanner sc = new Scanner(System.in);
    //variable to store balance in the account
    static double a = 0.0;
    //method to check the balance
    public static void chkbal(){
        System.out.println(a);
    }
    //method tp deposit money into the account
    public static void depamt(){
        System.out.println("Enter the amount to be deposited");
        double amt= sc.nextDouble();
        //new total amount
        a = a+amt;
        System.out.println("Total Amount: "+a);
    }
    //method to withdraw from the account
    public static void witamt(){
        System.out.println("Enter the amount to be withdrawn");
        double amt = sc.nextDouble();
        //check for sufficient funds
        if (a<=0.00){
            System.out.println("Insufficient Balance");
        }
        else{
            a= a-amt;
            System.out.println("Total Amount: "+a);
        }
          
    }
    public static void main (String []args){
        System.out.println("Enter total amount");
        a= sc.nextDouble();
        //display options
        System.out.println("Enter a choice: \n1 for Check Balance \n2 for Deposit Amount \n3 for Withdraw Amount \n4 for Exit");
        int c = sc.nextInt();
        if(c == 1){
            chkbal();
        }
        else if(c == 2){
            depamt();
        }
        else if(c == 3){
            witamt();
        }
        else if(c == 4){
            System.exit(0);
        }
    }
}