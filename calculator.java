import java.util.*;
public class calculator{
  //main begins
    public static void main(String []args){
      //scanner object created to take user input
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        double a = sc.nextDouble();//first number
        double b = sc.nextDouble();//second number
        System.out.println("Enter a choice \nAddition: 1 \nSubtraction: 2 \nMultiplication: 3 \nDivision: 4");//operations that can be performed
        int c = sc.nextInt();
        if(c ==1)
          System.out.println(a+b);
        else if(c==2)
          System.out.println(a-b);
        else if(c==3)
          System.out.println(a*b);
        else if(c==4)
          System.out.println(a/b);
        else
          System.out.println("WRONG CHOICE");//for wrong submission of choice

    }//main closes
}