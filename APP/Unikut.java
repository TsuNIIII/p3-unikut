import java.util.LinkedList;
import java.util.Scanner;

public class Unikut {
    private LinkedList<Account> accounts = new LinkedList<Account>();
    private LinkedList<Password> passwords = new LinkedList<Password>();
    private LinkedList<fName> names = new LinkedList<fName>();
    Scanner s = new Scanner(System.in);
    
    public String createAccount(){
        System.out.print("Digite seu Login: ");
        String username = s.next();
        Account c = new Account(username);
        accounts.add(c);
        return username;
    }

    public String createPass(){
        System.out.print("Digite sua Senha: ");
        String pass = s.next();
        Password c = new Password(pass);
        passwords.add(c);
        return pass;
    }

    public String createName(){
        System.out.print("Digite seu Nome Completo: ");
        String name = s.next();
        if (name == null){    //verificar com Neto (enter não conta nulo)
            name = "Convidado";
            fName c = new fName(name);
            names.add(c);
            return name;
        }else{
            fName c = new fName(name);
            names.add(c);
            return name;
        }
    }

    public void verifyAccount (String username){
        for (Account vAccount : accounts){
            if (vAccount.getUsername() == username){
                for (Password vPass : passwords){
                    if (vPass.getPass() == Password){
                        vAccount.login();
                    }
                }
            }
        }
    }
}
