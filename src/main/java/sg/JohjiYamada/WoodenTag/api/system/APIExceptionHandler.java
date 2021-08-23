package sg.JohjiYamada.WoodenTag.api.system;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class APIExceptionHandler /* extends ResponseEntityExceptionHandler */ {
	/*
	 * @Override protected ResponseEntity<Object> handleExceptionInternal(Exception
	 * ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request)
	 * { if (body == null) { body = ex.getClass().toString(); } return
	 * super.handleExceptionInternal(ex, body, headers, status, request); }
	 * 
	 * @Override protected ResponseEntity<Object>
	 * handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders
	 * headers, HttpStatus status, WebRequest request) { return
	 * handleExceptionInternal(ex, "MethodArgumentNotValid", headers, status,
	 * request); }
	 * 
	 * @Override protected ResponseEntity<Object> handleBindException(BindException
	 * ex, HttpHeaders headers, HttpStatus status, WebRequest request) { return
	 * handleExceptionInternal(ex, "BindException", headers, status, request); }
	 * 
	 * @ExceptionHandler(ConstraintViolationException.class) public
	 * ResponseEntity<Object> handleConstraintViolation(ConstraintViolationException
	 * ex, WebRequest request) { return handleExceptionInternal(ex, "Constraint",
	 * null, HttpStatus.BAD_REQUEST, request); }
	 */

}