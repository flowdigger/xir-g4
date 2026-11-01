package org.flowdigger.ast.core.model;

public record AstRelation(String sourceClass, String roleName, String targetClass, Cardinality cardinality, RelationKind kind) {
}

