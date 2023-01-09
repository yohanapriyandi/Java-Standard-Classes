package ardhastudio.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 100;

        Long longValue = intValue.longValue();
        Short shortValue = longValue.shortValue();

        String contoh = "155000";

        Integer contohInteger = +Integer.valueOf(contoh);

        int contohInt = Integer.parseInt(contoh);

        System.out.println(contohInteger);
        System.out.println("=========================================");
        System.out.println(contohInt);

        String contohDouble = "10.15";
        Double hasilconvertDOuble = Double.valueOf(contohDouble);
        System.out.println(hasilconvertDOuble);



    }
}
