public class Main {
    public static void main(String[] args) {
        String firstName = "Sultan";
        String lastName = "Suleyman";
        String favouriteDish = "Steak";
        printPersonInfo(firstName, lastName, favouriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal) {
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("favorite dish: " + meal);
    }
}