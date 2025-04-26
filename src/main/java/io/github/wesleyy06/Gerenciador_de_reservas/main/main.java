package io.github.wesleyy06.Gerenciador_de_reservas.main;

import io.github.wesleyy06.Gerenciador_de_reservas.models.Customer;
import io.github.wesleyy06.Gerenciador_de_reservas.models.Reserve;
import io.github.wesleyy06.Gerenciador_de_reservas.useful.DateTimeFormater;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    private List<Reserve> reserve = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void executar(){
        newReserve();
    }

    private void newReserve() {

        int day = 1;
        int month = 1;
        String hour = "00:00";

        System.out.print("Nome de quem está reservando: ");
        String name = scanner.nextLine();
        System.out.print("segundo nome: ");
        String lastName = scanner.nextLine();
        System.out.println("\nTelefone de quem está reservando: ");
        long phoneNumber = scanner.nextLong();

        System.out.print("\nDigite o dia da reserva: ");
        day = scanner.nextInt();

        System.out.print("\nDigite o mês da reserva: ");
        month = scanner.nextInt();

        scanner.nextLine(); //consome quebra de linha que ficou no buffer

        System.out.print("\nDigite o horario da reserva: ");
        hour = scanner.nextLine();

        LocalDate reservationDate = LocalDate.of(2025, month, day);

        Customer customer = new Customer(name, lastName, phoneNumber);
        Reserve _reserve = new Reserve(name, lastName, phoneNumber, reservationDate, DateTimeFormater.dateTimerFormater(hour));

        reserve.add(_reserve);

        reserve.forEach(System.out::println);
    }
}
