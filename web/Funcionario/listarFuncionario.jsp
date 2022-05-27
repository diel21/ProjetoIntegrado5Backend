<%-- 
    Document   : listarFuncionario
    Created on : 26 de mai. de 2022, 12:11:32
    Author     : Adiel
--%>

<%@page import="integrado.com.DTO.FuncionarioDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="integrado.com.DAO.FuncionarioDAO"%>
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
            
            FuncionarioDAO objFuncionarioDAO = new FuncionarioDAO();
            ArrayList<FuncionarioDTO> lista = objFuncionarioDAO.PesquisarFuncionarios();
            for (int num = 0;num < lista.size();num++ ) {
                    out.print("Código: "+lista.get(num).getId()+"<br>");
                    out.print("Nome: "+lista.get(num).getNome()+"<br>");
                    out.print("Setor: "+lista.get(num).getSetor()+"<br>");
                    
                    
                    out.print("<a href='frmExcluirFuncionarioView.jsp?id="+lista.get(num).getId()+"&nome= "+lista.get(num).getNome()
                    +"&cpf="+lista.get(num).getCpf()+"&senha="+lista.get(num).getSenha()+"&setor="+lista.get(num).getSetor()+"'>Excluir</a>");
                    
                     out.print("<a href='frmAlterarFuncionarioView.jsp?id="+lista.get(num).getId()+"&nome= "+lista.get(num).getNome()
                    +"&cpf="+lista.get(num).getCpf()+"&senha="+lista.get(num).getSenha()+"&setor="+lista.get(num).getSetor()+"'> Alterar Senha</a>"+"<br>"
                    );
                    
                    
                }
            
                

         %><Br> <Br><%
             } catch (Exception e) {
             }
   
            
        %>
    </body>
</html>
