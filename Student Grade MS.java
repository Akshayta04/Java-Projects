import java.util.*;
class report {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];//initialialized array with 3 length
        int a = 0;//total marks
        System.out.println("Enter student name");
        String name = sc.nextLine();
        System.out.println("Enter the marks of 3 subjects of the student");
        for(int i = 0; i<3; i++){
            marks[i]= sc.nextInt();
            a+= marks[i];
        }
        System.out.println(name);
        double avg = a/3.0;// average calculated in decimals
        System.out.println("Average marks: "+ avg);
        if(avg>79.00){
            System.out.println("Grade: A");
        }
        else if(avg<80.00 && avg>59.00){
            System.out.println("Grade: B");
        }
        else if(avg<60.00 && avg>39.00){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Grade: FAIL");
        }

    }
}