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
public class Carro extends Veiculos {

    int volumeMala;

    public int getVolumeMala() {
        return volumeMala;
    }

    public void setVolumeMala(int volumeMala) {
        this.volumeMala = volumeMala;
    }

    public void acelerar() {
        Motor m = new Motor();
        m.rpm += 100;
    }

    public void desacelerar() {

    }

    public void virarEsquerda() {

        System.out.println("Carro " + esquerda);
    }

    public void virarDireita() {

        System.out.println("Carro " + direita);
    }

    public void frear() {
        System.out.println("Carro " + frear);
    }

    public Carro() {
    }

    public Carro(int volumeMala, int NumeroPassageiros, double preco, String proprietario, String marca, String modelo, Motor motor) {
        super(NumeroPassageiros, preco, proprietario, marca, modelo, motor);
        this.volumeMala = volumeMala;
    }

    public Carro(int volumeMala, int NumeroPassageiros, double preco, String proprietario, String marca, Motor motor, String modelo) {
        super(NumeroPassageiros, preco, proprietario, marca, motor, modelo);
        this.volumeMala = volumeMala;
    }

    public Carro(int volumeMala, int NumeroPassageiros, String proprietario, String marca, double preco, String modelo, Motor motor) {
        super(NumeroPassageiros, proprietario, marca, preco, modelo, motor);
        this.volumeMala = volumeMala;
    }

    public Carro(int volumeMala, int NumeroPassageiros, String modelo, double preco, String proprietario, String marca, Motor motor) {
        super(NumeroPassageiros, modelo, preco, proprietario, marca, motor);
        this.volumeMala = volumeMala;
    }

    public Carro(int volumeMala, int NumeroPassageiros, String proprietario, String marca, String modelo, double preco, Motor motor) {
        super(NumeroPassageiros, proprietario, marca, modelo, preco, motor);
        this.volumeMala = volumeMala;
    }

    public Carro(int volumeMala, int NumeroPassageiros, String proprietario, String marca, String modelo, Motor motor, double preco) {
        super(NumeroPassageiros, proprietario, marca, modelo, motor, preco);
        this.volumeMala = volumeMala;
    }

    public Carro(int volumeMala, double preco, int NumeroPassageiros, String proprietario, String marca, String modelo, Motor motor) {
        super(preco, NumeroPassageiros, proprietario, marca, modelo, motor);
        this.volumeMala = volumeMala;
    }

    public Carro(int volumeMala, double preco, String proprietario, int NumeroPassageiros, String marca, String modelo, Motor motor) {
        super(preco, proprietario, NumeroPassageiros, marca, modelo, motor);
        this.volumeMala = volumeMala;
    }

    public Carro(int volumeMala, double preco, String proprietario, String marca, String modelo, int NumeroPassageiros, Motor motor) {
        super(preco, proprietario, marca, modelo, NumeroPassageiros, motor);
        this.volumeMala = volumeMala;
    }

    public void cadastrar(int NumeroPassageiros, double preco, String proprietario, String marca, String modelo, Motor motor, int volumeMala) {
        super.cadastrar(NumeroPassageiros, preco, proprietario, marca, modelo, motor);
        this.volumeMala = volumeMala;

    }

    public void imprimir() {
        super.imprimir();
        System.out.println("\n O volume da mala é: " + volumeMala);
    }

}
