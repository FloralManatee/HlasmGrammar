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
	 * Enter a parse tree produced by {@link HLASMParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(HLASMParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(HLASMParser.ArgumentContext ctx);
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
	 * Enter a parse tree produced by {@link HLASMParser#whitespace}.
	 * @param ctx the parse tree
	 */
	void enterWhitespace(HLASMParser.WhitespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#whitespace}.
	 * @param ctx the parse tree
	 */
	void exitWhitespace(HLASMParser.WhitespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(HLASMParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(HLASMParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#opcode}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(HLASMParser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#opcode}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(HLASMParser.OpcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(HLASMParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(HLASMParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#relative}.
	 * @param ctx the parse tree
	 */
	void enterRelative(HLASMParser.RelativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#relative}.
	 * @param ctx the parse tree
	 */
	void exitRelative(HLASMParser.RelativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#sect}.
	 * @param ctx the parse tree
	 */
	void enterSect(HLASMParser.SectContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#sect}.
	 * @param ctx the parse tree
	 */
	void exitSect(HLASMParser.SectContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#curloc}.
	 * @param ctx the parse tree
	 */
	void enterCurloc(HLASMParser.CurlocContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#curloc}.
	 * @param ctx the parse tree
	 */
	void exitCurloc(HLASMParser.CurlocContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#dircode}.
	 * @param ctx the parse tree
	 */
	void enterDircode(HLASMParser.DircodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#dircode}.
	 * @param ctx the parse tree
	 */
	void exitDircode(HLASMParser.DircodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#bracketarg}.
	 * @param ctx the parse tree
	 */
	void enterBracketarg(HLASMParser.BracketargContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#bracketarg}.
	 * @param ctx the parse tree
	 */
	void exitBracketarg(HLASMParser.BracketargContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(HLASMParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(HLASMParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#macode}.
	 * @param ctx the parse tree
	 */
	void enterMacode(HLASMParser.MacodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#macode}.
	 * @param ctx the parse tree
	 */
	void exitMacode(HLASMParser.MacodeContext ctx);
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