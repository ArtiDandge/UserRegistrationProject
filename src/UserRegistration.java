import java.util.Scanner;

public class UserRegistration {
    public static boolean validateFirstName(String name){
        String expression = "^[A-Z]{1}[a-zA-Z]{2,}";
        if (name.matches(expression)) {
            System.out.println("'"+name+"'"+" validation success !");
            return true;
        }else {
            System.out.println("'"+name+"'"+" validation unsuccessful ! ");
            return false;
        }

    }
    public static boolean validateEmail(String mail){
        String emailExp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z.-]+$";

        if (mail.matches(emailExp)){
            System.out.println("'"+mail+"'"+" validation success !");
            return true;
        }else {
            System.out.println("'"+mail+"'"+" validation success !");
            return false;
        }
    }
    public static boolean validateMobileNumber(String number) {
        String mobExp = "([0]{1}\\s|[+][9]{1}[1]{1}\\s)?[6-9]{1}[0-9]{9}";
        if (number.matches(mobExp)) {
            System.out.println("'"+number+"'"+" validation success !");
            return true;
        } else {
            System.out.println("'"+number+"'"+" validation success !");
            return false;
        }
    }
    public static boolean validatePassword(String password){
        String passwordExp1 = "[a-zA-Z]{8,}";   //password should have minimum 8 characters
        String passwordExp2 = ".*[A-Z].*";      //Rule 2: password should have atleast one Upper case
        if (password.matches(passwordExp1) && password.matches(passwordExp2)){
            System.out.println("'"+password+"'"+" validation success !");
            return true;
        }else {
            System.out.println("'"+password+"'"+" validation success !");
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Project ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name ");
        String first_name = sc.nextLine();
        System.out.println(validateFirstName(first_name));
        System.out.println("Enter Last name ");
        String last_name = sc.nextLine();
        System.out.println(validateFirstName(last_name));
        System.out.println("Enter Mail address");
        String email = sc.nextLine();
        System.out.println(validateEmail(email));
        System.out.println("Enter Mobile Number");
        String mobileNo = sc.nextLine();
        System.out.println(validateMobileNumber(mobileNo));
        System.out.println(validateMobileNumber(mobileNo));
        System.out.println("Enter Password");
        String password = sc.nextLine();
        System.out.println(validatePassword(password));
    }
}
