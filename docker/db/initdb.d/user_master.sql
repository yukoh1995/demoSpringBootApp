DROP DATABASE IF EXISTS `my_test_db`;
CREATE DATABASE `my_test_db`;
USE `my_test_db`;

DROP TABLE IF EXISTS `user_master`;

CREATE TABLE `user_master`
(
  id           INT(10),
  name     VARCHAR(40)
);

INSERT INTO `user_master` (id, name) VALUES (1, "kida");
INSERT INTO `user_master` (id, name) VALUES (2, "shimamura");