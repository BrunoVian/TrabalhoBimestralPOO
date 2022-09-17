package br.unipar.trabalhobimestral.models;

//Controlar os banhos e tosas que cada animal teve e se há algum banho/tosa marcado.
public class BanhoTosa {

    private Animal animal;
    private String dtBanhoTosa;
    private String dtAgendamentoBanhoTosa;

    public BanhoTosa() {
    }

    public BanhoTosa(Animal animal, String dtBanhoTosa, String dtAgendamentoBanhoTosa) {
        this.animal = animal;
        this.dtBanhoTosa = dtBanhoTosa;
        this.dtAgendamentoBanhoTosa = dtAgendamentoBanhoTosa;
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
        return "BanhoTosa{" + "animal=" + animal + ", dtBanhoTosa=" + dtBanhoTosa + ", dtAgendamentoBanhoTosa=" + dtAgendamentoBanhoTosa + '}';
    }

}
