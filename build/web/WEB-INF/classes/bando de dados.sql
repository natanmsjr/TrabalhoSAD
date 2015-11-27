CREATE DATABASE IF NOT EXISTS horario;

USE horario;

DROP TABLE IF EXISTS sala;
DROP TABLE IF EXISTS turma;
DROP TABLE IF EXISTS periodo;
DROP TABLE IF EXISTS usuario;


CREATE TABLE sala(
    IdSala INT NOT NULL,
    NCadeiras INT NOT NULL,
    Acessivel INT NOT NULL,
    Qualidade INT NOT NULL,
    PRIMARY KEY(IdSala)
);

INSERT INTO sala VALUES(101,100,1,1);
INSERT INTO sala VALUES(201,100,1,2);
INSERT INTO sala VALUES(301,100,1,2);
INSERT INTO sala VALUES(401,100,0,3);
INSERT INTO sala VALUES(501,100,0,3);
INSERT INTO sala VALUES(202,70,1,1);
INSERT INTO sala VALUES(302,70,1,2);
INSERT INTO sala VALUES(402,70,1,2);
INSERT INTO sala VALUES(502,70,0,3);
INSERT INTO sala VALUES(103,50,1,1);
INSERT INTO sala VALUES(203,50,1,1);
INSERT INTO sala VALUES(303,50,1,2);
INSERT INTO sala VALUES(403,50,0,3);
INSERT INTO sala VALUES(503,50,0,30);
INSERT INTO sala VALUES(104,30,1,1);
INSERT INTO sala VALUES(204,30,1,2);
INSERT INTO sala VALUES(304,30,0,3);
INSERT INTO sala VALUES(105,10,1,1);
INSERT INTO sala VALUES(205,10,1,2);

CREATE TABLE turma(
    IdTurma INT NOT NULL AUTO_INCREMENT,
    Disciplina VARCHAR(8) NOT NULL,
    Professor VARCHAR(7) NOT NULL,
    DiasHorario VARCHAR(14) NOT NULL,
    NAlunos INT NOT NULL,
    Curso VARCHAR(2) NOT NULL,
    Periodo INT NOT NULL,
    Acessibilidade INT NOT NULL,
    Qualidade INT NOT NULL,
    PRIMARY KEY(IdTurma)
);

INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0311','Prof T','2M12-4M12',100,'EC',5,0,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0250','Prof G','3M12-4M12',42,'EC',4,0,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0284','Prof Y','2M12-5M34',7,'EC',3,0,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0212','Prof E','3M12-5M12',45,'EC',2,1,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0198','Prof E','3M34-5M12',30,'EC',5,0,3);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0197','Prof R','2M34-4M34-6M12',50,'EC',1,0,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0197','Prof S','2M34-4M34-6M34',55,'EC',1,0,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0219','Prof G','3M34-4M56',90,'EC',8,1,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0203','Prof M','3M56-5M34',8,'EC',5,1,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0279','Prof A','2M56-4M56-6M56',45,'EC',9,0,3);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0281','Prof E','2M56-5M56',25,'EC',2,1,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0396','Prof K','2M56-4M56-6M56',70,'EC',3,0,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0282','Prof T','3M56-5M56',50,'EC',2,0,3);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0233','Prof M','3T12-5T12-6T12',55,'CC',5,0,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0311','Prof A','3T56-5T56',30,'SI',5,0,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0221','Prof E','7M12-7M34',10,'SI',3,1,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0219','Prof B','3T12-5T12',66,'CC',3,0,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0203','Prof K','4T56-6T56',27,'CC',5,0,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0279','Prof I','3T34-5T34',91,'CC',7,1,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0281','Prof M','2T34-4T34',47,'CC',4,0,3);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0212','Prof B','3T34-5T34',55,'CC',2,0,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0213','Prof C','3T56-5T56',87,'SI',5,0,3);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0196','Prof K','2T56',55,'CC',1,1,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0197','Prof T','2T34-4T34-6T34',55,'CC',1,1,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0337','Prof G','3T56-5T56',55,'CC',1,1,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0396','Prof Y','2T12-4T12-6T12',33,'CC',6,0,3);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0222','Prof E','2T12',15,'CC',4,0,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0222','Prof E','4T12',15,'EC',5,0,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0297','Prof R','2T34-4T34',25,'CC',5,0,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0265','Prof S','2T56-4T56',65,'CC',6,0,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0250','Prof G','3T34-5T34',35,'CC',3,0,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0282','Prof S','2T34-4T34',25,'CC',7,0,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0220','Prof L','3T34',10,'EC',4,0,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0220','Prof L','5T34',10,'EC',4,0,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0220','Prof L','6T34',10,'EC',4,0,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0311','Prof A','2T56-4T56',30,'SI',5,0,3);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0347','Prof D','2N34-4N34-6N34',90,'SI',5,1,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0217','Prof H','2N12-4N12',65,'SI',3,0,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0210','Prof J','2N34-4N34',55,'SI',1,0,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0198','Prof MT','2T56-4T56-6T56',55,'SI',1,0,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0264','Prof I','3N34-5N34',20,'SI',8,0,3);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0284','Prof I','3N34-5N34',90,'SI',7,1,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0306','Prof Y','3N12-5N12-6T45',45,'SI',4,0,1);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0257','Prof A','2N12-4N12',55,'SI',9,0,2);
INSERT INTO turma (Disciplina,Professor,DiasHorario,NAlunos,Curso,Periodo,Acessibilidade,Qualidade) VALUES('COMP0211','Prof K','3N12-5N12-6N12',17,'SI',5,0,3);

CREATE TABLE periodo (
    IdPeriodo VARCHAR(6) NOT NULL,
    Sala VARCHAR(8) NOT NULL,
    Turma INT NOT NULL,
    PRIMARY KEY(IdPeriodo)
);

CREATE TABLE usuario(
    IdUsuario INT NOT NULL AUTO_INCREMENT,
    Email VARCHAR(20) NOT NULL,
    Senha VARCHAR(8) NOT NULL,
    PRIMARY KEY(IdUsuario, Email)
);