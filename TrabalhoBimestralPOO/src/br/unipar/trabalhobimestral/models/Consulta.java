package br.unipar.trabalhobimestral.models;

import java.util.ArrayList;

public class Consulta {

    private Animal animal;
    private ArrayList<Medicamento> listaMedicamento = new ArrayList<>();
    private ArrayList<Exame> listaExame = new ArrayList<>();
    private String dtConsulta;
    private Double vlrConsulta;
    private Double vlrTotalConsulta;

    public void calculaValorConsulta() {
        Double vlrTotal = 0.0;
        Double vlrMedicamento = 0.0;
        Double vlrExame = 0.0;

        for (int i = 0; i < listaMedicamento.size(); i++) {
            vlrMedicamento = vlrMedicamento + listaMedicamento.get(i).getVlrMedicamento();
        }

        for (int i = 0; i < listaExame.size(); i++) {
            vlrExame = vlrExame + listaExame.get(i).getVlrExame();
        }

        vlrTotal = vlrExame + vlrMedicamento + vlrConsulta;

        System.out.println("Valor total: " + vlrTotal);

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

    public String getDtConsulta() {
        return dtConsulta;
    }

    public void setDtConsulta(String dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public Double getVlrConsulta() {
        return vlrConsulta;
    }

    public void setVlrConsulta(Double vlrConsulta) {
        this.vlrConsulta = vlrConsulta;
    }



    public Double getVlrTotalConsulta() {
        return vlrTotalConsulta;
    }

    public void setVlrTotalConsulta(Double vlrTotalConsulta) {
        this.vlrTotalConsulta = vlrTotalConsulta;
    }

    @Override
    public String toString() {
        return "Consulta{" + "animal=" + animal + ", listaMedicamento=" + listaMedicamento + ", listaExame=" + listaExame + ", dtConsulta=" + dtConsulta + ", vlrConsulta=" + vlrConsulta + ", vlrTotalConsulta=" + vlrTotalConsulta + '}';
    }

}
