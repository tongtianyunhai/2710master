/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : pumpkin

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 23/10/2021 22:49:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for m_brand
-- ----------------------------
DROP TABLE IF EXISTS `m_brand`;
CREATE TABLE `m_brand`  (
  `bid` int NOT NULL AUTO_INCREMENT,
  `brand_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `brand_bn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `update_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `pre_1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pre_2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `brand_color` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `brand_isvaild` int NOT NULL DEFAULT 1,
  `brand_size` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`bid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_brand
-- ----------------------------
INSERT INTO `m_brand` VALUES (1, 'lenvo', '0XNKJH', 'GLY', '2021-10-14 13:47:40', NULL, '2021-10-14 13:47:45', NULL, NULL, 'white', 1, '15.6');
INSERT INTO `m_brand` VALUES (2, 'lenvo', '0XNKJH', 'GLY', '2021-10-14 13:50:35', NULL, '2021-10-15 13:50:38', NULL, NULL, 'red', 1, '14.0');
INSERT INTO `m_brand` VALUES (3, 'hasee', 'ZTXPRO', 'GLY', '2021-10-15 13:52:37', NULL, '2021-10-23 13:52:40', NULL, NULL, 'blue', 1, '15.6');
INSERT INTO `m_brand` VALUES (4, 'hasee', 'ZTXPO', 'GLY', '2021-10-15 13:53:34', NULL, '2021-10-15 13:53:38', NULL, NULL, 'black', 1, '14.0');
INSERT INTO `m_brand` VALUES (5, 'apple', 'IPADPRO', 'GLY', '2021-10-14 13:55:16', NULL, '2021-10-14 13:55:19', NULL, NULL, 'white', 1, '14.0');

SET FOREIGN_KEY_CHECKS = 1;

DROP TABLE IF EXISTS `m_merchandise`;
CREATE TABLE `m_merchandise`  (
  `mid` int NOT NULL AUTO_INCREMENT,
  `m_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_price` double(30, 2) NULL DEFAULT NULL,
  `m_isvaild` int NULL DEFAULT 1,
  `m_bn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_color` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_size` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_brand` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_discount` double(30, 2) NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pre_1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pre_2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `m_isparent` int NULL DEFAULT 0,
  `m_sn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`mid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_merchandise
-- ----------------------------
INSERT INTO `m_merchandise` VALUES (1, 'god of war', 'laptop', 800.00, 1, 'ZTXPRO', 'blue', '15.6', 'hasee', NULL, '2021-10-14 14:01:23', 'GLY', '2021-10-14 14:01:28', 'gly', NULL, NULL, 0, '5566X');
INSERT INTO `m_merchandise` VALUES (2, 'ipadpro', 'tablet pc', 1200.00, 1, 'IPADPRO', 'white', '14.0', 'apple', NULL, '2021-10-14 14:06:04', 'GLY', '2021-10-14 14:06:07', 'GLY', NULL, NULL, 0, '1111P');

SET FOREIGN_KEY_CHECKS = 1;


DROP TABLE IF EXISTS `m_type`;
CREATE TABLE `m_type`  (
  `tid` int NOT NULL AUTO_INCREMENT,
  `type_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `pre_1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pre_2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `updaye_time` datetime NULL DEFAULT NULL,
  `type_isvaild` int NULL DEFAULT 1,
  `type_isparent` int NULL DEFAULT 1,
  PRIMARY KEY (`tid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_type
-- ----------------------------
INSERT INTO `m_type` VALUES (1, 'laptop', 'GLY', '2021-10-14 13:57:10', NULL, NULL, NULL, NULL, 1, 1);
INSERT INTO `m_type` VALUES (2, 'tablet pc', 'GLY', '2021-10-14 13:58:00', NULL, NULL, NULL, NULL, 1, 1);
INSERT INTO `m_type` VALUES (3, 'lcd', 'GLY', '2021-10-14 13:58:51', NULL, NULL, NULL, NULL, 1, 1);

SET FOREIGN_KEY_CHECKS = 1;

DROP TABLE IF EXISTS `m_warehouse`;
CREATE TABLE `m_warehouse`  (
  `sid` int NOT NULL AUTO_INCREMENT,
  `ware_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ware_color` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ware_size` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ware_bn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ware_amount` int NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `create_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_by` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `pre_1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pre_2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of m_warehouse
-- ----------------------------
INSERT INTO `m_warehouse` VALUES (1, 'god of war', 'blue', '15.6', 'ZTXPRO', 1000, '2021-10-14 14:20:17', 'GLY', NULL, '2021-10-14 14:20:23', NULL, NULL);
INSERT INTO `m_warehouse` VALUES (2, 'ipadpro', 'white', '14.0', 'IPADPRO', 2000, '2021-10-14 14:21:01', 'GLY', NULL, '2021-10-14 14:21:06', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;

DROP TABLE IF EXISTS `p_customer`;
CREATE TABLE `p_customer`  (
  `cid` int NOT NULL AUTO_INCREMENT,
  `role_id` int NOT NULL DEFAULT 1,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `birthday` date NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `country` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `balance` bigint NULL DEFAULT NULL,
  `city` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `zipcode` int NULL DEFAULT NULL,
  `state` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of p_customer
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;

DROP TABLE IF EXISTS `p_staff`;
CREATE TABLE `p_staff`  (
  `sid` int NOT NULL AUTO_INCREMENT,
  `role_id` int NOT NULL DEFAULT 0,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `department` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `city` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `state` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `zipcode` int NULL DEFAULT NULL,
  `job` int NULL DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of p_staff
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;


DROP TABLE IF EXISTS `p_user`;
CREATE TABLE `p_user`  (
  `uid` int NOT NULL AUTO_INCREMENT,
  `userName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `passWord` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `login_time` datetime NULL DEFAULT NULL,
  `isvalid` int NOT NULL DEFAULT 1,
  `update_by` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `menu_id` int NULL DEFAULT NULL,
  `pre_1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `star` int NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nickName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of p_user
-- ----------------------------
INSERT INTO `p_user` VALUES (1, 'ttyh', '123', '2021-09-29 22:26:07', 1, NULL, NULL, '1', NULL, 1, NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
