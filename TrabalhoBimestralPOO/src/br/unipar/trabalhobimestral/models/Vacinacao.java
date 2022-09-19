package br.unipar.trabalhobimestral.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vacinacao {

    private Integer id;
    private Animal animal;
    private Vacina vacina;
    private String dataVacina;

    public Vacinacao() {
    }

    public Vacinacao(Integer id, Animal animal, Vacina vacina, String dataVacina) {
        this.id = id;
        this.animal = animal;
        this.vacina = vacina;
        this.dataVacina = dataVacina;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public String getDataVacina() {
        return dataVacina;
    }

    public void setDataVacina(String dataVacina) {
        this.dataVacina = dataVacina;
    }

    @Override
    public String toString() {
        return "Vacinacao{" + "id=" + id + ", animal=" + animal + "\nvacina=" 
                + vacina + ", dataVacina=" + dataVacina + '}';
    }

}
