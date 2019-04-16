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

 Date: 04/16/2019 11:42:36 AM
*/

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_order_item_0`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_item_0`;
CREATE TABLE `t_order_item_0` (
  `order_item_id` bigint(20) NOT NULL,
  `order_id` bigint(20) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`order_item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_order_item_0`
-- ----------------------------
BEGIN;
INSERT INTO `t_order_item_0` VALUES ('324300312040964096', '324300311088857088', '12'), ('324300347772239872', '324300347755462656', '343'), ('324300714757062656', '324300714736091136', '46');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
