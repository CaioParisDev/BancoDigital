package com;

public class Documentos {
	private static final int tamanhoCPF = 11;
	private static final int tamanhoCNPJ = 14;
	private String nomeCompleto;
	private String numeroDocumento;
	
	public void setNumeroDocumento(String numeroDocumento) {
		if (this.numeroDocumento == null || this.numeroDocumento.isEmpty()) {
			this.numeroDocumento = new String();
		}
		this.numeroDocumento = numeroDocumento;
	}
	
}