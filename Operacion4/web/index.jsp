<%-- 
    Document   : index
    Created on : 16/12/2022, 19:47:49
    Author     : fabia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Prueba</title>
    </head>
    <body>
        <h1>Datos de la Persona</h1>
        </<!-- Carga de datos  -->
        <form action="SvPersona" method="POST">
            <p> <label> DNI : </label> <input type="text" name="dni"> </p>
            <p> <label> Nombre : </label> <input type="text" name="nombre"> </p>
            <p> <label> Apellido : </label> <input type="text" name="apellido"> </p>
            <p> <label> Telefono : </label> <input type="text" name="telefono"> </p>
            <button type="submit" > Enviar </button>
        </form>
        
        <h1>Ver lista de las Personas</h1>
        <p>Si desea ver la lista de las personas haga click</p>
        <form action="SvPersona" method="GET">
            <button type="submit" > Mostrar Personas </button>
        </form>
        
        <h1>Eliminar las Personas</h1>
        <p>Ingrese el ID de la persona que desea borrar </p>
        <form action=" " method=" ">
            <p> <label> ID : </label> <input type="text" name="id_eliminar"> </p>
        <button type="submit" > Eliminar </button>
        </form>
        
    </body>
</html>
