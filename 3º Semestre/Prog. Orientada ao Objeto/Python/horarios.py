# 0 - 6 --> Boa madrugada
# 6 - 12 --> Bom dia
# 12 - 18 --> Boa tarde
# 18 - 24 --> Boa noite
# 15 --> Bom chá

hora = int (input("Digite a hora:"))

if hora < 0 or hora > 23:
  (print("Hora inválida"))
elif hora < 12:
    (print("Bom dia!"))
elif hora == 15:
    (print("Bom chá!"))
elif hora < 18:
    (print("Boa tarde!"))
else:
    (print("Boa noite!"))