package br.unipar.trabalhobimestral.models;

public class Animal {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + '}';
    }

}
