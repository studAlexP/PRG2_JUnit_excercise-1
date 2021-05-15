package passwordChecker;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordCheckerTest {
    @Test
    @DisplayName("Password too short")
    public void passwordLengthTest_Scenario1() {
        PasswordChecker pw = new PasswordChecker();
        boolean actual = pw.checkPassword("test");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password too long")
    public void passwordLengthTest_Scenario2() {
        PasswordChecker pw = new PasswordChecker();
        boolean actual = pw.checkPassword("reallySecurePassword123456");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password length is valid")
    public void passwordLengthTest_Scenario3() {
        PasswordChecker pw = new PasswordChecker();
        boolean actual = pw.checkPassword("Testojd()wIHsq23");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password needs atleast one big letter")
    public void passwordLetterTest_Scenario1() {
        PasswordChecker pw = new PasswordChecker();
        boolean actual = pw.checkPassword("testabcdrt");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password needs atleast one small letter")
    public void passwordLetterTest_Scenario2() {
        PasswordChecker pw = new PasswordChecker();
        boolean actual = pw.checkPassword("TESTABCDAV");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password letters are valid")
    public void passwordLetterTest_Scenario3() {
        PasswordChecker pw = new PasswordChecker();
        boolean actual = pw.checkPassword("TeStAbc@232D");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password has no numbers")
    public void passwordNumberTest_Scenario1() {
        PasswordChecker pw = new PasswordChecker();
        boolean actual = pw.checkPassword("firtwpclsfq");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password has numbers")
    public void passwordNumberTestTest_Scenario2() {
        PasswordChecker pw = new PasswordChecker();
        boolean actual = pw.checkPassword("eR23#8r(en98");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password has no special characters")
    public void passwordSpecialCharTest_Scenario1() {
        PasswordChecker pw = new PasswordChecker();
        boolean actual = pw.checkPassword("2ewdUHSgzo78dsu");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Password has special characters")
    public void passwordSpecialCharTest_Scenario2() {
        PasswordChecker pw = new PasswordChecker();
        boolean actual = pw.checkPassword("suhwSaYqw88p+#w");
        boolean expected = true;
        assertEquals(expected, actual);
    }
}
