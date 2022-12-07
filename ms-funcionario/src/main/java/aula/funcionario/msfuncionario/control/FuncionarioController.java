package aula.funcionario.msfuncionario.control;

import aula.funcionario.msfuncionario.dto.FuncionarioDTO;
import aula.funcionario.msfuncionario.model.Funcionario2;
import aula.funcionario.msfuncionario.repository.FuncionarioRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {	
    @Autowired
    private FuncionarioRepository acoes;

    @GetMapping("/")
    public List<FuncionarioDTO> listarTodosFuncionarios(){
        List<Funcionario2> funcionarioList = acoes.findAll();
        List<FuncionarioDTO> dtos = FuncionarioDTO.converteListaDTO(funcionarioList);
        return dtos;
    }
    @GetMapping("/{id}")
    public FuncionarioDTO consutarPorId(@PathVariable(name = "id")Long id){
        Funcionario2 funcionario = acoes.getReferenceById(id);
        return new FuncionarioDTO(funcionario);
    }
    @PostMapping("/")
    public void inserirFuncionario(@RequestBody FuncionarioDTO dto){
        Funcionario2 funcionario = dto.converteFuncionario();
        acoes.save(funcionario);
    }
    @PutMapping("/{id}")
    public FuncionarioDTO alterarFuncionario(@PathVariable(name = "id")Long id, @RequestBody FuncionarioDTO dto){
        Funcionario2 funcionarioBase = acoes.getReferenceById(id);
        dto.setId(funcionarioBase.getId());
        Funcionario2 funcionarioAlterado = dto.converteFuncionario();
        acoes.save(funcionarioAlterado);
        return dto;
    }
    @DeleteMapping("/{id}")
    public FuncionarioDTO deletarFuncionario(@PathVariable(name = "id")Long id){
        Funcionario2 funcionario = acoes.getReferenceById(id);
        FuncionarioDTO dto = new FuncionarioDTO(funcionario);
        acoes.delete(funcionario);
        return dto;
    }
}
