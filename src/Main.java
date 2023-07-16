/**
 * Пользователь вводит с клавиатуры значение в массив.
 * После чего запускаются два потока.
 * Первый поток находит максимум в массиве,
 * второй — минимум.
 * Результаты вычислений возвращаются в метод main().
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] arrays = {1, 4, 66, 7, 9, -99, -3, 55};

        MyThread t1 = new MyThread(arrays);
        MyThread t2 = new MyThread(arrays);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(t1.getMax());
        System.out.println(t2.getMin());
    }
}