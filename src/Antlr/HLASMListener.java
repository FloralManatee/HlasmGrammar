// Generated from HLASM.g4 by ANTLR 4.13.2
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HLASMParser}.
 */
public interface HLASMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HLASMParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(HLASMParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(HLASMParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(HLASMParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(HLASMParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(HLASMParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(HLASMParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(HLASMParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(HLASMParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(HLASMParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(HLASMParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#macro}.
	 * @param ctx the parse tree
	 */
	void enterMacro(HLASMParser.MacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#macro}.
	 * @param ctx the parse tree
	 */
	void exitMacro(HLASMParser.MacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#operands}.
	 * @param ctx the parse tree
	 */
	void enterOperands(HLASMParser.OperandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#operands}.
	 * @param ctx the parse tree
	 */
	void exitOperands(HLASMParser.OperandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(HLASMParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(HLASMParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#comment_}.
	 * @param ctx the parse tree
	 */
	void enterComment_(HLASMParser.Comment_Context ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#comment_}.
	 * @param ctx the parse tree
	 */
	void exitComment_(HLASMParser.Comment_Context ctx);
}