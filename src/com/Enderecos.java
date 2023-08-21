package com;

public class Enderecos {

	private String cep;
	private String numero;

	public String getCep() {
		return cep;
	}

	public int setCep(String cep) {
		if (cep.length() == 8) {
			this.cep = cep;
			return 1;
		} else {
			System.out.println("CEP inválido.");
			return 0;
		}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
