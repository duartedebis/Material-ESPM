let tabela = document.getElementById("tabela")
let nome = document.getElementById("nome")
let ra = document.getElementById("RA")

function cadastrar() {
    let linha = tabela.insertRow(-1)
    let celulaNome = linha.insertCell(0)
    let celulaRA = linha.insertCell(1)

    celulaNome.innerHTML = nome.value
    celulaRA.innerHTML = ra.value
}