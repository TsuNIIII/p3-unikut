public class Password {
    protected String pwd;

    public Password(String pass){
        this.pwd = pass;
        System.out.println("Senha criada");
    }

    public String getPass(){
        return pwd;
    }
}
