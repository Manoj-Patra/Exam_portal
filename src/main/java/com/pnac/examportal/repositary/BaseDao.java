package com.pnac.examportal.repositary;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class BaseDao {

	@PersistenceContext
	protected EntityManager entityManager;
	
}
