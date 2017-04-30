package com.cato.entities;

import com.cato.entities.Estado;
import com.cato.entities.Temas;
import com.cato.entities.TipoRecurso;
import com.cato.entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-30T07:45:49")
@StaticMetamodel(RecursosXTema.class)
public class RecursosXTema_ { 

    public static volatile SingularAttribute<RecursosXTema, String> descripcion;
    public static volatile SingularAttribute<RecursosXTema, TipoRecurso> tipoRecursoId;
    public static volatile SingularAttribute<RecursosXTema, Date> fechaRegistro;
    public static volatile SingularAttribute<RecursosXTema, String> fuente;
    public static volatile SingularAttribute<RecursosXTema, String> referencia2;
    public static volatile SingularAttribute<RecursosXTema, Estado> codigoEstado;
    public static volatile SingularAttribute<RecursosXTema, Usuarios> usuarioId;
    public static volatile SingularAttribute<RecursosXTema, String> url;
    public static volatile SingularAttribute<RecursosXTema, String> license;
    public static volatile SingularAttribute<RecursosXTema, String> contenturl;
    public static volatile SingularAttribute<RecursosXTema, String> detalleDescripcion;
    public static volatile SingularAttribute<RecursosXTema, Temas> temaId;
    public static volatile SingularAttribute<RecursosXTema, Integer> rxtId;
    public static volatile SingularAttribute<RecursosXTema, String> referencia1;
    public static volatile SingularAttribute<RecursosXTema, Date> fechaActualizacion;

}