# Analisar o perfil do investidor para compra de ativos, padrão BACEN, faça um programa que pergunte
# 1. Tem formação na área financeira?
# 2. Tem experiência em investimentos?
# 3. Possui patrimônio constituido?
# 4. Esta disposto a correr risco?
# 5. Você suporta perdas de até 20% do capital investido a curto prazo?

# De acordo com as resposta, o programa deve classificar o perfil do investidor em:
# 1. Conservador, se responder até 1 sim;
# 2. Moderado, se responder até 3 sim;
# 3. Agressivo, se responder até 4 sim;
# 4. Especulador, se responder sim para 5;

perguntas = [
    input("Tem formação na área financeira?"),
    input("Tem experiência em investimentos? "),
    input("Possui patrimônio constituido?"),
    input("Esta disposto a correr risco?"),
    input("Você suporta perdas de até 20% do capital investido a curto prazo?")
]

pontos = 0
for perg in perguntas:
    if input == "sim":
        pontos += 1