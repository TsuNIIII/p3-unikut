public class fName {
    private String fullName;

    public fName(String name){
        this.fullName = name;
        System.out.println("Nome Cadastrado");
    }

    public String getName(){
        return fullName;
    }
}