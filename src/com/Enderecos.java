package com;

public class Enderecos {
	
	public enum Tipos{
		CASA, TRABALHO
	}
	
	public enum Estados {
		ACRE, ALAGOAS, AMAPÁ, AMAZONAS, BAHIA, CEARÁ, DISTRITO_FEDERAL, ESPÍRITO_SANTO, GOIÁS, MARANHÃO,
		MATO_GROSSO, MATO_GROSSO_DO_SUL, MINAS_GERAIS, PARÁ, PARAÍBA, PARANÁ, PERNAMBUCO, PIAUÍ, RIO_DE_JANEIRO,
		RIO_GRANDE_DO_NORTE, RIO_GRANDE_DO_SUL, RONDÔNIA, RORAIMA, SANTA_CATARINA, SÃO_PAULO, SERGIPE, TOCANTINS
	}
	
	Estados estado;
	String cidade;
	String bairro;
	String rua;
	String numero;
	Tipos tipo;
}
