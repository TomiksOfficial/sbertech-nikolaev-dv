package tomiks.exceptions;

public class OutOfLimitTransferException extends BankOnlineException {
    public OutOfLimitTransferException(Integer limit) {
        super(String.format("You reach the limit of transferred: %s", limit));
    }
}
