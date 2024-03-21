<%-- 
    Document   : index
    Created on : 21 mar 2024, 19:23:58
    Author     : Ivan
--%>

<%@page import="principal.ligabaloncesto.logica.Partido"%>
<%@page import="java.util.List"%>
<%@page import="principal.ligabaloncesto.logica.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>Liga ACB</title>
    </head>
    <body>
        <div class="container mt-4">
            <h2>Equipos Participantes de liga</h2>
            <form action="EquipoSv" method="POST">
                <div class="form-group">
                    <label for="nombre">NOMBRE:</label>
                    <input type="text" class="form-control" id="nombre" name="nombre">
                </div>
                <div class="form-group">
                    <label for="ciudad">CIUDAD:</label>
                    <input type="text" class="form-control" id="ciudad" name="ciudad">
                </div>                

                <button type="submit" class="btn btn-primary">GUARDAR EQUIPO</button>
            </form>

            <hr>
            <form action="EquipoSv" method="GET">    
                <button type="submit" class="btn btn-primary">lISTA DE EQUIPOS</button>
            </form>             

            <br>
            <!-- Resultados en tabla EQUIPOS -->
            <div class="results-table">
                <% if (request.getAttribute("listaEquipos") != null) { %>
                <h3>Equipos registrados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Ciudad</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Equipo equipo : (List<Equipo>) request.getAttribute("listaEquipos")) {%>
                        <tr>
                            <td><%= equipo.getId()%></td>
                            <td><%= equipo.getNombre()%></td>
                            <td><%= equipo.getCiudad()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% } %>
            </div>      



            <br>
            <br>            
            <hr>
            <h2>Rellenar Partidos de la liga ACB</h2>
            <form action="PartidoSv" method="POST">
                <div class="form-group">
                    <label for="fecha">Fecha:</label>
                    <input type="date" class="form-control" id="fecha" name="fecha">
                </div>     
                <div class="form-group">
                    <label for="equipo1">EQUIPO LOCAL:</label>
                    <input type="text" class="form-control" id="equipoLocal" name="equipoLocal">
                </div>                
                <div class="form-group">
                    <label for="equipo2">EQUIPO VISITANTE:</label>
                    <input type="text" class="form-control" id="equipoVisitante" name="equipoVisitante">
                </div>                
                <div class="form-group">
                    <label for="resultadoequipo1">PUNTOS EQUIPO LOCAL:</label>
                    <input type="text" class="form-control" id="puntosEquipoLocal" name="puntosEquipoLocal">
                </div>                 
                <div class="form-group">
                    <label for="resultadoequipo2">PUNTOS EQUIPO VISITANTE:</label>
                    <input type="text" class="form-control" id="puntosEquipoVisitante" name="puntosEquipoVisitante">
                </div>                  

                <button type="submit" class="btn btn-primary">GUARDAR PARTIDO</button>
            </form>            
            <hr>
            <form action="PartidoSv" method="GET">    
                <button type="submit" class="btn btn-primary">LISTA DE PARTIDOS JUGADOS</button>
            </form>               

            <br>
            <!-- Resultados en tabla PARTIDOS -->
            <div class="results-table">
                <% if (request.getAttribute("partidos") != null) { %>
                <h3>Partidos registrados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Fecha</th>
                            <th>Equipo 1</th>
                            <th>Equipo 2</th>
                            <th>Resultado Equipo 1</th>
                            <th>Resultado Equipo 2</th>                                
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Partido partido : (List<Partido>) request.getAttribute("partidos")) {%>
                        <tr>
                            <td><%=partido.getFechaFormateada()%></td>
                            <td><%=partido.getEquipoLocal().getNombre()%></td>
                            <td><%=partido.getEquipoVisitante().getNombre()%></td>   
                            <td><%=partido.getResultadoEquipoLocal()%></td>
                            <td><%=partido.getResultadoEquipoVisitante()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% }%>
            </div>                

        </div>        


        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
