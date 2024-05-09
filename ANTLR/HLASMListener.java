// Generated from HLASM.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link HLASMParser#register_}.
	 * @param ctx the parse tree
	 */
	void enterRegister_(HLASMParser.Register_Context ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#register_}.
	 * @param ctx the parse tree
	 */
	void exitRegister_(HLASMParser.Register_Context ctx);
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
	 * Enter a parse tree produced by {@link HLASMParser#assemblerdirective}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerdirective(HLASMParser.AssemblerdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#assemblerdirective}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerdirective(HLASMParser.AssemblerdirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#lbl}.
	 * @param ctx the parse tree
	 */
	void enterLbl(HLASMParser.LblContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#lbl}.
	 * @param ctx the parse tree
	 */
	void exitLbl(HLASMParser.LblContext ctx);
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
	 * Enter a parse tree produced by {@link HLASMParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(HLASMParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(HLASMParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(HLASMParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(HLASMParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HLASMParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(HLASMParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HLASMParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(HLASMParser.NumberContext ctx);
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
}