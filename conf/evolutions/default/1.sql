# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table categoriaentity (
  id                            bigint not null,
  nombre                        varchar(255),
  constraint pk_categoriaentity primary key (id)
);
create sequence Categoria;

create table huertaentity (
  id                            bigint not null,
  usuario_id                    bigint,
  constraint pk_huertaentity primary key (id)
);
create sequence huertaEntity_seq;

create table plantaentity (
  id                            bigint not null,
  nombre                        varchar(255),
  nombre_cientifico             varchar(255),
  descripcion                   varchar(255),
  categoria_id                  bigint,
  tabla_id                      bigint,
  sensor_id                     bigint,
  constraint uq_plantaentity_tabla_id unique (tabla_id),
  constraint uq_plantaentity_sensor_id unique (sensor_id),
  constraint pk_plantaentity primary key (id)
);
create sequence Planta;

create table reporteentity (
  id                            bigint not null,
  planta_id                     bigint,
  recomendacion                 varchar(255),
  constraint pk_reporteentity primary key (id)
);
create sequence Reporte;

create table sensorentity (
  id                            bigint not null,
  ph                            float,
  ec                            float,
  recomendacion                 varchar(255),
  constraint pk_sensorentity primary key (id)
);
create sequence Sensor;

create table tabladecrecimientoentity (
  id                            bigint not null,
  tipo_planta                   varchar(255),
  rango_superior_ph             float,
  rango_inferior_ph             float,
  ph_inicial                    float,
  ph_actual                     float,
  rango_superior_ec             float,
  rango_inferior_ec             float,
  ec_inicial                    float,
  ec_actual                     float,
  constraint pk_tabladecrecimientoentity primary key (id)
);
create sequence tablaDeCrecimientoEntity_seq;

create table tablaestaticaentity (
  id                            bigint not null,
  tipo_planta                   varchar(255),
  rango_superior_ph             float,
  rango_inferior_ph             float,
  rango_superior_ec             float,
  rango_inferior_ec             float,
  constraint pk_tablaestaticaentity primary key (id)
);
create sequence tablaEstaticaEntity_seq;

create table usuarioentity (
  id                            bigint not null,
  nombre                        varchar(255),
  clave                         varchar(255),
  correo                        varchar(255),
  constraint pk_usuarioentity primary key (id)
);
create sequence Usuario;

alter table huertaentity add constraint fk_huertaentity_usuario_id foreign key (usuario_id) references usuarioentity (id) on delete restrict on update restrict;
create index ix_huertaentity_usuario_id on huertaentity (usuario_id);

alter table plantaentity add constraint fk_plantaentity_categoria_id foreign key (categoria_id) references categoriaentity (id) on delete restrict on update restrict;
create index ix_plantaentity_categoria_id on plantaentity (categoria_id);

alter table plantaentity add constraint fk_plantaentity_tabla_id foreign key (tabla_id) references tabladecrecimientoentity (id) on delete restrict on update restrict;

alter table plantaentity add constraint fk_plantaentity_sensor_id foreign key (sensor_id) references sensorentity (id) on delete restrict on update restrict;

alter table reporteentity add constraint fk_reporteentity_planta_id foreign key (planta_id) references plantaentity (id) on delete restrict on update restrict;
create index ix_reporteentity_planta_id on reporteentity (planta_id);


# --- !Downs

alter table if exists huertaentity drop constraint if exists fk_huertaentity_usuario_id;
drop index if exists ix_huertaentity_usuario_id;

alter table if exists plantaentity drop constraint if exists fk_plantaentity_categoria_id;
drop index if exists ix_plantaentity_categoria_id;

alter table if exists plantaentity drop constraint if exists fk_plantaentity_tabla_id;

alter table if exists plantaentity drop constraint if exists fk_plantaentity_sensor_id;

alter table if exists reporteentity drop constraint if exists fk_reporteentity_planta_id;
drop index if exists ix_reporteentity_planta_id;

drop table if exists categoriaentity cascade;
drop sequence if exists Categoria;

drop table if exists huertaentity cascade;
drop sequence if exists huertaEntity_seq;

drop table if exists plantaentity cascade;
drop sequence if exists Planta;

drop table if exists reporteentity cascade;
drop sequence if exists Reporte;

drop table if exists sensorentity cascade;
drop sequence if exists Sensor;

drop table if exists tabladecrecimientoentity cascade;
drop sequence if exists tablaDeCrecimientoEntity_seq;

drop table if exists tablaestaticaentity cascade;
drop sequence if exists tablaEstaticaEntity_seq;

drop table if exists usuarioentity cascade;
drop sequence if exists Usuario;

