
package managelecturer;
public class PartTimeLecturer extends Lecturer{
    private int teachingHours;

    public PartTimeLecturer() {
    }
    @Override
    public long TotalSalary(){
        return super.getHourlyWages()*teachingHours;
    }
    
    public int getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(int teachingHours) {
        this.teachingHours = teachingHours;
    }

    public PartTimeLecturer(int teachingHours) {
        this.teachingHours = teachingHours;
    }

    public PartTimeLecturer(int teachingHours, String id, String name, String email, String phone, int hourlyWages,int type) {
        super(id, name, email, phone, hourlyWages,type);
        this.teachingHours = teachingHours;
    }

    @Override
    public String toString() {
        return super.toString()+" | "+ teachingHours;
    }
    
    
    
}
