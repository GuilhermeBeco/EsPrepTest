/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beco.guilherme.modelo;

import java.util.ArrayList;

/**
 *
 * @author guilherme
 */
public class DadosAplicacao {
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Utilizador> utilizador;
    private ArrayList<Dono> donos;
    private static DadosAplicacao INSTANCE;

    public DadosAplicacao() {
        veiculos= new ArrayList();
        utilizador= new ArrayList();
        donos=new ArrayList();
    }
    
    public void adicioarVeiculo(Veiculo veiculo){
      /*  boolean pronto=true;
        for (Veiculo veiculo1 : veiculos) {
            if(veiculo1.getNumeroSerie()==veiculo.getNumeroSerie()){
                pronto = false;
            }
        }
        if(pronto){
            veiculos.add(veiculo);
        }
        else{
            System.out.println("Veiculo nao inserido");
        }*/ //esta procura nao e aqui
      veiculos.add(veiculo);
    }
    public void atualizarVeiculo(int numeroSerie,Veiculo veiculo){
        int y=0;  
        int index=0;
        for (Veiculo v : veiculos) {
            if(veiculo.getNumeroSerie()==numeroSerie){
               index=y; 
            }
            y++;
        }
        veiculos.set(index, veiculo);
    }
    public void atualizarDono(Veiculo v,Dono d){
        int index=0;
        int y=0;
        for (Veiculo vei : veiculos) {
            if(vei.getNumeroSerie()==v.getNumeroSerie()){
               index=y; 
            }
            y++;
        }
        Veiculo aTrespassar = veiculos.get(index);
        aTrespassar.setDono(d);
        atualizarVeiculo(aTrespassar.getNumeroSerie(),aTrespassar);
        
    }
    public boolean procurarNumeroSerie (int numeroSerie){
        for (Veiculo veiculo : veiculos) {
            if(veiculo.getNumeroSerie()==numeroSerie){
                return true;
            }
        }
        return false;
    }
  
    public static DadosAplicacao getInstance(){
        if(INSTANCE==null){
        INSTANCE=new DadosAplicacao();
        
        }
        return INSTANCE;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public ArrayList<Utilizador> getUtilizador() {
        return utilizador;
    }
    public void addUser(Utilizador user){
        utilizador.add(user);
    }

    public ArrayList<Dono> getDonos() {
        return donos;
    }
    public void addDono(Dono dono){
        donos.add(dono);
    }
    
    
}
