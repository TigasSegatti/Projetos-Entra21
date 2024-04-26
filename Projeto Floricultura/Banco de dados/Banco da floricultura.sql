CREATE DATABASE db_floricultura;
USE db_floricultura;

/* CONSTRUÇÃO DA ESTRUTURA DO BANCO DE DADOS */

CREATE TABLE Produto(
id_produto INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    tipo VARCHAR(45) NOT NULL,
    preco DOUBLE NOT NULL,
    quantidade_estoque INTEGER
);

CREATE TABLE Cliente(
idCliente INTEGER PRIMARY KEY AUTO_INCREMENT,
    rg VARCHAR(14) NOT NULL,
    nome VARCHAR(255) NOT NULL,
    telefone VARCHAR(11) NOT NULL,
    endereco VARCHAR(255)
);

CREATE TABLE Pedido(
idPedido INTEGER PRIMARY KEY AUTO_INCREMENT,
fk_cliente INTEGER,
    dataPedido DATE,
    valorTotal DOUBLE
);

CREATE TABLE pedido_has_produto(
fk_pedido INTEGER,
    fk_produto INTEGER,
    FOREIGN KEY (fk_pedido) REFERENCES Pedido(idPedido),
    FOREIGN KEY (fk_produto) REFERENCES Produto(id_produto)
);

ALTER TABLE Pedido ADD CONSTRAINT fk_Pedido_Cliente 
FOREIGN KEY (fk_cliente) REFERENCES Cliente(idCliente);

/*MANIPULAÇÃO DE DADOS NO BANCO DE DADOS*/

INSERT INTO cliente VALUES
(null, "20530112124", "João Carlos da Silva", "876541258", "Av. Movimentada, n 100"),
(null, "20530112421", "Mara Clara dos Santos", "8597488521", "Rua Sem Fim, n 15");

INSERT INTO cliente VALUES
(null, "20530112124", "Davi Saldanha", "876541258", "Av. Movimentada, n 1058");

SELECT * FROM cliente;

UPDATE cliente SET endereco = "Rua Paralela, n 15" WHERE idCliente = 2; 

INSERT INTO produto VALUES
(null, "Rosa", "Flor", 5.99, 50),
(null, "Margarida", "Flor", 4.99, 15),
(null, "Jarro de Barro", "Diversos", 29.99, 10);

SELECT * FROM produto;

INSERT INTO pedido VALUES
(null, 1, "2024-04-15", 11.98),
(null, 2, "2024-04-16", 4.99);

SELECT * FROM pedido;

INSERT INTO pedido_has_produto VALUES
(1, 1),
(1, 2),
(2, 2);

SELECT * FROM pedido_has_produto;

/* COMANDO DQL */
SELECT SUM(valorTotal) "Total (R$)" FROM pedido;

SELECT MAX(valorTotal) "Maior Valor" FROM pedido;

SELECT COUNT(idPedido) "Quantidade" FROM pedido;

SELECT idPedido, dataPedido FROM pedido WHERE valorTotal >= 10.0;

SELECT * FROM cliente ORDER BY nome DESC;

SELECT idPedido, nome "Cliente", valorTotal "Total (R$)"FROM pedido
INNER JOIN cliente
ON pedido.fk_cliente = cliente.idCliente;

SELECT idPedido, nome "Cliente", valorTotal "Total (R$)"FROM pedido
RIGHT JOIN cliente
ON pedido.fk_cliente = cliente.idCliente;

SELECT nome "Produto", COUNT(fk_produto) FROM pedido_has_produto
RIGHT JOIN produto
ON pedido_has_produto.fk_produto = produto.idProduto
GROUP BY NOME;

