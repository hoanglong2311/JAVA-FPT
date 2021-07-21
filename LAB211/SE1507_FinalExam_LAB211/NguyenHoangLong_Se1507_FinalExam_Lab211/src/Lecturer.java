public class Lecturer extends Employee{
    private float teachingAllowance;
    public Lecturer(float teachingAllowance) {
        this.teachingAllowance = teachingAllowance;
    }

    public Lecturer(String id, String name, String phone, String email, float coefficients, int employeeType,
            float teachingAllowance) {
        super(id, name, phone, email, coefficients, employeeType);
        this.teachingAllowance = teachingAllowance;
    }

    public float getTeachingAllowance() {
        return teachingAllowance;
    }
    
    public void setTeachingAllowance(float teachingAllowance) {
        this.teachingAllowance = teachingAllowance;
    }
  
    @Override
    public float tinhLuong() {
        // TODO Auto-generated method stub
        return ((this.getCoefficients()) * 1650000 + teachingAllowance);
    }
    

}
