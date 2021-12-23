public class Staff  extends Employee{
    private String department ;

    public Staff(String department) {
        this.department = department;
    }

    public Staff(String id, String name, String email, int birthYear, float coefficients, int employeeType,
            String department) {
        super(id, name, email, birthYear, coefficients, employeeType);
        this.department = department;
    }



    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public float tinhLuong() {
        return super.getCoefficients() * 1650000;
    }
}
