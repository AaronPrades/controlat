package io.aaronprades.controlat.mapper;

import io.aaronprades.controlat.domain.Aula;
import io.aaronprades.controlat.dto.AulaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-07-08T00:32:32+0200",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_171 (Oracle Corporation)"
)
@Component
public class AulaMapperImpl implements AulaMapper {

    @Override
    public List<AulaDTO> listaAulaToListaAulaDTO(List<Aula> aulas) {
        if ( aulas == null ) {
            return null;
        }

        List<AulaDTO> list = new ArrayList<AulaDTO>();
        for ( Aula aula : aulas ) {
            list.add( aulaToAulaDTO( aula ) );
        }

        return list;
    }

    @Override
    public Aula aulaDTOToAula(AulaDTO aulaDTO) {
        if ( aulaDTO == null ) {
            return null;
        }

        Aula aula = new Aula();

        aula.setIdAula( aulaDTO.getIdAula() );
        aula.setMaxAlumnos( aulaDTO.getMaxAlumnos() );

        return aula;
    }

    @Override
    public AulaDTO aulaToAulaDTO(Aula aula) {
        if ( aula == null ) {
            return null;
        }

        AulaDTO aulaDTO_ = new AulaDTO();

        aulaDTO_.setIdAula( aula.getIdAula() );
        aulaDTO_.setMaxAlumnos( aula.getMaxAlumnos() );

        return aulaDTO_;
    }
}
