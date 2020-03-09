-- create db "migrate"

create table accounts
(
    id         int8 not null
        constraint accounts_pkey primary key,
    first_name text,
    last_name  text,
    city       text,
    gender     text,
    username   text NOT NULL,
    profile_id int8
);