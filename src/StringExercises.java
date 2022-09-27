public class StringExercises {
    public void exercise1(String input) {

        String output = "<" + input + ">";
        System.out.println("Exercise 1: " + output);
    }

    public void exercise2(String input) {

        int output = input.length();
        System.out.println("Exercise 2: " + output);
    }

    public void exercise3(String input) {

        System.out.print("Exercise 3: ");
        for (int i = 0; i < input.length(); i++) {
            System.out.print("@" + input.charAt(i));
        }
        System.out.println("@");
    }

    public void exercise4(String input) {
        System.out.print("Excersie 4: ");
        for (int i = (input.length() - 1); i >= 0; i--) {
            System.out.print(input.charAt(i));
        }

    }

    public void exercise5(String input) {

        " " = "/";
        "a" = ".-";
        "b" = "-...";
        "c" = "-.-.";
        "d" = "-..";
        "e" = ".";
        "f" = "..-.";
        "g" = "--.";
        "h" = "....";
        "j" = ".---";
        "i" = "..";
        "k" = "-.-";
        "l" = ".-..";
        "m" = "--";
        "n" = "-.";
        "o" = "---";
        "p" = ".--.";
        "q" = "--.-";
        "r" = ".-.";
        "s" = "...";
        "t" = "-";
        "u" = "..-";
        "v" = "...-";
        "w" = ".--";
        "x" = "-..-";
        "y" = "-.--";
        "z" = "--..";
        "0" = "-----";
        "1" = ".----";
        "2" = "..---";
        "3" = "...--";
        "4" = "....-";
        "5" = ".....";
        "6" = "-....";
        "7" = "--...";
        "8" = "---..";
        "9" = "----.";



    }
}
