package tomiks.exceptions;

public class NullArgumentException extends BankOnlineException {
    public NullArgumentException() {
        super("One or more arguments are null!");
    }
}
