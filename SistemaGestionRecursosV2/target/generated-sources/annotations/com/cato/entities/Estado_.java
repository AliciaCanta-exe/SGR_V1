package com.cato.entities;

import com.cato.entities.Cursos;
import com.cato.entities.CursosXMalla;
import com.cato.entities.Mallas;
import com.cato.entities.Temas;
import com.cato.entities.UnidadAprendizaje;
import com.cato.entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-29T15:29:29")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile ListAttribute<Estado, Usuarios> usuariosList;
    public static volatile SingularAttribute<Estado, String> descripcionBreve;
    public static volatile ListAttribute<Estado, Temas> temasList;
    public static volatile ListAttribute<Estado, Mallas> mallasList;
    public static volatile SingularAttribute<Estado, Date> fechaRegistro;
    public static volatile ListAttribute<Estado, Cursos> cursosList;
    public static volatile ListAttribute<Estado, UnidadAprendizaje> unidadAprendizajeList;
    public static volatile SingularAttribute<Estado, Date> fechaActualizacion;
    public static volatile ListAttribute<Estado, CursosXMalla> cursosXMallaList;
    public static volatile SingularAttribute<Estado, String> codigoEstado;
    public static volatile SingularAttribute<Estado, String> nombre;

}