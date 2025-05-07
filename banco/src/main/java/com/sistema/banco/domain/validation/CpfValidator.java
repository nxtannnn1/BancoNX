package com.sistema.banco.domain.validation;

public class CpfValidator implements Validator<String>{

@Override
public boolean validate(String cpf){
    return cpf != null && cpf.length()==11 && cpf.matches("\\d{11}");
}

@Override
public String getMessage(){
    return "Erro! CPF possui caracteres insuficientes!\nFavor corrigir...";
}
}
