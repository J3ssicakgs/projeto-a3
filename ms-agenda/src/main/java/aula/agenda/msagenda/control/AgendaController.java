package aula.agenda.msagenda.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import aula.agenda.msagenda.dto.AgendaDTO;
import aula.agenda.msagenda.service.AgendaService;

@RestController
@RequestMapping("/agenda")
public class AgendaController {
	
	@Autowired
	private AgendaService agendaService;
	
	@PostMapping("/")
	public void incluirAgenda(@RequestBody AgendaDTO dto){
		agendaService.registrarAgenda(dto);
	}
	@GetMapping("/")
	public List<InfoAgendaDTO> listarTodaAgenda(){
        return agendaService.listarTodas();
	}
	
}
