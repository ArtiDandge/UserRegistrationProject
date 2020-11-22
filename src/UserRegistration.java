import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean validateFirstName(String name){
        String expression = "^[A-Z]{1}[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(expression);
        return pattern.matcher(name).matches();
    }

    public static boolean validateEmail(String testEmail){
        String emailExp = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,6}$";
        Pattern pattern = Pattern.compile(emailExp);
        return pattern.matcher(testEmail).matches();

    }
    public static boolean validateMobileNumber(String number) {
        String mobExp = "([0]{1}\\s|[+][9]{1}[1]{1}\\s)?[6-9]{1}[0-9]{9}";
        Pattern pattern = Pattern.compile(mobExp);
        return pattern.matcher(number).matches();
    }
    public static boolean validatePassword(String password){
//        String passwordExp1 = "[a-zA-Z]{8,}";     //Rule 1: password should have minimum 8 characters
//        String passwordExp2 = ".*[A-Z].*";		//Rule 2: password should have atleast one Upper case
//        String passwordExp3 = ".*[0-9].*";		//Rule 3: password should have atleast one numeric
//        String passwordExp4 = ".*[@#$%^&+=].*";	//Rule 4: password should have exactly one special character
        String passExp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.+[@#$%^&+=]{1}).{8,}$";
        Pattern pattern = Pattern.compile(passExp);
        return pattern.matcher(password).matches();
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
