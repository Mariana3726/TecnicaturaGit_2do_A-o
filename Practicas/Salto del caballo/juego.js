const N = 8; // Tamaño del tablero

// Posibles movimientos del caballo
const moves = [
    [2, 1], [1, 2], [-1, 2], [-2, 1],
    [-2, -1], [-1, -2], [1, -2], [2, -1]
];

// Inicializa el tablero con -1 (casillas no visitadas)
function createBoard(n) {
    const board = [];
    for (let i = 0; i < n; i++) {
        board[i] = Array(n).fill(-1);
    }
    return board;
}

// Verifica si el movimiento es válido
function isValid(x, y, board) {
    return x >= 0 && y >= 0 && x < N && y < N && board[x][y] === -1;
}

// Algoritmo de backtracking
function solveKnightTour(x, y, moveCount, board) {
    // Caso base: todas las casillas fueron visitadas
    if (moveCount === N * N) return true;

    for (let [dx, dy] of moves) {
        const nextX = x + dx;
        const nextY = y + dy;

        if (isValid(nextX, nextY, board)) {
            board[nextX][nextY] = moveCount;

            if (solveKnightTour(nextX, nextY, moveCount + 1, board)) {
                return true; // Se encontró solución
            }

            // Backtracking: desmarcar casilla
            board[nextX][nextY] = -1;
        }
    }

    return false; // No se encontró solución desde esta ruta
}

// Función principal
function knightTour() {
  const board = createBoard(N);

  for (let startX = 0; startX < N; startX++) {
    for (let startY = 0; startY < N; startY++) {
      // Inicializa el tablero
      for (let i = 0; i < N; i++) {
        board[i].fill(-1);
      }

      board[startX][startY] = 0;

      if (solveKnightTour(startX, startY, 1, board)) {
        drawBoard(board);
        return; // Mostrar la primera solución encontrada
      }
    }
  }

  document.getElementById('board-container').innerText = "No se encontró solución.";
}

