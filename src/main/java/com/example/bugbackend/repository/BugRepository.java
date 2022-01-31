package com.example.bugbackend.repository;

import com.example.bugbackend.models.Bug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BugRepository extends JpaRepository<Bug, Long> {
    Bug findBugByUserId(Long id);
    Bug findBugByUserIdAndTitle(Long id, String title);
}
