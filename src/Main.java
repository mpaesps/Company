import entities.Funcionario;
import entities.FuncionarioTerceirizado;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantidade de Funcionários: ");
        int x = sc.nextInt();
        sc.nextLine();

              for (int i = 1; i <= x ; i++) {
            System.out.println("Dados do empregado " + i + ":");
            System.out.print("O funcionário é terceirizado? [s/n] ");
            String resposta = sc.nextLine();

            if (resposta.equals("s")) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Horas: ");
                int horas = sc.nextInt();
                System.out.print("Valor por hora: ");
                double valorHora = sc.nextDouble();
                System.out.print("Despesa Adicional: ");
                double despesaAdicional = sc.nextDouble();

                FuncionarioTerceirizado funcionarioTerceirizado = new FuncionarioTerceirizado(nome, horas, valorHora, despesaAdicional);
                funcionarios.add(funcionarioTerceirizado);
            }else if (resposta.equals("n")){
                      System.out.print("Nome: ");
                      String nome = sc.nextLine();
                      System.out.print("Horas: ");
                      int horas = sc.nextInt();
                      System.out.print("Valor por hora: ");
                      double valorHora = sc.nextDouble();

                      Funcionario funcionario = new Funcionario(nome, horas, valorHora);
                      funcionarios.add(funcionario);
                  }
                  sc.nextLine();
        }
              sc.close();

        System.out.println("\n\nPagamentos");
        for (Funcionario funcionario: funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Salario: " + funcionario.pagarFuncionario());
        }

    }
}



