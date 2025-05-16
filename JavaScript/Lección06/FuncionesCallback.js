miFuncion1()
miFuncion2()

function miFuncion1(){
    console.log('Función 1');
}

function miFuncion2(){
    console.log('Función 2');
}

//Funciones de tipo Callback
function imprimir(mensaje){
    console.log( mensaje );
}

function sumar(op1, op2, funcionCallback){
    let respuesta = op1 + op2;
    funcionCallback(`Resultado: ${respuesta}`);
}

sumar(5, 3, imprimir);

//Llamadas asíncronas con uso de setTimeout
function miFuncionCallback(){
    console.log('Saludo asíncrono después de 6 segundos');
}

setTimeout(miFuncionCallback, 6000);

setTimeout( function() {console.log('Saludo asíncrono 2')}, 3000);

setTimeout( () => console.log('Saludo asíncrono 3'), 7000);

let reloj = () => {
    let fecha = new Date();
    console.log(`${fecha.getHours()}:${fecha.getMinutes()}:${fecha.getSeconds()}`);
}

setInterval(reloj, 1000); //cada un segundo se va mostrando la ejecución