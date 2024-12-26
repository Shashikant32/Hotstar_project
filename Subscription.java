public class Subscription {
    private String type; // "BASIC", "PRO", "ELITE"
    private int noOfScreensSubscribed;

    public Subscription(String type, int noOfScreensSubscribed) {
        this.type = type;
        this.noOfScreensSubscribed = noOfScreensSubscribed;
    }

    public double calculateCost() {
        double cost = 0;
        switch (type) {
            case "BASIC":
                cost = 500 + 200 * noOfScreensSubscribed;
                break;
            case "PRO":
                cost = 800 + 250 * noOfScreensSubscribed;
                break;
            case "ELITE":
                cost = 1000 + 350 * noOfScreensSubscribed;
                break;
        }
        return cost;
    }

    public boolean canWatchWebSeries(WebSeries webSeries) {
        if ("ELITE".equals(type)) {
            return true; // ELITE can watch all web series
        } else if ("PRO".equals(type)) {
            return !webSeries.getSubscriptionPlan().equals("ELITE"); // PRO can watch BASIC and PRO web series
        } else if ("BASIC".equals(type)) {
            return webSeries.getSubscriptionPlan().equals("BASIC"); // BASIC can only watch BASIC web series
        }
        return false;
    }

    public boolean canWatchMatch() {
        return "ELITE".equals(type); // Only ELITE can watch matches
    }

    public String getType() {
        return type;
    }

    public int getNoOfScreensSubscribed() {
        return noOfScreensSubscribed;
    }
}
