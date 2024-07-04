package tomiks;

import tomiks.exceptions.*;

import java.util.*;

public class BankOnline {

    private final List<String> blockedCards = Arrays.asList(
            "1111111111111111",
            "2222222222222222",
            "3333333333333333"
    );

    private final static int TRANSFER_LIMIT = 50000;

    private final Map<String, Double> userTransferLimit = new HashMap<>();

    public boolean send(String cardNumber, Double money) throws InvalidCardNumberException, NullArgumentException, CardBlockedException, InvalidTransferValueException, OutOfLimitTransferException {
        if (cardNumber == null || money == null) {
            throw new NullArgumentException();
        }

        if (money <= 0) {
            throw new InvalidTransferValueException();
        }

        if (cardNumber.length() != 16 || !isValidCardNumber(cardNumber)) {
            throw new InvalidCardNumberException();
        }

        if (blockedCards.contains(cardNumber))
        {
            throw new CardBlockedException();
        }

        if (isReachedLimit(cardNumber, money))
        {
            throw new OutOfLimitTransferException(TRANSFER_LIMIT);
        }

        userTransferLimit.put(cardNumber, userTransferLimit.get(cardNumber) + money);

        return true;
    }

    private boolean isReachedLimit(String cardNumber, Double money) {
        if (userTransferLimit.containsKey(cardNumber)) {
            return userTransferLimit.get(cardNumber) + money > TRANSFER_LIMIT;
        } else {
            userTransferLimit.put(cardNumber, 0.0);
            return money > TRANSFER_LIMIT;
        }
    }

    private boolean isValidCardNumber(String s) {
        try {
            Double.parseDouble(s);
        } catch(NumberFormatException | NullPointerException e) {
            return false;
        }

        return true;
    }

}
