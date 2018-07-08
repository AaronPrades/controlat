package io.aaronprades.controlat.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAlumno is a Querydsl query type for Alumno
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAlumno extends EntityPathBase<Alumno> {

    private static final long serialVersionUID = 589473726L;

    public static final QAlumno alumno = new QAlumno("alumno");

    public final StringPath dni = createString("dni");

    public final StringPath email = createString("email");

    public final StringPath emailPadres = createString("emailPadres");

    public final NumberPath<Integer> idAlumno = createNumber("idAlumno", Integer.class);

    public final StringPath nombre = createString("nombre");

    public final StringPath primerApellido = createString("primerApellido");

    public final StringPath segundoApellido = createString("segundoApellido");

    public final StringPath telefonoCasa = createString("telefonoCasa");

    public QAlumno(String variable) {
        super(Alumno.class, forVariable(variable));
    }

    public QAlumno(Path<? extends Alumno> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAlumno(PathMetadata metadata) {
        super(Alumno.class, metadata);
    }

}

