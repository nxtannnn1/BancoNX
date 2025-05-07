package com.sistema.banco.domain.model;

import com.sistema.banco.enums.TipoPessoa;

abstract public class Pessoa { //Atributos da classe Pessoa
    protected String nome;
    protected String cpf;
    protected double saldo;
    protected int idade;
    protected TipoPessoa tipoPessoa;

    public Pessoa(String nome, double saldo, int idade, String cpf, TipoPessoa tipoPessoa) { //Construtor para inicializar atributos
        this.nome = nome;
        this.saldo = saldo;
        this.idade = idade;
        this.cpf = cpf;
        this.tipoPessoa = tipoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}


