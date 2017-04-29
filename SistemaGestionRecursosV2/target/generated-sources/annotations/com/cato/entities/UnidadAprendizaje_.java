package com.cato.entities;

import com.cato.entities.Cursos;
import com.cato.entities.Estado;
import com.cato.entities.Temas;
import com.cato.entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-29T15:29:29")
@StaticMetamodel(UnidadAprendizaje.class)
public class UnidadAprendizaje_ { 

    public static volatile SingularAttribute<UnidadAprendizaje, String> descripcion;
    public static volatile SingularAttribute<UnidadAprendizaje, String> codigo;
    public static volatile SingularAttribute<UnidadAprendizaje, Date> fechaRegistro;
    public static volatile SingularAttribute<UnidadAprendizaje, Estado> codigoEstado;
    public static volatile SingularAttribute<UnidadAprendizaje, String> nombre;
    public static volatile SingularAttribute<UnidadAprendizaje, Usuarios> usuarioId;
    public static volatile SingularAttribute<UnidadAprendizaje, String> objetivo;
    public static volatile ListAttribute<UnidadAprendizaje, Temas> temasList;
    public static volatile SingularAttribute<UnidadAprendizaje, String> referencia1;
    public static volatile SingularAttribute<UnidadAprendizaje, Date> fechaActualizacion;
    public static volatile SingularAttribute<UnidadAprendizaje, Integer> unidadAprendizajeId;
    public static volatile SingularAttribute<UnidadAprendizaje, Cursos> cursoId;
    public static volatile SingularAttribute<UnidadAprendizaje, Integer> cantTemas;

}