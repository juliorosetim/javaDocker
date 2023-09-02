package com.javaDocker.service;

import com.javaDocker.domain.PessoaDomain;
import com.javaDocker.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaDomain> getAll(){
        return pessoaRepository.findAll();
    }

    public PessoaDomain savePessoa(PessoaDomain pessoaDomain){
        return pessoaRepository.save(pessoaDomain);
    }

    public void deletePessoa(Long id){
        pessoaRepository.deleteById(id);
    }
}
