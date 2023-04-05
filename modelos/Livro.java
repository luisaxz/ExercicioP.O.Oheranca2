/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;


public class  Livro extends Produto {
    protected String titulo;
    protected String autor;
    protected String tradutor;
    protected String editora;
    protected int anoPublicacao;


   // public Livro(int codigo, String descricao, float preco, String tipoDoProduto) {
     //   super(codigo, descricao, preco, tipoDoProduto);
    


    public Livro() {
    super();
    }

    
    public String getTitulo() {
        return "Orgulho e preconceito";
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return "Jane Austen";
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTradutor() {
        return "fulano";
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public String getEditora() {
        return "Martin Claret";
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return 2020;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", tradutor=" + tradutor + ", editora=" + editora + ", anoPublicacao=" + anoPublicacao + '}';
    }

    

    
}
