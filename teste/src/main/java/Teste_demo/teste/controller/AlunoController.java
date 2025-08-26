package controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DadosCadastroAluno;

@RestController //controlador
@RequestMapping("alunos") // requisao mapeada para esse nome
public class AlunoController {


    @PostMapping
    public void Cadastrar(@RequestBody DadosCadastroAluno dadosCadastroAluno){

    }
}
