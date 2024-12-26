import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WebSeriesService {

    // Assuming a webSeriesRepository that fetches from the database
    private final WebSeriesRepository webSeriesRepository;

    public WebSeriesService(WebSeriesRepository webSeriesRepository) {
        this.webSeriesRepository = webSeriesRepository;
    }

    public List<WebSeries> getAllWebSeries() {
        return webSeriesRepository.findAll();  // Fetch all web series from the database
    }

    public WebSeries getWebSeriesByTitle(String title) {
        return webSeriesRepository.findByTitle(title);  // Fetch a web series by title
    }
}
