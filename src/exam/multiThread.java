package exam;

public class multiThread {

    public static void main(String... args) {
        Printer print = new Printer();
        Thread t1 = new Thread(new ChanLe(print, 100, true));
        Thread t2 = new Thread(new ChanLe(print, 100, false));

        t2.start();
        t1.start();

    }

}




