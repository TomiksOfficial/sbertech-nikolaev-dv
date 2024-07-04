package tomiks.exceptions;

public class InvalidCardNumberException extends BankOnlineException {
    public InvalidCardNumberException() {
        super("Invalid card number");
    }
}
