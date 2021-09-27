package exam;

class ChanLe implements Runnable {

        int max;
        Printer print;
        boolean soChan;

        ChanLe(Printer print, int max, boolean soChan) {
            this.print = print;
            this.max = max;
            this.soChan = soChan;
        }

        @Override
        public void run() {
            int number = soChan == false ? 0 : 1;
            while (number <= max) {

                if (soChan) {
                    print.printEven(number);
                } else {
                    try {
                        print.printOdd(number);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                number += 2;
            }

        }

}

