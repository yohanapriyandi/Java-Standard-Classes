package ardhastudio.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String value = "Fathar Dhabit Adz-Dzaky";
        StringTokenizer tokenizer = new StringTokenizer(value, " ");
        while (tokenizer.hasMoreTokens()){
            String hasil = tokenizer.nextToken();
            System.out.println(hasil);
        }
    }
}
