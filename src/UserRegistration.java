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
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Project ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name ");
        String first_name = sc.nextLine();
        System.out.println(validateFirstName(first_name));
    }
}
