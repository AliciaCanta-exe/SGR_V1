package com.cato.entities;

import com.cato.entities.Cursos;
import com.cato.entities.Estado;
import com.cato.entities.Mallas;
import com.cato.entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-29T15:29:29")
@StaticMetamodel(CursosXMalla.class)
public class CursosXMalla_ { 

    public static volatile SingularAttribute<CursosXMalla, String> descripcion;
    public static volatile SingularAttribute<CursosXMalla, String> objetivo;
    public static volatile SingularAttribute<CursosXMalla, Date> fechaRegistro;
    public static volatile SingularAttribute<CursosXMalla, String> referencia1;
    public static volatile SingularAttribute<CursosXMalla, Integer> cxmId;
    public static volatile SingularAttribute<CursosXMalla, String> referencia2;
    public static volatile SingularAttribute<CursosXMalla, Date> fechaActualizacion;
    public static volatile SingularAttribute<CursosXMalla, Mallas> mallaId;
    public static volatile SingularAttribute<CursosXMalla, Cursos> cursoId;
    public static volatile SingularAttribute<CursosXMalla, Estado> codigoEstado;
    public static volatile SingularAttribute<CursosXMalla, Usuarios> usuarioId;

}