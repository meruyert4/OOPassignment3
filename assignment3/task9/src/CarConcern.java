public class CarConcern {
    private final String manufacturer;
    private final String model;
    private final int year;
    private final String color;
    public CarConcern(String model, int year, String color) {
        this.manufacturer = "Lamborghini";
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public CarConcern(String model, int year) {
        this.manufacturer = "Lamborghini";
        this.model = model;
        this.year = year;
        this.color = "green";
    }
    public CarConcern(String model) {
        this.manufacturer = "Lamborghini";
        this.model = model;
        this.year = 2022;
        this.color = "green";}
    public void info(){
        System.out.println("The manufacturer - "+manufacturer);
        System.out.println("Model - "+ model);
        System.out.println("Year - "+ year);
        System.out.println("Color - "+ color);
    }
}