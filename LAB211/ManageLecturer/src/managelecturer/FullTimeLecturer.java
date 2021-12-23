
package managelecturer;

public class FullTimeLecturer extends Lecturer{
    private int teachingHoursAllowance;
    private int miniHours; 
    private int travelAllowance;
    private int equiqAllowance;

    public FullTimeLecturer() {
    }
    
    public FullTimeLecturer(int teachingHoursAllowance, int miniHours, int travelAllowance, int equiqAllowance, String id, String name, String email, String phone, int hourlyWages,int type) {
        super(id, name, email, phone, hourlyWages,type);
        this.teachingHoursAllowance = teachingHoursAllowance;
        this.miniHours = miniHours;
        this.travelAllowance = travelAllowance;
        this.equiqAllowance = equiqAllowance;
    }

    
    public int getTeachingHoursAllowance() {
        return teachingHoursAllowance;
    }

    public void setTeachingHoursAllowance(int teachingHoursAllowance) {
        this.teachingHoursAllowance = teachingHoursAllowance;
    }

    public int getMiniHours() {
        return miniHours;
    }

    public void setMiniHours(int miniHours) {
        this.miniHours = miniHours;
    }

    public int getTravelAllowance() {
        return travelAllowance;
    }

    public void setTravelAllowance(int travelAllowance) {
        this.travelAllowance = travelAllowance;
    }

    public int getEquiqAllowance() {
        return equiqAllowance;
    }

    public void setEquiqAllowance(int equiqAllowance) {
        this.equiqAllowance = equiqAllowance;
    }

    @Override
    public String toString() {
        return super.toString()+ " | "+ teachingHoursAllowance+" | "+miniHours+" | "+ travelAllowance+" | "+equiqAllowance;
    }
    @Override
    public long TotalSalary(){
        return ((super.getHourlyWages()*miniHours)+teachingHoursAllowance+travelAllowance+equiqAllowance);
    }
}
