
package managelecturer;

import com.sun.javafx.animation.TickCalculation;


abstract class Lecturer {
    private String id, name, email, phone;
    private int hourlyWages,type;

    public Lecturer() {
    }

    public Lecturer(String id, String name, String email, String phone, int hourlyWages,int type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.hourlyWages = hourlyWages;
        this.type=type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getHourlyWages() {
        return hourlyWages;
    }
    public void setHourlyWages(int hourlyWages) {
        this.hourlyWages = hourlyWages;
    }
    @Override
    public String toString() {
        return id + " | " + name + " | " +phone+ " | "+ email + " | "+ hourlyWages;
    }
    public abstract long TotalSalary();
    
}
