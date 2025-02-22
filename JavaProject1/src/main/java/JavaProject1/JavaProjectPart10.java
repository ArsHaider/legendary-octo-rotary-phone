package JavaProject1;

public class JavaProjectPart10 {
    public static void main(String[] args) {

        String[] Strings = {"Strings", "Stringss", "stringss", "Stringsss", "Stringggs", "stringggs", "stringggs", "stringss", "Stringy"};

        for (int i = 0; i < Strings.length; i++) {
            boolean Duplicate = false;

            for (int a = 0; a < i; a++) {
                if (Strings[i].equalsIgnoreCase(Strings[a])) {
                    Duplicate = true;
                }
            }

            if (!Duplicate) {
                for (int b = i + 1; b < Strings.length; b++) {
                    if (Strings[i].equalsIgnoreCase(Strings[b])) {
                        System.out.println(Strings[i]);
                    }
                }
            }
        }
    }
}