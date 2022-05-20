package integrado.com.DAO;

import integrado.com.DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO {
    Connection con;
    PreparedStatement pstm; 
    
    public void CadastrarFuncionario(FuncionarioDTO objFuncionario) throws ClassNotFoundException{
        
        String sql = "insert into funcionario(nome,cpf,senha,setor) values (?,?,?,?)";
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
}
