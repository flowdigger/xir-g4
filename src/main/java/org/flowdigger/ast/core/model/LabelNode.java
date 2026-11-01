package org.flowdigger.ast.core.model;

public record LabelNode(String label, GrammarNode node) implements GrammarNode {
}

