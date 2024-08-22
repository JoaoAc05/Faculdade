const board = document.getElementById('board');
const cells = [];

let currentPlayer = 'X';
let gameActive = true;

// Criação do tabuleiro
for (let i = 0; i < 9; i++) {
  const cell = document.createElement('div');
  cell.classList.add('cell');
  cell.dataset.index = i;
  cell.addEventListener('click', handleCellClick);
  board.appendChild(cell);
  cells.push(cell);
}

function handleCellClick(event) {
  if (!gameActive) return;

  const clickedCell = event.target;
  const cellIndex = clickedCell.dataset.index;

  if (cells[cellIndex].textContent === '') {
    cells[cellIndex].textContent = currentPlayer;

    if (checkWinner()) {
      showWinner(currentPlayer);
      gameActive = false;
    } else if (checkDraw()) {
      setTimeout(() => {
        alert('Empate!');
        resetGame(); // Adiciona o reset após o alerta de empate
      }, 100);
    } else {
      currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
    }
  }
}

function resetGame() {
  // Limpa o conteúdo de todas as células e reinicia o jogo
  cells.forEach(cell => {
    cell.textContent = '';
  });

  // Reseta as variáveis
  currentPlayer = 'X';
  gameActive = true;
}

function checkWinner() {
  const winningCombinations = [
    [0, 1, 2], [3, 4, 5], [6, 7, 8], // Linhas
    [0, 3, 6], [1, 4, 7], [2, 5, 8], // Colunas
    [0, 4, 8], [2, 4, 6]              // Diagonais
  ];

  return winningCombinations.some(combination => {
    const [a, b, c] = combination;
    return cells[a].textContent !== '' &&
           cells[a].textContent === cells[b].textContent &&
           cells[a].textContent === cells[c].textContent;
  });
}

function checkDraw() {
  return cells.every(cell => cell.textContent !== '');
}

function showWinner(player) {
  setTimeout(() => {
    alert(`Jogador ${player} venceu!`);
    resetGame(); // Adiciona o reset após o alerta de vitória
  }, 100);
}
