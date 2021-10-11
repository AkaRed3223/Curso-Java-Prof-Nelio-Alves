package CursoJava.secao15_Tratamento_de_Excecoes.ex01_ContaBancaria.model.exceptions;

import java.io.Serial;

public class BusinessException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public BusinessException (String msg) {
        super(msg);
    }
}
