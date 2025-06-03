-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 03/06/2025 às 22:16
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `adriana-tarefa`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `cachorro`
--

CREATE TABLE `cachorro` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `raca` varchar(255) NOT NULL,
  `pelugem` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cachorro`
--

INSERT INTO `cachorro` (`id`, `nome`, `raca`, `pelugem`) VALUES
(1, 'Zé', 'rottweiler', 'baixa'),
(2, 'jose', 'pug', 'curta'),
(9, 'juse', 'qualquer', 'baixo');

-- --------------------------------------------------------

--
-- Estrutura para tabela `caneta`
--

CREATE TABLE `caneta` (
  `id` int(11) NOT NULL,
  `cor` varchar(200) NOT NULL,
  `marca` varchar(200) NOT NULL,
  `preco` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `caneta`
--

INSERT INTO `caneta` (`id`, `cor`, `marca`, `preco`) VALUES
(1, 'azul', 'bic', 2),
(3, 'roxo', 'bic', 3.6);

-- --------------------------------------------------------

--
-- Estrutura para tabela `carro`
--

CREATE TABLE `carro` (
  `id` int(11) NOT NULL,
  `modelo` varchar(255) NOT NULL,
  `fabricante` varchar(255) NOT NULL,
  `ano` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `carro`
--

INSERT INTO `carro` (`id`, `modelo`, `fabricante`, `ano`) VALUES
(1, 'Sandero', 'Renault', 2002),
(2, 'Uno', 'Fiat', 2002);

-- --------------------------------------------------------

--
-- Estrutura para tabela `ferramenta`
--

CREATE TABLE `ferramenta` (
  `id` int(11) NOT NULL,
  `tipof` varchar(255) NOT NULL,
  `marcaf` varchar(255) NOT NULL,
  `funcao` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `ferramenta`
--

INSERT INTO `ferramenta` (`id`, `tipof`, `marcaf`, `funcao`) VALUES
(1, 'alicate', 'milwakee', 'alicatar');

-- --------------------------------------------------------

--
-- Estrutura para tabela `impressora`
--

CREATE TABLE `impressora` (
  `id` int(11) NOT NULL,
  `modelo` varchar(255) NOT NULL,
  `papel` varchar(255) NOT NULL,
  `preco` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `impressora`
--

INSERT INTO `impressora` (`id`, `modelo`, `papel`, `preco`) VALUES
(1, 'Epson TM-T20', 'Fiscal', 850),
(2, 'Elgin i9', 'Fiscal', 1220);

-- --------------------------------------------------------

--
-- Estrutura para tabela `instrumento`
--

CREATE TABLE `instrumento` (
  `id` int(11) NOT NULL,
  `tipo` varchar(255) NOT NULL,
  `material` varchar(255) NOT NULL,
  `preco` double(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `instrumento`
--

INSERT INTO `instrumento` (`id`, `tipo`, `material`, `preco`) VALUES
(1, 'Baixo', 'Madeira', 2),
(2, 'violao', 'plástico', 3201);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `cachorro`
--
ALTER TABLE `cachorro`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `caneta`
--
ALTER TABLE `caneta`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `carro`
--
ALTER TABLE `carro`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `ferramenta`
--
ALTER TABLE `ferramenta`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `impressora`
--
ALTER TABLE `impressora`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `instrumento`
--
ALTER TABLE `instrumento`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cachorro`
--
ALTER TABLE `cachorro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `caneta`
--
ALTER TABLE `caneta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `carro`
--
ALTER TABLE `carro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `ferramenta`
--
ALTER TABLE `ferramenta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `impressora`
--
ALTER TABLE `impressora`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `instrumento`
--
ALTER TABLE `instrumento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
