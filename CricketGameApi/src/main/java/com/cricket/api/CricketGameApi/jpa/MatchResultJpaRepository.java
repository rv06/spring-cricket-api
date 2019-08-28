package com.cricket.api.CricketGameApi.jpa;

import com.cricket.api.CricketGameApi.MatchResult;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.lang.reflect.Type;
import java.util.List;

@Repository
@Transactional
public class MatchResultJpaRepository {
    @PersistenceContext
    EntityManager entityManager;

    public List<MatchResult> findAll() {
        TypedQuery<MatchResult> namedQuery = entityManager.createNamedQuery("find_all_results", MatchResult.class);
        return namedQuery.getResultList();
    }

    public MatchResult findById(int matchid) {
        TypedQuery<MatchResult> query = entityManager.createQuery("select m from MatchResult m where m.id = :matchid", MatchResult.class);
        return query.setParameter("matchid", matchid).getResultList().get(0);
    }
}
