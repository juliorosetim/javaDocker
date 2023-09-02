package com.javaDocker.controller;

import com.javaDocker.DTO.PessoaDto;
import com.javaDocker.domain.PessoaDomain;
import com.javaDocker.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PessoaDto pessoaDto;

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/getAll")
    public List<PessoaDomain> getPessoa(){
        return pessoaService.getAll();
    }

    @PostMapping("/savePessoa")
    public ResponseEntity<PessoaDomain> salvePessoa(@RequestBody PessoaDomain pessoaDomain){
        return ResponseEntity.ok(pessoaService.savePessoa(pessoaDomain));
    }

    @DeleteMapping("{id}")
    public void deletePessoa(@PathVariable Long id){
        pessoaService.deletePessoa(id);
    }
}
