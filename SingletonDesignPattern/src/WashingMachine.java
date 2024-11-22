public class WashingMachine {

    //private constructor
    private WashingMachine(){};

    //private instance
    private static WashingMachine instance = new WashingMachine();

    //method to access the instance from outside
    public static WashingMachine getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("I am the singleton object");
    }


}
