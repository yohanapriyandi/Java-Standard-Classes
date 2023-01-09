package ardhastudio.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Fathar");
        builder.append(" ");
        builder.append("Dhabit");
        builder.append(" ");
        builder.append("Adz-Dzaky");

        String name = builder.toString();
        System.out.println(name);

    }
}
