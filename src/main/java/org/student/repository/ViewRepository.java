package org.student.repository;

import org.springframework.data.repository.*;

import java.io.Serializable;

@NoRepositoryBean
public interface ViewRepository<T, ID extends Serializable> extends Repository<T, ID> {
//    T findOne(ID id);
//    boolean exists(ID id);
    Iterable<T> findAll();
//    long count();
}