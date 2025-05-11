function aleatorio(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

function eleccion(jugada) {
  if (jugada === 1) return "✊🏻 Piedra";
  if (jugada === 2) return "🧻 Papel";
  if (jugada === 3) return "✂️ Tijera";
  return "Mal elegido";
}

let triunfos = 0;
let perdidas = 0;

const resultado = document.getElementById("resultado");
const botones = document.querySelectorAll(".btn");

botones.forEach((btn) => {
  btn.addEventListener("click", () => {
    const jugador = parseInt(btn.getAttribute("data-choice"));
    const pc = aleatorio(1, 3);

    let mensaje = `PC elige: ${eleccion(pc)}\nTú eliges: ${eleccion(jugador)}\n`;

    if (pc === jugador) {
      mensaje += "Resultado: EMPATE 🤝";
    } else if (
      (jugador === 1 && pc === 3) ||
      (jugador === 2 && pc === 1) ||
      (jugador === 3 && pc === 2)
    ) {
      mensaje += "Resultado: ¡Ganaste! 🎉";
      triunfos++;
    } else {
      mensaje += "Resultado: ¡Perdiste! 🤣🫵🏻";
      perdidas++;
    }

    mensaje += `\nMarcador: ${triunfos} ganadas / ${perdidas} perdidas`;

    if (triunfos === 3 || perdidas === 3) {
      mensaje += triunfos === 3
        ? `\n🎊 ¡Felicitaciones! Ganaste la partida.`
        : `\n💀 Perdiste la partida. ¡Suerte la próxima!`;

      triunfos = 0;
      perdidas = 0;
    }

    resultado.innerText = mensaje;
  });
});











