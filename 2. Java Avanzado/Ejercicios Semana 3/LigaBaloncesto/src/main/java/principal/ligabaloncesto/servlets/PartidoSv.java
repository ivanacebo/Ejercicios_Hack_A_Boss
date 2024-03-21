package principal.ligabaloncesto.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import principal.ligabaloncesto.logica.Controladora;
import principal.ligabaloncesto.logica.Partido;

@WebServlet(name = "PartidoSv", urlPatterns = {"/PartidoSv"})
public class PartidoSv extends HttpServlet {
    
    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Partido> listaPartidos = control.traerPartidos();
        
        request.setAttribute("partidos", listaPartidos);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String fechaPartido = request.getParameter("fecha");
        String puntosEquipoLocal = request.getParameter("puntosEquipoLocal");
        String puntosEquipoVisitante = request.getParameter("puntosEquipoVisitante");
        String equipoLocal = request.getParameter("equipoLocal");
        String equipoVisitante = request.getParameter("equipoVisitante");
        
        try {
            SimpleDateFormat fechaFormat = new SimpleDateFormat("yyyyy-mm-dd");
            Date fecha = fechaFormat.parse(fechaPartido);
            
            Partido partido = new Partido();
            partido.setFecha(fecha);
            partido.setResultadoEquipoLocal(Integer.parseInt(puntosEquipoLocal));
            partido.setResultadoEquipoVisitante(Integer.parseInt(puntosEquipoVisitante));
            
            control.crearPartido(partido, Long.parseLong(equipoLocal), Long.parseLong(equipoVisitante));
            
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        } catch (ParseException ex) {
            Logger.getLogger(PartidoSv.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
