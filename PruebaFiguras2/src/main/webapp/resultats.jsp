<%-- 
    Document   : resultats
    Created on : 30 may 2024, 17:02:11
    Author     : angel
--%>

<%@page import="modelo.Figura"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Figura> listaFiguras = (ArrayList<Figura>) request.getSession().getAttribute("lista");
    //Creamos el ArrayList si no lo tenemos aun. 
    if (listaFiguras == null) {
        listaFiguras = new ArrayList<>();
        request.getSession().setAttribute("lista", listaFiguras);
    }%>

<!DOCTYPE html>
<html lang="ca">
    <head>
        <meta charset="utf-8" />
        <title>Formulari de Figures Geomètriques</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f5f5f5;
                margin: 0;
                padding: 20px;
            }

            h1 {
                color: #333333;
            }

            form {
                background-color: #ffffff;
                border: 1px solid #dddddd;
                padding: 20px;
                border-radius: 5px;
                box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
                max-width: 800px;
                margin: 0 auto;
            }

            label {
                display: block;
                margin-block: 10px;
                color: #555555;
            }

            select, input[type="number"], input[type="color"], input[type="submit"] {
                width: 100%;
                padding: 8px;
                font-size: 16px;
                border: 1px solid #dddddd;
                border-radius: 3px;
                box-sizing: border-box;
            }

            input[type="color"]{
                height: 4em;
            }

            input[type="submit"] {
                background-color: #4CAF50;
                color: #ffffff;
                cursor: pointer;
                margin-block: 1em;
            }
        </style>
    </head>
    <body>
        <h1>Formulari de Figures Geomètriques</h1>
        <!-- Realizamos tabla de resultados -->
        <table>
            <tr>
                <th>Figura</th>
                <th>Perimetro</th>
                <th>Area</th>
                <th>Color</th>

                <!-- Creamos bucle para el numero de resultado -->
            </tr>
            <% for (Figura f : listaFiguras) {%>
            <tr>
                <td><%=f.toString()%></td>
                <td><%=f.getPerimetre()%></td>
                <td><%=f.getArea()%></td>
                <td style="backgorund-color:<%=f.getColor()%>"</td>
            </tr>
            <% }%>

        </table>
    </body>
</html>
