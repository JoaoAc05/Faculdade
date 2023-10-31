let contador = 0
let res = document.querySelector('section#result')
// as variaveis aqui fora são variaveis globais

function contar() {
    contador ++
    res.innerHTML = `<p> O contador está com <mark><strong>${contador}</strong></mark> cliques. </p>`
}
function zerar() {
    contador = 0
    res.innerHTML = null
}