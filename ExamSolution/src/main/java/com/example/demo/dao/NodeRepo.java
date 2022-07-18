package com.example.demo.dao;

import com.example.demo.pojos.Node;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeRepo extends JpaRepository<Node,Integer> {

}
