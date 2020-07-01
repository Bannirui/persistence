-- --------------------------
-- rp_loan_label_batch_check
-- --------------------------
CREATE TABLE `rp_loan_label_batch_check` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `is_delete` int(10) NOT NULL DEFAULT 0,
  `bank_name` varchar(32) NOT NULL DEFAULT '',
  `label` varchar(32) NOT NULL DEFAULT '',
  `long_msg` int(10) NOT NULL DEFAULT 0,
  `sync` int(10) NOT NULL DEFAULT 0,
  `bank` varchar(32) NOT NULL DEFAULT '',
  `create_time` varchar(32) NOT NULL DEFAULT '',
  `enable` int(10) NOT NULL DEFAULT 0,
  `sms` varchar(32) NOT NULL DEFAULT '',
  `alias` varchar(32) NOT NULL DEFAULT '',
  `verify` int(10) NOT NULL DEFAULT 0,
  `channel_name` varchar(32) NOT NULL DEFAULT '',
  `label_name` varchar(32) NOT NULL DEFAULT '',
  `channel_id` int(10) NOT NULL DEFAULT 0,
  PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;