import java.util.List;

public class ProductionHouse {
    private String name;
    private List<WebSeries> webSeriesList;

    public ProductionHouse(String name, List<WebSeries> webSeriesList) {
        this.name = name;
        this.webSeriesList = webSeriesList;
    }

    public String getName() {
        return name;
    }

    public List<WebSeries> getWebSeriesList() {
        return webSeriesList;
    }

    public double calculateRating() {
        double totalRating = 0;
        for (WebSeries webSeries : webSeriesList) {
            // Assuming some way to get ratings for webSeries, e.g., via some external system.
            // For simplicity, we're going to assume a rating of 5 for each web series here.
            totalRating += 5; // Placeholder for actual ratings.
        }
        return webSeriesList.isEmpty() ? 0 : totalRating / webSeriesList.size();
    }
}
