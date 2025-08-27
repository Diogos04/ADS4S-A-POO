package com.dio.party.Model;

import jakarta.persistence.*;

@Entity (name = "TBL_PESSOA")
@Table (name = "PESSOA")
public class PessoaModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public String nome;
    public int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public PessoaModel(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


}
