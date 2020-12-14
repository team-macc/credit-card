CREATE TABLE `credit_card` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `number` varchar(16) NOT NULL,
  `expiration` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;