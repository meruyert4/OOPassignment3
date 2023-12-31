public class Skyscraper {
    private int floorsCount;
    private String developer;

    public Skyscraper(){
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    public Skyscraper(int floorsCount,String developer){
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public void info(){
        System.out.println("The skyscraper has been built.");
        System.out.println("Number of floors - "+ floorsCount);
        System.out.println("Developer - " + developer);
    }
}

