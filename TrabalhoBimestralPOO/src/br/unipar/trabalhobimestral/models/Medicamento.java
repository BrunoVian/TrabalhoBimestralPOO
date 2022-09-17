package br.unipar.trabalhobimestral.models;

public class Medicamento {

    private Integer id;
    private String nome;
    private String vencimento;
    private Double vlrMedicamento;

    public Medicamento(Integer id, String nome, String vencimento, Double vlrMedicamento) {
        this.id = id;
        this.nome = nome;
        this.vencimento = vencimento;
        this.vlrMedicamento = vlrMedicamento;
    }

    public Medicamento() {
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

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public Double getVlrMedicamento() {
        return vlrMedicamento;
    }

    public void setVlrMedicamento(Double vlrMedicamento) {
        this.vlrMedicamento = vlrMedicamento;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "id=" + id + ", nome=" + nome + ", vencimento=" + vencimento + ", vlrMedicamento=" + vlrMedicamento + '}';
    }

}
