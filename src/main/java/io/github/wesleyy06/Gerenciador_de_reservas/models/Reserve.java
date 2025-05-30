package io.github.wesleyy06.Gerenciador_de_reservas.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="reservas")
public class Reserve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private LocalDate reserveDate;

    @Column(nullable = false)
    private LocalTime reservationTime;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Customer customer;

    public Reserve() {}

    public Reserve(LocalDate reserveDate, LocalTime reservationTime, Customer customer) {
        this.reserveDate = reserveDate;
        this.reservationTime = reservationTime;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Nome: " + customer.getName() + ' ' + customer.getLastName()+
                "\nTelefone/celular: " + customer.getPhoneNumber() +
                "\nData reserva: " + reserveDate +
                "\nHorario marcado: " + reservationTime;
    }
}