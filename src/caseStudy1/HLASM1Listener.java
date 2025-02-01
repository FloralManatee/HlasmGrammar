// Generated from HLASM1.g4 by ANTLR 4.13.2
package caseStudy1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HLASM1Parser}.
 */
public interface HLASM1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HLASM1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(HLASM1Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASM1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(HLASM1Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASM1Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(HLASM1Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASM1Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(HLASM1Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASM1Parser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(HLASM1Parser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASM1Parser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(HLASM1Parser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASM1Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(HLASM1Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASM1Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(HLASM1Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASM1Parser#parms}.
	 * @param ctx the parse tree
	 */
	void enterParms(HLASM1Parser.ParmsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASM1Parser#parms}.
	 * @param ctx the parse tree
	 */
	void exitParms(HLASM1Parser.ParmsContext ctx);
}