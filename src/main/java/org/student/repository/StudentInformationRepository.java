package org.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import org.student.model.StudentInformation;

import java.io.Serializable;

@Repository
public interface StudentInformationRepository extends CrudRepository<StudentInformation, Long>  {
    @NoRepositoryBean
    interface ViewRepository<T, ID extends Serializable> extends org.springframework.data.repository.Repository<T, ID> {
        T findOne(ID id);
        boolean exists(ID id);
        Iterable<T> findAll();
        long count();
    }
}
