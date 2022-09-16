package Lesson12Mnogopotoshka;

import java.util.ArrayList;
import java.util.List;

public class BitcoinCounter {
    public volatile static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        List<Thread>threads =new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            ProccesOneBitcoin proccesOneBitcoin = new ProccesOneBitcoin();
            proccesOneBitcoin.start();
            threads.add(proccesOneBitcoin);
        }// прочитали каждый элемент и вызвали метод ,который ставит на паузу поток майн, чтобы пройтись по другим потокам
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.printf("Counter=%d%n", counter);
    }
}
class ProccesOneBitcoin extends Thread {
public static final Object monitor =new Object();
    @Override
    public void run() {
        // заблокировали доступ,монитор занят, каждый поток проходит через монитор..один занялБ все очтальные ждут, вышел..другой зашел и т.д обеспечивает потокобезопасность
        synchronized (monitor) {
            //Все зависит от многих факторов какое число получим сначала у нас считается counter  тредов сколько успевает потом мы переходи в ме6тод
            // getDelta там у нас прописана логика , что поток засыпает на 1 секунду при этом у нас общая переменная равна 0 , когда проснулся поток он выполняет операцию return 1
//        это значит ,что у нас вместо 0 теперь один и эта еденица прибавляется к каждому треду и получаем общий результат
            BitcoinCounter.counter = BitcoinCounter.counter + getDelta();
        }
    }
        private int getDelta () {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1;
        }
    }

