// Generated from C:/Users/ajackson/Documents/GitHub/HlasmGrammar/src/caseStudy1/HLASM1Parser.g4 by ANTLR 4.13.1
package caseStudy1;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HLASM1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HLASM1ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HLASM1Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(HLASM1Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASM1Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(HLASM1Parser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASM1Parser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(HLASM1Parser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASM1Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(HLASM1Parser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASM1Parser#macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro(HLASM1Parser.MacroContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASM1Parser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(HLASM1Parser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASM1Parser#parms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParms(HLASM1Parser.ParmsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASM1Parser#moperands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoperands(HLASM1Parser.MoperandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASM1Parser#ooperands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOoperands(HLASM1Parser.OoperandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASM1Parser#register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister(HLASM1Parser.RegisterContext ctx);
}