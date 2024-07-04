package tomiks.task.one;

import lombok.SneakyThrows;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Method;

public class CalculatorTest {

    @Test
    void sumNumbersTest() {
        Arithmetic arithmetic = Mockito.mock(Arithmetic.class);

        Mockito.when(arithmetic.add(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(23.0);
        Calculator calculator = new Calculator(arithmetic);

        Assertions.assertThat(calculator.sumTwoNumbers(5.0, 3.0)).isEqualTo(23.0);
    }

    @Test
    void countCallMethods() {
        Arithmetic arithmetic = Mockito.mock(Arithmetic.class);

        Mockito.when(arithmetic.add(Mockito.anyDouble(), Mockito.anyDouble())).thenReturn(23.0);
        Mockito.when(arithmetic.divide(Mockito.anyDouble(), Mockito.anyDouble())).thenCallRealMethod();
        Calculator calculator = new Calculator(arithmetic);

        calculator.sumTwoNumbers(5.0, 3.0);
        calculator.divideTwoNumbers(3, 2);
        calculator.divideTwoNumbers(3, 2);

        Mockito.verify(arithmetic, Mockito.times(1)).add(Mockito.anyDouble(), Mockito.anyDouble());
        Mockito.verify(arithmetic, Mockito.times(2)).divide(Mockito.anyDouble(), Mockito.anyDouble());
    }

    @Test
    void zeroDivisionTest() {
        Calculator calculator = new Calculator(new Arithmetic());

        Assertions.assertThatThrownBy(() -> {
            calculator.divideTwoNumbers(5, 0);
        }).isInstanceOf(ArithmeticException.class);
    }

    @Test
    void privateMethodWithoutReflectionTest() {
        Calculator calculator = new Calculator(new Arithmetic());

        Assertions.assertThat(calculator.sqrt(4)).isEqualTo(2);
        Assertions.assertThat(calculator.sqrt(9)).isEqualTo(3);
        Assertions.assertThat(calculator.sqrt(16)).isEqualTo(4);
        Assertions.assertThat(calculator.sqrt(36)).isEqualTo(6);
    }

    @Test
    @SneakyThrows
    void privateMethodWithReflectionTest() {
        final double EXPECTED = 8.0;

        Calculator calculator = new Calculator(new Arithmetic());

        Method method = calculator.getClass().getDeclaredMethod("pow", double.class, double.class);
        method.setAccessible(true);
        Assertions.assertThat(method.invoke(calculator, 2, 3)).isEqualTo(EXPECTED);

    }

}