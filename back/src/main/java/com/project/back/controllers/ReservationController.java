package com.project.back.controllers;


import com.project.back.models.Reservation;
import com.project.back.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @PostMapping("/create")
    public Reservation createReservation(@RequestBody Reservation reservation){
        return reservationService.createReservation(reservation);
    }
    @GetMapping("/reservations")
    public List<Reservation> getReservations(){
        return reservationService.getAllReservation();
    }
    @PutMapping("/update/{id}")
    public Reservation updateReservation(@PathVariable String id,@RequestBody Reservation reservation){
        return reservationService.updateReservation(id,reservation);
    }
    @GetMapping("/{id}")
    public Optional<Reservation> getOneReservation(@PathVariable String id){
        return reservationService.getReservation(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteReservation(@PathVariable String id){
        return reservationService.deleteReservation(id);
    }

}
