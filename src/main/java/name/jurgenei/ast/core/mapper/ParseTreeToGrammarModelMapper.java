package org.flowdigger.ast.core.mapper;

import org.flowdigger.ast.core.model.GrammarModel;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Maps ANTLR parse tree into normalized grammar model.
 */
public interface ParseTreeToGrammarModelMapper<T extends ParseTree> {
    GrammarModel map(T parseTree);
}

