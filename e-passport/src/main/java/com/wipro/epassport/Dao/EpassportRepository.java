package com.wipro.epassport.Dao;

import com.wipro.epassport.Model.Epassport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpassportRepository extends JpaRepository<Epassport,Integer> {
}
