package org.example.domain.car;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyCarRepository extends JpaRepository<MyCar, Long> {
}