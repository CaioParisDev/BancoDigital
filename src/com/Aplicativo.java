package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Clientes> cliente = new ArrayList<>();
		int opcao = 0;
		do {
			try {
				System.out.println("1.Cadastrar-se\n2.Entrar\n3.Sair");
				opcao = sc.nextInt();
			} catch (Exception e) {
				System.out.println("O valor digitado não é um número");
				sc.nextLine();
			}
		
		switch (opcao) {
		case 1:
			sc.nextLine();
			Documentos documento = new Documentos();

			int numeroDocumento = 0; //Serve para verificar se o método foi executado do jeito esperado
			do {					 //As funções returnam 1 para: "realizado" e 0 para: "fazer novamente"
				System.out.println("Digite o CPF/CNPJ: ");
				numeroDocumento = documento.setNumero(sc.nextLine());
			} while (numeroDocumento != 1);

			System.out.println("Digite seu nome completo: ");
			documento.setNomeCompleto(sc.nextLine());

			Nascimento dataNascimento = new Nascimento();
			int data = 0;
			int mes = 0;
			int ano = 0;
			do {
				try {
					System.out.println("Insira sua data de nascimento:\nDia: ");
					data = dataNascimento.setDia(sc.nextInt());
				} catch (Exception e) {
					System.out.println("Insira um dia válido.");
					sc.nextLine();
				}
			} while (data != 1);
			do {
				try {
					System.out.println("Mês (em número): ");
					mes = dataNascimento.setMes(sc.nextInt());
				} catch (Exception e) {
					System.out.println("Insira um mês válido.");
					sc.nextLine();
				}
			} while (mes != 1);
			do {
				try {
					System.out.println("Ano: ");
					ano = dataNascimento.setAno(sc.nextInt());
				} catch (Exception e) {
					System.out.println("Insira um ano válido.");
					sc.nextLine();
				}
			} while (ano != 1);
			documento.setDataNascimento(dataNascimento);
			System.out.println(documento);

			break;
		case 2:
			break;
		case 3:
			break;
		default:
			System.out.println("\nOpção inválida.\n");
		}
		} while (opcao != 3);

		sc.close();
	}
}