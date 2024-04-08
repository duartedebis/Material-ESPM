let senha = '';

function appendToSenha(digito) {
    senha += digito;
    updateSenhaInput();
}

function updateSenhaInput() {
    document.getElementById('senha-input').value = '*'.repeat(senha.length);
}

function clearSenha() {
    senha = '';
    updateSenhaInput();
}

function validarSenha() {
    const resultadoDiv = document.getElementById('resultado');
    resultadoDiv.style.color = senha === '1234' ? 'green' : 'red';
    resultadoDiv.textContent = senha === '1234' ? 'Senha correta. Acesso permitido.' : 'Senha incorreta. Acesso negado.';
    clearSenha();
}

document.addEventListener('keydown', function(event) {
    const key = event.key;
    const isDigit = /^\d$/.test(key);

    if (isDigit) {
        appendToSenha(key);
    } else if (key === 'Enter') {
        validarSenha();
    }
});

document.getElementById('senha-input').addEventListener('click', clearSenha);
