<%-- 
    Document   : index
    Created on : 21 mar 2024, 16:40:09
    Author     : Ivan
--%>

<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>Votaciones</title>
    </head>
    <body>
        <div class="container mt-4">
            <h2>Formulario Persona</h2>
            <form action="SvVoto" method="POST">
                <div class="form-group">
                    <input type="radio" id="option1" name="voto" value="Partido A">
                    <label for="option1">Partido A</label>
                </div>
                <div class="form-group">
                    <input type="radio" id="option2" name="voto" value="Partido B">
                    <label for="option2">Partido B</label>
                </div>
                <div class="form-group">
                    <input type="radio" id="option3" name="voto" value="Partido C">
                    <label for="option3">Partido C</label>
                </div>
                <button type="submit" class="btn btn-primary">Confirmar Voto</button>
            </form>

            <hr>

            <form action="SvVoto" method="GET">
                <div class="form-group">
                    <button type="submit" class="btn btn-success">Mostrar Votos Totales</button>
                </div>
            </form>

            <br>
            <br>
            <!-- Resultados de las votaciones -->
            <div class="results-table">
                <% if (request.getAttribute("resultados") != null) { %>
                <h3>Resultados de las Votaciones:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>PARTIDOS</th>
                            <th>VOTOS</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            Map<String, Long> votosPartidos = (Map<String, Long>) request.getAttribute("resultados");
                            for (Map.Entry<String, Long> partido : votosPartidos.entrySet()) {
                        %>
                        <tr>
                            <td><%= partido.getKey()%></td>
                            <td><%= partido.getValue()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% }%>
            </div>

            <!-- Scripts de Bootstrap -->
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
