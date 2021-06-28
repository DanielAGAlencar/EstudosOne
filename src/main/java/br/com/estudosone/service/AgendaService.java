package br.com.estudosone.service;

import br.com.estudosone.model.Agenda;
import br.com.estudosone.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public Agenda save(Agenda agenda){
        return agendaRepository.save(agenda);
    }
    public List<Agenda> findAll(){
        return (List<Agenda>) agendaRepository.findAll();
    }
    public Agenda findById(int id) { return agendaRepository.findOne(id);}
    public void delete(int id) { agendaRepository.delete(id);}

}
