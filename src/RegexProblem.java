import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First name: ");
        boolean firstName = Pattern.matches("[A-Z][a-z]{3,}", sc.next());
        System.out.println("Result : " + firstName);
    }
}
