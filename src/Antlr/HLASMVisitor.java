// Generated from HLASM.g4 by ANTLR 4.13.2
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HLASMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HLASMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HLASMParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(HLASMParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(HLASMParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(HLASMParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(HLASMParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(HLASMParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro(HLASMParser.MacroContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#operands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperands(HLASMParser.OperandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(HLASMParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#comment_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_(HLASMParser.Comment_Context ctx);
}