<%-- 
    Document   : excluirCliente
    Created on : 27 de mai. de 2022, 12:06:42
    Author     : Adiel
--%>

<%@page import="integrado.com.DAO.ClienteDAO"%>
<%@page import="integrado.com.DTO.ClienteDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
           try{ ClienteDTO objCliente = new ClienteDTO();
            objCliente.setId(Integer.parseInt(request.getParameter("id")));
            
            ClienteDAO DAOFuncionario = new ClienteDAO();
            DAOFuncionario.ExcluirCliente(objCliente);
            }catch (Exception e){
            }
            
        %>
    </body>
</html>
