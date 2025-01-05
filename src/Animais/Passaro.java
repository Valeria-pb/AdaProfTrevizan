package Animais;

public class Passaro extends Animal {
    static int numeroDepassaros;

    /*
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito;
    */

    public Passaro(String nome, String cor, double peso, String estadoDeEspirito) {
        super(nome, cor, peso, estadoDeEspirito);
        numeroDepassaros++;
    }

    /*
    void comer(){}
    void dormir(){}
    void soar(){
        System.out.println("piu piu!");

     */

    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
   public void soar() {
        System.out.println("piu piu!");
    }
}

