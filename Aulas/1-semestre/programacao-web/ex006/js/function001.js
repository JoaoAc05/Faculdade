function info() {
    let agora = new Date 
    let saida = document.getElementById("saida")
    saida.innerHTML = `<p>O que eu recebi do sistema foi <mark>${agora}</mark></p>`
    
   }

function info2() {
    let agora = new Date 
    let saida = document.getElementById("saida")
    saida.innerHTML = `<p>${agora.getMinutes()}</p>` 
    // saida.innerHTML = `<p>${agora.getHours()+":"+agora.getMinutes()}</p>` 
}

function info3() {
    let agora = new Date 
    let saida = document.getElementById("saida")
    saida.innerHTML = `<p>${agora.getHours()+":"+agora.getMinutes()}</p>` 
}
function info4() {
    let agora = new Date 
    let saida = document.getElementById("saida")
    saida.innerHTML = `<p>${agora.getDate()+"/"+(agora.getMonth()+1)+" - "+agora.getHours()+":"+agora.getMinutes()+":"+agora.getSeconds()}</p>`
}

// setInterval(() => {
//     info4();
//     }, 1000);
// TIMER