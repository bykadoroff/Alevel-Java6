package ua.bykadoroff.hw12;

public class Task2 {

    static public void main(String[] args) throws Exception {
        g();
    }

    protected static void f() throws Exception {
        throw new Exception("Some exception # 1");
    }

    protected static void g() throws Exception {
        try {
            f();
        } catch (Exception excFromF) {
            System.out.println(excFromF);
            throw new Exception("New exception # 2");
        }
    }
}
