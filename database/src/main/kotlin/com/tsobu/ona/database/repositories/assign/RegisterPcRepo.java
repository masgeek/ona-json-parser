package com.tsobu.ona.database.repositories.assign;

import com.tsobu.ona.database.entities.assign.RegisterPcEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegisterPcRepo extends JpaRepository<RegisterPcEntity, Long>, JpaSpecificationExecutor<RegisterPcEntity> {

}