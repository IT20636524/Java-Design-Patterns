public class AddEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 25, "123 Main St", "123456", "Manager");
        System.out.println(employee);

        //When don't have all the parameters required by the constructor
        Employee x = new EmployeeBuilder().setName("Prathibha").setAge(25).setAddress("Balangoda").getEmployee();
        System.out.println(x);
    }
}
