# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table categoriaentity (
  id                            bigint not null,
  nombre                        varchar(255),
  constraint pk_categoriaentity primary key (id)
);
create sequence Categoria;

create table plantaentity (
  id                            bigint not null,
  nombre                        varchar(255),
  nombre_cientifico             varchar(255),
  descripcion                   varchar(255),
  categoria_id                  bigint,
  constraint pk_plantaentity primary key (id)
);
create sequence Planta;

alter table plantaentity add constraint fk_plantaentity_categoria_id foreign key (categoria_id) references categoriaentity (id) on delete restrict on update restrict;
create index ix_plantaentity_categoria_id on plantaentity (categoria_id);


# --- !Downs

alter table if exists plantaentity drop constraint if exists fk_plantaentity_categoria_id;
drop index if exists ix_plantaentity_categoria_id;

drop table if exists categoriaentity cascade;
drop sequence if exists Categoria;

drop table if exists plantaentity cascade;
drop sequence if exists Planta;

