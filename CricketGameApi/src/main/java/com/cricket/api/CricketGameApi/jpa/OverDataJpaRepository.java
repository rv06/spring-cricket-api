package com.cricket.api.CricketGameApi.jpa;

import com.cricket.api.CricketGameApi.MatchData;
import com.cricket.api.CricketGameApi.MatchResult;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class OverDataJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<MatchData> findAll() {
        TypedQuery<MatchData> namedQuery = entityManager.createNamedQuery("find_all_over_data", MatchData.class);
        return namedQuery.getResultList();
    }
    public MatchData getDataById(int matchid, int over) {
        TypedQuery<MatchData> query = entityManager.createQuery("select m from MatchData m where m.matchid = :matchid and m.overs = :over", MatchData.class);
        return query.setParameter("matchid", matchid).setParameter("over", over).getResultList().get(0);
    }
}
