package Day10Task;

//main
public class Main {
    public static void main(String[] args) {
        
        BlackTea blackTea = new BlackTea();
        blackTea.prepareTea(); // Prepare black tea
        blackTea.addMilk(); // Add milk to black tea
        blackTea.addSugar(); // Add sugar to black tea

        GreenTea greenTea = new GreenTea();
        greenTea.prepareTea(); // Prepare green tea
        greenTea.addSugar(); // Add sugar to green tea

        HerbalTea herbalTea = new HerbalTea();
        herbalTea.prepareTea(); // Prepare herbal tea
        herbalTea.addMilk(); // Try adding milk to herbal tea (not applicable)

    }
}
