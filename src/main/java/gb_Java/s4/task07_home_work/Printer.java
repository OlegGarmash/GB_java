package gb_Java.s4.task07_home_work;

import java.util.LinkedList;

class MyQueue<T> {

    // Напишите свое решение ниже
    private LinkedList<Integer> elements = new LinkedList<>();

    public void enqueue(int element) {
        // Напишите свое решение ниже
        elements.addLast(element);
    }

    public int dequeue() {
        // Напишите свое решение ниже
        return elements.removeFirst();
    }

    public int first() {
        // Напишите свое решение ниже
        return elements.getFirst();

    }

    public LinkedList<Integer> getElements() {
        // Напишите свое решение ниже
        return elements;

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
