package com.cato.entities;

import com.cato.entities.CursosXMalla;
import com.cato.entities.Estado;
import com.cato.entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-29T15:29:29")
@StaticMetamodel(Mallas.class)
public class Mallas_ { 

    public static volatile SingularAttribute<Mallas, String> descripcion;
    public static volatile SingularAttribute<Mallas, String> objetivo;
    public static volatile SingularAttribute<Mallas, String> codigo;
    public static volatile SingularAttribute<Mallas, Date> fechaRegistro;
    public static volatile SingularAttribute<Mallas, String> referencia1;
    public static volatile SingularAttribute<Mallas, Integer> mallaId;
    public static volatile SingularAttribute<Mallas, Date> fechaActualizacion;
    public static volatile ListAttribute<Mallas, CursosXMalla> cursosXMallaList;
    public static volatile SingularAttribute<Mallas, Estado> codigoEstado;
    public static volatile SingularAttribute<Mallas, String> nombre;
    public static volatile SingularAttribute<Mallas, Usuarios> usuarioId;
    public static volatile SingularAttribute<Mallas, String> anio;

}