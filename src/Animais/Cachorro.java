package Animais;
// usando o encapsulamento /modificadores de acesso

public class Cachorro extends Animal{
    static  int numeroDoCachorro;
    // acesso privado dos atributos
    //private String nome;
    //private String cor;
    //private int altura;
    //private double peso;
    private int tamanhoDoRabo;
    //private String estadoDeEspirito;

    // contrutor padrão
    //public Cachorro(String nome, String cor, int altura, int peso, int tamanhoDoRabo, String estadoDeEspirito) {}

    public Cachorro(int altura, String nome, String cor, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        this.altura = altura;
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
        numeroDoCachorro ++;
    }

    // contrutores adicionados
    //public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }
//public String nome;
    //public String cor;
    //public int altura;
    //public double peso;
    //public int tamanhoDoRabo;
    //public String estadoDeEspirito;

    public void comer(){

    }
    //public void latir(){System.out.println("AU AU");}
    public String pegar(){
        return "Bolinha";
    }
    public String interagir(String acao){
        switch(acao){
            case "Carinho" : this.estadoDeEspirito = "Feliz";break;
            case "Vai dormir" : this.estadoDeEspirito = "Bravo";break;
            case "Pisar na patinha" :this.estadoDeEspirito = "Triste";break;
            case "Dar comida" : this.estadoDeEspirito = "Super feliz!";break;
            default : this.estadoDeEspirito = "Neutro";
           } return this.estadoDeEspirito;
        /* forma mais verboza
        if (acao.equals("carinho")){
            this.estadoDeEspirito = "Feliz";
            }
        else if (acao.equals("Vai Dormir!")) {
            this.estadoDeEspirito = "Bravo";
        }else{
            this.estadoDeEspirito = "Neutro";
        }
        return estadoDeEspirito;
         */
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
    @Override
    public void soar() {
        System.out.println("au au!");
    }
}

