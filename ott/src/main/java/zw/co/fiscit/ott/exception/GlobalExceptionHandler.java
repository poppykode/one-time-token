package zw.co.fiscit.ott.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import zw.co.fiscit.ott.model.ErrorDetail;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(OttException.class)
    public ResponseEntity<?> handleGeneralException(OttException ex, WebRequest request){
        ErrorDetail errorDetails = new ErrorDetail(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails,ex.getHttpStatus());
    }

}
