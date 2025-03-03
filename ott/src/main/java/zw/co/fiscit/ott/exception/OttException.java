package zw.co.fiscit.ott.exception;

import org.springframework.http.HttpStatus;

import java.io.Serial;

public class OttException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    private final HttpStatus httpStatus;
    public OttException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;

    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
