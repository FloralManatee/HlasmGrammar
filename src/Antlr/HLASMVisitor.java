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
	 * Visit a parse tree produced by {@link HLASMParser#whitespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhitespace(HLASMParser.WhitespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(HLASMParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(HLASMParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#opcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcode(HLASMParser.OpcodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister(HLASMParser.RegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(HLASMParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(HLASMParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#relative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelative(HLASMParser.RelativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#curloc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurloc(HLASMParser.CurlocContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#dircode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDircode(HLASMParser.DircodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro(HLASMParser.MacroContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(HLASMParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#macode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacode(HLASMParser.MacodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HLASMParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(HLASMParser.CommentContext ctx);
}