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
    private PorteAnimalEnum porteAnimal;
    private VacinacaoAnimalEnum vacinacaoAnimal;

    public Animal() {
    }

    public Animal(Integer id, String nome, String sexo, Double peso, Proprietario proprietario, PorteAnimalEnum porteAnimal, VacinacaoAnimalEnum vacinacaoAnimal) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.proprietario = proprietario;
        this.porteAnimal = porteAnimal;
        this.vacinacaoAnimal = vacinacaoAnimal;
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

    public PorteAnimalEnum getPorteAnimal() {
        return porteAnimal;
    }

    public void setPorteAnimal(PorteAnimalEnum porteAnimal) {
        this.porteAnimal = porteAnimal;
    }

    public VacinacaoAnimalEnum getVacinacaoAnimal() {
        return vacinacaoAnimal;
    }

    public void setVacinacaoAnimal(VacinacaoAnimalEnum vacinacaoAnimal) {
        this.vacinacaoAnimal = vacinacaoAnimal;
    }

    public static void calculaProximaDose(Vacinacao vacinacao) throws ParseException {
        int diasProxDose = vacinacao.getVacina().getDiasProxDose();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date ultimaVacina = formato.parse(vacinacao.getDataVacina());

        Date proximaVacina = ultimaVacina;
        Calendar c = Calendar.getInstance();
        c.setTime(proximaVacina);

        c.add(Calendar.DAY_OF_YEAR, diasProxDose);
        System.out.println("\nA segunda dose do animal " + vacinacao.getAnimal().getNome() + ", da vacina de " + vacinacao.getVacina().getNome()
                + " será em " + formato.format(c.getTime()));
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", peso=" + peso + "\nproprietario=" + proprietario + ", porteAnimal=" + porteAnimal + ", vacinacaoAnimal=" + vacinacaoAnimal + '}';
    }

}
