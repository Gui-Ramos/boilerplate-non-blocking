package com.non.blocking.repository;

import com.non.blocking.model.Agendamento;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AgendamentoRepository extends R2dbcRepository<Agendamento, UUID> {
}
