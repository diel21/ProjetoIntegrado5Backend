/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrado.com.DAO;

import integrado.com.DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClienteDTO> lista = new ArrayList<>();
    
    public void CadastrarCliente(ClienteDTO objCliente) throws ClassNotFoundException{
        
       String sql = "insert into cliente(nome_cliente,cpf_cliente,rg_cliente,telefone_cliente,rua_cliente,numeroRua_cliente,cidade_cliente,uf_cliente) values (?,?,?,?,?,?,?,?)";
        con = new ConexaoDAO().conexaoDB();
        try {
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objCliente.getNome());
            pstm.setString(2, objCliente.getCpf());
            pstm.setString(3, objCliente.getRg());
            pstm.setString(4, objCliente.getTelefone());
            pstm.setString(5, objCliente.getRua());
            pstm.setString(6, objCliente.getNumeroRua());
            pstm.setString(7, objCliente.getCidade());                                                     
            pstm.setString(8, objCliente.getUf());
   
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
        }
        
    }
 
    public ArrayList<ClienteDTO> PesquisarCliente() throws ClassNotFoundException{
        
        String sql = "select * from cliente";
        con = new ConexaoDAO().conexaoDB();
        try {
            
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
            while (rs.next()) {
                ClienteDTO objCliente = new ClienteDTO();
                objCliente.setId(rs.getInt("id_cliente"));
                objCliente.setNome(rs.getString("nome_cliente"));
                objCliente.setCpf(rs.getString("cpf_cliente"));
                objCliente.setRg(rs.getString("rg_cliente"));
                objCliente.setTelefone(rs.getString("telefone_cliente"));
                objCliente.setRua(rs.getString("rua_cliente"));
                objCliente.setNumeroRua(rs.getString("numeroRua_cliente"));
                objCliente.setCidade(rs.getString("cidade_cliente"));
                objCliente.setUf(rs.getString("uf_cliente"));
                
                
                lista.add(objCliente);
                
            }
            
        } catch (SQLException e) {
        }
        return lista;
    } 
     public void ExcluirCliente(ClienteDTO objCliente) throws ClassNotFoundException{
        
        String sql = "delete from cliente where id_cliente = ?";
        con = new ConexaoDAO().conexaoDB();
        try {
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, objCliente.getId());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
        }
        
    }
//    public void AlterarCliente(ClienteDTO objCliente) throws ClassNotFoundException{
//        
//        String sql = "update funcionario set senha_funcionario = ? where id_funcionario = ?";
//        con = new ConexaoDAO().conexaoDB();
//        try {
//            
//            pstm = con.prepareStatement(sql);
//            pstm.setString(1, objCliente.getSenha());
//            pstm.setInt(2, objCliente.getId());
//            
//            pstm.execute();
//            pstm.close();
//            
//        } catch (SQLException e) {
//        }
//        
//    }
}
