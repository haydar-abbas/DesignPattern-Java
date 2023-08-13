package structural.facade;

public class SecurityCodeCheck {

    public int getSecurityCode() {
        return 1234;
    }

    public boolean isCodeCorrect(int secCodeToCheck) {
        return (secCodeToCheck == getSecurityCode());
    }
}
