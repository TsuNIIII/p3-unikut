import java.util.Scanner;
import APP.Unikut;

public class mainAPP {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int option = 0;
        Unikut unikutApp = new Unikut();

        System.out.println("Bem vindo à UNIKUT\nA rede social mais antisocial do mundo !\n");

        do{
            System.out.println("1. Login");
            System.out.println("2. Cadastro");
            System.out.println("3. Sair");
            System.out.println("O que deseja fazer ?");
            option = s.nextInt();
            if(option == 1){
                System.out.print("Digite seu login:");
                String username = s.next();
                System.out.print("Digite sua senha:");
                String pass = s.next();
            }else if(option == 2){
                unikutApp.createAccount();
                unikutApp.createPass();
                unikutApp.createName();
                System.out.println("Conta Criada com Sucesso!");
            }

        }while(option != 3);
        System.out.println("Volte sempre (ou não)");
        s.close();
    }
}
