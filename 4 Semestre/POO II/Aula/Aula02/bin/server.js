const app = require ('../src/app');
const port = normalizaPort(process.env.PORT || '1337');

function normalizaPort(val) {
    const port = parseInt(val, 10);
    if (isNaN(port)) {
        return val;
    }

    if (port >= 0) {
        return port;
    }

    return false;
}

app.listen(port, () => {
    console.log(`Servidor Online na porta ${port}.`)
} )
