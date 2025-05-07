package com.sistema.banco.domain.validation;

public interface Validator<T> {

    boolean validate (T value);
    String getMessage();
}
