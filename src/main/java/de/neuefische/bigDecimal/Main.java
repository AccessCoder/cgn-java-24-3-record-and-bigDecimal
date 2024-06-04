package de.neuefische.bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;

        System.out.println(a+b);


        //Wie "bauen" wir einen BigDecimal?
        BigDecimal number1 = new BigDecimal("0.1");
        BigDecimal number2 = new BigDecimal("0.4");
        BigDecimal number3 = BigDecimal.valueOf(0.3);

        //Berechnungen mit BigDecimal
        number1.add(number2);
        number1.subtract(number2);
        number1.multiply(number2);
        number1.divide(number2, 2, RoundingMode.UP);


        BigDecimal roundedSum = number1.add(number2).setScale(0, RoundingMode.HALF_UP);
        System.out.println(roundedSum);

        //RoundingModes
        /**
         * UP = IMMER aufrunden
         * DOWN = IMMER abrunden
         * HALF_UP = Kfm. Runden ab 0.5 = Aufrunden
         * HALF_DOWN = Kfm. Runden, bis inkl. 0.5 abrunden
         */
    }
}
