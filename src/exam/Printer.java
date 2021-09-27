package exam;

class Printer {

    boolean soLe = false;

    synchronized void printEven(int number) {

        while (soLe == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("--" +number);
        soLe = false;
        notifyAll();
    }

    synchronized void printOdd(int number) throws InterruptedException {
        while (soLe == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(number);
        soLe = true;
        notifyAll();
        wait();
    }

}