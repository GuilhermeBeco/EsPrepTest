/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beco.guilherme.modelo;

/**
 *
 * @author guilherme
 */
public class Dono {
    private String nome;
    private String morada;
    private long nif;

    public Dono(String nome, String morada, long nif) {
        this.nome = nome;
        this.morada = morada;
        this.nif = nif;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public long getNif() {
        return nif;
    }

    public void setNif(long nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Dono{" + "nome=" + nome + ", morada=" + morada + ", nif=" + nif + '}';
    }
    
}
