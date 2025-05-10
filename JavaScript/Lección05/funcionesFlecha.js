function miFuncion(){
    console.log('Saludos desde mi función clásica');
}

miFuncion();

let myFunction = function () {
    console.log('Saludos desde la función anónima');
}

//Ahora creamos una función flecha

let miFuncionFlecha = () => {
    console.log('Saludos desde mi función flecha');
}
//Hay mas variantes para funciones flecha 
miFuncionFlecha();

//Lo hacemos en una sola línea
const saludar = () => console.log('Saludos desde esta función flecha');
saludar();

//otro ejemplo
const saludar2 = () => {
    return 'Saludos desde la función flecha dos'
}

console.log(saludar2);

//Simplificamos la función anterior
const saludar3 = () => 'Saludos desde la función flecha 3';
console.log(saludar3);

//otro ejemplo
const regresaObjeto = () => ({nombre: 'Jose', apellido: 'Gomez'});
console.log(regresaObjeto());

//Funciones flecha que reciben parámetros
const funcionParametros = (mensaje) => console.log(mensaje);
funcionParametros ('saludos desde esta función con parámetros');

//Una función con parámetros clásica
const funcionParametrosClasica = function(mensaje){
    console.log(mensaje);
}
funcionParametrosClasica('Saludos desde la función clásica');

//Se pueden omitir los paréntesis en la función flecha
const funcionConParametros = mensaje => console.log(mensaje);
funcionConParametros('Otra forma de trabajar con función flecha');

//Funciones flecha con varios parámetros
//Podemos abrir la función y tener má cosas dentro de ella
const funcionConParametros2 = (op1, op2) => {
    let resultado = op1 + op2
    return resultado;
}
console.log(funcionConParametros2(3, 5));