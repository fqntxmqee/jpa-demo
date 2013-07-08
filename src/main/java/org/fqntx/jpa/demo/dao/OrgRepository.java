/**
 * 
 */
package org.fqntx.jpa.demo.dao;

import org.fqntx.jpa.demo.domain.TOrg;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author <a href="mailto:guoqing.huang@foxmail.com">Guoqing Huang</a>
 *
 * @since 2013-7-5
 * @version
 */
@Repository
public interface OrgRepository extends PagingAndSortingRepository<TOrg, Long> {

}
