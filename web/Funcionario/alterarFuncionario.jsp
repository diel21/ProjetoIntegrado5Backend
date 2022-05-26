<%-- 
    Document   : alterarFuncionario
    Created on : 26 de mai. de 2022, 15:38:22
    Author     : Adiel
--%>

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
            objFuncionario.setId(Integer.parseInt(request.getParameter("id")));
            
            FuncionarioDAO DAOFuncionario = new FuncionarioDAO();
            DAOFuncionario.AlterarFuncionario(objFuncionario);
            
        %>
    </body>
</html>
