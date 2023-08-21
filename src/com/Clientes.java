package com;

import java.util.ArrayList;
import java.util.List;

public class Clientes {

	public enum tipoConta {
		CORRENTE, POUPANCA
	}
	public enum tipoPessoa {
		FISICA, JURIDICA
	}
	Documentos documento;
	List<Enderecos> cep = new ArrayList<>();
	
	public String toString() {
		return "" + documento + "";
	}
}