package com.example.demo.dao;

import com.example.demo.pojos.Node;
import com.example.demo.pojos.NodeRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NodeRelationRepo extends JpaRepository<NodeRelation,Integer> {
    List<NodeRelation> findBynodeId1(Optional<Node> nodeId);
    List<NodeRelation> findBynodeId2(Optional<Node> nodeId);


}


