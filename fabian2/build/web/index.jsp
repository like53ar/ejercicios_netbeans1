<%-- 
    Document   : index
    Created on : 12/12/2022, 14:07:04
    Author     : Fabian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina Inicio </title>
    </head>
    <body>
        <h1>Esta es la pagina de inicio</h1>
        <h2>Aqui solicita los datos</h2>
        <p> Hola ingresa los valor solicitados </p>
        <<form action="paginaDestino.jsp" method="post"></form>
            <table cellspacing ="3" cellpadding="3" border="1">
            <tr>
                <td align="right">Nombre</td>
                <td> <input type="text" name="nombre"></td><!-- comment -->
            </tr>

            <tr>
                <td align="right">Minuto Inicial:</td>
                <td> <input type="text" name="tiempoIni"></td><!-- comment -->
            </tr>

            <tr>
                <td align="right">Minuto Final:</td>
                <td> <input type="text" name="tiempoFin"></td><!-- comment -->
            </tr>
                    
            <tr>
                <td align="right">Distancia Recorrida:</td>
                <td> <input type="text" name="distancia"></td><!-- comment -->
            </tr>

            </table>
            <br>
            
            <input type="reset" value="Borrar"><!-- comment -->
            <input type="submit"  value="Enviar"><!-- comment -->

    </body>
</html>
