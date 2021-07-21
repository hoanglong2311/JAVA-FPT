public class EastAsiaCountries extends Country {
    
    private String countryTerrain;

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    // @Override
    // public int compareTo(EastAsiaCountries t) {
    //     return this.getCountryName().compareTo(t.getCountryName());
    // }

    @Override
    public void display() {
        System.out.printf("%-10s%-25s%-20.0f%-25s\n",this.countryCode,
        this.countryName, this.countryArea, this.countryTerrain);
    }
    


}
