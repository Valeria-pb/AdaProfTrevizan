package Animais;

public class Gatos extends Animal{
    static int numeroDeGatos;


   // private String nome;
   // private String cor;
   // private int altura;
   // private double peso;
   // private String estadoDeEspirito;

    public Gatos (String nome, String cor, double peso, String estadoDeEspirito) {
        super(nome, cor, peso, estadoDeEspirito);
        numeroDeGatos++;
    }
    @Override
    public void soar() {
        System.out.println("Miau Miau!");
    }

    @Override
    public String toString() {
        return "Gatos{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
    //void comer(){}
    //void dormir(){}
    //void soar(){
    //System.out.println("MIAU MIAU");

