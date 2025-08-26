package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.Aluno;
import repository.AlunoRepository;
import service.DadosCadastroAluno;

@RestController //controlador
@RequestMapping("alunos") // requisao mapeada para esse nome
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @PostMapping
    public void Cadastrar(@RequestBody DadosCadastroAluno dados){
        repository.save( new Aluno(dados));


    }
}
