package tomiks.exceptions;

public class CardBlockedException extends BankOnlineException {
    public CardBlockedException() {
        super("Card blocked!");
    }
}
