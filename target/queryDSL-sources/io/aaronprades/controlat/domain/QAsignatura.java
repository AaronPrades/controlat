package io.aaronprades.controlat.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAsignatura is a Querydsl query type for Asignatura
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAsignatura extends EntityPathBase<Asignatura> {

    private static final long serialVersionUID = -280405203L;

    public static final QAsignatura asignatura = new QAsignatura("asignatura");

    public final NumberPath<Integer> horasPlanificadas = createNumber("horasPlanificadas", Integer.class);

    public final NumberPath<Integer> idAsignatura = createNumber("idAsignatura", Integer.class);

    public final StringPath nombre = createString("nombre");

    public QAsignatura(String variable) {
        super(Asignatura.class, forVariable(variable));
    }

    public QAsignatura(Path<? extends Asignatura> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAsignatura(PathMetadata metadata) {
        super(Asignatura.class, metadata);
    }

}

