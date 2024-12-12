function playGame(playerChoice) {
    const choices = ['rock', 'paper', 'scissors'];
    const computerChoice = choices[Math.floor(Math.random() * 3)];

    const result = document.getElementById('result');
    result.textContent = `Você escolheu ${playerChoice}. O computador escolheu ${computerChoice}.`;

    if (playerChoice === computerChoice) {
        result.textContent += ' É um empate!';
    } else if (
        (playerChoice === 'rock' && computerChoice === 'scissors') ||
        (playerChoice === 'paper' && computerChoice === 'rock') ||
        (playerChoice === 'scissors' && computerChoice === 'paper')
    ) {
        result.textContent += ' Você venceu!';
    } else {
        result.textContent += ' O computador venceu!';
    }
}
