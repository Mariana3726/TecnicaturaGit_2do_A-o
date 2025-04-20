"use strict"; //no permite el uso de alguna varible sin declarar
x = 10;
console.log(x);

miFuncion();

function miFuncion(){
    "use strict";
   let y = 10;
   console.log(y);
}
miFuncion();

//Es importante que a la hora de usa el modo strict, desactivemos y volvamos a activar quokka, 
// para que reconozca los errores