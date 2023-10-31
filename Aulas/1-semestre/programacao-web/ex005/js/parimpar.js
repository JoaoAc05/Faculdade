let res = document.querySelector('section#result')

function teste() {
    let num = Number(window.prompt("Digite o Número: "))

    if (num % 2 == 0) {
        res.innerHTML = `<p> Seu numero é par</p>`
    } else {
        res.innerHTML = `<p> Seu numero é Impar </p>`
    }
}