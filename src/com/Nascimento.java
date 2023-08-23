package com;

import java.time.LocalDate;

public class Nascimento {

	private Integer ano;
	private Integer mes;
	private Integer dia;

	public Integer getAno() {
		return ano;
	}

	public boolean setAno(Integer ano) {
		int anoAtual = LocalDate.now().getYear();
		if (ano > (anoAtual - 100) && ano < anoAtual) {
			if (ano > anoAtual - 18) {
				System.out.println("Menor de idade não pode abrir uma conta.");
				return true;
			}
			this.ano = ano;
			return false;
		} else {
			System.out.println("O ano digitado ultrapassa o estipulado.");
			return true;
		}
	}

	public Integer getMes() {
		return mes;
	}

	public boolean setMes(Integer mes) {
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
			return false;
		} else {
			System.out.println("Insira um mês válido.");
			return true;
		}
	}

	public Integer getDia() {
		return dia;
	}

	public boolean setDia(Integer dia) {
		if (dia >= 1 && dia <= 31) {
			this.dia = dia;
			return false;
		} else {
			System.out.println("Insira um dia válido");
			return true;
		}
	}

	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

}
