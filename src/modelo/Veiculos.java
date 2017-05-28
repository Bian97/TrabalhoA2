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
public abstract class Veiculos implements Interface{

    private int NumeroPassageiros;
    private double preco;
    private String proprietario, marca, modelo;
    private Motor motor;

    public int getNumeroPassageiros() {
        return NumeroPassageiros;
    }

    public void setNumeroPassageiros(int NumeroPassageiros) {
        this.NumeroPassageiros = NumeroPassageiros;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public interface frear extends Interface{
        public void frear();
    }
     
    public interface virarDireita extends Interface{
        public void virarDireita();
    }
    
    public interface virarEsquerda extends Interface{
        public void virarEsquerda();
    }
    
    public void getTempoMaxUso(){
        System.out.println("O tempo máximo de uso é: " + tempoMaxUso);
    }
    
    public void getIdadeMinMotorista(){
        System.out.println("A idade mínima do motorista é: "+idadeMinMotorista);
    }

    public Veiculos() {}

    public Veiculos(int NumeroPassageiros, double preco, String proprietario, String marca, String modelo, Motor motor) {
        this.NumeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(int NumeroPassageiros, double preco, String proprietario, String marca, Motor motor, String modelo) {
        this.NumeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(int NumeroPassageiros, String proprietario, String marca, double preco, String modelo, Motor motor) {
        this.NumeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(int NumeroPassageiros, String modelo, double preco, String proprietario, String marca, Motor motor) {
        this.NumeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(int NumeroPassageiros, String proprietario, String marca, String modelo, double preco, Motor motor) {
        this.NumeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(int NumeroPassageiros, String proprietario, String marca, String modelo, Motor motor, double preco) {
        this.NumeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(double preco, int NumeroPassageiros,String proprietario, String marca, String modelo, Motor motor) {
        this.NumeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(double preco, String proprietario, int NumeroPassageiros, String marca, String modelo, Motor motor) {
        this.NumeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(double preco, String proprietario, String marca, String modelo, int NumeroPassageiros, Motor motor) {
        this.NumeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void cadastrar(int NumeroPassageiros, double preco, String proprietario, String marca, String modelo, Motor motor){
        this.NumeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
}