/* Parte 1: Criar o banco de dados e suas tabelas
CREATE DATABASE IF NOT EXISTS popQuiz;
USE popQuiz;

CREATE TABLE IF NOT EXISTS perguntas(
	id int PRIMARY KEY,
	respCerta varchar(20) NOT NULL,
    respErradas varchar(80) NOT NULL,
    peso int NOT NULL,
    materia varchar(4) NOT NULL,
    enunciado varchar(30) NOT NULL
);
CREATE TABLE IF NOT EXISTS quizzes(
	id int PRIMARY KEY,
	id_perg1 int NOT NULL,
    id_perg2 int NOT NULL,
    id_perg3 int NOT NULL,
    id_perg4 int NOT NULL,
    id_perg5 int NOT NULL,
    id_perg6 int NOT NULL,
    id_perg7 int NOT NULL,
    id_perg8 int NOT NULL,
    id_perg9 int NOT NULL,
    id_perg10 int NOT NULL,
    id_perg11 int NOT NULL,
    id_perg12 int NOT NULL,
    id_perg13 int NOT NULL,
    id_perg14 int NOT NULL,
    id_perg15 int NOT NULL,
    nome char(30) NOT NULL,
    
	-- Referencias aos ids da tabela perguntas
    FOREIGN KEY(id_perg1) REFERENCES perguntas(id),
    FOREIGN KEY(id_perg2) REFERENCES perguntas(id),
    FOREIGN KEY(id_perg3) REFERENCES perguntas(id),
    FOREIGN KEY(id_perg4) REFERENCES perguntas(id),
    FOREIGN KEY(id_perg5) REFERENCES perguntas(id),
    FOREIGN KEY(id_perg6) REFERENCES perguntas(id),
    FOREIGN KEY(id_perg7) REFERENCES perguntas(id),
    FOREIGN KEY(id_perg8) REFERENCES perguntas(id),
    FOREIGN KEY(id_perg9) REFERENCES perguntas(id),
    FOREIGN KEY(id_perg10) REFERENCES perguntas(id),
    FOREIGN KEY(id_perg11) REFERENCES perguntas(id),
    FOREIGN KEY(id_perg12) REFERENCES perguntas(id),
    FOREIGN KEY(id_perg13) REFERENCES perguntas(id),
    FOREIGN KEY(id_perg14) REFERENCES perguntas(id),
    FOREIGN KEY(id_perg15) REFERENCES perguntas(id)
);


CREATE TABLE IF NOT EXISTS usuarios(
	id int PRIMARY KEY auto_increment,
    email varchar(30) NOT NULL,
    senha varchar(16) NOT NULL
);
CREATE TABLE IF NOT EXISTS tabNiveis(
	id_usuario int PRIMARY KEY,
    xpMate int NOT NULL,
    lvlMate int NOT NULL,
    xpPort int NOT NULL,
    lvlPort int NOT NULL,
    xpHist int NOT NULL,
    lvlHist int NOT NULL,
    xpBiol int NOT NULL,
    lvlBiol int NOT NULL,
    xpIng int NOT NULL,
    lvlIng int NOT NULL,
    xpGeog int NOT NULL,
    lvlGeog int NOT NULL,
    
    -- Referencia ao usuário dono da tabela
    FOREIGN KEY(id_usuario) REFERENCES usuarios(id)
);
CREATE TABLE IF NOT EXISTS tabConquistas(
	id_usuario int PRIMARY KEY,
    conq01 bool NOT NULL,
    conq02 bool NOT NULL,
    conq03 bool NOT NULL,
    conq04 bool NOT NULL,
    conq05 bool NOT NULL,
    conq06 bool NOT NULL,
    conq07 bool NOT NULL,
    conq08 bool NOT NULL,
    conq09 bool NOT NULL,
    conq10 bool NOT NULL,
    conq11 bool NOT NULL,
    conq12 bool NOT NULL,
    conq13 bool NOT NULL,
    conq14 bool NOT NULL,
    conq15 bool NOT NULL,
    
    -- Referencia ao usuário dono da tabela
    FOREIGN KEY(id_usuario) REFERENCES usuarios(id)
);
*/

/* Parte 2: fazer os exemplos de perguntas, usuários e quizzes */
-- Usuário pré-pronto
-- INSERT INTO usuarios(email,senha) VALUES("fulano@gmail.com","senha");

SELECT * FROM usuarios;
SELECT * FROM tabNiveis;
SELECT * FROM tabConquistas;