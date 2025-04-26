package io.github.wesleyy06.Gerenciador_de_reservas.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserve extends Customer{
    private LocalDate reserveDate;
    private LocalTime reservationTime;

    public Reserve(LocalDate reserveDate, LocalTime reservationTime) {
        this.reserveDate = reserveDate;
        this.reservationTime = reservationTime;
    }

    public Reserve(String name, String lastname, long phoneNumber, LocalDate reserveDate, LocalTime reservationTime) {
        super(name, lastname, phoneNumber);
        this.reserveDate = reserveDate;

        if(reservationTime == null) {
            System.out.println("Horario mencianado invalido!");
        } else {
            this.reservationTime = reservationTime;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + ' ' + getLastname()+
                "Telefone/celular: " + getPhoneNumber() +
                "Data reserva: " + reserveDate +
                "Horario marcado: " + reservationTime;
    }
}