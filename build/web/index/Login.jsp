<%-- 
    Document   : Login
    Created on : 27 de mai. de 2022, 14:09:12
    Author     : Adiel
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="integrado.com.DAO.ConexaoDAO"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%Connection con;
       con = new ConexaoDAO().conexaoDB(); %>
       <form action ="" method="POST">
            <label>Nome: </label>
            <input type = "text" name = "nome">
            <label>CPF: </label>
            <input type = "text" name = "senha">
       <% 
            if (con != null){
                if ((request.getParameter("nome")!= null ) && (request.getParameter("senha") != null)){
                    String login,senha;
                    login = request.getParameter("nome");
                    senha = request.getParameter("senha");
                    Statement st;
                    ResultSet rs;
                    st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.TYPE_FORWARD_ONLY);
                    rs = st.executeQuery("SELECT nome_funcionario,senha_funcionario FROM funcionario where nome_funcionario = '"
                    +login+"and senha = '"+senha+"");
                    if(rs.next()){
                        response.sendRedirect("frmCadastroFuncionario.html");
                    }
                    
                }
           }
       

       %>     
            <button type="submit">Logar</button>
         </form>
    </body>
</html>
