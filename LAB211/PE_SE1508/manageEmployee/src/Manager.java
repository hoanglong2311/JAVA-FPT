public class Manager extends Employee {
    private float coefficientPosition;

    public Manager() {
        super();
    }

    

    public Manager(float coefficientPosition) {
        this.coefficientPosition = coefficientPosition;
    }



    public Manager(String id, String name, String email, int birthYear, float coefficients, int employeeType,
            float coefficientPosition) {
        super(id, name, email, birthYear, coefficients, employeeType);
        this.coefficientPosition = coefficientPosition;
    }



    public float getCoefficientPosition() {
        return coefficientPosition;
    }



    public void setCoefficientPosition(float coefficientPosition) {
        this.coefficientPosition = coefficientPosition;
    }

    @Override
    public float tinhLuong() {
        // TODO Auto-generated method stub
        return (coefficientPosition + super.getCoefficients())*1650000;
    }

    
    
}
