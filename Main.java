import java.util.Arrays;
import java.util.List;

public class HotstarApplication {

    public static void main(String[] args) {
        // Sample data
        ProductionHouse productionHouse = new ProductionHouse("XYZ Productions", null); // Empty list for simplicity

        WebSeries webSeries1 = new WebSeries("BASIC Web Series", "BASIC", productionHouse);
        WebSeries webSeries2 = new WebSeries("PRO Web Series", "PRO", productionHouse);
        WebSeries webSeries3 = new WebSeries("ELITE Web Series", "ELITE", productionHouse);

        List<WebSeries> webSeriesList = Arrays.asList(webSeries1, webSeries2, webSeries3);

        Match match1 = new Match("M1", "Team A", "Team B", 90);
        Match match2 = new Match("M2", "Team C", "Team D", 90);

        List<Match> matchList = Arrays.asList(match1, match2);

        // Customer 1 with BASIC subscription
        Customer customer1 = new Customer("Alice", new Subscription("BASIC", 2));
        customer1.printAvailableContent(webSeriesList, matchList);
        System.out.println("Cost: " + customer1.getSubscriptionCost());

        // Customer 2 with PRO subscription
        Customer customer2 = new Customer("Bob", new Subscription("PRO", 3));
        customer2.printAvailableContent(webSeriesList, matchList);
        System.out.println("Cost: " + customer2.getSubscriptionCost());

        // Customer 3 with ELITE subscription
        Customer customer3 = new Customer("Charlie", new Subscription("ELITE", 4));
        customer3.printAvailableContent(webSeriesList, matchList);
        System.out.println("Cost: " + customer3.getSubscriptionCost());
    }
}
