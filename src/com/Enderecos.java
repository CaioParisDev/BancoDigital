package com;

public class Enderecos {
	
	private String tipo;
	private String cep;
	private String numero;
	
	public Enderecos() {}
	
	public Enderecos(String cep, String numero) {
		this.cep = cep;
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public boolean setCep(String cep) {
		if (cep.length() == 8) {
			try {
				Integer.parseInt(cep);
				this.cep = cep;
				return false;
			} catch (Exception e) {
				System.out.println("\nO valor contém letras.\n");
				return true;
			}
		} else {
			System.out.println("CEP inválido.");
			return true;
		}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
