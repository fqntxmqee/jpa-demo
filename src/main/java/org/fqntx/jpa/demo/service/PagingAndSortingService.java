
package org.fqntx.jpa.demo.service;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
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
public abstract class PagingAndSortingService<T, ID extends Serializable> extends CurdService<T, ID> {

    protected abstract PagingAndSortingRepository<T, ID> getPagingAndSortingRepository();

    @Override
    protected CrudRepository<T, ID> getCrudRepository() {
        return getPagingAndSortingRepository();
    }

    @Transactional(readOnly = true)
    public Iterable<T> findAll(Sort sort) {
        return getPagingAndSortingRepository().findAll(sort);
    }

    @Transactional(readOnly = true)
    public Page<T> findAll(Pageable pageable) {
        return getPagingAndSortingRepository().findAll(pageable);
    }
}
