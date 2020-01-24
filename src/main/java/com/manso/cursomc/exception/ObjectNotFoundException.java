package com.manso.cursomc.exception;

import com.manso.cursomc.domain.Categoria;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String msg) {
        super(msg);

    }

    public ObjectNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
