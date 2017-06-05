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
public class Onibus extends Veiculos {

    String motorista;

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public int acelerar(int rpm1,int rpmMax) {
        if(rpm1 < rpmMax){
            rpm1 += 50;
        }
        return rpm1;
    }

    public int desacelerar(int rpm1) {
        if(rpm1 > 0){
            rpm1 -= 50;
        }
        return rpm1;
    }

    public void virarEsquerda() {

        System.out.println("Ônibus " + esquerda);
    }

    public void virarDireita() {

        System.out.println("Ônibus " + direita);
    }

    public void frear() {
        System.out.println("Ônibus " + frear);
    }

    public Onibus() {
    }

    public Onibus(String motorista, int numeroPassageiros, double preco, String proprietario, String marca, String modelo, Motor motor) {
        super(numeroPassageiros, preco, proprietario, marca, modelo, motor);
        this.motorista = motorista;
    }

    public Onibus(String motorista, int numeroPassageiros, double preco, String proprietario, String marca, Motor motor, String modelo) {
        super(numeroPassageiros, preco, proprietario, marca, motor, modelo);
        this.motorista = motorista;
    }

    public Onibus(String motorista, int NumeroPassageiros, String proprietario, String marca, double preco, String modelo, Motor motor) {
        super(NumeroPassageiros, proprietario, marca, preco, modelo, motor);
        this.motorista = motorista;
    }

    public Onibus(String motorista, int NumeroPassageiros, String modelo, double preco, String proprietario, String marca, Motor motor) {
        super(NumeroPassageiros, modelo, preco, proprietario, marca, motor);
        this.motorista = motorista;
    }

    public Onibus(String motorista, int NumeroPassageiros, String proprietario, String marca, String modelo, double preco, Motor motor) {
        super(NumeroPassageiros, proprietario, marca, modelo, preco, motor);
        this.motorista = motorista;
    }

    public Onibus(String motorista, int NumeroPassageiros, String proprietario, String marca, String modelo, Motor motor, double preco) {
        super(NumeroPassageiros, proprietario, marca, modelo, motor, preco);
        this.motorista = motorista;
    }

    public Onibus(String motorista, double preco, int NumeroPassageiros, String proprietario, String marca, String modelo, Motor motor) {
        super(preco, NumeroPassageiros, proprietario, marca, modelo, motor);
        this.motorista = motorista;
    }

    public Onibus(String motorista, double preco, String proprietario, int NumeroPassageiros, String marca, String modelo, Motor motor) {
        super(preco, proprietario, NumeroPassageiros, marca, modelo, motor);
        this.motorista = motorista;
    }

    public Onibus(String motorista, double preco, String proprietario, String marca, String modelo, int NumeroPassageiros, Motor motor) {
        super(preco, proprietario, marca, modelo, NumeroPassageiros, motor);
        this.motorista = motorista;
    }

    public void cadastrar(int numeroPassageiros, double preco, String proprietario, String marca, String modelo, Motor motor, String motorista) {
        super.cadastrar(numeroPassageiros, preco, proprietario, marca, modelo, motor);
        this.motorista = motorista;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("\n O motorista é: " + motorista);
    }
}
