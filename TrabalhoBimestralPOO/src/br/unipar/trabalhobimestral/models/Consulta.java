package br.unipar.trabalhobimestral.models;

import java.util.ArrayList;

public class Consulta {

    private Animal animal;
    private ArrayList<Medicamento> listaMedicamento = new ArrayList<>();
    private ArrayList<Exame> listaExame = new ArrayList<>();
    private String dtConsulta;
    private Double vlrTotal;

    public Consulta(Animal animal, String dtConsulta, Double vlrTotal) {
        this.animal = animal;
        this.dtConsulta = dtConsulta;
        this.vlrTotal = vlrTotal;
    }

    public Consulta() {
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public ArrayList<Medicamento> getListaMedicamento() {
        return listaMedicamento;
    }

    public void setListaMedicamento(ArrayList<Medicamento> listaMedicamento) {
        this.listaMedicamento = listaMedicamento;
    }

    public ArrayList<Exame> getListaExame() {
        return listaExame;
    }

    public void setListaExame(ArrayList<Exame> listaExame) {
        this.listaExame = listaExame;
    }

    public Double getVlrTotal() {
        return vlrTotal;
    }

    public void setVlrTotal(Double vlrTotal) {
        this.vlrTotal = vlrTotal;
    }

    @Override
    public String toString() {
        return "Consulta{" + "animal=" + animal + ", listaMedicamento=" + listaMedicamento + ", listaExame=" + listaExame + ", dtConsulta=" + dtConsulta + ", vlrTotal=" + vlrTotal + '}';
    }

}
