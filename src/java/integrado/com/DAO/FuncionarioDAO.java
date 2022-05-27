package integrado.com.DAO;

import integrado.com.DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionarioDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();
    
    public void CadastrarFuncionario(FuncionarioDTO objFuncionario) throws ClassNotFoundException{
        
        String sql = "insert into funcionario(nome_funcionario,cpf_funcionario,senha_funcionario,setor_funcionario) values (?,?,?,?)";
        con = new ConexaoDAO().conexaoDB();
        try {
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objFuncionario.getNome());
            pstm.setString(2, objFuncionario.getCpf());
            pstm.setString(3, objFuncionario.getSenha());
            pstm.setString(4, objFuncionario.getSetor());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
        }
        
    }
 
    public ArrayList<FuncionarioDTO> PesquisarFuncionarios() throws ClassNotFoundException{
        
        String sql = "select * from funcionario";
        con = new ConexaoDAO().conexaoDB();
        try {
            
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery(sql);
            while (rs.next()) {
                FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();
                objFuncionarioDTO.setId(rs.getInt("id_funcionario"));
                objFuncionarioDTO.setNome(rs.getString("nome_funcionario"));
                objFuncionarioDTO.setCpf(rs.getString("cpf_funcionario"));
                objFuncionarioDTO.setSenha(rs.getString("senha_funcionario"));
                objFuncionarioDTO.setSetor(rs.getString("setor_funcionario"));
                
                lista.add(objFuncionarioDTO);
                
            }
            
        } catch (SQLException e) {
        }
        return lista;
    } 
     public void ExcluirFuncionario(FuncionarioDTO objFuncionario) throws ClassNotFoundException{
        
        String sql = "delete from funcionario where id_funcionario = ?";
        con = new ConexaoDAO().conexaoDB();
        try {
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, objFuncionario.getId());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
        }
        
    }
    public void AlterarFuncionario(FuncionarioDTO objFuncionario) throws ClassNotFoundException{
        
        String sql = "update funcionario set senha_funcionario = ? where id_funcionario = ?";
        con = new ConexaoDAO().conexaoDB();
        try {
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objFuncionario.getSenha());
            pstm.setInt(2, objFuncionario.getId());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
        }
        
    }
   
}
