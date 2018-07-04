

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

CREATE DATABASE Scoreboard;
USE Scoreboard;


CREATE TABLE IF NOT EXISTS `score` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `Nickname` varchar(100) NOT NULL,
  `Score` int(11) NOT NULL,
  PRIMARY KEY (`_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COMMENT='Player Scoreboard database for x-Zone Lost Glory';


INSERT INTO `score` (`_id`, `Nickname`, `Score`) VALUES
(1, 'TheSkullHound/Say10', 666),
(2, 'NitroSkate', 200);
COMMIT;