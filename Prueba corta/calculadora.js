function limpiar(){
    document.getElementById("formulario").reset();
}

function sumar(){
    var numero_uno = parseInt(document.getElementById("valor1").value);
    var numero_dos = parseInt(document.getElementById("valor2").value);
    
    document.getElementById("resultado").innerHTML = numero_uno + numero_dos;
}

function restar(){
    var numero_uno = parseInt(document.getElementById("valor1").value);
    var numero_dos = parseInt(document.getElementById("valor2").value);
    
    document.getElementById("resultado").innerHTML = numero_uno - numero_dos;
}

function multiplicar(){
    var numero_uno = parseInt(document.getElementById("valor1").value);
    var numero_dos = parseInt(document.getElementById("valor2").value);
    
    document.getElementById("resultado").innerHTML = numero_uno * numero_dos;
}

function dividir(){
    var numero_uno = parseInt(document.getElementById("valor1").value);
    var numero_dos = parseInt(document.getElementById("valor2").value);
    
    document.getElementById("resultado").innerHTML = numero_uno / numero_dos;
}