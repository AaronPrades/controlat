package io.aaronprades.controlat.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAula is a Querydsl query type for Aula
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAula extends EntityPathBase<Aula> {

    private static final long serialVersionUID = 2047546851L;

    public static final QAula aula = new QAula("aula");

    public final NumberPath<Integer> idAula = createNumber("idAula", Integer.class);

    public final NumberPath<Integer> max_alumnos = createNumber("max_alumnos", Integer.class);

    public final StringPath numero_clase = createString("numero_clase");

    public QAula(String variable) {
        super(Aula.class, forVariable(variable));
    }

    public QAula(Path<? extends Aula> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAula(PathMetadata metadata) {
        super(Aula.class, metadata);
    }

}

