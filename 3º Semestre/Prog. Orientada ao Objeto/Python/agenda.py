agenda = []
while True:
    comando = input ('> ').lower().strip()

    # Adicionar um contato "add"
    if comando == 'add':
        nome = input('Nome: ')
        telefone = input('Telefone: ')
        agenda.append([nome, telefone])

    # Listar todos os contatos "list"
    elif comando == 'list':
        for nome, telefone in agenda:
            print(f'Nome: {nome} Telefone: {telefone}')
    elif comando.split(" ") [0] == "search":
        nome = comando.split(" ")[1].lower
        for record in agenda:
            if nome in record[0].lower():
                print(f'Nome: {record[0]} Telefone: {record[1]}')
    elif comando == 'exit': break
    else: print('Comando inválido')