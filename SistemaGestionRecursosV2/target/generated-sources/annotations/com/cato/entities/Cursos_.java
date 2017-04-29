package com.cato.entities;

import com.cato.entities.CursosXMalla;
import com.cato.entities.Estado;
import com.cato.entities.UnidadAprendizaje;
import com.cato.entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-29T15:29:29")
@StaticMetamodel(Cursos.class)
public class Cursos_ { 

    public static volatile SingularAttribute<Cursos, String> codigo;
    public static volatile SingularAttribute<Cursos, String> descripcionBreve;
    public static volatile SingularAttribute<Cursos, Integer> cantUnidAprendizaje;
    public static volatile SingularAttribute<Cursos, Date> fechaRegistro;
    public static volatile ListAttribute<Cursos, UnidadAprendizaje> unidadAprendizajeList;
    public static volatile ListAttribute<Cursos, CursosXMalla> cursosXMallaList;
    public static volatile SingularAttribute<Cursos, Estado> codigoEstado;
    public static volatile SingularAttribute<Cursos, String> nombre;
    public static volatile SingularAttribute<Cursos, Usuarios> usuarioId;
    public static volatile SingularAttribute<Cursos, String> objetivo;
    public static volatile SingularAttribute<Cursos, String> referencia1;
    public static volatile SingularAttribute<Cursos, Date> fechaActualizacion;
    public static volatile SingularAttribute<Cursos, Integer> cursoId;

}