//addEventListener é o ouvinte, ou seja, ele especifica o evento e sua ação
document.getElementById('rbPizza').addEventListener('change', function () {
    if (this.checked) {
      document.getElementById('inPizza').classList.remove('oculta')
      document.getElementById('inBebida').classList.add('oculta')
    }
  })

  document.getElementById('rbBebida').addEventListener('change', function () {
    if (this.checked) {
      document.getElementById('inPizza').classList.add('oculta')
      document.getElementById('inBebida').classList.remove('oculta')
    }
  })

