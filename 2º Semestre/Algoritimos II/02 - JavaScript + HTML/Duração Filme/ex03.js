function converter() {
    let tempoMinuto = document.getElementById("minuto").value
    let msg = document.getElementById("msg")
    let hora = parseInt (tempoMinuto / 60)
    let minuto = parseInt (tempoMinuto % 60)
    msg.innerHTML = hora + "h" + minuto + " minutos"
}