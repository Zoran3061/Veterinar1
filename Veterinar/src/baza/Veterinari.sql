--
-- File generated with SQLiteStudio v3.1.1 on Sun Jan 14 04:23:49 2018
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: Tabela
CREATE TABLE Tabela (ID INTEGER PRIMARY KEY AUTOINCREMENT, Ime STRING, Prezime STRING, Mesto STRING, Telefon STRING, Drzava STRING, Godina STRING);
INSERT INTO Tabela (ID, Ime, Prezime, Mesto, Telefon, Drzava, Godina) VALUES (1, 'Nikola', 'Markovic', 'Pepeljevac', 55050005, 'Srbija', 35);
INSERT INTO Tabela (ID, Ime, Prezime, Mesto, Telefon, Drzava, Godina) VALUES (2, 'd', 'd', 'd', 'd', 'd', 'd');
INSERT INTO Tabela (ID, Ime, Prezime, Mesto, Telefon, Drzava, Godina) VALUES (3, 'd', 'd', 'd', 'd', 'f', 'f');
INSERT INTO Tabela (ID, Ime, Prezime, Mesto, Telefon, Drzava, Godina) VALUES (4, 'f', 'f', 'f', 'f', 'f', 'f');

-- Table: VetTabela
CREATE TABLE VetTabela (ID INTEGER PRIMARY KEY, Ime STRING, Prezime STRING, Mesto STRING, Telefon STRING, Drzava STRING, Godina STRING);
INSERT INTO VetTabela (ID, Ime, Prezime, Mesto, Telefon, Drzava, Godina) VALUES (1, 'a', 'a', 'a', 'a', 'a', 'a');

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
