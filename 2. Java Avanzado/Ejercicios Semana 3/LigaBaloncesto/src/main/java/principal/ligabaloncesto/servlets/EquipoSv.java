package principal.ligabaloncesto.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import principal.ligabaloncesto.logica.Controladora;
import principal.ligabaloncesto.logica.Equipo;

@WebServlet(name = "EquipoSv", urlPatterns = {"/EquipoSv"})
public class EquipoSv extends HttpServlet {
    
    Controladora control = new Controladora();
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Equipo> listEquipos = control.traerEquipos();
        
        request.setAttribute("listaEquipos", listEquipos);
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombre = request.getParameter("nombre");
        String ciudad = request.getParameter("ciudad");
        
        Equipo equipo = new Equipo();
        equipo.setNombre(nombre);
        equipo.setCiudad(ciudad);
        
        control.crearEquipo(equipo);
        
        
        response.sendRedirect("index.jsp");
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
