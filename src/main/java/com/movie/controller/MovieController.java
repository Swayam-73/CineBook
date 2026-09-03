package com.movie.controller;

import com.movie.dto.MovieDTO;
import com.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @PostMapping("/admin/create")
    public ResponseEntity<MovieDTO> createMovie(@RequestBody MovieDTO movieDTO){
        MovieDTO createdMovie = movieService.saveMovie(movieDTO);
        return ResponseEntity.ok(createdMovie);
    }
    @GetMapping("/getAllMovies")
    public ResponseEntity<List<MovieDTO>> getAllMovies(){
        List<MovieDTO> movieDTOS = movieService.getAllMovies();
        return ResponseEntity.ok(movieDTOS);
    }
    @GetMapping("/getmoviesbygenre")
    public ResponseEntity<List<MovieDTO>> getMovieByGenre(@RequestParam String genre){
        return ResponseEntity.ok(movieService.getMovieByGenre(genre));
    }
    /*
    @GetMapping("/getmoviebylanguage")
    public ResponseEntity<List<MovieDTO>> getMovieByLanguage(@RequestParam String language){
        return ResponseEntity.ok(movieService.getMovieByLanguage(language));
    }
    @GetMapping("/getmoviebytitle")
    public ResponseEntity<List<MovieDTO>> getMovieByTitle(@RequestParam String title){
        return ResponseEntity.ok(movieService.getMovieByTitle(title));
    }
    @PutMapping("/admin/updatemovie/{id}")
    public ResponseEntity<MovieDTO> updateMovie(@PathVariable Long id, @RequestBody MovieDTO movieDTO){
        return ResponseEntity.ok(movieService.updateMovie(id, movieDTO));
    }
    @DeleteMapping("/admin/deletemovie/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id){
        movieService.deleteMovie(id);
        return ResponseEntity.ok().build();
    }
    */
}
