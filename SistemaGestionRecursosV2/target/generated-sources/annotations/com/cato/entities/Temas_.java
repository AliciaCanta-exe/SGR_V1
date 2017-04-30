package com.cato.entities;

import com.cato.entities.Estado;
import com.cato.entities.RecursosXTema;
import com.cato.entities.UnidadAprendizaje;
import com.cato.entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-30T07:45:49")
@StaticMetamodel(Temas.class)
public class Temas_ { 

    public static volatile SingularAttribute<Temas, String> descripcion;
    public static volatile SingularAttribute<Temas, String> objetivo;
    public static volatile SingularAttribute<Temas, String> codigo;
    public static volatile SingularAttribute<Temas, Integer> temaId;
    public static volatile SingularAttribute<Temas, Date> fechaRegistro;
    public static volatile SingularAttribute<Temas, String> referencia1;
    public static volatile SingularAttribute<Temas, Date> fechaActualizacion;
    public static volatile SingularAttribute<Temas, Estado> codigoEstado;
    public static volatile SingularAttribute<Temas, UnidadAprendizaje> unidadAprendizajeId;
    public static volatile SingularAttribute<Temas, String> nombre;
    public static volatile SingularAttribute<Temas, Usuarios> usuarioId;
    public static volatile ListAttribute<Temas, RecursosXTema> recursosXTemaList;

}