<%-- 
    Document   : inserirFuncionario
    Created on : 20 de mai. de 2022, 15:38:04
    Author     : Adiel
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="integrado.com.DAO.FuncionarioDAO"%>
<%@page import="integrado.com.DTO.FuncionarioDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            FuncionarioDTO objFuncionario = new FuncionarioDTO();
            objFuncionario.setNome(request.getParameter("nome"));
            objFuncionario.setCpf(request.getParameter("cpf"));
            objFuncionario.setSetor(request.getParameter("setor"));
            objFuncionario.setSenha(request.getParameter("senha"));
            
            FuncionarioDAO DAOFuncionario = new FuncionarioDAO();
            DAOFuncionario.CadastrarFuncionario(objFuncionario);   
        %>
        
    </body>
</html>
