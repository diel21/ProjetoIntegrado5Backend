/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrado.com.DTO;

/**
 *
 * @author Adiel
 */
public class ProdutoDTO {
     private FabricanteDTO fabricante;
    private String nome;
    private double quantidade;
    private double valor;
    
    public ProdutoDTO(){}
    
    public ProdutoDTO(FabricanteDTO fabricante, String nome, double quantidade, double valor) {
        this.fabricante = fabricante;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public FabricanteDTO getFabricante() {
        return fabricante;
    }

    public void setFabricante(FabricanteDTO fabricante) {
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
