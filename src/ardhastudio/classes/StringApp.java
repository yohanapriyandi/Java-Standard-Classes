package ardhastudio.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Fathar Dhabit Adz-Dzaky ";

        String nameLowerCase = name.toLowerCase();
        System.out.println(nameLowerCase);
        System.out.println("=======================================");
        String nameToUppercase = name.toUpperCase();
        System.out.println(nameToUppercase);
        System.out.println("=======================================");
        System.out.println(name.length());
        System.out.println(name.trim());
        System.out.println(name.toCharArray());
    }
}
