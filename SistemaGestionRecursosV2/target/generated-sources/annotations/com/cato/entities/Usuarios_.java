package com.cato.entities;

import com.cato.entities.Cursos;
import com.cato.entities.CursosXMalla;
import com.cato.entities.Estado;
import com.cato.entities.Mallas;
import com.cato.entities.Temas;
import com.cato.entities.UnidadAprendizaje;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-29T17:01:14")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> clave;
    public static volatile SingularAttribute<Usuarios, Date> fechaRegistro;
    public static volatile ListAttribute<Usuarios, UnidadAprendizaje> unidadAprendizajeList;
    public static volatile ListAttribute<Usuarios, CursosXMalla> cursosXMallaList;
    public static volatile SingularAttribute<Usuarios, Estado> codigoEstado;
    public static volatile SingularAttribute<Usuarios, Integer> usuarioId;
    public static volatile SingularAttribute<Usuarios, String> rol;
    public static volatile ListAttribute<Usuarios, Temas> temasList;
    public static volatile ListAttribute<Usuarios, Mallas> mallasList;
    public static volatile ListAttribute<Usuarios, Cursos> cursosList;
    public static volatile SingularAttribute<Usuarios, Date> fechaActualizacion;
    public static volatile SingularAttribute<Usuarios, String> email;
    public static volatile SingularAttribute<Usuarios, String> dni;

}