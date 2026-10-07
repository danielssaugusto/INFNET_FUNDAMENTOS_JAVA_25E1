# Atividade Prática - Lógica de Programação e Orientação a Objetos em Java

Este repositório contém a resolução da lista de exercícios práticos de Java, cobrindo desde a configuração inicial do ambiente até conceitos avançados de Orientação a Objetos, estruturas de dados e manipulação de arquivos.

---

## Sumário
1. [Parte 1 - Configuração do Ambiente de Desenvolvimento](#parte-1---configuração-do-ambiente-de-desenvolvimento)
    - [Exercício 1: Instalando e configurando o ambiente Java](#exercício-1-instalando-e-configurando-o-ambiente-java)
2. [Parte 2 - Conceitos Básicos da Linguagem](#parte-2---conceitos-básicos-da-linguagem)
    - [Exercício 2: Validação de Senha Segura](#exercício-2-validação-de-senha-segura)
    - [Exercício 3: Calculadora de Impostos](#exercício-3-calculadora-de-impostos)
    - [Exercício 4: Simulador de Empréstimo Bancário](#exercício-4-simulador-de-empréstimo-bancário)
    - [Exercício 5: Criando um Programa CGI em Java](#exercício-5-criando-um-programa-cgi-em-java)
3. [Parte 3 - Classes e Objetos](#parte-3---classes-e-objetos)
    - [Exercício 6: Cadastro de Veículos](#exercício-6-cadastro-de-veículos)
    - [Exercício 7: Gerenciador de Alunos](#exercício-7-gerenciador-de-alunos)
4. [Parte 4 - Orientação a Objetos Avançada](#parte-4---orientação-a-objetos-avançada)
    - [Exercício 8: Sistema de Funcionários](#exercício-8-sistema-de-funcionários)
    - [Exercício 9: Conta Bancária com Encapsulamento](#exercício-9-conta-bancária-com-encapsulamento)
5. [Parte 5 - Manipulação de Arquivos e Estruturas Avançadas](#parte-5---manipulação-de-arquivos-e-estruturas-avançadas)
    - [Exercício 10: Registro de Compras em Arquivo](#exercício-10-registro-de-compras-em-arquivo)
    - [Exercício 11: Simulação de Loteria](#exercício-11-simulação-de-loteria)
    - [Exercício 12: Sistema de Chat Simples com Arrays](#exercício-12-sistema-de-chat-simples-com-arrays)

---

## Parte 1 - Configuração do Ambiente de Desenvolvimento

### Exercício 1: Instalando e configurando o ambiente Java
**Contexto:** Configuração inicial do ambiente de desenvolvimento em uma startup.

**Tarefas:**
1. Instalar o JDK mais recente e configurar as variáveis de ambiente.
2. Instalar a IDE IntelliJ IDEA e criar um projeto Java chamado `MinhaPrimeiraApp`.
3. Criar a classe `OlaMundo` e implementar a impressão da mensagem:
   > `"Olá, meu nome é [Seu Nome] e estou aprendendo Java!"`
4. Realizar o build do projeto e a execução pelo console da IDE.

**Comprovantes de Entrega (Capturas de Tela):**
- Terminal com o comando `java -version`.
- Tela de configuração do JDK no IntelliJ IDEA.
- Execução do programa no console da IDE.

---

## Parte 2 - Conceitos Básicos da Linguagem

### Exercício 2: Validação de Senha Segura
**Contexto:** Validação de senhas para novos cadastros de usuários.

**Requisitos:**
- Solicitar nome e senha do usuário.
- Regras de validação da senha:
    - Mínimo de 8 caracteres.
    - Pelo menos uma letra maiúscula.
    - Pelo menos um número.
    - Pelo menos um caractere especial (`@`, `#`, `$`, etc.).
- Caso seja inválida, informar o erro específico e solicitar uma nova tentativa até a entrada de uma senha válida.

### Exercício 3: Calculadora de Impostos
**Contexto:** Cálculo do imposto de renda anual de um funcionário com base no salário mensal.

**Tabela de Alíquotas:**

| Faixa de Salário Anual | Alíquota |
| :--- | :--- |
| Até R$ 22.847,76 | Isento |
| De R$ 22.847,77 a R$ 33.919,80 | 7,5% |
| De R$ 33.919,81 a R$ 45.012,60 | 15,0% |
| Acima de R$ 45.012,61 | 27,5% |

**Saída esperada:** Exibir o valor total do imposto calculado e o salário líquido resultante.

### Exercício 4: Simulador de Empréstimo Bancário
**Contexto:** Automação de simulação de empréstimo para clientes bancários.

**Requisitos:**
- Solicitar nome do cliente e valor do empréstimo.
- Solicitar quantidade de parcelas (mínimo 6, máximo 48).
- Aplicar taxa de juros mensal fixa de 3%.
- Exibir o valor total a ser pago e o valor das parcelas mensais.

### Exercício 5: Criando um Programa CGI em Java
**Contexto:** Simulação da mecânica do Common Gateway Interface (CGI) para geração de conteúdo dinâmico HTTP via linha de comando.

**Requisitos do Programa:**
- Imprimir o cabeçalho obrigatório `Content-Type: text/html`.
- Incluir uma linha em branco após os cabeçalhos.
- Imprimir o corpo formatado em HTML com a mensagem `"Olá, Terráqueos!"`.

**Exemplo de Saída Esperada:**
```http
Content-Type: text/html

<html>
<head><title>Saudação CGI</title></head>
<body>
<h1>Olá, Terráqueos!</h1>
</body>
</html>
```

---

## Parte 3 - Classes e Objetos

### Exercício 6: Cadastro de Veículos
**Contexto:** Gestão da frota de uma locadora de veículos.

**Estrutura da Classe `Veiculo`:**
- **Atributos:** `placa` (String), `modelo` (String), `ano` (int), `quilometragem` (double).
- **Métodos:**
    - `exibirDetalhes()`: Exibe todos os dados do veículo.
    - `registrarViagem(double km)`: Soma a quilometragem percorrida ao total.
- **Testes:** Instanciar dois veículos no método `main()` e realizar simulações de viagens.

### Exercício 7: Gerenciador de Alunos
**Contexto:** Sistema acadêmico de registro e avaliação de notas.

**Estrutura da Classe `Aluno`:**
- **Atributos:** `nome` (String), `matricula` (String), `nota1`, `nota2`, `nota3` (double).
- **Métodos:**
    - `calcularMedia()`: Retorna a média aritmética das três notas.
    - `verificarAprovacao()`: Avalia se o aluno foi aprovado (média $\ge$ 7.0) ou reprovado.
- **Testes:** Capturar dados informados pelo usuário e exibir o resultado do processamento no `main()`.

---

## Parte 4 - Orientação a Objetos Avançada

### Exercício 8: Sistema de Funcionários
**Contexto:** Cálculo salarial com base em papéis organizacionais via herança e polimorfismo.

**Estrutura do Sistema:**
- Classe base: `Funcionario` (`nome`, `salarioBase`).
- Subclasse `Gerente`: Aplica acréscimo de 20% ao salário.
- Subclasse `Estagiario`: Aplica desconto de 10% ao salário.
- **Testes:** Criar instâncias de cada classe e exibir os salários finais ajustados.

### Exercício 9: Conta Bancária com Encapsulamento
**Contexto:** Proteção e controle de acesso a dados bancários sensíveis.

**Estrutura da Classe `ContaBancaria`:**
- **Atributos:** `titular` (String), `saldo` (double, privado).
- **Métodos:**
    - `depositar(double valor)`
    - `sacar(double valor)` (Permitido apenas se houver saldo suficiente)
    - `exibirSaldo()`
- **Testes:** Instanciar uma conta no `main()` e validar as operações de depósito, saque e consulta.

---

## Parte 5 - Manipulação de Arquivos e Estruturas Avançadas

### Exercício 10: Registro de Compras em Arquivo
**Contexto:** Persistência simples de dados de vendas para controle de estoque.

**Requisitos:**
1. Receber o cadastro de 3 compras do usuário (produto, quantidade e preço unitário).
2. Gravar os dados formatados em um arquivo texto chamado `compras.txt`.
3. Efetuar a leitura do arquivo gerado e exibir as compras no console.

### Exercício 11: Simulação de Loteria
**Contexto:** Desenvolvimento de jogo de sorteio e conferência numérica.

**Requisitos:**
- Gerar aleatoriamente 6 números no intervalo entre 1 e 60.
- Solicitar que o usuário informe 6 palpites.
- Comparar os palpites informados com os números sorteados e exibir o total de acertos.

### Exercício 12: Sistema de Chat Simples com Arrays
**Contexto:** Sistema interativo de troca de mensagens via linha de comando utilizando arrays simples.

**Regras do Programa:**
- Registrar os nomes de dois usuários.
- Permitir o envio de até 5 mensagens por usuário (total de 10 mensagens alternadas).
- Armazenar o histórico em um array estático (`String[]`).
- Exibir o histórico de conversas e finalizar o programa ao término do envio das 10 mensagens.

**Exemplo de Execução:**
```text
Digite o nome do primeiro usuário: Alice
Digite o nome do segundo usuário: Bob

Alice, digite sua mensagem: Olá Bob, como você está?
Bob, digite sua mensagem: Oi Alice! Estou bem, e você?
...

===== Histórico de Mensagens =====
Alice: Olá Bob, como você está?
Bob: Oi Alice! Estou bem, e você?
...

Obrigado por utilizarem o sistema! Boa sorte para vocês!
```

---

## Requisitos para Execução do Projeto
- **JDK (Java Development Kit):** Versão 17 ou superior.
- **IDE Recomendada:** IntelliJ IDEA.
- **Compilação e Execução via Terminal:**
  ```bash
  javac NomeDoArquivo.java
  java NomeDoArquivo