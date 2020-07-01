-- --------------------------
-- statistics_info
-- --------------------------
CREATE TABLE "public"."statistics_info" (
  "id" serial NOT NULL PRIMARY KEY,
  "send_date" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "product" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "label" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "operator" int4 NOT NULL DEFAULT 0,
  "channel_name" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "channel_id" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "province" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "domain" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "sms_content" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "send_num" int8 NOT NULL DEFAULT 0,
  "send_success" int8 NOT NULL DEFAULT 0,
  "send_fail" int8 NOT NULL DEFAULT 0,
  "send_unknown" int8 NOT NULL DEFAULT 0,
  "pv" int8 NOT NULL DEFAULT 0,
  "uv" int8 NOT NULL DEFAULT 0,
  "ip" int8 NOT NULL DEFAULT 0,
  "create_time" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text,
  "update_time" text COLLATE "pg_catalog"."default" NOT NULL DEFAULT ''::text
);
