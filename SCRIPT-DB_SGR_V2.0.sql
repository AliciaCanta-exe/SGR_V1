
/*
 * Script de Base de Datos DB_SGR
 * Fecha: 25.04.2017 
 */    


/*
 * Tabla usuarios 
 */    

CREATE TABLE estado(
CODIGO_ESTADO VARCHAR(1) PRIMARY KEY,
NOMBRE VARCHAR(12) NOT NULL,
DESCRIPCION_BREVE VARCHAR(150) NOT NULL,
FECHA_REGISTRO DATE NOT NULL,
FECHA_ACTUALIZACION DATE NULL       
);

INSERT INTO estado(codigo_estado, nombre, descripcion_breve, fecha_registro, fecha_actualizacion)
VALUES ('E', 'ELIMADO', 'EL REGISTRO HA SIDO ELIMINADO', '2017-04-23',null);

INSERT INTO estado(codigo_estado, nombre, descripcion_breve, fecha_registro, fecha_actualizacion)
VALUES ('A', 'ACTUALIZADO', 'EL REGISTRO HA SIDO ACTUALIZADO','2017-04-23',null);

INSERT INTO estado(codigo_estado, nombre, descripcion_breve, fecha_registro, fecha_actualizacion)
VALUES ('C', 'CREADO', 'EL REGISTRO HA SIDO CREADO','2017-04-23',null);



/*
 * Tabla usuarios 
 */    


CREATE TABLE usuarios(
usuario_id SERIAL PRIMARY KEY,
email VARCHAR(50) NOT NULL,
clave VARCHAR(12) NOT NULL,
dni VARCHAR(8) NULL,
rol VARCHAR(12) NULL,
fecha_registro DATE NOT NULL,
fecha_actualizacion DATE NULL, 
codigo_estado VARCHAR(1) REFERENCES estado
);

INSERT INTO usuarios(email, clave, dni, rol, fecha_registro, fecha_actualizacion, codigo_estado)
VALUES ( 'administrador2017@gmail.com', '1234567', '52365236', 'admin','2017-04-23',null, 'C' );

INSERT INTO usuarios(email, clave, dni, rol, fecha_registro, fecha_actualizacion, codigo_estado)
VALUES ('death2012@gmail.com', '1234567', '22222222','admin','2017-04-23',null, 'C' );

INSERT INTO usuarios(email, clave, dni, rol, fecha_registro, fecha_actualizacion, codigo_estado)
VALUES ('alicia.canta.exe@gmail.com', '1234567', '11111111','admin','2017-04-23',null, 'C' );

INSERT INTO usuarios(email, clave, dni, rol, fecha_registro, fecha_actualizacion, codigo_estado)
VALUES ('test@gmail.com', '1234567', '11111111','consultor','2017-04-23',null, 'C' );




/*
 * Tabla cursos 
 */


CREATE TABLE cursos(
curso_id SERIAL PRIMARY KEY,
codigo VARCHAR(8) NOT NULL,
nombre VARCHAR(100) NOT NULL,
descripcion_breve VARCHAR(250) NOT NULL,
objetivo VARCHAR(150) NOT NULL,
cant_unid_aprendizaje INTEGER NULL,
fecha_registro DATE NOT NULL,
fecha_actualizacion DATE NULL,   
codigo_estado VARCHAR(1) REFERENCES estado,
usuario_id INTEGER REFERENCES usuarios,
referencia1 varchar(12) NULL    
);

INSERT INTO public.cursos(codigo, nombre, descripcion_breve, objetivo, cant_unid_aprendizaje, fecha_registro, fecha_actualizacion, codigo_estado,usuario_id,referencia1)
VALUES ('CUR001', 'HISTORIA DEL PERU', 'CURSO DE LETRAS HISTORIA', 'APRENDER LA CULTURA PERUANA', 25,'2017-04-23',null, 'C',1, null);

INSERT INTO public.cursos(codigo, nombre, descripcion_breve, objetivo, cant_unid_aprendizaje, fecha_registro, fecha_actualizacion, codigo_estado,usuario_id,referencia1)
VALUES ('CUR002', 'algebra', 'curso de numero', 'aprender algebra', 20,'2017-04-23',null, 'C',1,null);

INSERT INTO public.cursos(codigo, nombre, descripcion_breve, objetivo, cant_unid_aprendizaje, fecha_registro, fecha_actualizacion, codigo_estado,usuario_id,referencia1)
VALUES ('CUR003', 'lenguage', 'curso de letras', 'aprender leguaje', 50,'2017-04-23',null, 'C',1,null);




/*
 * Tabla Unidad de Aprendizaje 
 */
 


CREATE TABLE unidad_aprendizaje(
unidad_aprendizaje_id SERIAL PRIMARY KEY,
codigo VARCHAR(12) NOT NULL,
nombre VARCHAR(500) NOT NULL,
descripcion TEXT NOT NULL,
objetivo VARCHAR(2500) NOT NULL,
cant_temas INTEGER NULL,
curso_id INTEGER REFERENCES cursos,
fecha_registro DATE NOT NULL,
fecha_actualizacion DATE NULL,   
codigo_estado VARCHAR(1) REFERENCES estado,
usuario_id INTEGER REFERENCES usuarios,
referencia1 varchar(12) NULL
);
INSERT INTO unidad_aprendizaje(codigo, nombre, descripcion, objetivo, cant_temas, 
                                        curso_id, fecha_registro, fecha_actualizacion, codigo_estado, 
                                        usuario_id, referencia1)
VALUES ('UNAP001', 'UNIDAD DE APRENDIZAJE A', 'Descripción de la Unidad de Aprendizaje A', 'Objetivo de la Unidad de Aprendizaje A', 15, 1, '2017-04-23', null, 'C', 1,null);

INSERT INTO unidad_aprendizaje(codigo, nombre, descripcion, objetivo, cant_temas, 
                                        curso_id, fecha_registro, fecha_actualizacion, codigo_estado, 
                                        usuario_id, referencia1)
VALUES ('UNAP002', 'UNIDAD DE APRENDIZAJE B', 'Descripción de la Unidad de Aprendizaje B', 'Objetivo de la Unidad de Aprendizaje B', 25, 1, '2017-04-23', null, 'C', 1,null);

INSERT INTO unidad_aprendizaje(codigo, nombre, descripcion, objetivo, cant_temas, 
                                        curso_id, fecha_registro, fecha_actualizacion, codigo_estado, 
                                        usuario_id, referencia1)
VALUES ('UNAP003', 'UNIDAD DE APRENDIZAJE C', 'Descripción de la Unidad de Aprendizaje C', 'Objetivo de la Unidad de Aprendizaje C', 26, 1, '2017-04-23', null, 'C', 1,null);



/*
 * Tabla Temas
 */
 


CREATE TABLE temas(
tema_id SERIAL PRIMARY KEY,
codigo VARCHAR(12) NOT NULL,
nombre VARCHAR(500) NOT NULL,
descripcion TEXT NOT NULL,
objetivo VARCHAR(2500) NOT NULL,
unidad_aprendizaje_id INTEGER REFERENCES unidad_aprendizaje,
fecha_registro DATE NOT NULL,
fecha_actualizacion DATE NULL,   
codigo_estado VARCHAR(1) REFERENCES estado,
usuario_id INTEGER REFERENCES usuarios,
referencia1 varchar(12) NULL
);

INSERT INTO public.temas(codigo, nombre, descripcion, objetivo, unidad_aprendizaje_id, fecha_registro, 
                           fecha_actualizacion, codigo_estado, usuario_id, referencia1)
VALUES ('TEM001', 'Tema 01', 'Descripción del Tema 001', 'Objetivos que se deben cumplir con el tema 001', 1, '2017-04-23', null, 'C', 1, null);

INSERT INTO public.temas(codigo, nombre, descripcion, objetivo, unidad_aprendizaje_id, fecha_registro, 
                           fecha_actualizacion, codigo_estado, usuario_id, referencia1)
VALUES ('TEM002', 'Tema 01', 'Descripción del Tema 002', 'Objetivos que se deben cumplir con el tema 003', 1, '2017-04-23', null, 'C', 1, null);

INSERT INTO public.temas(codigo, nombre, descripcion, objetivo, unidad_aprendizaje_id, fecha_registro, 
                           fecha_actualizacion, codigo_estado, usuario_id, referencia1)
VALUES ('TEM003', 'Tema 01', 'Descripción del Tema 003', 'Objetivos que se deben cumplir con el tema 003', 1, '2017-04-23', null, 'C', 1, null);




/*
 * Tabla Mallas
 * Una malla por año  
 */

 
CREATE TABLE mallas(
malla_id SERIAL PRIMARY KEY,
codigo VARCHAR(12) NOT NULL,
anio VARCHAR(4) NOT NULL,
nombre VARCHAR(500) NOT NULL,
descripcion TEXT NOT NULL,
objetivo VARCHAR(2500) NOT NULL,
fecha_registro DATE NOT NULL,
fecha_actualizacion DATE NULL,   
codigo_estado VARCHAR(1) REFERENCES estado,
usuario_id INTEGER REFERENCES usuarios,
referencia1 varchar(12) NULL    
);

INSERT INTO public.mallas(
codigo, anio, nombre, descripcion, objetivo, fecha_registro, fecha_actualizacion, codigo_estado, usuario_id, referencia1)
VALUES (
'M201701001','2017','Malla Enero 2017', 'Descripción de la malla 2017', 'Objetivos de la Malla Curricular 2017', '2017-04-23',null, 'C',1,null);



/*
 * Tabla Cursos x Malla
 */

 
CREATE TABLE cursos_x_malla(
cxm_id SERIAL PRIMARY KEY,
malla_id INTEGER REFERENCES mallas,
curso_id INTEGER REFERENCES cursos,    
descripcion TEXT NOT NULL,
objetivo VARCHAR(2500) NOT NULL,
fecha_registro DATE NOT NULL,
fecha_actualizacion DATE NULL,   
codigo_estado VARCHAR(1) REFERENCES estado,
usuario_id INTEGER REFERENCES usuarios,
referencia1 varchar(12) NULL,
referencia2 varchar(12) NULL       
);

INSERT INTO public.cursos_x_malla(
	malla_id, curso_id, descripcion, objetivo, fecha_registro, fecha_actualizacion, codigo_estado, usuario_id, referencia1, referencia2)
	VALUES (1, 1, 'Descripcion 1 curso por malla', 'Objetivos 1 curso por malla', '2017-04-23', null, 'C', 1, null, null);

INSERT INTO public.cursos_x_malla(
	malla_id, curso_id, descripcion, objetivo, fecha_registro, fecha_actualizacion, codigo_estado, usuario_id, referencia1, referencia2)
	VALUES (1, 2, 'Descripcion 2 curso por malla', 'Objetivos 2 curso por malla', '2017-04-23', null, 'C', 1, null, null);

INSERT INTO public.cursos_x_malla(
	malla_id, curso_id, descripcion, objetivo, fecha_registro, fecha_actualizacion, codigo_estado, usuario_id, referencia1, referencia2)
	VALUES (1, 3, 'Descripcion 3 curso por malla', 'Objetivos 3 curso por malla', '2017-04-23', null, 'C', 1, null, null);

	
/*  SEGUNDA PARTE */	

/*
 * Tabla Tipo de Recurso
 * IMG, VIDEO, AUDIO, LINK
 */    

CREATE TABLE tipo_recurso (
tipo_recurso_id SERIAL PRIMARY KEY,
codigo VARCHAR(10) not NULL,
nombre VARCHAR(50) NOT NULL,
descripcion VARCHAR(500) NOT NULL,
fecha_registro DATE NOT NULL,
fecha_actualizacion DATE NULL,
codigo_estado VARCHAR(1) REFERENCES estado,
usuario_id INTEGER REFERENCES usuarios
)

INSERT INTO tipo_recurso(codigo, nombre, descripcion, fecha_registro, fecha_actualizacion, codigo_estado, usuario_id)
VALUES('IMG', 'Imagen', 'Recurso tipo Imagen', '2017-04-23',null, 'C', 1);

INSERT INTO tipo_recurso(codigo, nombre, descripcion, fecha_registro, fecha_actualizacion, codigo_estado, usuario_id)
VALUES('VIDEO', 'Video', 'Recurso tipo Video', '2017-04-23',null, 'C', 1);

INSERT INTO tipo_recurso(codigo, nombre, descripcion, fecha_registro, fecha_actualizacion, codigo_estado, usuario_id)
VALUES('LINK', 'Enlace', 'Recurso tipo enlace hacia otra pagina', '2017-04-23',null, 'C', 1);

INSERT INTO tipo_recurso(codigo, nombre, descripcion, fecha_registro, fecha_actualizacion, codigo_estado, usuario_id)
VALUES('AUDIO', 'Audio', 'Recurso tipo Audio', '2017-04-23',null, 'C', 1);

INSERT INTO tipo_recurso(codigo, nombre, descripcion, fecha_registro, fecha_actualizacion, codigo_estado, usuario_id)
VALUES('TEXT', 'Texto', 'Recurso tipo TEXTO', '2017-04-23',null, 'C', 1);

/*
 * Tabla usuarios 
 */    

CREATE TABLE recursos_x_tema(
rxt_id SERIAL PRIMARY KEY,
tipo_recurso_id INTEGER REFERENCES tipo_recurso,
tema_id INTEGER REFERENCES temas,
fuente VARCHAR(2500) NOT NULL,
descripcion TEXT NULL,
detalle_descripcion TEXT NULL,
contentUrl TEXT null,  
url TEXT null,  
license TEXT null,  
referencia1 TEXT null,
referencia2 TEXT null,  
fecha_registro DATE NOT NULL,
fecha_actualizacion DATE NULL,   
codigo_estado VARCHAR(1) REFERENCES estado,
usuario_id INTEGER REFERENCES usuarios   
);

INSERT INTO recursos_x_tema (tipo_recurso_id, tema_id, fuente, descripcion, detalle_descripcion, contenturl, url, license, referencia1, referencia2, fecha_registro, fecha_actualizacion, codigo_estado, usuario_id)
VALUES( 3, 1, 'Welcome to Schema.org', 'Barack Hussein Obama II is an American politician', 'detalle descripcion', 'http://t0.gstatic.com/images?q=tbn:ANd9GcSkJEGgR2wJ0bp8DhOXx2QuexPLTslqt0v-G2iTiDWVp3iRhSnc','https://commons.wikimedia.org/wiki/File:BarackObama2005portrait.jpg','https://en.wikipedia.org/wiki/Wikipedia:Text_of_Creative_Commons_Attribution-ShareAlike_3.0_Unported_License','referencia1', 'referencia2', '2017-04-23',null, 'C', 1);

