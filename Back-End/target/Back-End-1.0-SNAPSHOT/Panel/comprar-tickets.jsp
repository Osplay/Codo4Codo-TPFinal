<%-- 
    Document   : comprar-tickets
    Created on : 19 dic. 2023, 00:51:45
    Author     : Ryzen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../header.jsp" />

<div class="container">

        <div class="d-flex justify-content-center" style="text-align: center;">
            <div class="col-sm-2 offset-3" style="border: 2px solid blue; margin:10px;">
                <p><h2>Estudiante</h2></p>
                <p>Tiene un descuento</p>
                <p><b>80%</b></p>
                <p style="color:gray; font-size: 11px;">*presentar documentación.</p>
            </div>
            <div class="col-sm-2" style="border: 2px solid green;margin:10px;">
                <p><h2>Trainee</h2></p>
                <p>Tiene un descuento</p>
                <p><b>50%</b></p>
                <p style="color:gray; font-size: 11px;">*presentar documentación.</p>
            </div>
            <div class="col-sm-2" style="border: 2px solid orange;margin:10px;">
                <p><h2>Junior</h2></p>
                <p>Tiene un descuento</p>
                <p><b>15%</b></p>
                <p style="color:gray; font-size: 11px;">*presentar documentación.</p>
            </div>
        </div>

        <div class="row">

            <div class="col" style="text-align: center; color:black; background-color: white;">
                <p>Venta</p>
                <p><h2>VALOR DEL TICKET: $200</h2></p>
            </div>
        </div>

        <form action="AgregarTicket"method="POST">
            <div class="row" style="background-color: white;">
              <div class="col-3 offset-3 col-start">
                <input type="text" class="form-control" name="nombre" placeholder="Nombre">
              </div>
              <div class="col-3 col-start">
                <input type="text" class="form-control" name="apellido" placeholder="Apellido">
              </div>
              <br>
              <div class="col-6 offset-3" style="padding-top:5px;">
                <input type="text" name="email" value="<%= (String) request.getSession().getAttribute("email")  %>" class="form-control" placeholder="Email">
              </div>
              <br>
              <div class="col-3 offset-3" style="padding-top:5px;">
                <p>Cantidad:</p>
                <input type="text" class="form-control" name="cantidad" placeholder="Cantidad" id="cantidad">
              </div>
              <div class="col-3" style="padding-top:5px;padding-bottom: 10px;">
                <p>Categoría:</p>
                <select class="form-select" name="categoria" id="categoria">
                    <option value="0">Estudiante</option>
                    <option value="1">Trainee</option>
                    <option value="2">Junior</option>
                  </select>
              </div>

              <div class="alert alert-primary col-6 offset-3" role="alert">
                  Total a pagar: $<input type="text" class="form-control" id="total" value="" name="total" />
              </div>

              <div class="d-grid gap-2 col-3 offset-2" style="padding-top: 10px;">
                <button class="btn btn-primary" style="background-color: #86dc3d; color:white;" id="borrar" type="button">Borrar</button>
              </div>
              
              <div class="d-grid gap-2 col-3" style="padding-top: 10px;">
                <button class="btn btn-primary" style="background-color: #86dc3d; color:white;" id="resumen" type="button">Resumen</button>
              </div>
              
              <div class="d-grid gap-2 col-3" style="padding-top: 10px;">
                <button class="btn btn-primary" style="background-color: #86dc3d; color:white;" id="resumen" type="submit">Reservar</button>
              </div>
                  
            </div>
          </form>

    </div>

<jsp:include page="../footer.jsp" />
