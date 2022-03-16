public class Account {
    private String accountUser;

    public Account(String username){
        this.accountUser = username;
        System.out.println("Login criado");
    }

    public String getUsername(){
        return accountUser;
    }

    public void login(){
        System.out.println("Bem vindo ao Login");
    }
}
