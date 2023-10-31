let res = document.querySelector("section#result");
let computador = 0;
let jogador = 0 ;

function sortear() {
let min = 1;
let max = 100;
let dif = max - min;
let aleatorio = Math.random();
computador = min + Math.trunc(dif * aleatorio);
}

function jogar() {
 jogador = Number(window.prompt("Qual é o palpite?"));

    if ( jogador > computador) {
    res.innerHTML += `<p> você falou <strong>${jogador}</strong>. Seu número é <strong>MAIOR</strong> do que o meu número</p>`;
    } else if ( jogador < computador) {
    res.innerHTML += `<p> você falou <strong>${jogador}</strong>. Seu número é <strong>Menor</strong> do que o meu número</p>`;
    } else if (jogador == computador) {
    res.innerHTML += `<p> você falou <strong>${jogador}</strong>. Seu número esta <strong>CORRETO</strong></p>`;
    document.getElementById("botao").style.visibility = 'hiden';
    }
}