public class SingletonDemo {
    public static void main(String[] args) {
        //get the object using get instance method since cannot create the object using private constructor
        WashingMachine washingMachine = WashingMachine.getInstance();

        washingMachine.showMessage();
    }
}
