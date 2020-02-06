public class Car{
    private int miles;
    private int year;
    private String model;
    private String make;
    public Car(int miles, int year, String model, String make){
        this.miles = miles;
        this.year = year;
        this.make = model;
        this.model = make;
    }

    public String toString(){
        return "This car is a " + this.getYear() + " " + this.getMake() + " " + this.getModel() + " with " + this.getMiles() + " miles.";
    }

    public void drive(){
        this.setMiles(miles + 1);
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}