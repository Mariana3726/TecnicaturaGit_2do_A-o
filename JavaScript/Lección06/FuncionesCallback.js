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
