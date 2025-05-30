package io.github.wesleyy06.Gerenciador_de_reservas.repository;

import io.github.wesleyy06.Gerenciador_de_reservas.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
