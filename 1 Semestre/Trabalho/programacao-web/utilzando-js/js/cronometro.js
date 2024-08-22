let cronometro = document.getElementById('cronometro');
let horas = 0;
let minutos = 0;
let segundos = 0;
let interval;

function incrementar() {
    segundos++;

    if (segundos >= 60) {
        segundos = 0;
        minutos++;
    }

    if (minutos >= 60) {
        minutos = 0;
        horas++;
    }

    cronometro.textContent = `${horas.toString().padStart(2, '0')}:${minutos.toString().padStart(2, '0')}:${segundos.toString().padStart(2, '0')}`;
}

function iniciar() {
    clearInterval(interval);
    interval = setInterval(incrementar, 1000);
}

function pausar() {
    clearInterval(interval);
}

function reiniciar() {
    clearInterval(interval);
    horas = 0;
    minutos = 0;
    segundos = 0;
    cronometro.textContent = '00:00:00';
}