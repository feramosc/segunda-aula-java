package br.com.digitalhouse.objetos;

public class Animal {

    private int idadeAnimal;
    private String nomeAnimal;
    private String corAnimal;
    private String racaAnimal;
    private boolean patasAnimal;

    //construtor padrão
    public Animal (){
    }

    //construtor específico
    public Animal (int idade, String nome, boolean patas){
        this.idadeAnimal = idade;
        this.nomeAnimal = nome;
        this.patasAnimal = patas;
    }

    //acessores
    public int getIdadeAnimal(){
        return idadeAnimal;
    }

    public String getNomeAnimal(){
        return nomeAnimal;
    }

    public String getCorAnimal(){
        return corAnimal;
    }

    public String getRacaAnimal(){
        return racaAnimal;
    }

    public boolean getPatasAnimal(){
        return patasAnimal;
    }

    //modificadores
    public void setIdadeAnimal(int idade){
        this.idadeAnimal = idade;
    }

    public void setNomeAnimal(String nome){
        this.nomeAnimal = nome;
    }

    public void setCorAnimal(String cor){
        this.corAnimal = cor;
    }

    public void setRacaAnimal(String raca){
        this.racaAnimal = raca;
    }

    public void setPatasAnimal(boolean patas){
        this.patasAnimal = patas;
    }

}
