package ardhastudio.classes;

import java.util.StringJoiner;

public class JoinerApp {
    public static void main(String[] args) {
        String[] names = {"Fathar", "Dhabit", "Adz-Dzaky"};
        StringJoiner joiner = new StringJoiner("||", "[", "]");

        for (var name : names){
            joiner.add(name);
        }

        System.out.println(joiner.toString());

    }
}
