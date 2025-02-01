// Generated from HLASM.g4 by ANTLR 4.13.2
package Antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HLASMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DIRCODE=1, SECT=2, ASTER=3, RELATIVE=4, REGISTER=5, OPCODE=6, MACODE=7, 
		PARMS=8, QUOTE=9, ALPHA=10, SYMBOL=11, INT=12, EOL=13, COMMA=14, WHITESPACE=15;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_label = 2, RULE_instruction = 3, RULE_directive = 4, 
		RULE_macro = 5, RULE_operands = 6, RULE_comment = 7, RULE_comment_ = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "label", "instruction", "directive", "macro", "operands", 
			"comment", "comment_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DIRCODE", "SECT", "ASTER", "RELATIVE", "REGISTER", "OPCODE", "MACODE", 
			"PARMS", "QUOTE", "ALPHA", "SYMBOL", "INT", "EOL", "COMMA", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HLASM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HLASMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HLASMParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				line();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 33998L) != 0) );
			setState(23);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(HLASMParser.EOL, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public MacroContext macro() {
			return getRuleContext(MacroContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(HLASMParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(HLASMParser.WHITESPACE, i);
		}
		public OperandsContext operands() {
			return getRuleContext(OperandsContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Comment_Context comment_() {
			return getRuleContext(Comment_Context.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRCODE:
			case SECT:
			case OPCODE:
			case MACODE:
			case ALPHA:
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALPHA) {
					{
					setState(25);
					label();
					}
				}

				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(28);
					match(WHITESPACE);
					}
				}

				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPCODE:
					{
					setState(31);
					instruction();
					}
					break;
				case DIRCODE:
				case SECT:
					{
					setState(32);
					directive();
					}
					break;
				case MACODE:
					{
					setState(33);
					macro();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(36);
					match(WHITESPACE);
					}
					break;
				}
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(39);
					operands();
					}
					break;
				}
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(42);
					match(WHITESPACE);
					}
					break;
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 57342L) != 0)) {
					{
					setState(45);
					comment();
					}
				}

				setState(48);
				match(EOL);
				}
				break;
			case ASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				comment_();
				setState(51);
				match(EOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA() { return getTokens(HLASMParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(HLASMParser.ALPHA, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(HLASMParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(HLASMParser.SYMBOL, i);
		}
		public List<TerminalNode> INT() { return getTokens(HLASMParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(HLASMParser.INT, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ALPHA);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) {
				{
				{
				setState(56);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode OPCODE() { return getToken(HLASMParser.OPCODE, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(OPCODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveContext extends ParserRuleContext {
		public TerminalNode DIRCODE() { return getToken(HLASMParser.DIRCODE, 0); }
		public TerminalNode SECT() { return getToken(HLASMParser.SECT, 0); }
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==DIRCODE || _la==SECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MacroContext extends ParserRuleContext {
		public TerminalNode MACODE() { return getToken(HLASMParser.MACODE, 0); }
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitMacro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitMacro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_macro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(MACODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperandsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(HLASMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HLASMParser.COMMA, i);
		}
		public List<TerminalNode> RELATIVE() { return getTokens(HLASMParser.RELATIVE); }
		public TerminalNode RELATIVE(int i) {
			return getToken(HLASMParser.RELATIVE, i);
		}
		public List<TerminalNode> PARMS() { return getTokens(HLASMParser.PARMS); }
		public TerminalNode PARMS(int i) {
			return getToken(HLASMParser.PARMS, i);
		}
		public List<TerminalNode> REGISTER() { return getTokens(HLASMParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(HLASMParser.REGISTER, i);
		}
		public List<TerminalNode> ASTER() { return getTokens(HLASMParser.ASTER); }
		public TerminalNode ASTER(int i) {
			return getToken(HLASMParser.ASTER, i);
		}
		public List<TerminalNode> ALPHA() { return getTokens(HLASMParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(HLASMParser.ALPHA, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(HLASMParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(HLASMParser.SYMBOL, i);
		}
		public List<TerminalNode> INT() { return getTokens(HLASMParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(HLASMParser.INT, i);
		}
		public OperandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterOperands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitOperands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitOperands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandsContext operands() throws RecognitionException {
		OperandsContext _localctx = new OperandsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operands);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTER:
				{
				{
				setState(68);
				match(REGISTER);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RELATIVE) {
					{
					setState(69);
					match(RELATIVE);
					}
				}

				}
				}
				break;
			case ALPHA:
				{
				{
				{
				setState(72);
				match(ALPHA);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) {
					{
					{
					setState(73);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RELATIVE) {
					{
					setState(79);
					match(RELATIVE);
					}
				}

				}
				}
				break;
			case ASTER:
				{
				{
				setState(82);
				match(ASTER);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RELATIVE) {
					{
					setState(83);
					match(RELATIVE);
					}
				}

				}
				}
				break;
			case RELATIVE:
				{
				setState(86);
				match(RELATIVE);
				}
				break;
			case PARMS:
				{
				setState(87);
				match(PARMS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(90);
			match(COMMA);
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTER:
				{
				{
				setState(91);
				match(REGISTER);
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(92);
					match(RELATIVE);
					}
					break;
				}
				}
				}
				break;
			case ALPHA:
				{
				{
				{
				setState(95);
				match(ALPHA);
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(96);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(102);
					match(RELATIVE);
					}
					break;
				}
				}
				}
				break;
			case ASTER:
				{
				{
				setState(105);
				match(ASTER);
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(106);
					match(RELATIVE);
					}
					break;
				}
				}
				}
				break;
			case RELATIVE:
				{
				setState(109);
				match(RELATIVE);
				}
				break;
			case PARMS:
				{
				setState(110);
				match(PARMS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(113);
				match(COMMA);
				}
				break;
			}
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				{
				setState(116);
				match(REGISTER);
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(117);
					match(RELATIVE);
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				{
				{
				setState(120);
				match(ALPHA);
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(121);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(127);
					match(RELATIVE);
					}
					break;
				}
				}
				}
				break;
			case 3:
				{
				{
				setState(130);
				match(ASTER);
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(131);
					match(RELATIVE);
					}
					break;
				}
				}
				}
				break;
			case 4:
				{
				setState(134);
				match(RELATIVE);
				}
				break;
			case 5:
				{
				setState(135);
				match(PARMS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(HLASMParser.EOL, 0); }
		public TerminalNode ASTER() { return getToken(HLASMParser.ASTER, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(138);
				match(ASTER);
				}
				break;
			}
			setState(141);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==EOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comment_Context extends ParserRuleContext {
		public List<TerminalNode> ASTER() { return getTokens(HLASMParser.ASTER); }
		public TerminalNode ASTER(int i) {
			return getToken(HLASMParser.ASTER, i);
		}
		public List<TerminalNode> EOL() { return getTokens(HLASMParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(HLASMParser.EOL, i);
		}
		public Comment_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterComment_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitComment_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitComment_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comment_Context comment_() throws RecognitionException {
		Comment_Context _localctx = new Comment_Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_comment_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(143);
					match(ASTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(146); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 57342L) != 0)) {
				{
				{
				setState(148);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==EOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000f\u009b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000"+
		"\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001"+
		"\u0001\u0003\u0001\u001e\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001#\b\u0001\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0003\u0001"+
		")\b\u0001\u0001\u0001\u0003\u0001,\b\u0001\u0001\u0001\u0003\u0001/\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00016\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002:\b\u0002\n\u0002\f"+
		"\u0002=\t\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006G\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006K\b\u0006\n\u0006\f\u0006N\t\u0006\u0001"+
		"\u0006\u0003\u0006Q\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006U\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006Y\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006^\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"b\b\u0006\n\u0006\f\u0006e\t\u0006\u0001\u0006\u0003\u0006h\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006l\b\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006p\b\u0006\u0001\u0006\u0003\u0006s\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006w\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006{\b\u0006\n\u0006"+
		"\f\u0006~\t\u0006\u0001\u0006\u0003\u0006\u0081\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0085\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0089"+
		"\b\u0006\u0001\u0007\u0003\u0007\u008c\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0004\b\u0091\b\b\u000b\b\f\b\u0092\u0001\b\u0005\b\u0096\b\b"+
		"\n\b\f\b\u0099\t\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0000\u0003\u0001\u0000\n\f\u0001\u0000\u0001\u0002\u0001"+
		"\u0000\r\r\u00b9\u0000\u0013\u0001\u0000\u0000\u0000\u00025\u0001\u0000"+
		"\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000"+
		"\b@\u0001\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fX\u0001\u0000"+
		"\u0000\u0000\u000e\u008b\u0001\u0000\u0000\u0000\u0010\u0090\u0001\u0000"+
		"\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000"+
		"\u0000\u0000\u0019\u001b\u0003\u0004\u0002\u0000\u001a\u0019\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001d\u0001\u0000"+
		"\u0000\u0000\u001c\u001e\u0005\u000f\u0000\u0000\u001d\u001c\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\"\u0001\u0000\u0000"+
		"\u0000\u001f#\u0003\u0006\u0003\u0000 #\u0003\b\u0004\u0000!#\u0003\n"+
		"\u0005\u0000\"\u001f\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"\"!\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000$&\u0005\u000f\u0000"+
		"\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000"+
		"\u0000\u0000\')\u0003\f\u0006\u0000(\'\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*,\u0005\u000f\u0000\u0000"+
		"+*\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000"+
		"\u0000-/\u0003\u000e\u0007\u0000.-\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u000001\u0005\r\u0000\u000016\u0001\u0000"+
		"\u0000\u000023\u0003\u0010\b\u000034\u0005\r\u0000\u000046\u0001\u0000"+
		"\u0000\u00005\u001a\u0001\u0000\u0000\u000052\u0001\u0000\u0000\u0000"+
		"6\u0003\u0001\u0000\u0000\u00007;\u0005\n\u0000\u00008:\u0007\u0000\u0000"+
		"\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000>?\u0005\u0006\u0000\u0000?\u0007\u0001\u0000"+
		"\u0000\u0000@A\u0007\u0001\u0000\u0000A\t\u0001\u0000\u0000\u0000BC\u0005"+
		"\u0007\u0000\u0000C\u000b\u0001\u0000\u0000\u0000DF\u0005\u0005\u0000"+
		"\u0000EG\u0005\u0004\u0000\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GY\u0001\u0000\u0000\u0000HL\u0005\n\u0000\u0000IK\u0007\u0000"+
		"\u0000\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OQ\u0005\u0004\u0000\u0000PO\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QY\u0001\u0000\u0000\u0000RT\u0005\u0003"+
		"\u0000\u0000SU\u0005\u0004\u0000\u0000TS\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UY\u0001\u0000\u0000\u0000VY\u0005\u0004\u0000\u0000"+
		"WY\u0005\b\u0000\u0000XD\u0001\u0000\u0000\u0000XH\u0001\u0000\u0000\u0000"+
		"XR\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Zo\u0005\u000e\u0000\u0000[]\u0005\u0005"+
		"\u0000\u0000\\^\u0005\u0004\u0000\u0000]\\\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^p\u0001\u0000\u0000\u0000_c\u0005\n\u0000\u0000`b\u0007"+
		"\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000fh\u0005\u0004\u0000\u0000gf\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hp\u0001\u0000\u0000\u0000ik\u0005"+
		"\u0003\u0000\u0000jl\u0005\u0004\u0000\u0000kj\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lp\u0001\u0000\u0000\u0000mp\u0005\u0004\u0000"+
		"\u0000np\u0005\b\u0000\u0000o[\u0001\u0000\u0000\u0000o_\u0001\u0000\u0000"+
		"\u0000oi\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000pr\u0001\u0000\u0000\u0000qs\u0005\u000e\u0000\u0000rq\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u0088\u0001\u0000\u0000"+
		"\u0000tv\u0005\u0005\u0000\u0000uw\u0005\u0004\u0000\u0000vu\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0089\u0001\u0000\u0000\u0000"+
		"x|\u0005\n\u0000\u0000y{\u0007\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000"+
		"{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"\u0081\u0005\u0004\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u0089\u0001\u0000\u0000\u0000\u0082"+
		"\u0084\u0005\u0003\u0000\u0000\u0083\u0085\u0005\u0004\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u0089\u0001\u0000\u0000\u0000\u0086\u0089\u0005\u0004\u0000\u0000\u0087"+
		"\u0089\u0005\b\u0000\u0000\u0088t\u0001\u0000\u0000\u0000\u0088x\u0001"+
		"\u0000\u0000\u0000\u0088\u0082\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\r\u0001\u0000\u0000\u0000\u008a\u008c\u0005\u0003"+
		"\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\b\u0002\u0000"+
		"\u0000\u008e\u000f\u0001\u0000\u0000\u0000\u008f\u0091\u0005\u0003\u0000"+
		"\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u0097\u0001\u0000\u0000\u0000\u0094\u0096\b\u0002\u0000\u0000"+
		"\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u0011\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u001d\u0015\u001a\u001d\"%(+.5;FLPTX]cgkorv|\u0080\u0084\u0088\u008b"+
		"\u0092\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}