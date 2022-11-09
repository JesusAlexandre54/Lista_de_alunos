package com.example.listadealunos;

public class Aluno {
    private String nome;
    private String morada;
    private String email;

    public Aluno() {
        nome="";
        morada="";
        email="";

    }

    public Aluno(String nome, String morada, String email) {
        this.nome = nome;
        this.morada = morada;
        this.email = email;
    }

    public Aluno(Aluno a) {
        this.nome = a.nome;
        this.morada = a.morada;
        this.email = a.email;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nome;
    }
}
