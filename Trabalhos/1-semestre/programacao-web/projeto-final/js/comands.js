document.addEventListener('DOMContentLoaded', function() {
    var nomeElement = document.getElementById('my-name');
    var nome = 'João Alves';
    var index = 0;

    function escreverNome() {
        nomeElement.innerHTML += nome[index];
        index++;
        if (index < nome.length) {
        setTimeout(escreverNome, 200); 
        }
    }

    escreverNome();
    });
    

    function scrollToDiv(targetId) {
    const targetElement = document.getElementById(targetId);
    const targetPosition = targetElement.offsetTop - 80; // Subir 80 pixels do header
    const startPosition = window.scrollY;
    const distance = targetPosition - startPosition;
    const duration = 1500; // 1,5 segundos
    let start = null;
    function animateScroll(timestamp) {
        if (!start) start = timestamp;
        const progress = timestamp - start;
        window.scrollTo(0, easeInOutCubic(progress, startPosition, distance, duration));
        if (progress < duration) {
        requestAnimationFrame(animateScroll);
        }
    }


    function easeInOutCubic(t, b, c, d) {
        t /= d / 2;
        if (t < 1) return c / 2 * t * t * t + b;
        t -= 2;
        return c / 2 * (t * t * t + 2) + b;
    }
    requestAnimationFrame(animateScroll);
}
