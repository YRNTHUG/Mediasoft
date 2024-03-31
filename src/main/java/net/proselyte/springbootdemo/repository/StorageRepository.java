package net.proselyte.springbootdemo.repository;

import net.proselyte.springbootdemo.model.Storages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepository extends JpaRepository <Storages, Long> {
}
