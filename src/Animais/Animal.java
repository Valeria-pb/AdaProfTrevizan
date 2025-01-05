package Animais;

public class Animal {

        protected String nome;
        protected String cor;
        protected int altura;
        protected double peso;
        protected String estadoDeEspirito;

    public Animal(String nome, String cor,  double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public Animal() {
    }

    void comer() {
        }

        void dormir() {
        }

        void soar() {
            System.out.println(" ");
        }
    }

