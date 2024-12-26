import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MatchService {

    private final MatchRepository matchRepository;

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public List<Match> getAllMatches() {
        return matchRepository.findAll();  // Fetch all matches
    }

    public Match getMatchById(String matchId) {
        return matchRepository.findById(matchId);  // Fetch a match by ID
    }
}
