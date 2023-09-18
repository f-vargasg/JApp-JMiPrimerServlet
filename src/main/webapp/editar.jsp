<%-- 
    Document   : editar
    Created on : Sep 17, 2023, 1:04:58 PM
    Author     : garfi
--%>

<%@page import="com.fvgprinc.primerservlet.logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar usuario</title>
    </head>
    <body>
        <% Usuario usu =  (Usuario)request.getSession().getAttribute("usuEditar");  %>
        <h1>Datos del cliente</h1>
        <form action="SvEditar" method="POST">
            <p><label>Dni:</label><input type="text" name="dni" value ="<%=usu.getDni()%>"/></p>
            <p><label>Nombre:</label><input type="text" name="nombre" value="<%=usu.getNombre()%>"/></p>
            <p><label>Apellido:</label><input type="text" name="apellido" value="<%=usu.getApellido()%>"/></p>
            <p><label>Telefono:</label><input type="text" name="telefono" value="<%=usu.getTelefono()%>"/></p>
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
