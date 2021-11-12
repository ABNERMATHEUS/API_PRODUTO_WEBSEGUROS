package com.grupofaculdade.tde01produtoresource.model;

public enum Perfil {

    ADMIN(1, "ROLE_ADMIN"),
    CLIENTE(2, "ROLE_CLIENTE");

    private int cod;
    private String descricao;

    private Perfil(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    // Método para converter um inteiro para o estado pagamento
    public static Perfil toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for(Perfil x : Perfil.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("ID inválido: " + cod);
    }

}