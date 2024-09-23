package com.non.blocking.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;


@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@Entity(name = "agendamento")
public class Agendamento extends AbstractModel{

  private LocalDate data;

  private LocalTime horaInicio;

  private LocalTime horaFim;

  private UUID sala;

}
