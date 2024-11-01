package com.project.back.services;

import com.project.back.models.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    List<Reservation> getAllReservation();
    Optional<Reservation> getReservation(String id);
    Reservation createReservation(Reservation reservation);
    Reservation updateReservation(String id,Reservation reservation);
    String deleteReservation(String id);
}