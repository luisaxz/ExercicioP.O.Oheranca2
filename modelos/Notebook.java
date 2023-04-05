/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class Notebook extends Produto {
    protected String marca;
    protected String modelo;
    protected int memoriaRam;
    protected float capacidade;
    protected String processador;
    protected float tamanhoTela;
    protected String sistemaOperacional;

    //public Notebook(String marca, String modelo, int memoriaRam, float capacidade, String processador, int tamanhoTela, String sistemaOperacional) {
      //  this.marca = marca;
      //  this.modelo = modelo;
     //   this.memoriaRam = memoriaRam;
      //  this.capacidade = capacidade;
      //  this.processador = processador;
     //   this.tamanhoTela = tamanhoTela;
     //   this.sistemaOperacional = sistemaOperacional;
   // }
    
    public Notebook(){
        super();
        
    }
    public String getMarca() {
        return "Acer";
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return "Aspire";
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return (int) (8192);
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public float getCapacidade() {
        return (float) (154545);
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public String getProcessador() {
        return "AMD";
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public float getTamanhoTela() {
        return (float) (15.6);
    }

    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getSistemaOperacional() {
        return "Windows 11";
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return "Notebook{" + "marca=" + marca + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", capacidade=" + capacidade + ", processador=" + processador + ", tamanhoTela=" + tamanhoTela + ", sistemaOperacional=" + sistemaOperacional + '}';
    }
    
}
