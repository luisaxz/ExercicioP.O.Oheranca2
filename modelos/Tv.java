/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class Tv extends Produto {
    protected String modelo;
    protected String marca;
    protected String sistemaOperacional;
    protected int tamanhoTela;

   // public Tv(String modelo, String marca, String sistemaOperacional, int tamanhoTela) {
      //  this.modelo = modelo;
      //  this.marca = marca;
      //  this.sistemaOperacional = sistemaOperacional;
      //  this.tamanhoTela = tamanhoTela;
    
    public Tv(){
    super();
}

    public String getModelo() {
        return "Tv";
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return "Phillips";
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperacional() {
        return "Saphi";
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public int getTamanhoTela() {
        return (int) (32);
    }

    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    public String toString() {
        return "Tv{" + "modelo=" + modelo + ", marca=" + marca + ", sistemaOperacional=" + sistemaOperacional + ", tamanhoTela=" + tamanhoTela + '}';
    }
    
}
