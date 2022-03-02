DROP DATABASE IF EXISTS `my_test_db`;
CREATE DATABASE `my_test_db`;
USE `my_test_db`;

DROP TABLE IF EXISTS `user_master`;

CREATE TABLE `user_master`
(
  `user_id` INT(10) UNSIGNED NOT NULL,
  `user_name` VARCHAR(40) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  PRIMARY KEY(`user_id`)
);

INSERT INTO `user_master` (`user_id`, `user_name`) VALUES (1, "kida");
INSERT INTO `user_master` (`user_id`, `user_name`) VALUES (2, "shimamura");