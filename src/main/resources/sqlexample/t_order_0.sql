/*
 Navicat MySQL Data Transfer

 Source Server         : 本地数据库
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost
 Source Database       : zt_test_oceanus

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : utf-8

 Date: 04/16/2019 11:42:14 AM
*/

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_order_0`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_0`;
CREATE TABLE `t_order_0` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=324300714736091137 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_order_0`
-- ----------------------------
BEGIN;
INSERT INTO `t_order_0` VALUES ('324300311088857088', '456', '1'), ('324300347755462656', '46', '1'), ('324300714736091136', '79', '1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
