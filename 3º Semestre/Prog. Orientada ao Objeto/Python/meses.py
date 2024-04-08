meses = [
    'jan', 'fev', 'mar',  'abr', 'mai', 'jun',
    'jul', 'ago', 'set', 'out', 'nov', 'dez'
]

print("1. ", meses[0])
print("2. ", meses[0:3])
print("3. ", meses[4:9])
print("4. ", meses[len(meses) - 1])
print("5. ", meses[-1])
print("6. ", meses[-3:0])
print("7. ", meses[0:-3])
print("8. ", meses[::2]) #ímpares
print("9. ", meses[1::2]) #pares
print("10. ", meses[::]) #todos os elementos