package aula_05_08_2025;

import java.util.Scanner;

public class Agencia_bancaria {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double saldo = 2500.00; 
	        int opcao;
	        System.out.println("");
	        System.out.println("======= MENU ATENDIMENTO BANCÁRIO =======");

	        while (true) {
	        	
	            System.out.println("\n---------------------------------");
	            System.out.println("Selecione uma opção:");
	            System.out.println("");
	            System.out.println("1. Saldo disponível");
	            System.out.println("2. Realizar depósito");
	            System.out.println("3. Realizar saque");
	            System.out.println("4. Sair do sistema");
	            System.out.println("---------------------------------");
	            System.out.print("Digite a opção desejada: ");

	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                	System.out.println("");
	                    System.out.printf("Saldo disponível atual é: R$ %.2f\n", saldo);
	                    break;
	                    
	                case 2:
	                	System.out.println("");
	                    System.out.print("Digite o valor do depósito: R$ ");
	                    double valorDeposito = scanner.nextDouble();
	                    
	                    if (valorDeposito > 0) {
	                        saldo += valorDeposito;
	                        System.out.println("");
	                        System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", valorDeposito);
	                        System.out.println("");
	                        System.out.printf("Novo saldo disponível: R$ %.2f\n", saldo);
	                        
	                    } else {
	                    	System.out.println("");
	                        System.out.println("Valor de depósito inválido. Tente novamente.");
	                    }
	                    break;
	                    
	                case 3:
	                	System.out.println("");
	                    System.out.print("Digite o valor do saque: R$ ");
	                    double valorSaque = scanner.nextDouble();
	                    
	                    if (valorSaque > 0 && valorSaque <= saldo) {
	                        saldo -= valorSaque;
	                        System.out.println("");
	                        System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", valorSaque);
	                        System.out.println("");
	                        System.out.printf("Novo saldo disponível: R$ %.2f\n", saldo);
	                        
	                    } else if (valorSaque > saldo) {
	                    	System.out.println("");
	                        System.out.println("Saldo insuficiente para o saque.");
	                        
	                    } else {
	                    	System.out.println("");
	                        System.out.println("Valor de saque inválido. Tente novamente.");
	                    }
	                    break;
	                    
	                case 4:
	                	System.out.println("");
	                    System.out.println("Sistema encerrado com sucesso...");
	                    scanner.close(); 
	                    
	                    return;
	                    
	                default:
	                	System.out.println("");
	                    System.out.println("Opção inválida. Escolha uma opção válida.");
	            }
	        }
	    }
	} 
