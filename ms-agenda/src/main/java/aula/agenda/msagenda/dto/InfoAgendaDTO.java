package aula.agenda.msagenda.dto;

import java.util.List;

public class InfoAgendaDTO {
	 	private Long id;
	    private String nomeAgenda;
	    private String nomeFuncionario;
	    private List<String> nomesSala;
	    
	    public InfoAgendaDTO() {
	    	
	    }
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }
	    public String getNomeAgenda() {
	        return nomeAgenda;
	    }

	    public void setNomeAgenda(String nomeAgenda) {
	        this.nomeAgenda = nomeAgenda;
	    }
	    public String getNomeFuncionario() {
	        return nomeFuncionario;
	    }

	    public void setNomeFuncionario(String nomeFuncionario) {
	        this.nomeFuncionario = nomeFuncionario;
	    }
	    public List<String> getNomesSala() {
	        return nomesSala;
	    }

	    public void setNomesSala(List<String> nomesSala) {
	        this.nomesSala = nomesSala;
	    }

}
