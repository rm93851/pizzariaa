package com.itb.inf2am.pizzariaa.model.entity;

public class ItemPedido {

    private Long id;
    private int quantidadeitem;
    private boolean cod_status;
    private String valor_unitario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidadeitem() {
        return quantidadeitem;
    }

    public void setQuantidadeitem(int quantidadeitem) {
        this.quantidadeitem = quantidadeitem;
    }

    public boolean isCod_status() {
        return cod_status;
    }

    public void setCod_status(boolean cod_status) {
        this.cod_status = cod_status;
    }

    public String getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(String valor_unitario) {
        this.valor_unitario = valor_unitario;
    }
}
