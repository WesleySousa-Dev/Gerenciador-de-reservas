package io.github.wesleyy06.Gerenciador_de_reservas.controller;

import io.github.wesleyy06.Gerenciador_de_reservas.dto.ReserveRequest;
import io.github.wesleyy06.Gerenciador_de_reservas.models.Customer;
import io.github.wesleyy06.Gerenciador_de_reservas.models.Reserve;
import io.github.wesleyy06.Gerenciador_de_reservas.repository.CustomerRepository;
import io.github.wesleyy06.Gerenciador_de_reservas.repository.ReserveRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservar")
public class ReserveController {

    private CustomerRepository customerRepository;
    private ReserveRepository reserveRepository;

    public ReserveController(CustomerRepository customerRepository, ReserveRepository reserveRepository) {
        this.customerRepository = customerRepository;
        this.reserveRepository = reserveRepository;
    }

    @PostMapping("/nova-reserva")
    public void newReserve(@RequestBody ReserveRequest reserveRequest){
        Customer newCustomer = new Customer(reserveRequest.name(), reserveRequest.lastName(), reserveRequest.phoneNumber());
        Reserve newReserve = new Reserve(reserveRequest.reserveDate(), reserveRequest.reservationTime(), newCustomer );
        customerRepository.save(newCustomer);
        reserveRepository.save(newReserve);
    }
}
