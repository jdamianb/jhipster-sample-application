package com.jdamianb.test.jhipster.myapp.repository;

import com.jdamianb.test.jhipster.myapp.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
