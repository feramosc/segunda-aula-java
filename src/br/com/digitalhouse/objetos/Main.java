package br.com.digitalhouse.objetos;

public class Main {

    public static void main (String[] args){

        Animal cachorro = new Animal();

        Animal gato = new Animal(2, "cat", true);

        Animal peixe = new Animal (1,"fish", false);

        gato.setCorAnimal("preto");
        System.out.println("Gato " + gato.getCorAnimal());

    }

}
