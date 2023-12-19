<%-- 
    Document   : header
    Created on : 18 dic. 2023, 00:01:17
    Author     : Ryzen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TP Integrador - Maurizio - 23557</title>
    <link href="<%= request.getContextPath() %>/style.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script type="text/javascript" src="<%= request.getContextPath() %>/script/comprar-ticket.js" defer></script>
</head>
<body>
    

    <header>
        <div class="container-head">

            <div class="row">

                <div class="col-2">
                    <a href="<%= request.getContextPath() %>/index.html"><img src="<%= request.getContextPath() %>/recursos/codoacodo.png" height="75px" width="150px" alt="logo">Conf Bs As</a>
                </div>

                <div class="col-2 col-btn-head offset-2">
                    <p>La conferencia</p>
                </div>

                <div class="col-2 col-btn-head">
                    <p>El lugar y la fecha</p>
                </div>

                <div class="col-2 col-btn-head">
                    <p><a href="<%= request.getContextPath() %>/Panel/ser-orador">Conviértete en orador</a></p>
                </div>

                <div class="col-2 col-btn-head">
                    <p><a href="<%= request.getContextPath() %>/Panel/comprar-tickets.jsp">Comprar Tickets</a></p>
                </div>

            </div>

        </div>
    </header>
