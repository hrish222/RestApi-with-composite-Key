package com.example.demo.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@IdClass(NodeKey.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NodeRelation {
    @Id
    @ManyToOne
    private Node nodeId1;
    @Id
    @ManyToOne
    private Node nodeId2;

    private String relationshipName;

}
