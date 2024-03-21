package principal.votaciones.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import principal.votaciones.logica.Controladora;
import principal.votaciones.logica.Voto;

@WebServlet(name = "SvVoto", urlPatterns = {"/SvVoto"})
public class SvVoto extends HttpServlet {

    private Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        Map<String, Long> totalVotos = control.traerVotos();
        request.setAttribute("resultados", totalVotos);
        
        System.out.println("***********************");
        
        System.out.println("***********************");

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String seleccionarVoto = request.getParameter("voto");

        if (seleccionarVoto != null && !seleccionarVoto.isEmpty()) {

            Voto voto = new Voto(seleccionarVoto);

            control.crearVoto(voto);
            System.out.println("----------------------------------");
            System.out.println("Voto ->" + seleccionarVoto);
            System.out.println("----------------------------------");

            response.sendRedirect("index.jsp");
        } 
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
