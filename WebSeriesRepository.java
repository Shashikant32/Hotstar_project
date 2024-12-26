import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebSeriesRepository extends JpaRepository<WebSeries, Long> {
    WebSeries findByTitle(String title);  // Custom query to find a web series by title
}
