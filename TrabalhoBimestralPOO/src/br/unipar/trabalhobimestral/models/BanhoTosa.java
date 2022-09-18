package br.unipar.trabalhobimestral.models;

//Controlar os banhos e tosas que cada animal teve e se há algum banho/tosa marcado.
public class BanhoTosa {

    private Integer id;
    private Animal animal;
    private String dtBanhoTosa;
    private String dtAgendamentoBanhoTosa;
    private boolean banho;
    private boolean tosa;

    public BanhoTosa() {
    }

    public BanhoTosa(Integer id, Animal animal, String dtBanhoTosa, String dtAgendamentoBanhoTosa, boolean banho, boolean tosa) {
        this.id = id;
        this.animal = animal;
        this.dtBanhoTosa = dtBanhoTosa;
        this.dtAgendamentoBanhoTosa = dtAgendamentoBanhoTosa;
        this.banho = banho;
        this.tosa = tosa;
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

    public boolean isBanho() {
        return banho;
    }

    public void setBanho(boolean banho) {
        this.banho = banho;
    }

    public boolean isTosa() {
        return tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }

    public String AgendadoBanhoTosa() {
        String agendado;

        if ("".equals(dtAgendamentoBanhoTosa)) {
            agendado = "\nNão há agendamentos de banho e/ou tosa para o animal";
        } else {
            agendado = "\nHá uma agendamentos de banho e/ou tosa para " + dtAgendamentoBanhoTosa;
        }
        return agendado;
    }

    @Override
    public String toString() {
        return "BanhoTosa{" + "id=" + id + ", animal=" + animal + "\ndtBanhoTosa=" 
                + dtBanhoTosa + ", dtAgendamentoBanhoTosa=" + dtAgendamentoBanhoTosa 
                + ", banho=" + banho + ", tosa=" + tosa + '}';
    }

    
}
