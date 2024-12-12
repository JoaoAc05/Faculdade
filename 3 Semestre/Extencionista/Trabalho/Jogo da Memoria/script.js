const secretNumber = Math.floor(Math.random() * 100) + 1;
let attempts = 0;

function checkGuess() {
    const guessInput = document.getElementById('guessInput');
    const message = document.getElementById('message');
    const userGuess = parseInt(guessInput.value);

    if (isNaN(userGuess) || userGuess < 1 || userGuess > 100) {
        message.textContent = 'Por favor, insira um número válido entre 1 e 100.';
        message.style.color = 'black';
    } else {
        attempts++;

        if (userGuess === secretNumber) {
            message.textContent = `Parabéns! Você acertou o número ${secretNumber} em ${attempts} tentativas.`;
            message.style.color = 'green';
            guessInput.disabled = true;
        } else {
            const hint = userGuess < secretNumber ? 'maior' : 'menor';
            message.textContent = `Tente novamente. O número é ${hint} que ${userGuess}.`;
            message.style.color = 'black';
        }
    }
}
