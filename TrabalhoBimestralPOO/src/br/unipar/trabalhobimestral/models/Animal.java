package br.unipar.trabalhobimestral.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Animal {

    private String nome;
    private String sexo;

    public Animal() {
    }

    public Animal(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
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
        Date proximaVacinacao;

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date ultimaVacina = formato.parse(vacinacao.getDataVacina());

        int dias = vacinacao.getVacina().getDiasProxDose();
        System.out.println(dias);
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", sexo=" + sexo + '}';
    }
}
