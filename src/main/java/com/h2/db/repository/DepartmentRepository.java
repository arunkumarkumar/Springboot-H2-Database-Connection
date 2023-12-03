
package com.h2.db.repository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.h2.db.entity.*;
 
// Annotation
@Repository
 
// Interface extending CrudRepository
public interface DepartmentRepository
    extends CrudRepository<Department, Long> {
}