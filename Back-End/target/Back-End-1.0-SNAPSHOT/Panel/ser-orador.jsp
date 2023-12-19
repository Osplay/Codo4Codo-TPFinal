<%-- 
    Document   : serorador
    Created on : 16 dic. 2023, 20:53:40
    Author     : Ryzen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="../header.jsp"/>


    
    <section>
        <form action="AgregarOrador" method="POST" >
            <div class="row">
                <div class="col-2 offset-5">
                    <h4>Datos del orador:</h4>
                </div>
                <div class="col-4 offset-2">
                    <input type="text" name="nombre" class="form-control" id="nombre" placeholder="Nombre del orador" style="width:100%"/>

                </div>

                <div class="col-4">
                    <input type="text" name="apellido" class="form-control" id="apellido" placeholder="Apellido del orador" style="width:100%"/>
                </div>

                <br/>

                <div class="col-8 offset-2" style="padding-top: 10px;">
                    <input type="text" name="descripcion" class="form-control" id="descripcion" placeholder="Breve descripción del orador..." style="width:100%"/>
                </div>
                
                <br/>

                <div class="col-6 offset-5">
                    <h4>Especialidades:</h4>
                </div>

                <br/>

                <div class="col-6 offset-2">
                    <input class="form-check-input" type="checkbox" value="javascript" name="chk_javascript" id="chk_javascript">
                    <label class="form-check-label" for="chk_javascript">
                        Javascript
                    </label>
                    <input class="form-check-input" type="checkbox" value="react" name="chk_react" id="chk_react">
                    <label class="form-check-label" for="chk_react">
                        React
                    </label>
                    <input class="form-check-input" type="checkbox" value="negocios" name="chk_negocios">
                    <label class="form-check-label" for="chk_negocios">
                        Negocios
                    </label>
                    <input class="form-check-input" type="checkbox" value="startups" name="chk_startups">
                    <label class="form-check-label" for="chk_startups">
                        Startups
                    </label>
                </div>

                <br/>

                <div class="col-8 offset-2">
                    Url foto:
                    <input type="text" name="foto" id="foto" style="width:100%;" placeholder="URL de la foto.">

                </div>

                <br/>

                <div class="col-8 offset-2">
                    <button class="btn btn-primary" type="submit" style="background-color: #86dc3d; color:white; width:100%; margin-top: 10px;">Enviar</button>
                </div>

            </div>
        </form>
    </section>


     <jsp:include page="../footer.jsp"/>
