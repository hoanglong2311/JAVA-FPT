public class Employee {
    private String id;
    private String name;
    private int birthYear;
    private String email;
    private float coefficients;
    private int employeeType; //1: for Manager ; 2 : for Staff
    
    public Employee() {
    }

    public Employee(String id, String name,String email , int birthYear, float coefficients, int employeeType) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
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
