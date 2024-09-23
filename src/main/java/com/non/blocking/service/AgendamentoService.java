package com.non.blocking.service;

import com.non.blocking.model.Agendamento;
import com.non.blocking.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
@Service
public class AgendamentoService {

  private final AgendamentoRepository repository;

  @Autowired
  public AgendamentoService(AgendamentoRepository _repository){
    this.repository = _repository;
  }

  public Flux<Agendamento> listarAgendamentos(){
    System.out.println("Chamando repository.findAll()");
    return this.repository.findAll();
  }
}
