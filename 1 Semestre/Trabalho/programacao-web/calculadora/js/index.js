function baskara() {
    let valor1 = Number(document.getElementById("a").value);
    let valor2 = Number(document.getElementById("b").value);
    let valor3 = Number(document.getElementById("c").value);
    delta = ((valor2 ** 2)- (4 * valor1 * valor3));
    divisao = 2 * valor1;
    raizq = Math. sqrt(divisao);

    if ( delta < 0) {
        resultado =  `Seu delta:${delta} possui valor negativo, a oparação finzaliza aqui!`
    } 
    document.getElementById("").value = resultado
}