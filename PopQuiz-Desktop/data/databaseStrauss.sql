-- Parte 1: Criar o banco de dados e suas tabelas
-- drop database popQuiz;
-- CREATE DATABASE IF NOT EXISTS popQuiz;
-- USE popQuiz;

-- CREATE TABLE IF NOT EXISTS perguntas(
-- 	id int PRIMARY KEY AUTO_INCREMENT,
-- 	respCerta varchar(20) NOT NULL,
--     respErradas varchar(80) NOT NULL,
--     peso int NOT NULL,
--     materia varchar(4) NOT NULL,
--     enunciado varchar(30) NOT NULL
-- );
-- CREATE TABLE IF NOT EXISTS quizzes(
-- 	id int PRIMARY KEY AUTO_INCREMENT,
-- 	id_perg1 int NOT NULL DEFAULT 0,
--     id_perg2 int NOT NULL DEFAULT 0,
--     id_perg3 int NOT NULL DEFAULT 0,
--     id_perg4 int NOT NULL DEFAULT 0,
--     id_perg5 int NOT NULL DEFAULT 0,
--     id_perg6 int NOT NULL DEFAULT 0,
--     id_perg7 int NOT NULL DEFAULT 0,
--     id_perg8 int NOT NULL DEFAULT 0,
--     id_perg9 int NOT NULL DEFAULT 0,
--     id_perg10 int NOT NULL DEFAULT 0,
--     id_perg11 int NOT NULL DEFAULT 0,
--     id_perg12 int NOT NULL DEFAULT 0,
--     id_perg13 int NOT NULL DEFAULT 0,
--     id_perg14 int NOT NULL DEFAULT 0,
--     id_perg15 int NOT NULL DEFAULT 0,
--     nome char(30) NOT NULL,
--     
-- 	-- Referencias aos ids da tabela perguntas
--     FOREIGN KEY(id_perg1) REFERENCES perguntas(id),
--     FOREIGN KEY(id_perg2) REFERENCES perguntas(id),
--     FOREIGN KEY(id_perg3) REFERENCES perguntas(id),
--     FOREIGN KEY(id_perg4) REFERENCES perguntas(id),
--     FOREIGN KEY(id_perg5) REFERENCES perguntas(id),
--     FOREIGN KEY(id_perg6) REFERENCES perguntas(id),
--     FOREIGN KEY(id_perg7) REFERENCES perguntas(id),
--     FOREIGN KEY(id_perg8) REFERENCES perguntas(id),
--     FOREIGN KEY(id_perg9) REFERENCES perguntas(id),
--     FOREIGN KEY(id_perg10) REFERENCES perguntas(id),
--     FOREIGN KEY(id_perg11) REFERENCES perguntas(id),
--     FOREIGN KEY(id_perg12) REFERENCES perguntas(id),
--     FOREIGN KEY(id_perg13) REFERENCES perguntas(id),
--     FOREIGN KEY(id_perg14) REFERENCES perguntas(id),
--     FOREIGN KEY(id_perg15) REFERENCES perguntas(id)
-- );


-- CREATE TABLE IF NOT EXISTS usuarios(
-- 	id int PRIMARY KEY AUTO_INCREMENT,
--     email varchar(30) NOT NULL,
--     senha varchar(16) NOT NULL
-- );
-- CREATE TABLE IF NOT EXISTS tabNiveis(
-- 	id_usuario int PRIMARY KEY,
--     xpMate int NOT NULL DEFAULT 0,
--     lvlMate int NOT NULL DEFAULT 0,
--     xpPort int NOT NULL DEFAULT 0,
--     lvlPort int NOT NULL DEFAULT 0,
--     xpHist int NOT NULL DEFAULT 0,
--     lvlHist int NOT NULL DEFAULT 0,
--     xpBiol int NOT NULL DEFAULT 0,
--     lvlBiol int NOT NULL DEFAULT 0,
--     xpIng int NOT NULL DEFAULT 0,
--     lvlIng int NOT NULL DEFAULT 0,
--     xpGeog int NOT NULL DEFAULT 0,
--     lvlGeog int NOT NULL DEFAULT 0,
--     
--     -- Referencia ao usuário dono da tabela
--     FOREIGN KEY(id_usuario) REFERENCES usuarios(id)
-- );
-- CREATE TABLE IF NOT EXISTS tabConquistas(
-- 	id_usuario int PRIMARY KEY,
--     conq01 bool NOT NULL DEFAULT FALSE,
--     conq02 bool NOT NULL DEFAULT FALSE,
--     conq03 bool NOT NULL DEFAULT FALSE,
--     conq04 bool NOT NULL DEFAULT FALSE,
--     conq05 bool NOT NULL DEFAULT FALSE,
--     conq06 bool NOT NULL DEFAULT FALSE,
--     conq07 bool NOT NULL DEFAULT FALSE,
--     conq08 bool NOT NULL DEFAULT FALSE,
--     conq09 bool NOT NULL DEFAULT FALSE,
--     conq10 bool NOT NULL DEFAULT FALSE,
--     conq11 bool NOT NULL DEFAULT FALSE,
--     conq12 bool NOT NULL DEFAULT FALSE,
--     conq13 bool NOT NULL DEFAULT FALSE,
--     conq14 bool NOT NULL DEFAULT FALSE,
--     conq15 bool NOT NULL DEFAULT FALSE,
--     
--     -- Referencia ao usuário dono da tabela
--     FOREIGN KEY(id_usuario) REFERENCES usuarios(id)
-- );


/* Parte 2: fazer os exemplos de perguntas, usuários e quizzes */
-- Zerar todas as tabelas, se necessário
-- DELETE FROM tabNiveis WHERE id_usuario > 0;
-- DELETE FROM tabConquistas WHERE id_usuario > 0;
-- DELETE FROM usuarios WHERE id > 0;

-- Fazer um usuário genérico
-- INSERT INTO usuarios(email,senha) VALUES("fulano@gmail.com","senha");
-- SELECT MAX(id)+1 AS nextId FROM usuarios;
-- INSERT INTO tabConquistas(id_usuario) VALUES(nextId);
-- INSERT INTO tabNiveis(id_usuario) VALUES(nextId);

-- SELECT * FROM usuarios;
-- SELECT * FROM tabNiveis;
-- SELECT * FROM tabConquistas;

-- Perguntas do quiz de Matemática, e ele mesmo logo em seguida
INSERT INTO perguntas(enunciado, materia, peso, respCerta, respErradas) VALUES("Quanto é 2+2?", "Mate", 1, "4", '"3","8","5"');
INSERT INTO perguntas(enunciado, materia, peso, respCerta, respErradas) VALUES("Quanto é 45+67+132?", "Mate", 1, "244", '"243","238","250"');
INSERT INTO perguntas(enunciado, materia, peso, respCerta, respErradas) VALUES("Quanto é 258 - 735?", "Mate", 1, "-477", '"-469","-487","-452"');
INSERT INTO perguntas(enunciado, materia, peso, respCerta, respErradas) VALUES("Quanto é 124×8?", "Mate", 1, "992", '"999","981","945"');
INSERT INTO perguntas(enunciado, materia, peso, respCerta, respErradas) VALUES("Quanto é 45+23?", "Mate", 1, "68", '"70","60","73"');
INSERT INTO perguntas(id, enunciado, materia, peso, respCerta, respErradas) VALUES(0, "", "", 0, "", '"","",""');
INSERT INTO perguntas(enunciado, materia, peso, respCerta, respErradas) VALUES("Quanto é 45+23?", "Mate", 1, "68", '"70","60","73"');
INSERT INTO perguntas(enunciado, materia, peso, respCerta, respErradas) VALUES("Quanto é 45+23?", "Mate", 1, "68", '"70","60","73"');
INSERT INTO perguntas(enunciado, materia, peso, respCerta, respErradas) VALUES("Quanto é 45+23?", "Mate", 1, "68", '"70","60","73"');
INSERT INTO perguntas(enunciado, materia, peso, respCerta, respErradas) VALUES("Quanto é 45+23?", "Mate", 1, "68", '"70","60","73"');
INSERT INTO perguntas(enunciado, materia, peso, respCerta, respErradas) VALUES("Quanto é 45+23?", "Mate", 1, "68", '"70","60","73"');
INSERT INTO perguntas(enunciado, materia, peso, respCerta, respErradas) VALUES("Quanto é 45+23?", "Mate", 1, "68", '"70","60","73"');
INSERT INTO perguntas(enunciado, materia, peso, respCerta, respErradas) VALUES("Quanto é 45+23?", "Mate", 1, "68", '"70","60","73"');
INSERT INTO perguntas(enunciado, materia, peso, respCerta, respErradas) VALUES("Quanto é 45+23?", "Mate", 1, "68", '"70","60","73"');
INSERT INTO perguntas(enunciado, materia, peso, respCerta, respErradas) VALUES("Quanto é 45+23?", "Mate", 1, "68", '"70","60","73"');
INSERT INTO quizzes(id_perg1, id_perg2, id_perg3, id_perg4, id_perg5, id_perg6, id_perg7, id_perg8, id_perg9, id_perg10, id_perg11, id_perg12, id_perg13, id_perg14, id_perg15, nome) 
	VALUE(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15, "Matematica");
SELECT * FROM perguntas;
SELECT * FROM quizzes;