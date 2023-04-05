/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;


public class Cd extends Produto {
    protected String nomeAlbum;
    protected String banda;
    protected String cantor;
    protected String generoMusical;

   // public Cd(String nomeAlbum, String banda, String cantor, String generoMusical) {
      //  this.nomeAlbum = nomeAlbum;
      //  this.banda = banda;
      //  this.cantor = cantor;
      //  this.generoMusical = generoMusical;
    
    public Cd(){
        super();
    }
    
    public String getNomeAlbum() {
        return "A little piece of heaven";
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getBanda() {
        return "Avenged Sevenfold";
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getCantor() {
        return "M. Shadows";
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGeneroMusical() {
        return "Rock";
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    @Override
    public String toString() {
        return "Cd{" + "nomeAlbum=" + nomeAlbum + ", banda=" + banda + ", cantor=" + cantor + ", generoMusical=" + generoMusical + '}';
    }
    
}
