package tomiks;

import lombok.SneakyThrows;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import tomiks.exceptions.*;

import java.lang.reflect.Method;

class BankOnlineTest {

    @Test
    void sendNullArgumentTest() {
        Assertions.assertThatThrownBy(() -> new BankOnline().send(null, 50.0)).isInstanceOf(NullArgumentException.class);
        Assertions.assertThatThrownBy(() -> new BankOnline().send("5343765398129847", null)).isInstanceOf(NullArgumentException.class);
    }

    @Test
    void sendInvalidCardNumberTest() {
        Assertions.assertThatThrownBy(() -> new BankOnline().send("11152", 50.0)).isInstanceOf(InvalidCardNumberException.class);
        Assertions.assertThatThrownBy(() -> new BankOnline().send("11111111111a1111", 50.0)).isInstanceOf(InvalidCardNumberException.class);
        Assertions.assertThatThrownBy(() -> new BankOnline().send("1111111-11111111", 50.0)).isInstanceOf(InvalidCardNumberException.class);
    }

    @Test
    void sendInvalidTransferValueTest() {
        Assertions.assertThatThrownBy(() -> new BankOnline().send("5343765398129847", -50.0)).isInstanceOf(InvalidTransferValueException.class);
        Assertions.assertThatThrownBy(() -> new BankOnline().send("5343765398129847", 0.0)).isInstanceOf(InvalidTransferValueException.class);
    }

    @Test
    void sendCardBlockedTest() {
        Assertions.assertThatThrownBy(() -> new BankOnline().send("1111111111111111", 50.0)).isInstanceOf(CardBlockedException.class);
        Assertions.assertThatThrownBy(() -> new BankOnline().send("2222222222222222", 1000.0)).isInstanceOf(CardBlockedException.class);
    }

    @Test
    @SneakyThrows
    void isReachedLimitTest() {
        Method method = BankOnline.class.getDeclaredMethod("isReachedLimit", String.class, Double.class);
        method.setAccessible(true);
        Assertions.assertThat(method.invoke(new BankOnline(), "5343765398129847", 50000.0)).isEqualTo(false);
        Assertions.assertThat(method.invoke(new BankOnline(), "5343765398129847", 51000.0)).isEqualTo(true);
    }

    @Test
    void sendOutOfLimitTransferTest() {
        BankOnline bank = new BankOnline();
        try {
            Assertions.assertThat(bank.send("5343765398129847", 25000.0)).isEqualTo(true);
            Assertions.assertThat(bank.send("5343765398129847", 25000.0)).isEqualTo(true);
        } catch (Exception ignored) {}

        Assertions.assertThatThrownBy(() -> bank.send("5343765398129847", 1000.0)).isInstanceOf(OutOfLimitTransferException.class);
    }
}