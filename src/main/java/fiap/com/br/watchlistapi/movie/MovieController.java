package fiap.com.br.watchlistapi.movie;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getMovies() {
        return ResponseEntity.ok(movieService.getMovies());
    }

    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(movieService.addMovie(movie));
    }

    @PatchMapping("{id}")
    public ResponseEntity<Movie> markAsWatched(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.markAsWatched(id));
    }


}
