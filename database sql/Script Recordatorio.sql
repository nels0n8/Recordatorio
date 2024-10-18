create database recordatorio
use recordatorio 
go

--drop table Evt_Vencido;
-- select * from fecha
//insert into fecha values ('25/5/2024','25/6/2024');


create table Evento (
id_Evt int not null identity (1,1) primary key,
nombre varchar(100) not null,
descripcion varchar(150),

/*Foraneas*/
id_fecha int not null,
id_prioridad int not null,
id_estado int not null,

constraint fk_fecha foreign key (id_fecha) references fecha(id_fecha),
constraint fk_prioridad foreign key (id_prioridad) references Prioridad(id_prioridad),
constraint fk_estado foreign key (id_estado) references Estado(id_estado)
);
---------------------------------------------------------------------------------------------------
use recordatorio
go

create table fecha(
id_fecha int not null primary key identity(1,1),
fecha_agregado datetime not null,
fecha_notificar datetime not null,
);

-----------------------------------------------------------------------------------------------------
use recordatorio
go

create table Evt_Vencido(
id_EvtVencido int not null primary key identity(1,1),


/*Foraneas*/
id_Evt int not null,
id_estado int not null,
id_fecha int not null,
id_prioridad int not null,

constraint fk_Evt foreign key (id_Evt) references Evento(id_Evt),
constraint fk_estado_vencido foreign key (id_estado) references Estado(id_estado),
constraint fk_fechaVencido foreign key (id_fecha) references fecha(id_fecha),
constraint fk_prioridadVencido foreign key (id_prioridad) references Prioridad(id_prioridad)
);
-----------------------------------------------------------------------------------------------------
use recordatorio
go
create table Evt_Eliminado (
id_EvtEliminado int not null primary key identity (1,1),
fecha_elim datetime not null,

/*foraneas*/
id_Evt int not null,
constraint fk_evento foreign key (id_Evt) references Evento(id_Evt)
);

use recordatorio
go
create table Prioridad (
id_prioridad int not null primary key identity(1,1),
estado varchar(20)
);
----------------------------------------------------------------------
use recordatorio
go
create table Estado (
id_estado int not null primary key identity(1,1),
estado varchar(20) not null
);
---------------------------------------------------------------------