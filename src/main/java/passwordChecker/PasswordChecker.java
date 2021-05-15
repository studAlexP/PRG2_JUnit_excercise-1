package passwordChecker;

public class PasswordChecker {

    boolean checkPassword(String password) {
        return password.matches("^(?=.{8,25})(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[()#$?!%/@]).+$");
    }
}
