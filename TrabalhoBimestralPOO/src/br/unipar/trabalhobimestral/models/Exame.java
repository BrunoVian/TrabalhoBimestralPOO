package br.unipar.trabalhobimestral.models;

public class Exame {
    private String nome;
    private Double vlrExame;

    public Exame(String nome, Double vlrExame) {
        this.nome = nome;
        this.vlrExame = vlrExame;
    }

    public Exame() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVlrExame() {
        return vlrExame;
    }

    public void setVlrExame(Double vlrExame) {
        this.vlrExame = vlrExame;
    }

    @Override
    public String toString() {
        return "Exame{" + "nome=" + nome + ", vlrExame=" + vlrExame + '}';
    }
   
}
