/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Modelos.Orador;
import Modelos.OradorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ryzen
 */
public class AgregarOrador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AgregarOrador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AgregarOrador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String descripcion = request.getParameter("descripcion");
        String javascript = request.getParameter("chk_javascript");
        String react = request.getParameter("chk_react");
        String negocios = request.getParameter("chk_negocios");
        String startups = request.getParameter("chk_startups");
        String foto = request.getParameter("foto");
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido " + apellido);
        System.out.println(descripcion);
        System.out.println(javascript);
        System.out.println(react);
        System.out.println(negocios);
        System.out.println(startups);
        
        Boolean js = false;
        Boolean ra = false;
        Boolean ng = false;
        Boolean st = false;
        
        if(javascript != null) js = true;
        
        if(react != null) ra = true;
        
        if (negocios != null) ng = true;
        
        if (startups != null) st = true;
        
        OradorDAO oradorDAO = new OradorDAO();
        Orador orador = new Orador(1,nombre,apellido,descripcion,js,ra,ng,st,foto);
        
        int r = oradorDAO.GenerarOrador(orador);
        
        if(r != 0) {
            response.sendRedirect(request.getContextPath() + "/Panel/ver-oradores.jsp");
        }
        
        System.out.println("SQL → " + r);
        
        processRequest(request, response);        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
