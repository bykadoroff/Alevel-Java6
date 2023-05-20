package ua.bykadoroff.hw12;

public class Task3 {

    void printExc(int num) throws ExceptionOne, ExceptionTwo, ExceptionThree {

        if (num < 0) {
            throw new ExceptionOne();
        }
        if (num == 0) {
            throw new ExceptionTwo("ExceptionTwo");
        }
        if (num > 0) {
            throw new ExceptionThree("ExceptionThree", new Throwable());
        }
    }
}

class ExceptionOne extends Exception {
    public ExceptionOne() {
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
