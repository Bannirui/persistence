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
  `create_time` date NOT NULL,
  `enable` int(10) NOT NULL DEFAULT 0,
  `sms` varchar(32) NOT NULL DEFAULT '',
  `alias` varchar(32) NOT NULL DEFAULT '',
  `verify` int(10) NOT NULL DEFAULT 0,
  `channel_name` varchar(32) NOT NULL DEFAULT '',
  `label_name` varchar(32) NOT NULL DEFAULT '',
  `channel_id` int(10) NOT NULL DEFAULT 0,
  PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------
-- rp_loan_label_check
-- --------------------------
CREATE TABLE `rp_loan_label_check` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `bank_name` varchar(32) NOT NULL DEFAULT '',
  `label` varchar(32) NOT NULL DEFAULT '',
  `long_msg` int(10) NOT NULL DEFAULT 0,
  `sync` int(10) NOT NULL DEFAULT 0,
  `url` varchar(32) NOT NULL DEFAULT '',
  `url_key` varchar(32) NOT NULL DEFAULT '',
  `bank` varchar(32) NOT NULL DEFAULT '',
  `modify_time` date NOT NULL,
  `create_time` date NOT NULL,
  `enable` int(10) NOT NULL DEFAULT 0,
  `individuation` int(10) NOT NULL DEFAULT 0,
  `name` varchar(32) NOT NULL DEFAULT '',
  `alias` varchar(32) NOT NULL DEFAULT '',
  `verify` int(10) NOT NULL DEFAULT 0,
  PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------
-- rp_loan_label_check_all
-- --------------------------
CREATE TABLE `rp_loan_label_check_all` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `bank_name` varchar(32) NOT NULL DEFAULT '',
  `label` varchar(32) NOT NULL DEFAULT '',
  `long_msg` int(10) NOT NULL DEFAULT 0,
  `sync` int(10) NOT NULL DEFAULT 0,
  `url` varchar(32) NOT NULL DEFAULT '',
  `url_key` varchar(32) NOT NULL DEFAULT '',
  `bank` varchar(32) NOT NULL DEFAULT '',
  `modify_time` date NOT NULL,
  `create_time` date NOT NULL,
  `enable` int(10) NOT NULL DEFAULT 0,
  `individuation` int(10) NOT NULL DEFAULT 0,
  `name` varchar(32) NOT NULL DEFAULT '',
  `alias` varchar(32) NOT NULL DEFAULT '',
  `verify` int(10) NOT NULL DEFAULT 0,
  `update_time` date NOT NULL,
  PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------
-- rp_loan_sms_template_check
-- --------------------------
CREATE TABLE `rp_loan_sms_template_check` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `template` varchar(32) NOT NULL DEFAULT '',
  `bank` varchar(32) NOT NULL DEFAULT '',
  `modify_time` varchar(32) NOT NULL DEFAULT '',
  `ext_no` varchar(32) NOT NULL DEFAULT '',
  `create_time` date NOT NULL,
  `enable` int(10) NOT NULL DEFAULT 0,
  `verify` int(10) NOT NULL DEFAULT 0,
  `bank_name` varchar(32) NOT NULL DEFAULT '',
  `sync` int(10) NOT NULL DEFAULT 0,
  `channel_id` varchar(32) NOT NULL DEFAULT '',
  `operator` varchar(32) NOT NULL DEFAULT '',
  PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------
-- rp_loan_statistics_day
-- --------------------------
CREATE TABLE `rp_loan_statistics_day` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `uv` int(10) NOT NULL DEFAULT 0,
  `test` varchar(32) NOT NULL DEFAULT '',
  `ip_real_succ_rate` varchar(32) NOT NULL DEFAULT '',
  `sub_success` int(10) NOT NULL DEFAULT 0,
  `pv` int(10) NOT NULL DEFAULT 0,
  `ip` int(10) NOT NULL DEFAULT 0,
  `unknown_send_rate` varchar(32) NOT NULL DEFAULT '',
  `fail_send_rate` varchar(32) NOT NULL DEFAULT '',
  `label` varchar(32) NOT NULL DEFAULT '',
  `operator` varchar(32) NOT NULL DEFAULT '',
  `bank` varchar(32) NOT NULL DEFAULT '',
  `send_fail` int(10) NOT NULL DEFAULT 0,
  `create_time` date NOT NULL,
  `send_unknow` int(10) NOT NULL DEFAULT 0,
  `sms` varchar(32) NOT NULL DEFAULT '',
  `send_success` int(10) NOT NULL DEFAULT 0,
  `send` int(10) NOT NULL DEFAULT 0,
  `ip_succ_rate` varchar(32) NOT NULL DEFAULT '',
  `channel_id` varchar(32) NOT NULL DEFAULT '',
  `hand` varchar(32) NOT NULL DEFAULT '',
  PRIMARY KEY(`id`)
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8;