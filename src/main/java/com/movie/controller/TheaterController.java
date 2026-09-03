package com.movie.controller;

import com.movie.dto.TheaterDTO;
import com.movie.entity.Theater;
import com.movie.service.MovieService;
import com.movie.service.TheaterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/theater")
@RequiredArgsConstructor
public class TheaterController {
    private final TheaterService theaterService;

  @PostMapping("/admin/addtheater")
    public ResponseEntity<Theater> addTheater(@RequestBody TheaterDTO theaterDTO){
        return ResponseEntity.ok(theaterService.addTheater(theaterDTO));
    }
    @GetMapping("/gettheaterbylocation")
    public ResponseEntity<List<TheaterDTO>> getTheaterByLocation(@RequestParam String location){
        return ResponseEntity.ok(theaterService.getTheaterByLocation(location));
    }
    @PutMapping("/admin/updatetheater/{id}")
    public ResponseEntity<TheaterDTO> updateTheater(@PathVariable Long id,@RequestBody TheaterDTO theaterDTO){
        return ResponseEntity.ok(theaterService.updateTheater(id,theaterDTO));
    }
    @DeleteMapping("/deletetheater/{id}")
    public ResponseEntity<Void> deleteTheater(@PathVariable Long id){
        theaterService.deleteTheater(id);
        return ResponseEntity.ok().build();
    }
}
