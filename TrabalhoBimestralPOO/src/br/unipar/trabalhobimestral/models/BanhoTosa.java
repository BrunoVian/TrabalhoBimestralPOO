package br.unipar.trabalhobimestral.models;

//Controlar os banhos e tosas que cada animal teve e se há algum banho/tosa marcado.
public class BanhoTosa {

    private Integer id;
    private Animal animal;
    private String dtBanhoTosa;
    private String dtAgendamentoBanhoTosa;

    public BanhoTosa() {
    }

    public BanhoTosa(Integer id, Animal animal, String dtBanhoTosa, String dtAgendamentoBanhoTosa) {
        this.id = id;
        this.animal = animal;
        this.dtBanhoTosa = dtBanhoTosa;
        this.dtAgendamentoBanhoTosa = dtAgendamentoBanhoTosa;
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

    public String getDtBanhoTosa() {
        return dtBanhoTosa;
    }

    public void setDtBanhoTosa(String dtBanhoTosa) {
        this.dtBanhoTosa = dtBanhoTosa;
    }

    public String getDtAgendamentoBanhoTosa() {
        return dtAgendamentoBanhoTosa;
    }

    public void setDtAgendamentoBanhoTosa(String dtAgendamentoBanhoTosa) {
        this.dtAgendamentoBanhoTosa = dtAgendamentoBanhoTosa;
    }

    public String AgendadoBanhoTosa() {
        String agendado;

        if ("".equals(dtAgendamentoBanhoTosa)) {
            agendado = "Não há agendamentos para o animal";
        } else {
            agendado = "Há uma agendamento para " + dtAgendamentoBanhoTosa;
        }
        return agendado;
    }

    @Override
    public String toString() {
        return "BanhoTosa{" + "id=" + id + ", animal=" + animal + ", dtBanhoTosa=" + dtBanhoTosa + ", dtAgendamentoBanhoTosa=" + dtAgendamentoBanhoTosa + '}';
    }

}
