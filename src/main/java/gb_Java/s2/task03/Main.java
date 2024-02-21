package gb_Java.s2.task03;

public class Main {
    public static void main(String[] args) {
        Vector vectorOne = new Vector(1.0, 2.0, 1.0);
        Vector vectorTwo = new Vector();
        System.out.println(vectorOne);
        System.out.println(vectorTwo);
        System.out.println("vectorOne.lenght() = " + vectorOne.lenght());

        System.out.println("vectorOne.scalar(vectorTwo) = " + vectorOne.scalar(vectorTwo));
        Vector vectorThree = vectorOne.multiply(vectorTwo);
        System.out.println("vectorThree = " + vectorThree);

        System.out.println("vectorOne.cos(vectorTwo) = " + vectorOne.cos(vectorTwo));
        Vector vectorFour = vectorOne.sum(vectorTwo);
        System.out.println("vectorFour = " + vectorFour);
        Vector vectorFive = vectorOne.degree(vectorTwo);
        System.out.println("vectorFive = " + vectorFive);
    }
}
