const frm = document.querySelector("form")
const msg = document.querySelector("pre")

frm.addEventListener("submit", (e) => {

    e.preventDefault()
    let nome = frm.inAtleta.value
    let idade = parseInt(frm.inIdade.value)

    const linha = gerarLinha(nome)
    const categoria = gerarCategoria(idade)
        
    let resposta = "\nNome: " + nome + linha + "\nCategoria: " + categoria
    msg.innerHTML = resposta 

})

const gerarLinha = (nome) => {
    let aux = ""
    for (let i = 0; i < nome.lenght; i++){
        if(nome[i] == " "){
            aux += " "
        }
        else (
            aux += "-"
            )
        }
        return aux
    }

const gerarCategoria = (idade) => {
    let aux = ""
    if(idade <= 12){
        aux = "Infantil"
    }
    else if(idade <= 18 ){
        aux = "Juvenil"
    }
    else{
        aux = "Adulto"
    }

    return aux
}