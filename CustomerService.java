import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final SubscriptionService subscriptionService;

    public CustomerService(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    public void subscribeCustomerToPlan(Customer customer, String subscriptionType, int noOfScreens) {
        Subscription subscription = subscriptionService.createSubscription(subscriptionType, noOfScreens);
        customer.setSubscription(subscription);  // Set the customer's subscription
    }

    public void printCustomerContent(Customer customer, WebSeriesService webSeriesService, MatchService matchService) {
        List<WebSeries> availableWebSeries = webSeriesService.getAllWebSeries();
        List<Match> availableMatches = matchService.getAllMatches();
        customer.printAvailableContent(availableWebSeries, availableMatches);
    }
}
