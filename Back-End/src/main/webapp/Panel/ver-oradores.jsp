<%-- 
    Document   : ver-oradores
    Created on : 17 dic. 2023, 00:59:30
    Author     : Ryzen
--%>

<%@page import="java.util.List"%>
<%@page import="Modelos.Orador"%>
<%@page import="Modelos.Orador"%>
<%@page import="Modelos.OradorDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


    <jsp:include page="../header.jsp" />

    <section>
        <div class="row">

            <div class="col-10 offset-1">

                <table class="table">
                    <thead>
                      <tr>
                        <th scope="col">Opción</th>
                        <th scope="col">Foto:</th>
                        <th scope="col">Nombre:</th>
                        <th scope="col">Apellido:</th>
                        <th scope="col">Especialidades:</th>
                        <th scope="col">Descripción del orador:</th>
                      </tr>
                    </thead>
                    <tbody>
                      <%
                          OradorDAO oradorDAO = new OradorDAO();
                          
                          List<Orador> lista = oradorDAO.ObtenerOradores();
                          
                          for(Orador o : lista) {
                          %>
                        <tr>
                            <th scope="row"><form action="BorrarOrador" method="GET"><button type="submit" name="id" class="btn btn-primary" value="<% out.print(o.getId()); %>" placeholder="Eliminar" />Eliminar</button></form></th>
                            <td><img src="<% out.println(o.getFoto()); %>" alt="alt" style="width:150px; height: 170px;"/></td>
                            <td><% out.println(o.getNombre()); %></td>
                            <td><% out.println(o.getApellido()); %></td>
                            <td><% if(o.getJavascript()) out.print("Javascript "); %>
                            <% if(o.getReact()) out.print("React "); %> 
                            <% if(o.getNegocios()) out.print("Negocios "); %> 
                            <% if(o.getStartups()) out.print("React "); %></td>
                            <td><% out.println(o.getDescripcion()); %></td>
                        </tr>
                          
                          <% }
                          %>
                    </tbody>
                  </table>

            </div>

        </div>
    </section>
    
                          <jsp:include page="../footer.jsp"/>
