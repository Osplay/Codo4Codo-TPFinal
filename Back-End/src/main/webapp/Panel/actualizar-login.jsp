<%-- 
    Document   : actualizar-login
    Created on : 19 dic. 2023, 16:46:27
    Author     : Ryzen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <jsp:include page="../header.jsp" />

    <section>
        <div class="container">

            <form action="ActualizarContrasena" method="POST" class="row" style="padding-top: 10px;">

                <div class="col-8 offset-2">
                    <input type="text" class="form-control" placeholder="email" name="email">
                    <br>
                    <input type="password" class="form-control" placeholder="contraseña actual" name="contrasena">
                    <br>
                    <input type="password" class="form-control" placeholder="contraseña nueva" name="contrasenanueva">
                    <br>
                    <button type="submit" class="btn btn-primary">Iniciar Sesión</button>
                </div>
            </form>

            </div>

    </section>


    <jsp:include page="../footer.jsp" />