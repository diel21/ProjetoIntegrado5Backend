/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrado.com.DTO;

/**
 *
 * @author Adiel
 */
public class FabricanteDTO {
        private String nome;
    private int codFabricante;
    //private ArrayList<Produto> produtos = new ArrayList<>();

    public FabricanteDTO(String nome, int codFabricante) {
        this.nome = nome;
        this.codFabricante = codFabricante;
    }
    
    public FabricanteDTO(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodFabricante() {
        return codFabricante;
    }

    public void setCodFabricante(int codFabricante) {
        this.codFabricante = codFabricante;
    }

//    public ArrayList<Produto> getProdutos() {;
//        return produtos;
//    }
//   
//    public void setProdutos(ArrayList<Produto> produtos) {
//        this.produtos = produtos;
//    }
//    public void setProdutos(Produto produto) {
//        this.produtos.add(produto);
//    }
}
