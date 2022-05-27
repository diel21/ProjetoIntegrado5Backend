/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrado.com.DTO;

import java.util.ArrayList;

/**
 *
 * @author Adiel
 */
public class PedidoDTO {
    private FuncionarioDTO funcionario;
    private ClienteDTO cliente;
    private String endEntrega;
    private ArrayList <ProdutoDTO> produtos = new ArrayList<>(); 

    
    public PedidoDTO(FuncionarioDTO funcionario, ClienteDTO cliente, String endEntrega) {
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.endEntrega = endEntrega;
    }

    public FuncionarioDTO getFuncionario() {
        return funcionario;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }


    public String getEndEntrega() {
        return endEntrega;
    }

    public void setEndEntrega(String endEntrega) {
        this.endEntrega = endEntrega;
    }

    public ArrayList<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<ProdutoDTO> produtos) {
        this.produtos = produtos;
    }
    public void setProdutos(ProdutoDTO produto){
        this.produtos.add(produto);
    }
    public double totalPedido(){
        double valorTotal = 0;
        for (ProdutoDTO produto : produtos) {
            valorTotal += produto.getQuantidade() * produto.getValor();
        }
        return valorTotal;
    }
}
