<%-- 
    Document   : index
    Created on : 11 dic. 2023, 23:33:06
    Author     : Ryzen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
   <title>TP Integrador - Enzo - 23557</title>
    <meta charset="UTF-8">
    <link href="style.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>

<body class="d-flex flex-column min-vh-100">

    <header>
        <div class="row" style="background-color: gray; color:white;">
            <div class="col-4">
                <a href="/codo4codo.github.io/index.html"><img src="recursos/codoacodo.png" height="75px" width="150px" alt="logo">Conf Bs As</a>
            </div>
            <div class="col-1 offset-2" style="color:white;">
                La conferencia
            </div>
            <div class="col-1">
                Los oradores
            </div>
            <div class="col-1">
                El lugar y la fecha
            </div>
            <div class="col-1">
                Conviértete en orador
            </div>
            <div class="col-1" style="color:lightgreen;">
                <a href="/codo4codo.github.io/comprar-tickets.html">Comprar Tickets</a>
            </div>
        </div>
    </header>

    <div class="container">

        <div class="row" id="fila-conferencia" style="color:white;">
            <div class="col-start-left offset-8">
                <h1>Conf Bs As</h1>
            </div>
            <div class="col-sm-center offset-6" style="text-align: left;">Bs As llega por primera vez a Argentina.
                Un evento para compartir con <br>
                nuesta comunidad el conocimiento y experiencia de los expertos que <br>
                están creando
                el futuro de internet. Ven
                a conocer a miembros del <br> evento, a otros estudiantes de Codo a Codo y los oradores de primer <br> nivel que tenemos para ti. Te esperamos!</div>
            <div class="col-end offset-8">
                <button type="button" class="btn btn-outline-light">Quiero ser orador</button>
                <a href="comprar-tickets.html"><button type="button" class="btn btn-success">Comprar Ticket</button></a>
            </div>
        </div>

        <div class="row" style="background-color:white; color:black;">

            <div class="col-start" style="text-align: center;">
                CONOCE A LOS
            </div>

            <div class="col-center" style="text-align: center;">
                <h3>ORADORES</h3>
            </div>

        </div>

        <div class="row" id="box-card" style="background-color:white; color:black;">
            
            <div class="col-md-4 col-sm-12">
                <div class="card" style="width: 20rem;">
                    <img class="card-img-top" src="recursos/steve.jpg" alt="Steve">
                    <div class="card-body">
                        <span class="badge bg-warning" style="color:black;">Javascript</span>
                        <span class="badge bg-info">React</span>
                      <h5 class="card-title">Steve Jobs</h5>
                      <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                    </div>
                  </div>
            </div>
            <div class="col-md-4 col-sm-12">
                <div class="card" style="width: 20rem;">
                    <img class="card-img-top" src="recursos/bill.jpg" alt="Bill">
                    <div class="card-body">
                        <span class="badge bg-warning" style="color:black;">Javascript</span>
                        <span class="badge bg-info">React</span>
                      <h5 class="card-title">Bill Gates</h5>
                      <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                    </div>
                  </div>
            </div>

            <div class="col-md-4 col-sm-12">
                <div class="card" style="width: 20rem;">
                    <img class="card-img-top" src="recursos/ada.jpeg" alt="Bill">
                    <div class="card-body">
                        <span class="badge bg-secondary">Negocios</span>
                        <span class="badge bg-danger">Startups</span>
                      <h5 class="card-title">Ada lovelace</h5>
                      <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                    </div>
                  </div>
            </div>

        </div>

        <div class="row" style="margin-top:10px; background-color: gray;" >

            <div class="col-6">
                <img src="recursos/honolulu.jpg" class="img-fluid" alt="honolulu">
            </div>

            <div class="col-6">
               <p><h2>Bs As - Octubre</h2></p>
                <p>Buenos Aires es la provincia y localidad más grande del estado de Argentina en los Estados Unidos.
                Honolulu es la más sureña de entre las principales ciudades estadounidenses. Aunque el nombre de Honolulu se refiere al área urbana en la costa sureste de la isla de Oahu, la ciudad y el condado de Honolulu han formado una ciudad-condado consolidada que cubre toda la ciudad (aproximadamente 600 km¨2 de superficie).</p>
                <button type="button" class="btn btn-outline-light">Conocé más</button>
            </div>

        </div>

        <div class="row">

            <div class="col" style="text-align: center; color:black; background-color: white;">
                <p>CONVIERTETÉ EN UN</p>
                <p><h2>ORADOR</h2></p>
                <p>Anótate como orador para dar una <u>charla ignite</u>. Cuéntanos de qué quieres hablar!</p>
            </div>
        </div>

        <form>
            <div class="row" style="background-color: white;">
              <div class="col-3 offset-3">
                <input type="text" class="form-control" placeholder="Nombre">
              </div>
              <div class="col-3">
                <input type="text" class="form-control" placeholder="Apellido">
              </div>
              <div class="form-group" style="padding-top: 10px;">
                <textarea class="form-control" id="exampleFormControlTextarea1" rows="3">Sobre qué quieres hablar?</textarea>
                <p style="color:gray;">recuerda incluir un título para tu charla</p>
                </div>
                <div class="d-grid gap-2">
                    <button class="btn btn-primary" style="background-color: #86dc3d; color:white;" type="button">Enviar</button>
                  </div>
                  
            </div>
          </form>
    </div>

    <footer class="mt-auto">
        <div class="row" style="background-color: blueviolet; margin-top: 10px;">
            <div class="col offset-2">Preguntas<br>
                Frecuentes</div>
            <div class="col">
                Contáctanos
            </div>

            <div class="col">
                Prensa
            </div>

            <div class="col">
                Conferencias
            </div>

            <div class="col">
                <p>Términos y</p>
                <p>condiciones</p>
            </div>

            <div class="col">
                Privacidad
            </div>

            <div class="col">
                Estudiantes
            </div>
        </div>
    </footer>
</body>