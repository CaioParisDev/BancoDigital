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
				
				boolean loop = true;
				do {
					System.out.println("Digite o CPF/CNPJ: ");
					String numero = sc.nextLine();
					loop = documento.setNumero(numero);
				} while (loop);

				do {
					System.out.println("Digite seu nome completo: ");
					String nome = sc.nextLine();
					loop = documento.setNomeCompleto(nome);
				} while (loop);

				Nascimento dataNascimento = new Nascimento();

				do {
					try {
						System.out.println("Insira sua data de nascimento:\nDia: ");
						Integer dia = sc.nextInt();
						loop = dataNascimento.setDia(dia);
					} catch (Exception e) {
						System.out.println("Insira um dia válido.");
						sc.nextLine();
						loop = true;
						
					}
				} while (loop);
				do {
					try {
						System.out.println("Mês (em número): ");
						Integer mes = sc.nextInt();
						loop = dataNascimento.setMes(mes);
					} catch (Exception e) {
						System.out.println("Insira um mês válido.");
						sc.nextLine();
						loop = true;
						
					}
				} while (loop);
				do {
					try {
						System.out.println("Ano: ");
						Integer ano = sc.nextInt();
						loop = dataNascimento.setAno(ano);
					} catch (Exception e) {
						System.out.println("Insira um ano válido.");
						sc.nextLine();
						loop = true;
						
					}
				} while (loop);

				Enderecos endereco = new Enderecos();

				sc.nextLine();
				do {
					System.out.println("Agora, digite o seu CEP: ");
					loop = endereco.setCep(sc.nextLine());
					System.out.println("Digite o número: ");
					endereco.setNumero(sc.nextLine());
				} while (loop);

				System.out.println("Conta criada com sucesso!");
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