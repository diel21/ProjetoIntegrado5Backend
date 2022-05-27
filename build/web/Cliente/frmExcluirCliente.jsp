<%-- 
    Document   : frmExcluirCliente
    Created on : 27 de mai. de 2022, 11:59:28
    Author     : Adiel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action ="excluirCliente.jsp" method="POST">
            
            <label>ID: </label>
            <input type = "text" name = "id"
                   value="<%=request.getParameter("id")%>" readonly>
            <label>Nome: </label>
            <input type = "text" name = "nome"
                   value="<%=request.getParameter("nome")%>" readonly>
            
            <button type="submit">Excluir</button>
        </form>
    </body>
</html>
