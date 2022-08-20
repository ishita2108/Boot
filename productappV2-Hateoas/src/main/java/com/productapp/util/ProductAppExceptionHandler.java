package com.productapp.util;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.productapp.dto.ErrorDetails;
import com.productapp.exceptions.ProductNotFoundException;

@RestControllerAdvice
public class ProductAppExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorDetails> handle404(ProductNotFoundException ex, WebRequest req){
		ErrorDetails details=new ErrorDetails();
		details.setDate(LocalDateTime.now());
		details.setName("rgupta.mtech@gmail.com");
		details.setMessage(ex.getMessage());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(details);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handle500(Exception ex, WebRequest req){
		ErrorDetails details=new ErrorDetails();
		details.setDate(LocalDateTime.now());
		details.setName("rgupta.mtech@gmail.com");
		details.setMessage("Internal Server Error, Please try again later!");
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(details);
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex) {

		Map<String, String> errorMap = new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error -> {
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		return errorMap;
	}
}
