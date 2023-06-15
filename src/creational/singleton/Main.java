package creational.singleton;

public class Main {

    public static void main(String[] args) {
//        Singleton obj1 = Singleton.getInstance();
//        Singleton obj2 = Singleton.getInstance();
//
//        obj1.printData();
//        obj2.printData();

         new DataPrinter().start();
         new DataPrinter().start();

    }
}

class DataPrinter extends Thread {
    @Override
    public void run() {
        Singleton.getInstance().printData();
    }
}
