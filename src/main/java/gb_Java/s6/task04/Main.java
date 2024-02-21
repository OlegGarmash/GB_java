package gb_Java.s6.task04;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Kelvin();

        System.out.println("cel.convertValue(100) = " + converter.convertValue(100));
    }
}
