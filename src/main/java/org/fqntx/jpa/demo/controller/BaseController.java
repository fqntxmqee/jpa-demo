
package org.fqntx.jpa.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fqntx.jpa.demo.exp.ErrorMessage;
import org.fqntx.jpa.demo.exp.HttpStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @author <a href="mailto:guoqing.huang@foxmail.com">Guoqing Huang</a>
 *
 * @since 2013-7-5
 * @version
 */
public class BaseController {

    protected final Log    log = LogFactory.getLog(getClass());

    @ResponseBody
    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    protected ErrorMessage handleException(MethodArgumentNotValidException ex) {
        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        List<ObjectError> globalErrors = ex.getBindingResult().getGlobalErrors();
        List<String> errors = new ArrayList<String>(fieldErrors.size() + globalErrors.size());
        String error;
        for (FieldError fieldError : fieldErrors) {
            error = fieldError.getField() + ", " + fieldError.getDefaultMessage();
            errors.add(error);
        }
        for (ObjectError objectError : globalErrors) {
            error = objectError.getObjectName() + ", " + objectError.getDefaultMessage();
            errors.add(error);
        }
        return new ErrorMessage(errors);
    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    protected ResponseEntity<String> handleException(Exception ex) {
        log.error(ex.getMessage(), ex);
        HttpStatus statusCode = HttpStatus.INTERNAL_SERVER_ERROR;
        if (ex instanceof HttpStatusException) {
        	statusCode = ((HttpStatusException) ex).getStatus();
        }
        return new ResponseEntity<String>(ex.getMessage(), statusCode);
    }
}
