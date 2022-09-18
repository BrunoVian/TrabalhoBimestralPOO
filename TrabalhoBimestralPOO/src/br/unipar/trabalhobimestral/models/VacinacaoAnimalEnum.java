package br.unipar.trabalhobimestral.models;

public enum VacinacaoAnimalEnum {

    EMDIA("Vacinação em dia"),
    ATRASO("Vacinção em atraso"),
    NAOSABE("Não sabe");

    private final String dsEnum;

    private VacinacaoAnimalEnum(String dsEnum) {
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
