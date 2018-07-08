package io.aaronprades.controlat.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDiasLaborables is a Querydsl query type for DiasLaborables
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDiasLaborables extends EntityPathBase<DiasLaborables> {

    private static final long serialVersionUID = 1014426554L;

    public static final QDiasLaborables diasLaborables = new QDiasLaborables("diasLaborables");

    public final DateTimePath<java.util.Date> fecha = createDateTime("fecha", java.util.Date.class);

    public final NumberPath<Integer> idDiasLaborables = createNumber("idDiasLaborables", Integer.class);

    public QDiasLaborables(String variable) {
        super(DiasLaborables.class, forVariable(variable));
    }

    public QDiasLaborables(Path<? extends DiasLaborables> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDiasLaborables(PathMetadata metadata) {
        super(DiasLaborables.class, metadata);
    }

}

