/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Modelos.Ticket;
import Modelos.TicketDAO;
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
public class AgregarTicket extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AgregarTicket</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AgregarTicket at " + request.getContextPath() + "</h1>");
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
        
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String cantidad = request.getParameter("cantidad");
        String categoria = request.getParameter("categoria");
        String total = request.getParameter("total");
        
        int cantidadInt = 0;
        int categoriaInt = 0;
        int totalInt = 0;
        
        Boolean allOk = true;
        
        if(nombre == null || nombre.equals("")) allOk = false;
        
        if(apellido == null || apellido.equals("")) allOk = false;
        
        if(email == null || email.equals("")) allOk = false;
        
        if(cantidad == null || cantidad.equals("")) allOk = false;
        
        if(categoria == null || categoria.equals("")) allOk = false;
        
        if(total == null || total.equals("")) allOk = false;
        
        try {
            
            cantidadInt = Integer.parseInt(cantidad);
            categoriaInt = Integer.parseInt(categoria);
            totalInt = Integer.parseInt(total);
            
        } catch(Exception e){
            allOk = false;
        }
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Email:" + email);
        System.out.println("Cantidad:" + cantidad);
        System.out.println("Categoriía:" + categoria);
        System.out.println("Total:" + total);
        
        if(!allOk){
            response.sendRedirect("./comprar-tickets.jsp");
            return;
        }
        
        Ticket ticket = new Ticket(0,nombre,apellido,cantidadInt,categoriaInt,totalInt);
        
        TicketDAO tDAO = new TicketDAO();
        
        int r = tDAO.GenerarTicket(ticket);
        
        if(r == 0){
            response.sendRedirect("./comprar-tickets.jsp");
            return;
        } else {
            response.sendRedirect("./ver-tickets.jsp");
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
