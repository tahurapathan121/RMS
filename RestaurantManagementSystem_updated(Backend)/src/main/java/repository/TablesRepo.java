package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Tables;

public interface TablesRepo extends JpaRepository<Tables, Integer> 
{
    // You can add custom query methods if needed
}

