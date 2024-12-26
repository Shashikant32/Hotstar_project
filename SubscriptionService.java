import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

    public Subscription createSubscription(String type, int noOfScreens) {
        return new Subscription(type, noOfScreens);
    }
}
