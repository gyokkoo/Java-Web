package com.springbootlecutre.lecture.repository;

import com.springbootlecutre.lecture.entities.Cat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends CrudRepository<Cat, Long> {


}
