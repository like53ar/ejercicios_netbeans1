<%-- 
    Document   : verPersonas
    Created on : 17/12/2022, 18:59:33
    Author     : fabia
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Personas</title>
    </head>

    <h1>Lista de Personas</h1>
    <%
        List <Persona> listaPersonas = (List)request.getSession().getAttribute("listaPersonas");
        for (Persona per :listaPersonas){
    %>
        <p> <b>Dni:  </b> <%=per.getDNI() %> </p>
        <p> <b>Nombre:  </b> <%=per.getNombre()%> </p>
        <p> <b>Apellido:  </b> <%=per.getApellido()%> </p>
        <p> <b>Telefono:  </b> <%=per.getTelefono()%> </p>
        <p>------------------------------------------------------</p>
    <%    
        }
    %>
        
</body>
</html>
