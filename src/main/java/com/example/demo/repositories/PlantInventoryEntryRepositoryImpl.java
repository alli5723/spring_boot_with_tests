package com.example.demo.repositories;

import com.example.demo.models.PlantInventoryEntry;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class PlantInventoryEntryRepositoryImpl implements CustomPlantInventoryEntryRepository{
    @Autowired
    EntityManager em;
    @Override
    public List<PlantInventoryEntry> findMethod(String name) {
        return em.createQuery("select p from PlantInventoryEntry p where (p.name) like concat('%', :name, '%')")
                .setParameter("name",  name)
                .getResultList();
    }
}
