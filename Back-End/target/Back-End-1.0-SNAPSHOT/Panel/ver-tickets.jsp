<%-- 
    Document   : ver-tickets
    Created on : 17 dic. 2023, 00:16:43
    Author     : Ryzen
--%>

<%@page import="Modelos.Ticket"%>
<%@page import="Modelos.TicketDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="../header.jsp" />

    <section>
        <div class="row">

            <div class="col-10 offset-1">

                <table class="table">
                    <thead>
                      <tr>
                        <th scope="col">Id:</th>
                        <th scope="col">Nombre:</th>
                        <th scope="col">Apellido:</th>
                        <th scope="col">Cantidad</th>
                        <th scope="col">Categoria</th>
                        <th scope="col">Precio Total ($):</th>
                      </tr>
                    </thead>
                    <tbody>
                      <%
                          TicketDAO ticketDAO = new TicketDAO();
                          
                          List<Ticket> lista = ticketDAO.ObtenerTickets();
                          
                          for(Ticket o : lista) {
                          %>
                        <tr>
                            <th scope="row"><% out.println(o.getId()); %></th>
                            <td><% out.println(o.getNombre()); %></td>
                            <td><% out.println(o.getApellido()); %></td>
                            <td><% out.println(o.getCantidad()); %></td>
                            <td><% out.println(o.getCategoria()); %></td>
                            <td><% out.println(o.getTotal()); %></td>
                        </tr>
                          
                          <% }
                          %>
                    </tbody>
                  </table>

            </div>

        </div>
    </section>


                          <jsp:include page="../footer.jsp"/>