<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Factorial</title>
    </head>
    <body style="background-color: white;">
        <center>
            <h1>La Secuencia de Fibonacci</h1>
        <div style="-webkit-box-shadow: 0px 10px 13px -7px #000000, 5px 5px 15px 5px rgba(0,0,0,0); 
box-shadow: 0px 10px 13px -7px #000000, 5px 5px 15px 5px rgba(0,0,0,0);border:1px gray solid;width: 50%;margin-top: 100px">
        <center>
        <form method="get" action="NewServlet" name="form">
            <table>
            <tr><td>Ingrese la cantidad de términos a mostrar de la serie de Fibonacci: </td>
                <td><input type="text" name="text1" required/></td></tr>
            <tr><td></td><td><input type="submit" value="Calcular"/></td></tr>
            </table>
        </form>
        </center>
        </div>
        </center>
    </body>
</html>