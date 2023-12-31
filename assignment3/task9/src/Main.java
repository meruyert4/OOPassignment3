public class Main {
    public static void main(String[] args) {
        CarConcern car1 = new CarConcern("Gallardo", 2020, "Red");
        CarConcern car2 = new CarConcern("Murcielago", 2019, "Yellow");
        CarConcern car3 = new CarConcern("Urus", 2022, "Black");
        car1.info();
        car2.info();
        car3.info();
    }
}