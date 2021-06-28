package br.com.estudosone.controller;

import br.com.estudosone.constant.Constants;
import br.com.estudosone.model.Agenda;
import br.com.estudosone.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @RequestMapping(value = Constants.API_AGENDA, method = RequestMethod.POST)
    @ResponseBody
    public Agenda save(@RequestBody Agenda agenda){
        return agendaService.save(agenda);
    }

    @RequestMapping(value = Constants.API_AGENDA, method = RequestMethod.GET)
    @ResponseBody
    public List<Agenda> findAll(){
        return agendaService.findAll();
    }
}
