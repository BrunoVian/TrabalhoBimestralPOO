package br.unipar.trabalhobimestral.models;

public enum PorteAnimalEnum {

    PEQUENO("Pequeno"),
    MEDIO("Médio"),
    GRANDE("Grande");

    private final String dsEnum;

    private PorteAnimalEnum(String dsEnum) {
        this.dsEnum = dsEnum;
    }

    public String getDsEnum() {
        return dsEnum;
    }

    @Override
    public String toString() {
        return dsEnum;
    }
    
    
    
}
