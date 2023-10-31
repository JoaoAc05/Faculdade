let res = document.querySelector('section#result')
        
function avaliar() {

    let varia1 = Number(document.getElementById('valor1').value)
    let varia2 = Number(document.getElementById('valor2').value)

    if (varia1 < varia2) {
        res.innerHTML = `<p><strong> ${varia1} </strong> e <strong> ${varia2} </strong>, o maior é ${varia2}</p>`

    }else if (varia1 > varia2) {
        res.innerHTML = `<p><strong> ${varia1} </strong> e <strong> ${varia2} </strong>, o maior é ${varia1}</p>`
    }else {
        res.innerHTML = `<p> sao iguais </p>`
    }
}