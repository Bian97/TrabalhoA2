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
public class Motor {

    String marca, modelo, tipoCombustivel;
    int rpm, rpmMaximo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getRpmMaximo() {
        return rpmMaximo;
    }

    public void setRpmMaximo(int rpmMaximo) {
        this.rpmMaximo = rpmMaximo;
    }
    
    public Motor(){}

    public Motor(String marca, String modelo, String tipoCombustivel, int rpm, int rpmMaximo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
    }
    
    public Motor(String marca, String modelo, int rpmMaximo, String tipoCombustivel, int rpm) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
    }
    
    public Motor(String marca, int rpmMaximo, String modelo, String tipoCombustivel, int rpm) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
    }
    public Motor(int rpmMaximo,String marca, String modelo, String tipoCombustivel, int rpm) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
    }
    public Motor(String marca, int rpm, String modelo, int rpmMaximo, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
    }
    public Motor(int rpmMaximo,String marca,int rpm, String modelo, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
    }
    public Motor(int rpmMaximo, String marca, String tipoCombustivel, int rpm, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
    }
    public Motor(int rpmMaximo, int rpm, String marca, String modelo,  String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
    }
    public Motor(String marca, String modelo,int rpm,int rpmMaximo, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
    }

    public void cadastrar(String marca, String modelo, String tipoCombustivel, int rpm, int rpmMaximo){
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
    }
    
    public void imprimir(){
        System.out.println("A marca é: "+marca+"\nO modelo é: "+modelo+"\nO tipo de combustível é: "+tipoCombustivel+"\nO RPM é: "+rpm+"\nRPM máximo é: "+rpmMaximo);
    }
}