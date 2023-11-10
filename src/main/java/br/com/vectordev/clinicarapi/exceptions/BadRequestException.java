package br.com.vectordev.clinicarapi.exceptions;

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = -5162719555457166224L;

	public BadRequestException(String mensagem) {
		super(mensagem);
	}
}
