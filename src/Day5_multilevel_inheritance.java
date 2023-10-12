
//Program to demonstrate Multilevel Inheritance - Country Class

class Country {
private String countryName;
private String capital;
public String getCountryName() {
return countryName;
}
public void setCountryName(String countryName) {
this.countryName = countryName;
}
public String getCapital() {
return capital;
}
public void setCapital(String capital) {
this.capital = capital;
}
@Override
public String toString() {
return "Country [countryName=" + countryName + ", capital=" + capital + "]";
}
}
//Program to demonstrate Multilevel Inheritance - State Class
class State extends Country {
private String stateName;
private String language;
public String getStateName() {
return stateName;
}
public void setStateName(String stateName) {
this.stateName = stateName;
}
public String getLanguage() {
return language;
}
public void setLanguage(String language) {
this.language = language;
}
@Override
public String toString() {
return "State [stateName=" + stateName + ", Language="+language+", CountryName=" + getCountryName()+ ", Capital()=" + getCapital() +"]";
}
}
//Program to demonstrate Multilevel Inheritance - City Class
class City extends State{
private String cityName;
private float area;
public String getCityName() {
return cityName;
}
public void setCityName(String cityName) {
this.cityName = cityName;
}
public float getArea() {
return area;
}
public void setArea(float area) {
this.area = area;
}

@Override
public String toString() {
return "City [cityName=" + cityName + ", area=" + area + ", StateName=" + getStateName() + ", Language= "+getLanguage()+ ", CountryName=" + getCountryName() + ", Capital=" + getCapital() + "]";
}
}
//Program to demonstrate MultiLevel inheritance
public class Day5_multilevel_inheritance {
public static void main(String[] args) {
City city = new City();
city.setCityName("Nashik");
city.setArea(264.2f);
city.setStateName("Maharashtra");
city.setLanguage("Marathi");
city.setCountryName("India");
city.setCapital("Delhi");
System.out.println(city);
}
}
