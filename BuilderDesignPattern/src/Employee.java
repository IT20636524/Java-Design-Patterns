public class Employee {
    private String name;
    private int age;
    private String address;
    private String idNumber;
    private String position;

    public Employee(String name, int age, String address, String idNumber, String position) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.idNumber = idNumber;
        this.position = position;
    }

    public String toString() {
        return "Employee [name= " + name + ", age= " + age + ", address= " + address + ", idNumber= " + idNumber + ", position= " + position + "]";
    }
}
