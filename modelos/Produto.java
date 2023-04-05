/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;


abstract public class Produto {
    //Atributos 
     int codigo = 0;
     String descricao = "";
     float preco = 0;
     String tipoDoProduto = "";
    
    public Produto(int codigo, String descricao, float preco, String tipoDoProduto){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.tipoDoProduto = tipoDoProduto;
        
        
    }
public Produto(){
    super();
}

    public int getCodigo() {
        return 555;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return "Romance";
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return (float) (25.90);
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTipoDoProduto() {
        return "Livro";
    }

    public void setTipoDoProduto(String tipoDoProduto) {
        this.tipoDoProduto = tipoDoProduto;
    }

  //  public int getCodigo() {
    //    return codigo;
  //  }

 //   public void setCodigo(int codigo) {
  //      this.codigo = codigo;
  //  }

  //  public String getDescricao() {
  //      return descricao;
  //  }

  //  public void setDescricao(String descricao) {
 //       this.descricao = descricao;
  //  }

   // public float getPreco() {
  //      return preco;
 //   }

  //  public void setPreco(float preco) {
  //      this.preco = preco;
  //  }

   // public String getTipoDoProduto() {
   //     return tipoDoProduto;
   // }

 //   public void setTipoDoProduto(String tipoDoProduto) {
    //    this.tipoDoProduto = tipoDoProduto;
  //  }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + ", tipoDoProduto=" + tipoDoProduto + '}';
   }
    int codigo(){
        return (555);
    }
    String descricao(){
        return "Fantasia " ;
        
    }
    float preco(){
        return (float) (50.90);
                
    }
    String tipoProduto(){
        return "Livro";
    }
}
