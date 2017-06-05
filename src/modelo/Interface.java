/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DrGreend
 */
public interface Interface {

    static final int tempoMaxUso = 30;
    static final int idadeMinMotorista = 18;
    static final String frear = "Está freiando", direita = "Virando à direita", esquerda = "Virando à esquerda";

    public abstract void getTempoMaxUso();

    public abstract void getIdadeMinMotorista();
}
