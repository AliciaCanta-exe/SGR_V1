package com.cato.entities;

import com.cato.entities.Estado;
import com.cato.entities.RecursosXTema;
import com.cato.entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-30T07:45:49")
@StaticMetamodel(TipoRecurso.class)
public class TipoRecurso_ { 

    public static volatile SingularAttribute<TipoRecurso, Integer> tipoRecursoId;
    public static volatile SingularAttribute<TipoRecurso, String> descripcion;
    public static volatile SingularAttribute<TipoRecurso, String> codigo;
    public static volatile SingularAttribute<TipoRecurso, Date> fechaRegistro;
    public static volatile SingularAttribute<TipoRecurso, Date> fechaActualizacion;
    public static volatile SingularAttribute<TipoRecurso, Estado> codigoEstado;
    public static volatile SingularAttribute<TipoRecurso, String> nombre;
    public static volatile SingularAttribute<TipoRecurso, Usuarios> usuarioId;
    public static volatile ListAttribute<TipoRecurso, RecursosXTema> recursosXTemaList;

}