/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beco.guilherme.modelo;

import com.beco.guilherme.modelo.Marca.MARCA;

/**
 *
 * @author guilherme
 */
public class Veiculo {
    private int numeroSerie;
    private MARCA marca;
    private Data data;
    private Dono dono;

    public Veiculo(int numeroSerie, MARCA marca, Data data,Dono dono) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.data = data;
        this.dono=dono;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
    
    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public MARCA getMarca() {
        return marca;
    }

    public void setMarca(MARCA marca) {
        this.marca = marca;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "numeroSerie=" + numeroSerie + ", marca=" + marca + ", data=" + data + '}';
    }
    
           
}
