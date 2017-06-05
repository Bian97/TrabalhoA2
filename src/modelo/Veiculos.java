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

    private int numeroPassageiros;
    private double preco;
    private String proprietario, marca, modelo;
    private Motor motor;

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int NumeroPassageiros) {
        this.numeroPassageiros = NumeroPassageiros;
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
    
     public void acelerar() {
       if(motor.getRpm() < motor.getRpmMaximo()){
        int resu = motor.getRpm() + 100;
         motor.setRpm(resu);
       }
    } 
      public void desacelerar() {
       if(motor.getRpm() >0 ){
        int resu = motor.getRpm() - 100;
         motor.setRpm(resu);
       }
    }    
    
    public void getTempoMaxUso(){
        System.out.println("O tempo máximo de uso é: " + tempoMaxUso);
    }
    
    public void getIdadeMinMotorista(){
        System.out.println("A idade mínima do motorista é: "+idadeMinMotorista);
    }

    public Veiculos() {}

    public Veiculos(int numeroPassageiros, double preco, String proprietario, String marca, String modelo, Motor motor) {
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(int numeroPassageiros, double preco, String proprietario, String marca, Motor motor, String modelo) {
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(int NumeroPassageiros, String proprietario, String marca, double preco, String modelo, Motor motor) {
        this.numeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(int NumeroPassageiros, String modelo, double preco, String proprietario, String marca, Motor motor) {
        this.numeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(int NumeroPassageiros, String proprietario, String marca, String modelo, double preco, Motor motor) {
        this.numeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(int NumeroPassageiros, String proprietario, String marca, String modelo, Motor motor, double preco) {
        this.numeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(double preco, int NumeroPassageiros,String proprietario, String marca, String modelo, Motor motor) {
        this.numeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(double preco, String proprietario, int NumeroPassageiros, String marca, String modelo, Motor motor) {
        this.numeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Veiculos(double preco, String proprietario, String marca, String modelo, int NumeroPassageiros, Motor motor) {
        this.numeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void cadastrar(int NumeroPassageiros, double preco, String proprietario, String marca, String modelo, Motor motor){
        this.numeroPassageiros = NumeroPassageiros;
        this.preco = preco;
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void imprimir(){
    System.out.println("O Núm de passageiros é: "+numeroPassageiros+"\nO preço é: "+preco+"\nO proprietário é: "+proprietario
    +"\nMarca: "+marca+"\nO modelo é: "+modelo+"\n");
    System.out.println("Detalhes do motor: A marca é: "+motor.marca+"\nO modelo é: "+motor.modelo+"\nRPM é: "+motor.rpm+"\nRPM máximo é: "+motor.rpmMaximo+"\nO tipo do combustível é: "+motor.tipoCombustivel);
    }
    
}