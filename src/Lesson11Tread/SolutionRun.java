package Lesson11Tread;

public class SolutionRun {
    public static void main(String[] args) throws InterruptedException {
        //Create new parallel flow
        Thread thread = new Thread(new NewFrontEnd(), "Нить 1");
//        Thread thread1 = new Thread(new NewFrontEnd(),"Нить 2");
//        Thread thread2 = new Thread(new NewFrontEnd(),"Нить 3");
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
//        thread1.start();
//        thread2.start();
//    new Thread(() -> {
//        for (int i = 0; i < 10000; i++) {
//            System.out.println("Отрисовка интерфейса. Отрисовано: " + i + " кадров. ");
//        }
//    }).start();
        // setName the main thread
//        Thread.currentThread().setName("Главная нить");
//        String threadName = Thread.currentThread().getName();
//        for (int i = 0; i < 10000; i++) {
//            // passes in the thread  static sleep()
//            Thread.sleep(10);
//            System.out.println(threadName + " Чтение файлаю.Прочитано: " + i + " байт. ");
//        }
    }
}

// implements Runnable say that the threat will be executed in parallel
class NewFrontEnd implements Runnable {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        String threadName = Thread.currentThread().getName();
        for (int i = 0; i < 10000; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
               throw new RuntimeException();
            }
            System.out.println(threadName + " Отрисовка интерфейса. Отрисовано: " + i + " кадров. ");
//        //method(interrupt) and variable(isInterrupted) stops threadБ когда метод вызывает переменная стновиться true
            if (thread.isInterrupted()) break;
        }
    }
}

