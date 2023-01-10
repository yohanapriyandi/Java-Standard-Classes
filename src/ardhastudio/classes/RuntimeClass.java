package ardhastudio.classes;

public class RuntimeClass {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());//untuk mengetahui jumlah cpu di laptop/komputer
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());
    }
}
