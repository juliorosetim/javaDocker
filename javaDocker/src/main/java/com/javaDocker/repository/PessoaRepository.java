package com.javaDocker.repository;

import com.javaDocker.domain.PessoaDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaDomain, Long> {
}
