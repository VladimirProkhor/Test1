package Lesson11Tread;

public class SolutionTread {
    public static void main(String[] args) {
    FrontEnd frontEnd = new FrontEnd();
    //запускаем поток параллельно
    frontEnd.start();
        System.out.println("Происходит ");
        for (int i = 0; i < 10000; i++) {
            System.out.println("Чтение файлаю.Прочитано: " + i + " байт. ");
        }
    }
}

//будем работать в новой нити.//work parallel
class FrontEnd extends Thread {
//описать логику  метод run ля того чтобы делать что-то паралельно основного потока

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Отрисовка интерфейса. Отрисовано: " + i + " кадров. ");
        }
    }
}