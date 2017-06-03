/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 20162102326
 */
public class Moto extends Veiculos {

    int volumeBagageiro;

    public int getVolumeBagageiro() {
        return volumeBagageiro;
    }

    public void setVolumeBagageiro(int volumeBagageiro) {
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto() {
    }

    public Moto(int volumeBagageiro, int numeroPassageiros, double preco, String proprietario, String marca, String modelo, Motor motor) {
        super(numeroPassageiros, preco, proprietario, marca, modelo, motor);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int volumeBagageiro, int numeroPassageiros, double preco, String proprietario, String marca, Motor motor, String modelo) {
        super(numeroPassageiros, preco, proprietario, marca, motor, modelo);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int volumeBagageiro, int NumeroPassageiros, String proprietario, String marca, double preco, String modelo, Motor motor) {
        super(NumeroPassageiros, proprietario, marca, preco, modelo, motor);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int volumeBagageiro, int NumeroPassageiros, String modelo, double preco, String proprietario, String marca, Motor motor) {
        super(NumeroPassageiros, modelo, preco, proprietario, marca, motor);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int volumeBagageiro, int NumeroPassageiros, String proprietario, String marca, String modelo, double preco, Motor motor) {
        super(NumeroPassageiros, proprietario, marca, modelo, preco, motor);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int volumeBagageiro, int NumeroPassageiros, String proprietario, String marca, String modelo, Motor motor, double preco) {
        super(NumeroPassageiros, proprietario, marca, modelo, motor, preco);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int volumeBagageiro, double preco, int NumeroPassageiros, String proprietario, String marca, String modelo, Motor motor) {
        super(preco, NumeroPassageiros, proprietario, marca, modelo, motor);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int volumeBagageiro, double preco, String proprietario, int NumeroPassageiros, String marca, String modelo, Motor motor) {
        super(preco, proprietario, NumeroPassageiros, marca, modelo, motor);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int volumeBagageiro, double preco, String proprietario, String marca, String modelo, int NumeroPassageiros, Motor motor) {
        super(preco, proprietario, marca, modelo, NumeroPassageiros, motor);
        this.volumeBagageiro = volumeBagageiro;
    }

    public void acelerar() {
        Motor m = new Motor();
        m.rpm += 200;
    }

    public void desacelerar() {
        Motor m = new Motor();
        m.rpm -= 200;
    }

    public void virarEsquerda() {

        System.out.println("Moto " + esquerda);
    }

    public void virarDireita() {

        System.out.println("Moto " + direita);
    }

    public void frear() {
        System.out.println("Moto " + frear);
    }

    public void cadastrar(int NumeroPassageiros, double preco, String proprietario, String marca, String modelo, Motor motor, int volumeBagageiro) {
        super.cadastrar(NumeroPassageiros, preco, proprietario, marca, modelo, motor);
        this.volumeBagageiro = volumeBagageiro;

    }

    public void imprimir() {
        super.imprimir();
        System.out.println("\n O volume do bagageiro é: " + volumeBagageiro);
    }
}
