package szabo.fpv.umb.zpznamobjektov;

public class Country {
    private String nameOfCountry,areaOfCountry;

    public Country(String nameCountry, String areaCountry){
        nameOfCountry = nameCountry;
        areaOfCountry =areaCountry;

    }

    public String getAreaOfCountry() {
        return areaOfCountry;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }
}
