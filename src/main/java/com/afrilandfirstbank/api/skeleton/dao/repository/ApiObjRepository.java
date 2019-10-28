package com.afrilandfirstbank.api.skeleton.dao.repository;

import com.afrilandfirstbank.api.skeleton.dao.entity.ApiObj;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiObjRepository extends JpaRepository<ApiObj, Long> {
}
