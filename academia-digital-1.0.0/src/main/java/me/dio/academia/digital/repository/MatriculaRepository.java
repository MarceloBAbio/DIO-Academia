package me.dio.academia.digital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import me.dio.academia.digital.entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula,Long>{

    /**
     * Outra maneira de fazer
     * @Query(value = "SELECT * FROM tb_matriculas m "+ "INNER JOIN tb_alunos a ON m.aluno._id = a.id"+ "WHERE a.bairro = :bairro", nativeQuery = true)
     * ou
     * @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro")
     * List < Matricula> findAlunosMatriculadosBairro(String bairro);
     * 
     */
    List<Matricula> findByAlunoBairro(String bairro);
}
