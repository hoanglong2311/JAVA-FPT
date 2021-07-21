public class Officer extends Employee{
    private String department;
    private float officeAllowance;
    
    public Officer(String id, String name, String email, String phone, float coefficients, int employeeType,
            String department, float officeAllowance) {
        super(id, name, email, phone, coefficients, employeeType);
        this.department = department;
        this.officeAllowance = officeAllowance;       
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getOfficeAllowance() {
        return officeAllowance;
    }

    public void setOfficeAllowance(float officeAllowance) {
        this.officeAllowance = officeAllowance;
    }

    @Override
    public float tinhLuong() {
        // TODO Auto-generated method stub
        return  ((this.getCoefficients() * 1650000) + officeAllowance);
    }
    
}
