package com.project.back.services;

import com.project.back.models.EEtat;
import com.project.back.models.Reservation;
import com.project.back.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService{
    @Autowired
    private ReservationRepository reservationRepository;
    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Optional<Reservation> getReservation(String id) {
        return reservationRepository.findById(id);
    }

    @Override
    public Reservation createReservation(Reservation reservation) {
        reservation.setEtat(EEtat.Pending);
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(String id, Reservation reservation) {
        reservation.setId(id);
        return reservationRepository.save(reservation);
    }

    @Override
    public String deleteReservation(String id) {
        reservationRepository.deleteById(id);
        return "delete reservation with id : "+id;
    }
}
