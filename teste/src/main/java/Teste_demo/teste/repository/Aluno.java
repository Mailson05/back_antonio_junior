package repository;

import jakarta.persistence.*;
import service.DadosCadastroAluno;

@Entity(name = "Aluno")
@Table(name = "Alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String nome;

    public Aluno(DadosCadastroAluno dados){
        this.nome = dados.nome(); //this diferencial do nome da classe, ele so nasce dentro

    }


}
