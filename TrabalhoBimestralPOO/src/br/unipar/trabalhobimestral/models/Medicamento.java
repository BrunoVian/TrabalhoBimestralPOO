package br.unipar.trabalhobimestral.models;

public class Medicamento {

    private String nome;
    private String vencimento;
    private Double vlrMedicamento;

    public Medicamento(String nome, String vencimento, Double vlrMedicamento) {
        this.nome = nome;
        this.vencimento = vencimento;
        this.vlrMedicamento = vlrMedicamento;
    }

    public Medicamento() {
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
        return "Medicamento{" + "nome=" + nome + ", vencimento=" + vencimento + ", vlrMedicamento=" + vlrMedicamento + '}';
    }

}
