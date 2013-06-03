# --- !Ups

create table account (
  type                      int not null,
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_account primary key (email)
);

create table bet (
  id                        bigint not null,
  assigned_event            bigint not null,
  assigned_account          varchar(255) not null,
  bet                       int not null,
  constraint pk_bet primary key (id),
  foreign key (assigned_account) references account (email) on delete set null on update restrict,
  foreign key (assigned_event) references event (id) on delete set null on update restrict
);

create table event (
  id                        bigint not null,
  name                      varchar(255),
  situation                 boolean,
  due_date                  timestamp not null,
  result                    int,
  constraint pk_event primary key (id),
);

create sequence bet_seq start with 1000;
create sequence event_seq start with 1000;

# --- !Downs

drop table if exists bet;
drop table if exists event;

drop sequence if exists bet_seq;
drop sequence if exists event_seq;