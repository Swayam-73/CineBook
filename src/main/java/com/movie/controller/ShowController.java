package com.movie.controller;

import com.movie.dto.ShowDTO;
import com.movie.entity.Show;
import com.movie.service.ShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/show")
@RequiredArgsConstructor
public class ShowController {
    private final ShowService showService;
    @PostMapping("/createShow")
    public ResponseEntity<Show> createShow(@RequestBody ShowDTO showDTO){
        return ResponseEntity.ok(showService.createShow(showDTO));
    }
    @GetMapping("/getAllShows")
    public ResponseEntity<List<Show>> getAllShows(){
        return ResponseEntity.ok(showService.getAllShows());
    }
    @GetMapping("/getShowsByMovie/{id}")
    public ResponseEntity<List<Show>> getShowsByMovie(@RequestParam String movie){
        return ResponseEntity.ok(showService.getShowsByMovie(movie));
    }
    @GetMapping("/getShowsByTheater/{id}")
    public ResponseEntity<List<Show>> getShowsByTheater(@RequestParam String theater){
        return ResponseEntity.ok(showService.getShowsByTheater(theater));
    }
    @PutMapping("/updateShow/{id}")
    public ResponseEntity<Show> updateShow(@PathVariable Long id, @RequestBody ShowDTO showDTO){
        return ResponseEntity.ok(showService.updateShow(id, showDTO));
    }
    @DeleteMapping("/deleteshow/{id}")
    public ResponseEntity<Void> deleteShow(@PathVariable Long id){
        showService.deleteShow(id);
        return ResponseEntity.ok().build();
    }
}
