package repository;

import jakarta.persistence.*;

@Entity(name = "Aluno")
@Table(name = "Alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String nome;
}
