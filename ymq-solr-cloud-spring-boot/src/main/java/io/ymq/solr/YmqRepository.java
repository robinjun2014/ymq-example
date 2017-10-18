package io.ymq.solr;

import io.ymq.solr.po.Ymq;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.repository.SolrCrudRepository;

import org.springframework.data.solr.repository.Query;


import java.util.List;

/**
 * 描述: 继承 SolrCrudRepository
 *
 * @author yanpenglei
 * @create 2017-10-18 10:34
 **/
public interface YmqRepository extends SolrCrudRepository<Ymq, String> {

    @Query(" ymqTitle:*?0* ")
    public List<Ymq> findByQueryAnnotation(String ymqTitle);
}
