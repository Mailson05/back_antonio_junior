package repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository< Aluno, Long> {
    void save(Aluno aluno);
}
