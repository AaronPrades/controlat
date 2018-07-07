package io.aaronprades.controlat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.aaronprades.controlat.domain.Aula;

@Repository
@Transactional
public interface AulaRepository extends JpaRepository<Aula, Integer> {

	@Transactional(readOnly = true)
	public List<Aula> findAll();
}
