SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` bigint(16) NOT NULL AUTO_INCREMENT,
  `dname` varchar(55) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `db_source` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '开发部', 'clouddb02');
INSERT INTO `dept` VALUES (2, '人事部', 'clouddb02');
INSERT INTO `dept` VALUES (3, '财务部', 'clouddb02');
INSERT INTO `dept` VALUES (4, '市场部', 'clouddb02');
INSERT INTO `dept` VALUES (5, '运维部', 'clouddb02');

SET FOREIGN_KEY_CHECKS = 1;
