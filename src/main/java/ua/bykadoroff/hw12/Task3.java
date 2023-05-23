package ua.bykadoroff.hw12;

import java.util.concurrent.ThreadLocalRandom;

public class Task3 {

    public static void main(String[] args){

        try {
            printExc();
        } catch (ExceptionOne | ExceptionTwo | ExceptionThree excId1) {
            System.err.println(excId1.getMessage());
        }
    }

    static void printExc() throws ExceptionOne, ExceptionTwo, ExceptionThree {

        int num = ThreadLocalRandom.current().nextInt(1, 4);

        if (num == 1) {
            throw new ExceptionOne("ExceptionOne");
        }
        if (num == 2) {
            throw new ExceptionTwo("ExceptionTwo");
        }
        if (num == 3) {
            throw new ExceptionThree("ExceptionThree", new Throwable());
        }
    }
}

class ExceptionOne extends Exception {
    public ExceptionOne(String msg) {
    }
}

class ExceptionTwo extends Exception {
    public ExceptionTwo(String msg) {
        super(msg);
    }
}

class ExceptionThree extends Exception {
    public ExceptionThree(String msg, Throwable cause) {
        super(msg, cause);
    }
}
