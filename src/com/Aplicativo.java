package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Clientes> cliente = new ArrayList<>();
		int opção = 0;
		do {
			try {
				System.out.println("1.Cadastrar-se\n2.Entrar\n3.Sair");
				opção = sc.nextInt();
				sc.nextLine();
				switch (opção) {
				case 1:
					Documentos documento = new Documentos();

					int numeroDocumento = 0;
					do {
						System.out.println("Digite o CPF/CNPJ: ");
						numeroDocumento = documento.setNumero(sc.nextLine());
					} while (numeroDocumento == 0);

					int nome = 0;
					do {
						System.out.println("Digite seu nome completo");
						nome = documento.setNomeCompleto(sc.nextLine());
					} while (nome == 0);
					break;
				case 2:
					break;
				case 3:
					break;
				default:
					System.out.println("\nOpção inválida.\n");
				}
			} catch (Exception e) {
				System.out.println("O valor digitado não é um número");
				sc.nextLine();
			}
		} while (opção != 3);
		sc.close();
	}
}