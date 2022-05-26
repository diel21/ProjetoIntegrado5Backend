<%-- 
    Document   : frmExcluirFuncionarioView
    Created on : 26 de mai. de 2022, 14:54:50
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
           <form action ="excluirFuncionario.jsp" method="POST">
            
            <label>Id: </label>
            <input type = "text" name = "id"
                   value="<%=request.getParameter("id")%>">
            <label>Nome: </label>
            <input type = "text" name = "nome"
                   value="<%=request.getParameter("nome")%>">
            <label>CPF: </label>
            <input type = "text" name = "cpf"
                   value="<%=request.getParameter("cpf")%>">
            <label>Senha: </label>
            <input type = "text" name = "senha"
                   value="<%=request.getParameter("senha")%>">
            <label>Setor: </label>
            <input type = "text" name = "setor"
                   value="<%=request.getParameter("setor")%>">
            <button type="submit">Excluir</button>
            
        </form>
    </body>
</html>
