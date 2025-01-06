import Animais.Animal;
import Animais.Cachorro;
import Animais.Gatos;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {

    public static void main(String[] ada) {

        Cachorro cachorro1 = new Cachorro(20, "Nina", "Marrom", 50, 12, "nada");
        Cachorro cachorro2 = new Cachorro(40,"Jolie","marrom",30,5,"nada");
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
        Gatos gato1 = new Gatos("frajola", "cinza", 7, "nada");
        System.out.println(gato1.toString());
        Passaro passaro1= new Passaro("pirata", "verde", 1, "nada");
        System.out.println(passaro1.toString());
        passaro1.soar();
        gato1.soar();
        Petshop petshop = new Petshop();
        petshop.darBanho(cachorro2);
        System.out.println(cachorro2.getEstadoDeEspirito());

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());
        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());
// sobre Polimorfismo
        // bem complexo
Gatos gato0= new Gatos ("Felix", "Branco", 8,"nada");
Animal gato2 = new Gatos ("Felix", "Branco", 8,"nada");
Animal animal4 = new Passaro ("Felix", "Branco", 8,"nada");



       //cachorro1.setNome("Nina");
       // cachorro1.setCor("Caramelo");
       //  cachorro1.setPeso(25.00);
       // cachorro1.setAltura(45);
       // cachorro1.setTamanhoDoRabo(10);
       //System.out.println(cachorro1); imprime o endereço de memória do objeto


 // cachorro1.latir();
  //System.out.println("O cachorro pegou a : " + cachorro1.pegar());
  //System.out.println("O cachorro está: "+ cachorro1.interagir("Carinho"));
  //System.out.println("O cachorro está: "+ cachorro1.interagir("Vai dormir"));
  //System.out.println("O cachorro está: "+ cachorro1.interagir("Nada!"));
  //System.out.println("O cachorro está: "+ cachorro1.interagir("Pisar na patinha"));
  //System.out.println("O cachorro está: "+ cachorro1.interagir("Dar comida"));
    }



}