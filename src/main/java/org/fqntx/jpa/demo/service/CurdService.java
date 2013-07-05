
package org.fqntx.jpa.demo.service;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author <a href="mailto:guoqing.huang@foxmail.com">Guoqing Huang</a>
 *
 * @since 2013-7-5
 * @version
 * @param <T>
 * @param <ID>
 */
@Transactional
public abstract class CurdService<T, ID extends Serializable> {

	protected Log	log	= LogFactory.getLog(getLogName());
	
	@PersistenceContext 
	protected EntityManager em; 

	protected abstract CrudRepository<T, ID> getCrudRepository();

	protected String getLogName() {
		return getClass().getSimpleName();
	}

	@Transactional
	public <S extends T> S save(S entity) {
		return getCrudRepository().save(entity);
	}

	@Transactional
	public <S extends T> Iterable<S> save(Iterable<S> entities) {
		return getCrudRepository().save(entities);
	}

	@Transactional(readOnly = true)
	public T findOne(ID id) {
		return getCrudRepository().findOne(id);
	}

	@Transactional(readOnly = true)
	public boolean exists(ID id) {
		return getCrudRepository().exists(id);
	}

	@Transactional(readOnly = true)
	public Iterable<T> findAll() {
		return getCrudRepository().findAll();
	}

	@Transactional(readOnly = true)
	public Iterable<T> findAll(Iterable<ID> ids) {
		return getCrudRepository().findAll(ids);
	}

	@Transactional(readOnly = true)
	public long count() {
		return getCrudRepository().count();
	}

	@Transactional
	public void delete(ID id) {
		getCrudRepository().delete(id);
	}

	@Transactional
	public void delete(T entity) {
		getCrudRepository().delete(entity);
	}

	@Transactional
	public void delete(Iterable<? extends T> entities) {
		getCrudRepository().delete(entities);
	}

	@Transactional
	public void deleteAll() {
		getCrudRepository().deleteAll();
	}
}
