package com.example.finedesk.persistance;

import com.example.finedesk.persistance.models.Livestream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface LivestreamRepository extends JpaRepository<Livestream, Long> {
}