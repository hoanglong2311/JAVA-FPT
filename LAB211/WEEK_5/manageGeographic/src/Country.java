public class Country  implements Comparable<Country> {
    
    protected String countryCode;
    protected String countryName;
    protected float countryArea;
    public Country(String countryCode, String countryName, float countryArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryArea = countryArea;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public float getcountryArea() {
        return countryArea;
    }
    public void setcountryArea(float countryArea) {
        this.countryArea = countryArea;
    }

    public void display() {

    }
    public int compareTo(Country t) {
        return this.getCountryName().compareTo(t.getCountryName());
    }

}
