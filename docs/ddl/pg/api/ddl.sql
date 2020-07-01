-- --------------------------
-- rp_loan_label_batch_check
-- --------------------------
CREATE TABLE "public"."rp_loan_label_batch_check" (
  "id" serial NOT NULL PRIMARY KEY,
  "is_delete" int8 NOT NULL DEFAULT 0,
  "bank_name" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "label" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "long_msg" int8 NOT NULL DEFAULT 0,
  "sync" int8 NOT NULL DEFAULT 0,
  "bank" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "create_time" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "enable" int8 NOT NULL DEFAULT 0,
  "sms" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "alias" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "verify" int8 NOT NULL DEFAULT 0,
  "channel_name" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "label_name" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "channel_id" int8 NOT NULL DEFAULT 0
);

-- --------------------------
-- rp_loan_label_check
-- --------------------------
CREATE TABLE "public"."rp_loan_label_check" (
  "id" serial NOT NULL PRIMARY KEY,
  "bank_name" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "label" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "long_msg" int8 NOT NULL DEFAULT 0,
  "sync" int8 NOT NULL DEFAULT 0,
  "url" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "url_key" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "bank" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "modify_time" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "create_time" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "enable" int8 NOT NULL DEFAULT 0,
  "individuation" int8 NOT NULL DEFAULT 0,
  "name" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "alias" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "verify" int8 NOT NULL DEFAULT 0
);

-- --------------------------
-- rp_loan_label_check_all
-- --------------------------
CREATE TABLE "public"."rp_loan_label_check_all" (
  "id" serial NOT NULL PRIMARY KEY,
  "bank_name" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "label" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "long_msg" int8 NOT NULL DEFAULT 0,
  "sync" int8 NOT NULL DEFAULT 0,
  "url" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "url_key" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "bank" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "modify_time" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "create_time" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "enable" int8 NOT NULL DEFAULT 0,
  "individuation" int8 NOT NULL DEFAULT 0,
  "name" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "alias" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "verify" int8 NOT NULL DEFAULT 0,
  "update_time" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text
);

-- --------------------------
-- rp_loan_sms_template_check
-- --------------------------
CREATE TABLE "public"."rp_loan_sms_template_check" (
  "id" serial NOT NULL PRIMARY KEY,
  "template" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "bank" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "modify_time" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "ext_no" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "create_time" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "enable" int8 NOT NULL DEFAULT 0,
  "verify" int8 NOT NULL DEFAULT 0,
  "bank_name" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "sync" int8 NOT NULL DEFAULT 0,
  "channel_id" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "operator" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text
);

-- --------------------------
-- rp_loan_statistics_day
-- --------------------------
CREATE TABLE "public"."rp_loan_statistics_day" (
  "id" serial NOT NULL PRIMARY KEY,
  "date" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "uv" int8 NOT NULL DEFAULT 0,
  "test" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "ip_real_succ_rate" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "sub_success" int8 NOT NULL DEFAULT 0,
  "pv" int8 NOT NULL DEFAULT 0,
  "ip" int8 NOT NULL DEFAULT 0,
  "unknown_send_rate" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "fail_send_rate" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "label" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "operator" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "bank" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "send_fail" int8 NOT NULL DEFAULT 0,
  "create_time" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "send_unknow" int8 NOT NULL DEFAULT 0,
  "sms" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "send_success" int8 NOT NULL DEFAULT 0,
  "send" int8 NOT NULL DEFAULT 0,
  "ip_succ_rate" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "channel_id" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "hand" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text
);