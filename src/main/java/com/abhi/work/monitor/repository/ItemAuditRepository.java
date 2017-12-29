package com.abhi.work.monitor.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.work.monitor.model.ItemAudit;

public interface ItemAuditRepository extends JpaRepository<ItemAudit, Serializable>{

}
