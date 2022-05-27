<%-- 
    Document   : inserirCliente
    Created on : 27 de mai. de 2022, 11:50:09
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
            objCliente.setNome(request.getParameter("nome"));
            objCliente.setCpf(request.getParameter("cpf"));
            objCliente.setRg(request.getParameter("rg"));
            objCliente.setTelefone(request.getParameter("telefone"));
            objCliente.setRua(request.getParameter("rua"));
            objCliente.setNumeroRua(request.getParameter("numerorua"));
            objCliente.setCidade(request.getParameter("cidade"));
            objCliente.setUf(request.getParameter("uf"));
          
            
            ClienteDAO DAOCliente = new ClienteDAO();
            DAOCliente.CadastrarCliente(objCliente);
            }catch (Exception e){
            }
            
        %>
    </body>
</html>
