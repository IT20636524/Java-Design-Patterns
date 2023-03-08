public class FactoryDemoPattern {
    public static void main(String[] args) {
        PhoneFactory phoneFactory=new PhoneFactory();

        Phone myPhone = phoneFactory.getPhone("Low Price");
        myPhone.showSpec();
    }
}