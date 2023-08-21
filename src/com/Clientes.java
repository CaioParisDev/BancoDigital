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
	String nome;
	Documentos documento;
	List<Enderecos> endereco = new ArrayList<>();
	
}