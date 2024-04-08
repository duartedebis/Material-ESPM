# Soma de três números inseridos, se não tiver 3 números, dar Inválido.

numero = int(input("Digite um número inteiro e positivo: "))

if numero < 100 or numero > 999:
  print("Digite 3 números!")

else:
  soma = 0 
  while numero > 0:
    soma += numero % 10
    numero = numero // 10
  
print(f"a soma do número é {soma}")