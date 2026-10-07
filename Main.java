package Trabalho_Arthur_Pereira_POO;
 
import java.util.Scanner; //biblioteca para escanear os dados que o usuário pode escrever
 
public class Main {
 
public static void main(String[] args) {
 
Scanner scanner = new Scanner(System.in);
Locadora locadora = new Locadora();
 
  int opcao =-1;
 
  while (opcao != 0) {
  System.out.println("===== Locadora Orientada a Objetos LTDA =====");   //menu inicial do sistema
  System.out.println("1 - Cadastrar Carro de Passeio");
  System.out.println("2 - Cadastrar Caminhao");
  System.out.println("3 - Listar veiculos da frota");
  System.out.println("4 - Buscar veiculo por placa");
  System.out.println("5 - Associar cliente a um veiculo");
  System.out.println("6 - Calcular faturamento total previsto");
  System.out.println("0 - Sair");
  System.out.print("Escolha uma opcao: ");
  opcao = scanner.nextInt();
  scanner.nextLine();

  //escolha da opção pelo usuário e o que cada menu abre a depender do que se pretende fazer no sistema

if (opcao == 1) {
 
  System.out.print("Placa: ");
  String placa = scanner.nextLine();
  System.out.print("Modelo: ");
  String modelo = scanner.nextLine();
  System.out.print("Valor da diaria base: ");
  double valorDiaria = scanner.nextDouble();
  System.out.print("Quantidade de portas: ");
  int portas = scanner.nextInt();
  scanner.nextLine();
  System.out.print("Possui ar-condicionado (true/false): "); //coloquei assom por conta do Boolean, mas poderia ser com s/n
  boolean ar = scanner.nextBoolean();
 
  CarroPasseio carro = new CarroPasseio(placa, valorDiaria, modelo, null, portas, ar);
  locadora.cadastrarVeiculo(carro);
  } else if (opcao == 2) {
 
  System.out.print("Placa: ");
  String placa = scanner.nextLine();
  System.out.print("Modelo: ");
  String modelo = scanner.nextLine();
  System.out.print("Valor da diaria base: ");
  double valorDiaria = scanner.nextDouble();
  System.out.print("Capacidade de carga (toneladas): ");
  double capacidade = scanner.nextDouble();
  System.out.print("Numero de eixos: ");
  int eixos = scanner.nextInt();
 
  Caminhao caminhao = new Caminhao(placa, valorDiaria, modelo, null, capacidade, eixos);
  locadora.cadastrarVeiculo(caminhao);
 
  } else if (opcao == 3) {
 
  locadora.listarVeiculos();
 
  } else if (opcao == 4) {
 
  System.out.print("Digite a placa a buscar: ");
  String placa = scanner.nextLine();
  Veiculo veiculo = locadora.buscarPorPlaca(placa);
 
  if (veiculo == null) {
  System.out.println("Veiculo nao encontrado.");
  } else {
  veiculo.exibirFichaDetalhada();
  }
 
  } else if (opcao == 5) {
 
  System.out.print("Placa do veiculo: ");
  String placa = scanner.nextLine();
  Veiculo veiculo = locadora.buscarPorPlaca(placa);
 
  if (veiculo == null) {
  System.out.println("Veiculo nao encontrado.");
  } else {
  System.out.print("Nome do cliente: ");
  String nome = scanner.nextLine();
  System.out.print("CPF: ");
  String cpf = scanner.nextLine();
  System.out.print("CNH: ");
  String cnh = scanner.nextLine();
 
  Cliente cliente = new Cliente(nome, cpf, cnh);
  veiculo.associarLocatario(cliente);
  }
 
  } else if (opcao == 6) {
 
  System.out.print("Para quantos dias deseja calcular o faturamento? ");
  int dias = scanner.nextInt();
  double total = locadora.calcularFaturamentoTotal(dias);
  System.out.println("Faturamento total previsto: " + total);
 
  } else if (opcao != 0) {
 
  System.out.println("ERRO: Opção invalida!");
    }
  }
 
  scanner.close(); //fim da leitura de scanner
    }
}