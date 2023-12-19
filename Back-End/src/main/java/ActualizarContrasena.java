/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Modelos.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ryzen
 */
public class ActualizarContrasena extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<h1>PASSWORD CAMBIADO CON ÉXITO!</h1>");
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email = request.getParameter("email");
        String contraseñavieja = request.getParameter("contrasena");
        String contraseñanueva = request.getParameter("contrasenanueva");
        
        Boolean isOk = true;
        
        if(email == null || email.equals("")) isOk = false;
        
        if(contraseñavieja == null || contraseñavieja.equals("")) isOk = false;
        
        if(contraseñanueva == null || contraseñanueva.equals("")) isOk = false;
        
        if(!isOk){
            response.sendRedirect(request.getContextPath() + "/Panel/actualizar-login.jsp");
        }
        
        UsuarioDAO uDAO = new UsuarioDAO();
        
        int r = uDAO.ActualizarUsuario(email, contraseñavieja, contraseñanueva);
        
        if(r == 0){
            response.sendRedirect(request.getContextPath() + "/Panel/actualizar-login.jsp");
        } else {
            HttpSession s = request.getSession();
            s.invalidate();
            
            response.sendRedirect(request.getContextPath() +"/login.jsp");
        }
        
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
