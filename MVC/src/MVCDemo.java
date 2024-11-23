public class MVCDemo {
    public static void main(String[] args) {
        Employee employee = retrieveEmployeeFromDatabase();

        EmployeeView view = new EmployeeView();

        EmployeeCoontroller controller1 = new EmployeeCoontroller(employee, view);

        controller1.setEmployeeName("Prathibha");
        controller1.updateView();
    }

    private static Employee retrieveEmployeeFromDatabase(){
        Employee employee1 = new Employee();
        employee1.setName("John Doe");
        employee1.setRollNo("20");
        return employee1;
    }
}
