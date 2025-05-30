package io.github.wesleyy06.Gerenciador_de_reservas.repository;

import io.github.wesleyy06.Gerenciador_de_reservas.models.Reserve;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

@Configuration
public interface ReserveRepository extends JpaRepository<Reserve, Long> {
}
