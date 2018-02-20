package com.example.demo.repositories;

import com.example.demo.models.PlantInventoryEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//public interface PlantInventoryEntryRepository extends JpaRepository<PlantInventoryEntry, Long>{
////    List<PlantInventoryEntry> findByNameLike(String name);
//    @Query("Select e from PlantInventoryEntry e where e.name like CONCAT('%', :name, '%') ")
//    List<PlantInventoryEntry> findMethod(@Param("name") String name);
//}
@Repository
public interface PlantInventoryEntryRepository extends JpaRepository<PlantInventoryEntry, Long>,
        CustomPlantInventoryEntryRepository{
//    List<PlantInventoryEntry> findByNameLike(String name);
//    @Query("Select e from PlantInventoryEntry e where e.name like CONCAT('%', :name, '%') ")
//    List<PlantInventoryEntry> findMethod(@Param("name") String name);
}
