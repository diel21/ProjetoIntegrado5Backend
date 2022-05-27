<%-- 
    Document   : frmAlterarFuncionarioView
    Created on : 26 de mai. de 2022, 15:36:27
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
        <form action ="alterarFuncionario.jsp" method="POST">
            
            <label>Id: </label>
            <input type = "text" name = "id"
                   value="<%=request.getParameter("id")%>" readonly>
            
            <label>Senha: </label>
            <input type = "text" name = "senha"
                   value="<%=request.getParameter("senha")%>">

            <button type="submit">Alterar Senha</button>
            
        </form>
    </body>
</html>
