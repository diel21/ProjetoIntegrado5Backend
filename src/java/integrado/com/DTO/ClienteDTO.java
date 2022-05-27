package integrado.com.DTO;

import java.util.ArrayList;

public class ClienteDTO {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String rua;
    private String numeroRua;
    private String cidade;
    private String uf;
    private ArrayList<PedidoDTO> pedidos = new ArrayList<>();
    
    public ClienteDTO(){}
    
    public ClienteDTO(String nome, String cpf, String rg, String telefone, String rua, String numeroRua, String cidade, String uf) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.rua = rua;
        this.numeroRua = numeroRua;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumeroRua() {
        return numeroRua;
    }

    public void setNumeroRua(String numeroRua) {
        this.numeroRua = numeroRua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public ArrayList<PedidoDTO> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<PedidoDTO> pedidos) {
        this.pedidos = pedidos;
    }
    
    public void setPedidos(PedidoDTO pedido){
        this.pedidos.add(pedido);
    }
    
    public double valortotalPedidos(){
        double valortotal = 0;
        for (PedidoDTO pedido : pedidos) {
            valortotal += pedido.totalPedido();
        }
        return valortotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
