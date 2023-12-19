document.getElementById("cantidad").oninput = function() {updateCantidad()};
document.getElementById("categoria").onchange = function() {updateCantidad()};
document.getElementById("borrar").onclick = function() {clickBorrar()};
document.getElementById("resumen").onclick = function() {clickResumen()};

function updateCantidad(){

    var porcentaje = 1;
    var cantidad = 0;

    cantidad = Math.abs(parseInt(document.getElementById("cantidad").value)|| 0);
    porcentaje = document.getElementById("categoria").value;

    switch(porcentaje){
        case "0":
            porcentaje = 0.2;
            break;
        case "1":
            porcentaje = 0.5;
            break;
        case "2":
            porcentaje = 0.85;
            break;
        default:
            porcentaje = 1;
            break;
    }
 
    document.getElementById("total").value = (cantidad * 200) * porcentaje;
    document.getElementById("total").setAttribute("value", (cantidad * 200) * porcentaje);
    document.getElementById("total").innerHTML = (cantidad * 200) * porcentaje;

}

function clickBorrar(){
    document.getElementById("cantidad").value = 0;
    document.getElementById("categoria").value = 0;
    document.getElementById("total").value = 0;
    document.getElementById("total").setAttribute("value", 0);
    document.getElementById("total").innerHTML = "0";
}

function clickResumen(){
    updateCantidad(); // this is a comment
}