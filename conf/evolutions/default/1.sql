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
  tabla_id                      bigint,
  constraint uq_plantaentity_tabla_id unique (tabla_id),
  constraint pk_plantaentity primary key (id)
);
create sequence Planta;

create table reporteentity (
  id                            bigint not null,
  planta_id                     bigint,
  constraint pk_reporteentity primary key (id)
);
create sequence Reporte;

create table tabladecrecimientoentity (
  id                            bigint not null,
  planta_id                     bigint,
  constraint uq_tabladecrecimientoentity_planta_id unique (planta_id),
  constraint pk_tabladecrecimientoentity primary key (id)
);
create sequence tablaDeCrecimientoEntity_seq;

create table usuarioentity (
  id                            bigint not null,
  nombre                        varchar(255),
  clave                         varchar(255),
  correo                        varchar(255),
  constraint pk_usuarioentity primary key (id)
);
create sequence Usuario;

alter table plantaentity add constraint fk_plantaentity_categoria_id foreign key (categoria_id) references categoriaentity (id) on delete restrict on update restrict;
create index ix_plantaentity_categoria_id on plantaentity (categoria_id);

alter table plantaentity add constraint fk_plantaentity_tabla_id foreign key (tabla_id) references tabladecrecimientoentity (id) on delete restrict on update restrict;

alter table reporteentity add constraint fk_reporteentity_planta_id foreign key (planta_id) references plantaentity (id) on delete restrict on update restrict;
create index ix_reporteentity_planta_id on reporteentity (planta_id);

alter table tabladecrecimientoentity add constraint fk_tabladecrecimientoentity_planta_id foreign key (planta_id) references plantaentity (id) on delete restrict on update restrict;


# --- !Downs

alter table if exists plantaentity drop constraint if exists fk_plantaentity_categoria_id;
drop index if exists ix_plantaentity_categoria_id;

alter table if exists plantaentity drop constraint if exists fk_plantaentity_tabla_id;

alter table if exists reporteentity drop constraint if exists fk_reporteentity_planta_id;
drop index if exists ix_reporteentity_planta_id;

alter table if exists tabladecrecimientoentity drop constraint if exists fk_tabladecrecimientoentity_planta_id;

drop table if exists categoriaentity cascade;
drop sequence if exists Categoria;

drop table if exists plantaentity cascade;
drop sequence if exists Planta;

drop table if exists reporteentity cascade;
drop sequence if exists Reporte;

drop table if exists tabladecrecimientoentity cascade;
drop sequence if exists tablaDeCrecimientoEntity_seq;

drop table if exists usuarioentity cascade;
drop sequence if exists Usuario;

