package br.unipar.trabalhobimestral.models;

public class Exame {
    private Integer id;
    private String nome;
    private Double vlrExame;

    public Exame() {
    }

    public Exame(Integer id, String nome, Double vlrExame) {
        this.id = id;
        this.nome = nome;
        this.vlrExame = vlrExame;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return "Exame{" + "id=" + id + ", nome=" + nome + ", vlrExame=" + vlrExame + '}';
    }
   
}
