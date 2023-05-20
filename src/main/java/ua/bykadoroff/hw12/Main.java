package ua.bykadoroff.hw12;

public class Main {
    public static void main(String[] args) throws Exception {
        Task2 testExc = new Task2();
        testExc.g();

        Task3 threeExc = new Task3();
        try{
            threeExc.printExc(1);
        }
        catch (ExceptionOne | ExceptionTwo | ExceptionThree excId1){
            System.err.println(excId1.getMessage());
        }
    }
}
