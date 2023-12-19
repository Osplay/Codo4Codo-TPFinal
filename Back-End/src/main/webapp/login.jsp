<%-- 
    Document   : login
    Created on : 16 dic. 2023, 20:50:18
    Author     : Ryzen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Ver lista de oradores</title>
</head>
<body>

    <jsp:include page="header.jsp" />

    <section>
        <div class="container">

            <form action="Login" method="POST" class="row" style="padding-top: 10px;">

                <div class="col-8 offset-2">
                    <input type="text" class="form-control" placeholder="email" name="email">
                    <br>
                    <input type="password" class="form-control" placeholder="contraseña" name="contrasena">
                    <br>
                    <button type="submit" class="btn btn-primary">Iniciar Sesión</button>
                </div>
            </form>

            </div>

        </div>
    </section>


    <jsp:include page="footer.jsp" />
