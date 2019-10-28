package com.afrilandfirstbank.api.skeleton.dao.repository;

import com.afrilandfirstbank.api.skeleton.dao.entity.ApiObject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiObjectRepository extends JpaRepository<ApiObject, Long> {
}
