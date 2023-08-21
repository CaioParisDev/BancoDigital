package com;

import java.time.LocalDate;

public class Nascimento {

	private Integer ano;
	private Integer mes;
	private Integer dia;

	public Integer getAno() {
		return ano;
	}

	public int setAno(Integer ano) {
		int anoAtual = LocalDate.now().getYear();
		System.out.println(anoAtual);
		if (ano > (anoAtual - 100) && ano < anoAtual) {
			if (ano > anoAtual - 18) {
				System.out.println("Menor de idade não pode abrir uma conta.");
				return 0;
			}
			this.ano = ano;
			return 1;
		} else {
			System.out.println("O ano digitado ultrapassa o estipulado.");
			return 0;
		}
	}

	public Integer getMes() {
		return mes;
	}

	public int setMes(Integer mes) {
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
			return 1;
		} else {
			System.out.println("Insira um mês válido.");
			return 0;
		}
	}

	public Integer getDia() {
		return dia;
	}

	public int setDia(Integer dia) {
		if (dia >= 1 && dia <= 31) {
			this.dia = dia;
			return 1;
		} else {
			System.out.println("Insira um dia válido");
			return 0;
		}
	}

	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

}
