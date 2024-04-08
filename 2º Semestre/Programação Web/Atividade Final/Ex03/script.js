function calcularConvidados() {
    // Obter a pontuação mínima e converter para número
    var pontuacaoMinima = parseFloat(document.getElementById("inputPontuacaoMinima").value);

    // Inicializar o contador de competidores convidados
    var competidoresConvidados = 0;

    // Repetir para cada competidor
    for (var i = 1; i <= 7; i++) {
        // Obter as notas das provas e converter para número
        var notaProva1 = parseFloat(document.getElementById("inputNotaCompetidor" + i + "Prova1").value);
        var notaProva2 = parseFloat(document.getElementById("inputNotaCompetidor" + i + "Prova2").value);

        // Calcular a pontuação total do competidor
        var pontuacaoTotal = notaProva1 + notaProva2;

        // Verificar se o competidor atingiu a pontuação mínima
        if (pontuacaoTotal >= pontuacaoMinima) {
            competidoresConvidados++;
        }
    }

    // Exibir o resultado
    alert("Número de competidores convidados: " + competidoresConvidados);
}