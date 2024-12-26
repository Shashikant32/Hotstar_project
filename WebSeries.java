public class WebSeries {
    private String title;
    private String subscriptionPlan; // "BASIC", "PRO", "ELITE"
    private ProductionHouse productionHouse;

    public WebSeries(String title, String subscriptionPlan, ProductionHouse productionHouse) {
        this.title = title;
        this.subscriptionPlan = subscriptionPlan;
        this.productionHouse = productionHouse;
    }

    public String getTitle() {
        return title;
    }

    public String getSubscriptionPlan() {
        return subscriptionPlan;
    }

    public ProductionHouse getProductionHouse() {
        return productionHouse;
    }
}
