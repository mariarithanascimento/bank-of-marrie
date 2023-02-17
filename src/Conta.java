import java.util.Scanner;

public class Conta extends Main{
    public Conta() {
        Scanner input = new Scanner(System.in);

        System.out.println("Seja bem vindo ao Bank Of Marrie!");
        System.out.println("Verifiquei que é sua primeira vez aqui, vamos fazer seu cadastro? Vai ser rapidinho :)");
        System.out.println("Qual é o seu nome? ");
        String nome = input.next();
        System.out.println("Por favor digite um nome de usuario(somente letras): ");
        String userID = input.next();
        System.out.println("Senha(6 a 8 numeros): ");
        int password = input.nextInt();
        System.out.println("Cadastro concluido com sucesso!!");
        System.out.println("Olá! " + nome + " Em que posso te ajudar?");
        System.out.println("(1) - SALDO\n(2) - SAQUE\n(3) - DEPOSITO");
        int opc = input.nextInt();

        switch (opc) {
            case 1:
                System.out.printf("Seu saldo é: R$" + "%.2f", saldo );
                System.out.println(" ");
                break;
            case 2:
                System.out.print("Qual é o valor você deseja sacar? ");
                double saque = input.nextDouble();
                System.out.println(" ");
                if(saque > saldo){
                    System.out.println("Saldo insulficiente!");
                }else{
                    setSaldo(saldo - saque);
                    System.out.printf("Saque realizado com sucesso!! Seu novo saldo é: R$" + "%.2f", saldo );
                    System.out.println("\n");
                }
                break;

            case 3:
                System.out.print("Qual é o valor você deseja depositar? ");
                double deposito = input.nextDouble();
                setSaldo(saldo + deposito);
                System.out.println("Seu deposito foi finalizado com sucesso!!");
                System.out.printf("Seu saldo é: R$" + "%.2f", saldo );
                System.out.println("\n");
                break;
        }

        System.out.println("Algo mais em que posso te ajudar?\n 1 - Sim \n 2 - Não");
        int opc2 = input.nextInt();

        if(opc2 == 1){
            System.out.println("Em que posso te ajudar?");
            System.out.println("(1) - SALDO\n(2) - SAQUE\n(3) - DEPOSITO");
            int opc3 = input.nextInt();

            switch (opc3) {
                case 1:
                    System.out.printf("Seu saldo é: R$" + "%.2f", saldo );
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Qual é o valor você deseja sacar? ");
                    double saque = input.nextDouble();
                    System.out.println(" ");
                    if(saque > saldo){
                        System.out.println("Saldo insulficiente!");
                    }else{
                        setSaldo(saldo - saque);
                        System.out.printf("Saque realizado com sucesso!! Seu novo saldo é: R$" + "%.2f", saldo );
                        System.out.println("\n");
                    }
                    break;

                case 3:
                    System.out.print("Qual é o valor você deseja depositar? ");
                    double deposito = input.nextDouble();
                    setSaldo(saldo + deposito);
                    System.out.println("Seu deposito foi finalizado com sucesso!!");
                    System.out.printf("Seu saldo é: R$" + "%.2f", saldo );
                    System.out.println("\n");
                    break;
            }
        }else{
            System.out.println("Bank Of Marrie agradece. Até mais!");
        }
        System.out.println("Bank Of Marrie agradece. Até mais!");
    }

    public double getSaldo () {

        return saldo;
    }

    public void setSaldo ( double saldo){

        this.saldo = saldo;
    }

    double saldo;
}

