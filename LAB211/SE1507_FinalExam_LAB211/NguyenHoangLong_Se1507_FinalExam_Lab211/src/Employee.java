public class Employee {
    private String id;
    private String name;
    private String phone;
    private String email;
    private float coefficients;
    private int employeeType;
    public Employee() {
    }

    
    public Employee(String id, String name, String phone, String email, float coefficients, int employeeType) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.coefficients = coefficients;
        this.employeeType = employeeType;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getCoefficients() {
        return coefficients;
    }
    public void setCoefficients(float coefficients) {
        this.coefficients = coefficients;
    }
    public int getEmployeeType() {
        return employeeType;
    }
    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public float tinhLuong() {
        return 0;
    }
    
}
