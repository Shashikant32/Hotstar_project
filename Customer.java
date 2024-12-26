public class Customer {
    private String name;
    private Subscription subscription;

    public Customer(String name, Subscription subscription) {
        this.name = name;
        this.subscription = subscription;
    }

    public String getName() {
        return name;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void printAvailableContent(List<WebSeries> webSeriesList, List<Match> matchList) {
        System.out.println(name + "'s Available Content:");

        System.out.println("Web Series:");
        for (WebSeries webSeries : webSeriesList) {
            if (subscription.canWatchWebSeries(webSeries)) {
                System.out.println("- " + webSeries.getTitle());
            }
        }

        if (subscription.canWatchMatch()) {
            System.out.println("Matches:");
            for (Match match : matchList) {
                System.out.println("- Match between " + match.getTeam1() + " and " + match.getTeam2());
            }
        } else {
            System.out.println("You need an ELITE subscription to watch matches.");
        }
    }

    public double getSubscriptionCost() {
        return subscription.calculateCost();
    }
}
