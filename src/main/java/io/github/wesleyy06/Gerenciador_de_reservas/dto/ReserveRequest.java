package io.github.wesleyy06.Gerenciador_de_reservas.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record ReserveRequest(String name,
                             String lastName,
                             Long phoneNumber,
                             LocalTime reservationTime,
                             LocalDate reserveDate) {
}
