package io.github.actar233;

import io.github.actar233.lottery.LotteryConfigure;
import io.github.actar233.lottery.LotteryMachine;

import java.math.BigDecimal;

public class LotteryTest {

    public static void main(String[] args) {

        final LotteryMachine<BigDecimal> machine = new LotteryMachine<>(
                LotteryConfigure.configure(BigDecimal.valueOf(10), 100),
                LotteryConfigure.configure(BigDecimal.valueOf(20), 80),
                LotteryConfigure.configure(BigDecimal.valueOf(50), 20),
                LotteryConfigure.configure(BigDecimal.valueOf(100), 3),
                LotteryConfigure.configure(BigDecimal.valueOf(200), 1)
        );

        while (true) {

            final BigDecimal value = machine.lottery();

            if (value == null) {
                break;
            }

            System.out.println(value);

        }

    }

}
