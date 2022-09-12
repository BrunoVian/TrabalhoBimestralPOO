package br.unipar.trabalhobimestral.models.pessoa;

public class Pessoa {
    
    private Integer id;
    private String nome;
    private String cpf;
    private String rg;
    private Endereco endereco;
    private String dataNasc;
    private Contato contato;

    public Pessoa(Integer id, String nome, String cpf, String rg, Endereco endereco, String dataNasc, Contato contato) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
        this.contato = contato;
    }

    public Pessoa() {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", \nendereco=" + endereco + ", \ndataNasc=" + dataNasc + ", contato=" + contato + '}';
    }

}
