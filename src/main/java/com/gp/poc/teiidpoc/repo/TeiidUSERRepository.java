/**
 * 
 */
package com.gp.poc.teiidpoc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gp.poc.teiidpoc.entity.TeiidUSER;


/**
 * @author gpol
 *
 */
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface TeiidUSERRepository extends CrudRepository<TeiidUSER, Long> {
	
	List<TeiidUSER> findAll();

}
