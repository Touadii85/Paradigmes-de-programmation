-- Adminer 4.8.1 MySQL 8.2.0 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

CREATE TABLE `compte` (
  `id` int NOT NULL AUTO_INCREMENT,
  `login` varchar(128) NOT NULL,
  `pwd` varchar(128) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

INSERT INTO `compte` (`id`, `login`, `pwd`) VALUES
(1,	'root',	'kitetsu'),
(2,	'zoro',	'roronoa'),
(3,	'Horses',	'kitetsu5'),
(4,	'goku',	'8445'),
(6,	'supergirl',	'krypton');

CREATE TABLE `matiere` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(128) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

INSERT INTO `matiere` (`id`, `nom`) VALUES
(1,	'Programmation'),
(2,	'Conception BDD'),
(4,	'Linux Interface'),
(6,	'Anglais');

CREATE TABLE `specialiter` (
  `idcompte` int NOT NULL,
  `idmatiere` int NOT NULL,
  KEY `idcompte` (`idcompte`),
  KEY `idmatiere` (`idmatiere`),
  CONSTRAINT `specialiter_ibfk_1` FOREIGN KEY (`idcompte`) REFERENCES `compte` (`id`),
  CONSTRAINT `specialiter_ibfk_2` FOREIGN KEY (`idmatiere`) REFERENCES `matiere` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

INSERT INTO `specialiter` (`idcompte`, `idmatiere`) VALUES
(1,	6),
(4,	4),
(3,	1),
(1,	4),
(6,	6);

-- 2024-04-24 13:53:23