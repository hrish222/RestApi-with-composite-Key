package com.example.demo.controller;

import com.example.demo.pojos.NodeRelation;
import com.example.demo.service.NodeRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NodeController {
    @Autowired
    NodeRelationService nodeRelationService;
    @GetMapping("/getNodes/{nodeId}")
   public List<NodeRelation> insertData(@PathVariable int nodeId)
   {  
    	List<NodeRelation> nodes=nodeRelationService.getAllNodes(nodeId);
       return nodes;
   }

}

//OutPut no. 1:
// URL : http://localhost:8080/getNodes/2
//[
//        {
//        "nodeId1": {
//        "name": "node1",
//        "id": 1
//        },
//        "nodeId2": {
//        "name": "node2",
//        "id": 2
//        },
//        "relationshipName": "xyz"
//        }
//        ]


//Output no. 2 :-
//[
//        {
//        "nodeId1": {
//        "name": "node3",
//        "id": 3
//        },
//        "nodeId2": {
//        "name": "node3",
//        "id": 3
//        },
//        "relationshipName": "pqr"
//        },
//        {
//        "nodeId1": {
//        "name": "node3",
//        "id": 3
//        },
//        "nodeId2": {
//        "name": "node4",
//        "id": 4
//        },
//        "relationshipName": "abc"
//        },
//        {
//        "nodeId1": {
//        "name": "node3",
//        "id": 3
//        },
//        "nodeId2": {
//        "name": "node3",
//        "id": 3
//        },
//        "relationshipName": "pqr"
//        },
//        {
//        "nodeId1": {
//        "name": "node4",
//        "id": 4
//        },
//        "nodeId2": {
//        "name": "node3",
//        "id": 3
//        },
//        "relationshipName": "xyz"
//        }
//        ]

//Output no. 3 :-
//[
//        {
//        "nodeId1": {
//        "name": "node4",
//        "id": 4
//        },
//        "nodeId2": {
//        "name": "node3",
//        "id": 3
//        },
//        "relationshipName": "xyz"
//        },
//        {
//        "nodeId1": {
//        "name": "node3",
//        "id": 3
//        },
//        "nodeId2": {
//        "name": "node4",
//        "id": 4
//        },
//        "relationshipName": "abc"
//        }
//        ]
