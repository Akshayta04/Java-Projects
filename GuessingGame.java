import java.util.*;
public class GuessingGame{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();// random oblect created to generate random numbers
        int goal = r.nextInt(100)+1;//generates a random number between 1 and 100
        int c = 0;//counter created
        System.out.println("Guess the number");
        while(true){//loop runs till goal is achieved
            int n = sc.nextInt();
            if (n>goal){
                System.out.println("Too High");
                c+=1;
                System.out.println("Attempts: "+c);
            }
            else if(n<goal){
                System.out.println("Too Low");
                c+=1;
                System.out.println("Attempts: "+c);
            }
            else if(n==goal){
                System.out.println("Correct");
                c+=1;
                System.out.println("Attempts: "+c);
                System.exit(0);//exit
            }
        }
    }
}