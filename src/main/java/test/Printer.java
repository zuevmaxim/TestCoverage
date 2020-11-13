package test;

public class Printer {
    static void println(Object... objects) {
        for (Object s : objects) {
            System.out.print(s.toString());
        }
        System.out.println();
    }
}
