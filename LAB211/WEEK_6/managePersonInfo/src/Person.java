public class Person {
    private String name;
    private String address;
    private double salary;
    
    public Person(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    void displayPersonInfo() {
        System.out.println("Information of Person you have entered:");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Salary: " + this.salary + "\n");

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name: "+this.name +"\n"+"Address: " + this.address + "\n" +  "Salary: " + this.salary+"\n";
    }
}
