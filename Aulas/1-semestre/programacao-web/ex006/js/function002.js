function info() {
    let meses = new Array 
    ('Jan' , 'Fev' , 'Mar' , 'Abr' , 'Mai' , 'Jun' , 'Jul' , 'Agos' , 'Set' , 'Out' , 'Nov' ,  'Dez');
    let semana = new Array('Dom' , 'Seg' , 'Ter' , 'Qua', 'Qui' , 'Sex' , 'Sab')
    let agora = new Date 
    let saida = document.getElementById("saida")
    let dia = agora.getDate()
    let mes = agora.getMonth()
    let ano = agora.getFullYear()
    let sem = agora.getDay()
    let hora = agora.getHours()
    let min = agora.getMinutes()
    let seg = agora.getSeconds()
    
    saida.innerHTML = `<p>Dia: <b>${dia}</b></p>`
    saida.innerHTML += `<p>Mês: <b>${meses[mes]}</b></p>`
    saida.innerHTML += `<p>Ano: <b>${ano}</b></p>`
    saida.innerHTML += `<p>Dia da Semana: <b>${semana[sem]}</b></p>`
    saida.innerHTML += `<p>Hora: <b>${hora}</b></p>`
    saida.innerHTML += `<p>Minutos: <b>${min}</b></p>`
    saida.innerHTML += `<p>Segundos: <b>${seg}</b></p>`
}