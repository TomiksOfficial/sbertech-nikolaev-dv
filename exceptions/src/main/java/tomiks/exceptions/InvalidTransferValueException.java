package tomiks.exceptions;

public class InvalidTransferValueException extends BankOnlineException {
    public InvalidTransferValueException() {
        super("Invalid transfer value");
    }
}
