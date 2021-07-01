/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Employee {

    private String id;
    private String eName;
    private int level;

    public Employee() {
    }

    public Employee(String id, String eName, int level) {
        this.id = id;
        this.eName = eName;
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return id + " " + eName + " " + level;
    }

    public int compareTo(Employee t) {
        return t.id.compareTo(this.id);
    }

}
