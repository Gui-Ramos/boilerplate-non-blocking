package com.non.blocking.controller;

import com.non.blocking.model.Agendamento;
import com.non.blocking.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {

  private final AgendamentoService service;

  @Autowired
  AgendamentoController(AgendamentoService _service){
    this.service = _service;
  }

  @GetMapping
  public Flux<Agendamento> listarAgendamentos(){
    return service.listarAgendamentos();
  }
}
