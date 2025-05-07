package com.sistema.banco.domain.validation;

public class NomeValidator implements Validator<String>{

    @Override
    public boolean validate(String nome){
        return nome.length() <= 20 && nome.matches("[a-zA-Z]+");
    }

    @Override
    public String getMessage(){
        return "Erro! Nome possui mais de 20 caracteres e/ou possui dígitos!\nFavor corrigir...";
    }
}
