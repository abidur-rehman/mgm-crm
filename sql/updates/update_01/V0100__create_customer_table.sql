CREATE TABLE mgmcrm.customer
(
  id bigserial NOT NULL,
  organisation boolean NOT NULL,
  organisation_name character varying(20),
  first_name character varying(20) NOT NULL,
  last_name character varying(20) NOT NULL,
  gender character varying(20) NOT NULL,
  email character varying(20) NOT NULL,
  user_name character varying(20) NOT NULL,
  password character varying(20) NOT NULL,
  phone_number character varying(20) NOT NULL,
  add1 character varying(20) NOT NULL,
  add2 character varying(20),
  add3 character varying(20),
  town character varying(20) NOT NULL,
  county character varying(20) NOT NULL,
  post_code character varying(20) NOT NULL,
  country character varying(20) NOT NULL,
  CONSTRAINT customer_id_pkey PRIMARY KEY (id)
);

ALTER TABLE mgmcrm.customer OWNER TO developers;

INSERT INTO mgmcrm.customer VALUES (1, true, 'First Limited', 'John', 'Micheal', 'MALE', 'john@test.com', 'john',
'password', '099123', '12 street', '', '', 'Manchester', 'Greater Manchester', 'M32 0YH', 'GB');
INSERT INTO mgmcrm.customer VALUES (2, false, '', 'Marta', 'Micheal', 'FEMALE', 'marta@test.com', 'marta',
'password', '8777799123', '98 street', '', '', 'Manchester', 'Greater Manchester', 'M15 0YH', 'GB');