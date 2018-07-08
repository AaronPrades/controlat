package io.aaronprades.controlat.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QProfesor is a Querydsl query type for Profesor
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProfesor extends EntityPathBase<Profesor> {

    private static final long serialVersionUID = 772473380L;

    public static final QProfesor profesor = new QProfesor("profesor");

    public final StringPath dni = createString("dni");

    public final StringPath email = createString("email");

    public final NumberPath<Integer> idProfesor = createNumber("idProfesor", Integer.class);

    public final StringPath nombre = createString("nombre");

    public final StringPath primerApellido = createString("primerApellido");

    public final StringPath segundoApellido = createString("segundoApellido");

    public final StringPath telefono = createString("telefono");

    public QProfesor(String variable) {
        super(Profesor.class, forVariable(variable));
    }

    public QProfesor(Path<? extends Profesor> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProfesor(PathMetadata metadata) {
        super(Profesor.class, metadata);
    }

}

