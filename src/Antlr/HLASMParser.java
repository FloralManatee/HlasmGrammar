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
		T__0=1, DIRCODE=2, CURLOC=3, RELATIVE=4, REGISTER=5, OPCODE=6, MACODE=7, 
		STRING=8, INTEGER=9, COMMENT=10, EOL=11, WHITESPACE=12;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_label = 2, RULE_whitespace = 3, RULE_instruction = 4, 
		RULE_opcode = 5, RULE_register = 6, RULE_directive = 7, RULE_relative = 8, 
		RULE_curloc = 9, RULE_dircode = 10, RULE_macro = 11, RULE_macode = 12, 
		RULE_comment = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "label", "whitespace", "instruction", "opcode", "register", 
			"directive", "relative", "curloc", "dircode", "macro", "macode", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "DIRCODE", "CURLOC", "RELATIVE", "REGISTER", "OPCODE", "MACODE", 
			"STRING", "INTEGER", "COMMENT", "EOL", "WHITESPACE"
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				line();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7620L) != 0) );
			setState(33);
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
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public MacroContext macro() {
			return getRuleContext(MacroContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(35);
				label();
				}
			}

			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(38);
					whitespace();
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPCODE:
				{
				setState(44);
				instruction();
				}
				break;
			case DIRCODE:
				{
				setState(45);
				directive();
				}
				break;
			case MACODE:
				{
				setState(46);
				macro();
				}
				break;
			case COMMENT:
			case EOL:
			case WHITESPACE:
				break;
			default:
				break;
			}
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(49);
					whitespace();
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(55);
				comment();
				}
			}

			setState(58);
			match(EOL);
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
		public TerminalNode STRING() { return getToken(HLASMParser.STRING, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(STRING);
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
	public static class WhitespaceContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(HLASMParser.WHITESPACE, 0); }
		public WhitespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whitespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterWhitespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitWhitespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitWhitespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhitespaceContext whitespace() throws RecognitionException {
		WhitespaceContext _localctx = new WhitespaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whitespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(WHITESPACE);
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
		public OpcodeContext opcode() {
			return getRuleContext(OpcodeContext.class,0);
		}
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public RelativeContext relative() {
			return getRuleContext(RelativeContext.class,0);
		}
		public CurlocContext curloc() {
			return getRuleContext(CurlocContext.class,0);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
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
		enterRule(_localctx, 8, RULE_instruction);
		try {
			int _alt;
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				opcode();
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(65);
						whitespace();
						}
						} 
					}
					setState(70);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(71);
				register();
				setState(72);
				match(T__0);
				setState(77);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REGISTER:
					{
					setState(73);
					register();
					}
					break;
				case STRING:
					{
					setState(74);
					label();
					}
					break;
				case RELATIVE:
					{
					setState(75);
					relative();
					}
					break;
				case CURLOC:
					{
					setState(76);
					curloc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				opcode();
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(80);
						whitespace();
						}
						} 
					}
					setState(85);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(86);
				register();
				setState(87);
				match(T__0);
				setState(88);
				register();
				}
				break;
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
	public static class OpcodeContext extends ParserRuleContext {
		public TerminalNode OPCODE() { return getToken(HLASMParser.OPCODE, 0); }
		public OpcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterOpcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitOpcode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitOpcode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcodeContext opcode() throws RecognitionException {
		OpcodeContext _localctx = new OpcodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_opcode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
	public static class RegisterContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(HLASMParser.REGISTER, 0); }
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_register);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(REGISTER);
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
		public DircodeContext dircode() {
			return getRuleContext(DircodeContext.class,0);
		}
		public List<CurlocContext> curloc() {
			return getRuleContexts(CurlocContext.class);
		}
		public CurlocContext curloc(int i) {
			return getRuleContext(CurlocContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(HLASMParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HLASMParser.STRING, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(HLASMParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(HLASMParser.INTEGER, i);
		}
		public List<RelativeContext> relative() {
			return getRuleContexts(RelativeContext.class);
		}
		public RelativeContext relative(int i) {
			return getRuleContext(RelativeContext.class,i);
		}
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public WhitespaceContext whitespace() {
			return getRuleContext(WhitespaceContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			dircode();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(97);
				whitespace();
				}
			}

			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(100);
				curloc();
				}
				break;
			case 2:
				{
				setState(101);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(102);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(103);
				relative();
				}
				break;
			case 5:
				{
				setState(104);
				register();
				}
				break;
			case 6:
				{
				setState(105);
				label();
				}
				break;
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(108);
				match(T__0);
				}
			}

			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(111);
				curloc();
				}
				break;
			case 2:
				{
				setState(112);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(113);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(114);
				relative();
				}
				break;
			case 5:
				{
				setState(115);
				register();
				}
				break;
			case 6:
				{
				setState(116);
				label();
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
	public static class RelativeContext extends ParserRuleContext {
		public TerminalNode RELATIVE() { return getToken(HLASMParser.RELATIVE, 0); }
		public RelativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterRelative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitRelative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitRelative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeContext relative() throws RecognitionException {
		RelativeContext _localctx = new RelativeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(RELATIVE);
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
	public static class CurlocContext extends ParserRuleContext {
		public TerminalNode CURLOC() { return getToken(HLASMParser.CURLOC, 0); }
		public CurlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterCurloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitCurloc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitCurloc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CurlocContext curloc() throws RecognitionException {
		CurlocContext _localctx = new CurlocContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_curloc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(CURLOC);
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
	public static class DircodeContext extends ParserRuleContext {
		public TerminalNode DIRCODE() { return getToken(HLASMParser.DIRCODE, 0); }
		public DircodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dircode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterDircode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitDircode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitDircode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DircodeContext dircode() throws RecognitionException {
		DircodeContext _localctx = new DircodeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dircode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(DIRCODE);
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
		public MacodeContext macode() {
			return getRuleContext(MacodeContext.class,0);
		}
		public TerminalNode STRING() { return getToken(HLASMParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(HLASMParser.INTEGER, 0); }
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
		enterRule(_localctx, 22, RULE_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			macode();
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INTEGER) ) {
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
	public static class MacodeContext extends ParserRuleContext {
		public TerminalNode MACODE() { return getToken(HLASMParser.MACODE, 0); }
		public MacodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterMacode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitMacode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitMacode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacodeContext macode() throws RecognitionException {
		MacodeContext _localctx = new MacodeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_macode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(HLASMParser.COMMENT, 0); }
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
		enterRule(_localctx, 26, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(COMMENT);
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
		"\u0004\u0001\f\u0085\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000\u000b"+
		"\u0000\f\u0000\u001f\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001%"+
		"\b\u0001\u0001\u0001\u0005\u0001(\b\u0001\n\u0001\f\u0001+\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001\u0001\u0005"+
		"\u00013\b\u0001\n\u0001\f\u00016\t\u0001\u0001\u0001\u0003\u00019\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0005\u0004C\b\u0004\n\u0004\f\u0004F\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004N\b\u0004\u0001\u0004\u0001\u0004\u0005\u0004R\b\u0004\n\u0004"+
		"\f\u0004U\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004[\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0003\u0007c\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007k\b\u0007\u0001"+
		"\u0007\u0003\u0007n\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007v\b\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0004)4DS\u0000\u000e\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0001\u0001"+
		"\u0000\b\t\u0091\u0000\u001d\u0001\u0000\u0000\u0000\u0002$\u0001\u0000"+
		"\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000"+
		"\bZ\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\f^\u0001\u0000"+
		"\u0000\u0000\u000e`\u0001\u0000\u0000\u0000\u0010w\u0001\u0000\u0000\u0000"+
		"\u0012y\u0001\u0000\u0000\u0000\u0014{\u0001\u0000\u0000\u0000\u0016}"+
		"\u0001\u0000\u0000\u0000\u0018\u0080\u0001\u0000\u0000\u0000\u001a\u0082"+
		"\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001c"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !\u0001\u0000"+
		"\u0000\u0000!\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000\u0000\u0000"+
		"#%\u0003\u0004\u0002\u0000$#\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%)\u0001\u0000\u0000\u0000&(\u0003\u0006\u0003\u0000\'&\u0001\u0000"+
		"\u0000\u0000(+\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000)\'\u0001"+
		"\u0000\u0000\u0000*/\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000"+
		",0\u0003\b\u0004\u0000-0\u0003\u000e\u0007\u0000.0\u0003\u0016\u000b\u0000"+
		"/,\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000004\u0001\u0000\u0000\u000013\u0003\u0006"+
		"\u0003\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000042\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u000079\u0003\u001a\r\u000087\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0005\u000b\u0000"+
		"\u0000;\u0003\u0001\u0000\u0000\u0000<=\u0005\b\u0000\u0000=\u0005\u0001"+
		"\u0000\u0000\u0000>?\u0005\f\u0000\u0000?\u0007\u0001\u0000\u0000\u0000"+
		"@D\u0003\n\u0005\u0000AC\u0003\u0006\u0003\u0000BA\u0001\u0000\u0000\u0000"+
		"CF\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0003\f\u0006"+
		"\u0000HM\u0005\u0001\u0000\u0000IN\u0003\f\u0006\u0000JN\u0003\u0004\u0002"+
		"\u0000KN\u0003\u0010\b\u0000LN\u0003\u0012\t\u0000MI\u0001\u0000\u0000"+
		"\u0000MJ\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000ML\u0001\u0000"+
		"\u0000\u0000N[\u0001\u0000\u0000\u0000OS\u0003\n\u0005\u0000PR\u0003\u0006"+
		"\u0003\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000VW\u0003\f\u0006\u0000WX\u0005\u0001\u0000\u0000"+
		"XY\u0003\f\u0006\u0000Y[\u0001\u0000\u0000\u0000Z@\u0001\u0000\u0000\u0000"+
		"ZO\u0001\u0000\u0000\u0000[\t\u0001\u0000\u0000\u0000\\]\u0005\u0006\u0000"+
		"\u0000]\u000b\u0001\u0000\u0000\u0000^_\u0005\u0005\u0000\u0000_\r\u0001"+
		"\u0000\u0000\u0000`b\u0003\u0014\n\u0000ac\u0003\u0006\u0003\u0000ba\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cj\u0001\u0000\u0000\u0000"+
		"dk\u0003\u0012\t\u0000ek\u0005\b\u0000\u0000fk\u0005\t\u0000\u0000gk\u0003"+
		"\u0010\b\u0000hk\u0003\f\u0006\u0000ik\u0003\u0004\u0002\u0000jd\u0001"+
		"\u0000\u0000\u0000je\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000"+
		"jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000"+
		"\u0000km\u0001\u0000\u0000\u0000ln\u0005\u0001\u0000\u0000ml\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000nu\u0001\u0000\u0000\u0000ov\u0003"+
		"\u0012\t\u0000pv\u0005\b\u0000\u0000qv\u0005\t\u0000\u0000rv\u0003\u0010"+
		"\b\u0000sv\u0003\f\u0006\u0000tv\u0003\u0004\u0002\u0000uo\u0001\u0000"+
		"\u0000\u0000up\u0001\u0000\u0000\u0000uq\u0001\u0000\u0000\u0000ur\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000v\u000f\u0001\u0000\u0000\u0000wx\u0005\u0004"+
		"\u0000\u0000x\u0011\u0001\u0000\u0000\u0000yz\u0005\u0003\u0000\u0000"+
		"z\u0013\u0001\u0000\u0000\u0000{|\u0005\u0002\u0000\u0000|\u0015\u0001"+
		"\u0000\u0000\u0000}~\u0003\u0018\f\u0000~\u007f\u0007\u0000\u0000\u0000"+
		"\u007f\u0017\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0007\u0000\u0000"+
		"\u0081\u0019\u0001\u0000\u0000\u0000\u0082\u0083\u0005\n\u0000\u0000\u0083"+
		"\u001b\u0001\u0000\u0000\u0000\u000e\u001f$)/48DMSZbjmu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}