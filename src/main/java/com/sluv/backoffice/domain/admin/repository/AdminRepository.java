package com.sluv.backoffice.domain.admin.repository;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<KafkaProperties.Admin, Long> {
}