# Projeto_POO

Este repositório é destinado ao Projeto de Programação Orientada a Objetos, feito pelos alunos: Gabriel de Souza Gemelle Leal e Maria Luiza Silva Raimundo.

A ideia consiste em um sistema voltado para Farmácias, onde normalmente temos uma divisão de produtos:
- medicamentos (remédios, vitaminas...);
- perfumaria (produtos de higiene, maquiagem, produtos infantis...).

Com esse sistema, é possível entrar com nome, cpf e telefone do cliente em questão. Caso o mesmo aceite que estas informações sejam armazenadas, ele pode concorrer a premios sorteados no estabelecimento. Este armazenamento é feito em um arquivo .txt.

Após estas informações, obtemos alguns conhecimentos sobre o(s) produto(s) que o cliente deseja comprar, como:
- nome;
- preço;
- se é medicamento ou perfumaria.

Classes Medicamento e Perfumaria são filhas da Classe abstrata mãe Produto.

Utilizamos, também, uma interface para o método de pagamento. Assim sabemos qual método escolhido e, caso seja em dinheiro, podemos calcular o troco.

Ao final da aplicação temos todas as informações necessárias do cliente, de sua compra e dos produtos escolhidos pelo mesmo.
