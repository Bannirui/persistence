-- --------------------------
-- statistics_info
-- --------------------------
CREATE TABLE `statistics_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `send_date` date NOT NULL,
  `product` varchar(32) NOT NULL DEFAULT '',
  `label` varchar(32) NOT NULL DEFAULT '',
  `operator` int(10) NOT NULL DEFAULT 0,
  `channel_name` varchar(32) NOT NULL DEFAULT '',
  `channel_id` varchar(32) NOT NULL DEFAULT '',
  `province` varchar(32) NOT NULL DEFAULT '',
  `domain` varchar(32) NOT NULL DEFAULT '',
  `sms_content` varchar(32) NOT NULL DEFAULT '',
  `send_num` int(10) NOT NULL DEFAULT 0,
  `send_success` int(10) NOT NULL DEFAULT 0,
  `send_fail` int(10) NOT NULL DEFAULT 0,
  `send_unknown` int(10) NOT NULL DEFAULT 0,
  `pv` int(10) NOT NULL DEFAULT 0,
  `uv` int(10) NOT NULL DEFAULT 0,
  `ip` int(10) NOT NULL DEFAULT 0,
  `create_time` date NOT NULL,
  `update_time` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
