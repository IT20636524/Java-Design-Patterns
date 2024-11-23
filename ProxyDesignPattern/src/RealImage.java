public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromURL(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying "+ fileName);
    }

    private void loadFromURL(String fileName) {
        System.out.println("Loading from external server "+fileName);
    }
}
