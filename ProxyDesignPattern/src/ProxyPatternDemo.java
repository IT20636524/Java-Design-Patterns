public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("flower.jpg");
        img1.display();
//        Loading from external server flower.jpg
//        Displaying flower.jpg

        img1.display();
//        Displaying flower.jpg

    }
}
