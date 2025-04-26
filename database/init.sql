CREATE TABLE public."user"
(
    id         bigserial    NOT NULL,
    "name"     varchar(100) NOT NULL,
    lastname   varchar(100) NOT NULL,
    email      varchar(180) NOT NULL,
    created_at timestamp    NOT NULL,
    updated_at timestamp    NOT NULL,
    CONSTRAINT user_email_unique UNIQUE (email),
    CONSTRAINT user_pk PRIMARY KEY (id)
);