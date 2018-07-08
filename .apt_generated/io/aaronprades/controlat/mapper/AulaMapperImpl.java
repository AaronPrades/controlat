package io.aaronprades.controlat.mapper;

import io.aaronprades.controlat.domain.Aula;
import io.aaronprades.controlat.dto.AulaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-07-08T00:54:56+0200",
    comments = "version: 1.1.0.Final, compiler: Eclipse JDT (IDE) 3.13.100.v20171123-1049, environment: Java 1.8.0_171 (Oracle Corporation)"
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
        aula.setNumeroAula( aulaDTO.getNumeroAula() );

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
        aulaDTO_.setNumeroAula( aula.getNumeroAula() );

        return aulaDTO_;
    }
}
