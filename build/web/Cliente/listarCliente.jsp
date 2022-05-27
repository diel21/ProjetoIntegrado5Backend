<%-- 
    Document   : listarCliente
    Created on : 27 de mai. de 2022, 12:25:48
    Author     : Adiel
--%>

<%@page import="integrado.com.DAO.ClienteDAO"%>
<%@page import="integrado.com.DTO.ClienteDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
             <%
         try {
            
            ClienteDAO objClienteDAO = new ClienteDAO();
            ArrayList<ClienteDTO> lista = objClienteDAO.PesquisarCliente();
            for (int num = 0;num < lista.size();num++ ) {
                    out.print("Código: "+lista.get(num).getId()+"<br>");
                    out.print("Nome: "+lista.get(num).getNome()+"<br>");
                    out.print("CPF: "+lista.get(num).getCpf()+"<br>");
                    
                    out.print("<a href='frmExcluirCliente.jsp?id="+lista.get(num).getId()+"&nome="+lista.get(num).getNome()+"'>Excluir</a>");
                  
                }
            
                

         %><Br> <Br><%
             } catch (Exception e) {
             }
   
            
        %>
    </body>
</html>
