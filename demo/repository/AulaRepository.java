package com.example.demo.repository;

import com.example.demo.entity.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Long> {}
