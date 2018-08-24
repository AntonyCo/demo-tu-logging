package dev.exception;

public class CalculException extends RuntimeException{
	public CalculException(){
		super("L'expression est invalide !");
	}
	public CalculException(String msg){
		super(msg);
	}
}
