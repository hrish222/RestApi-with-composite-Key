package com.example.demo.service;

import com.example.demo.dao.NodeRelationRepo;
import com.example.demo.dao.NodeRepo;
import com.example.demo.pojos.Node;
import com.example.demo.pojos.NodeRelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NodeRelationService {
    @Autowired
    NodeRelationRepo nodeRelationRepo;
    @Autowired
    NodeRepo nodeRepo;
    public List<NodeRelation> getAllNodes(int nodeId) {
       Optional<Node> node1=nodeRepo.findById(nodeId);

       List<NodeRelation> nR1=nodeRelationRepo.findBynodeId1(node1);
        List<NodeRelation> nR2=nodeRelationRepo.findBynodeId2(node1);
        nR1.addAll(nR2);
         return nR1;
    }
}
