package com.masai.exception;

import java.beans.EventHandler;
import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Myerror> methpodInvalidException(MethodArgumentNotValidException ce,WebRequest req){
		Myerror err=new Myerror();
		err.setDate(LocalDate.now());
		err.setMessage(ce.getMessage());
		err.setDescription(req.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.OK);
	}
	
	@ExceptionHandler(EventException.class)
	public ResponseEntity<Myerror> EventHandlesr(EventException ce,WebRequest req){
		Myerror err=new Myerror();
		err.setDate(LocalDate.now());
		err.setMessage(ce.getMessage());
		err.setDescription(req.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.OK);
		
	}
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<Myerror> userException(UserException ce,WebRequest req){
		Myerror err=new Myerror();
		err.setDate(LocalDate.now());
		err.setMessage(ce.getMessage());
		err.setDescription(req.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.OK);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Myerror> AllException(Exception ce, WebRequest req){
		Myerror err=new Myerror();
		err.setDate(LocalDate.now());
		err.setMessage(ce.getMessage());
		err.setDescription(req.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.OK);
		
	}

}
