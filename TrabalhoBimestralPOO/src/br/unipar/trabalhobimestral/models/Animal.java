package br.unipar.trabalhobimestral.models;

import br.unipar.trabalhobimestral.models.pessoa.Proprietario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Animal {
    private Integer id;
    private String nome;
    private String sexo;
    private Double peso;
    private Proprietario proprietario;

    public Animal() {
    }

    public Animal(Integer id, String nome, String sexo, Double peso, Proprietario proprietario) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.proprietario = proprietario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public static void segundaDose(Vacina vacina) {

    }

    public static void calculaProximaDose(Vacinacao vacinacao) throws ParseException {
        Date proximaVacinacao = new Date();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date ultimaVacina = formato.parse(vacinacao.getDataVacina());

        proximaVacinacao.setDate(proximaVacinacao.getDate() + 10);

        System.out.println("Daqui há dez dias: " + formato.format(proximaVacinacao));

        int dias = vacinacao.getVacina().getDiasProxDose();
        System.out.println(dias);
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", peso=" + peso + ", proprietario=" + proprietario + '}';
    }

}
