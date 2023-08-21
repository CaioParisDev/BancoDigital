package com;

public class Nascimento {
	private Integer ano;
	private Integer mes;
	private Integer dia;
	
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Integer getDia() {
		return dia;
	}
	public void setDia(Integer dia) {
		this.dia = dia;
	}
	
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	
}
