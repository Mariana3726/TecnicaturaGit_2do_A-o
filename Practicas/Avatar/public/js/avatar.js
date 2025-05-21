function seleccionarPersonajeJugador(){
    const personajeZuko = document.getElementById("Zuko");
    const personajeKatara = document.getElementById("Katara");
    const personajeAang = document.getElementById("Aang");
    const personajeToph = document.getElementById("Toph");

    if (personajeZuko.checked) {
        alert("Seleccionaste a Zuko 🔥");
    } else if (personajeKatara.checked) {
        alert("Seleccionaste a Katara 🧊");
    } else if (personajeAang.checked) {
        alert("Seleccionaste a Aang 💨");
    } else if (personajeToph.checked) {
        alert("Seleccionaste a Toph 🌱");
    } else {
        alert("No seleccionaste ningún personaje");
    }
}

let botonPersonajeJugador = document.getElementById('boton-personaje');
botonPersonajeJugador.addEventListener('click', seleccionarPersonajeJugador);
