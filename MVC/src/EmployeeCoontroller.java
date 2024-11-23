public class EmployeeCoontroller {
    private Employee modal;
    private EmployeeView view;

    public EmployeeCoontroller(Employee modal, EmployeeView view) {
        this.modal = modal;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        modal.setName(name);
    }

    public String getEmployeeName() {
        return modal.getName();
    }

    public void setEmployeeRollNo(String rollNo) {
        modal.setRollNo(rollNo);
    }

    public String getEmployeeRollNo() {
        return modal.getRollNo();
    }

    public void updateView(){
        view.printEmployeeDetails(modal.getName(), modal.getRollNo());
    }
}
