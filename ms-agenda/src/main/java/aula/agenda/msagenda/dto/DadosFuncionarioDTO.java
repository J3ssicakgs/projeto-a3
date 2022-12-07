package aula.agenda.msagenda.dto;

public class DadosFuncionarioDTO {
	private Long id;
    private String nome;
    private String dataAdmissao;
    private String dataNascimento;
    
    public DadosFuncionarioDTO() {
    	
    }
    
    public Long getId() {
    	return id;
    }
    public void setId(Long id) {
    	this.id = id;
    }
    public String getNome() {
    	return nome;
    }
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public String getDataAdmissao() {
    	return dataAdmissao;
    }
    public void setDataAdmissao(String dataAdmissao) {
    	this.dataAdmissao = dataAdmissao;
    }
    public String getDataNascimento() {
    	return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
    	this.dataNascimento = dataNascimento;
    }
    
    @Override
    public String toString() {
    	return "DadosFuncionarioDTO{" + 
    			"id=" + id +
    			", nome=" + nome + 
    			", Data de admissão=" + dataAdmissao +
    			", Data de Nascimento= " + dataNascimento +
    			'\'' + '}';
    }
}
