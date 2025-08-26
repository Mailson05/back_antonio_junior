package repository;

import jakarta.persistence.*;

@Entity(name = "Aluno")
@Table(name = "Alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerando auto incremental
    private Long id;

    private  String nome;
}
