import java.util.*;
public class LoginSystem{
    public  static void main (String []args){
        Scanner sc =new Scanner(System.in);
        //inputting dummy keys and values
        Map<String, String> credentials = new HashMap<>();
        credentials.put("user", "user123");
        credentials.put("admin", "admin123");
        System.out.println("Enter User ID");
        String userid = sc.nextLine();
        System.out.println("Enter Password");
        String password = sc.nextLine();
        if(credentials.containsKey(userid)){//if userid exists
            if(credentials.get(userid).equals(password)){//checks if password is correct
                System.out.println("Login Successful "+userid);
            }
            else {
                System.out.println("Incorrect Password. \nTry Again.");//for incorrect password
            }
        }
        else{//if userid isn't found
            System.out.println("User Not Found! \nRegister First.");
        }
    }
}