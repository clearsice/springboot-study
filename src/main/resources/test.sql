CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `test`;

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=84 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tb_user` */

insert  into `tb_user`(`id`,`username`,`password`,`create_time`,`email`) values (1,'黄药师','huangpwd','2020-02-21 21:55:12',NULL),(2,'欧阳锋','oupwd','2020-02-22 21:55:56',NULL),(3,'叶轻眉','yepwde','2020-02-23 10:21:45',NULL),(5,'张无忌','123456','2020-02-23 15:08:30',NULL),(6,'聂小倩','123456','2020-02-23 15:15:27',NULL),(7,'聂小倩7','123456','2020-02-23 15:16:48',NULL),(51,'张无忌51','123456','2020-02-23 15:11:22',NULL),(52,'聂小倩','123456','2020-02-23 15:14:07',NULL),(77,'聂小倩71','123456','2020-02-23 15:22:50',NULL),(79,'聂小倩71','123456','2020-02-23 15:24:11',NULL),(80,'王欣','123',NULL,NULL),(81,NULL,NULL,NULL,NULL),(82,'test1','test1',NULL,NULL),(83,'test2','test2',NULL,NULL);
