package aula.funcionario.msfuncionario.repository;

import aula.funcionario.msfuncionario.model.Funcionario2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario2, Long> {
	Funcionario2 findFirstByNome(String nome);
}

