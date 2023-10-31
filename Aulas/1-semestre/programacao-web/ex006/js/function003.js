function calcidade() {
    let agora = new Date();
    let ano = agora.getFullYear();
    
    let nasc = Number(window.prompt("Qual seu ano de nascimento "));
    let idade = ano - nasc;
    
    let saida = document.getElementById("saida");
    saida.innerHTML = `<p>Quem nasceu em ${nasc} vai completar <strong>${idade}</strong> anos em ${ano}. </p>`;
    }