package com.example.demo.repositories;

import com.example.demo.models.PlantInventoryEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.List;

public interface CustomPlantInventoryEntryRepository {
    List<PlantInventoryEntry> findMethod(@Param("name") String name);
}

