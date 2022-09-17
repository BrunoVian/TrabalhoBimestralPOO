package br.unipar.trabalhobimestral.models;

public class Vacina {

    private Integer id;
    private String nome;
    private int diasProxDose;
    private String lote;

    public Vacina() {
    }

    public Vacina(Integer id, String nome, int diasProxDose, String lote) {
        this.id = id;
        this.nome = nome;
        this.diasProxDose = diasProxDose;
        this.lote = lote;
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

    public int getDiasProxDose() {
        return diasProxDose;
    }

    public void setDiasProxDose(int diasProxDose) {
        this.diasProxDose = diasProxDose;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Vacina{" + "id=" + id + ", nome=" + nome + ", diasProxDose=" + diasProxDose + ", lote=" + lote + '}';
    }

}
