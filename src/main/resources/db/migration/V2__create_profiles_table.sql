create table profiles_table
(
    id         int8 not null
        constraint profiles_pkey primary key,
    username   text not null,
    job_title  text,
    department text,
    company    text,
    skill      text,
    account_id int8
);