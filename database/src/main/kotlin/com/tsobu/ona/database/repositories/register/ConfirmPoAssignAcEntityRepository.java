package com.tsobu.ona.database.repositories.register;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ConfirmPoAssignAcEntityRepository extends JpaRepository<ConfirmPoAssignAcEntity, Void>, JpaSpecificationExecutor<ConfirmPoAssignAcEntity> {

}