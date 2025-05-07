package com.sistema.banco.domain.model;

import com.sistema.banco.enums.TipoPessoa;

public class Cliente extends Pessoa{

    public Cliente (String nome, double saldo, int idade, String cpf, TipoPessoa tipoPessoa) { //Construtor para inicializar atributos
        super(nome, saldo, idade, cpf, tipoPessoa);
    }

    public Cliente (){
        this("Natan", 500.0, 21, "12345678901", TipoPessoa.CPF);
    }

}
