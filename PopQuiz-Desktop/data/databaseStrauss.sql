CREATE DATABASE strauss;
USE strauss;

CREATE TABLE quizzes(
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
    nome char(30) NOT NULL
);

CREATE TABLE perguntas(
	respCerta varchar(20) NOT NULL,
    respErradas varchar(80) NOT NULL,
    perso int NOT NULL,
    materia varchar(4) NOT NULL
);

CREATE TABLE usuarios(
	nome varchar(30) NOT NULL,
    email varchar(30) NOT NULL,
    senha varchar(16) NOT NULL,
    idTabLvl int NOT NULL,
    idTabAcv int NOT NULL
);

CREATE TABLE tabConquistas(
	id_usuario int NOT NULL,
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
    conq15 bool NOT NULL
);

CREATE TABLE tabNiveis(
	id_usuario int NOT NULL,
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
    lvlGeog int NOT NULL
);