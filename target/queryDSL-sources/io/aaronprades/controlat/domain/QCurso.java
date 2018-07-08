package io.aaronprades.controlat.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCurso is a Querydsl query type for Curso
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCurso extends EntityPathBase<Curso> {

    private static final long serialVersionUID = -948703582L;

    public static final QCurso curso = new QCurso("curso");

    public final NumberPath<Integer> idCurso = createNumber("idCurso", Integer.class);

    public final StringPath nombre = createString("nombre");

    public QCurso(String variable) {
        super(Curso.class, forVariable(variable));
    }

    public QCurso(Path<? extends Curso> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCurso(PathMetadata metadata) {
        super(Curso.class, metadata);
    }

}

