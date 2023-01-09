package ardhastudio.classes;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("1000000000000000000000000");
        BigInteger b = new BigInteger("5000000000000000000000000");

        BigInteger hasil = b.subtract(a);
        System.out.println(hasil);
    }

}
