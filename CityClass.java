
public class CityClass {

    private int id;
    private String name;
    private String countryCode;
    private String update;

    public CityClass(int id, String name, String countryCode, String update) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.update = update;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

}
