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
		LITERAL=1, BRACKETREG=2, DIRCODE=3, SECT=4, CURLOC=5, RELATIVE=6, REGISTER=7, 
		OPCODE=8, MACODE=9, STRING=10, COMMSTRING=11, QUOTE=12, LONGCOM=13, INTEGER=14, 
		EOL=15, COMMA=16, WHITESPACE=17;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_instruction = 2, RULE_directive = 3, 
		RULE_argument = 4, RULE_macro = 5, RULE_label = 6, RULE_whitespace = 7, 
		RULE_comma = 8, RULE_opcode = 9, RULE_register = 10, RULE_relative = 11, 
		RULE_sect = 12, RULE_curloc = 13, RULE_dircode = 14, RULE_bracketreg = 15, 
		RULE_literal = 16, RULE_macode = 17, RULE_comment = 18, RULE_comment_ = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "instruction", "directive", "argument", "macro", "label", 
			"whitespace", "comma", "opcode", "register", "relative", "sect", "curloc", 
			"dircode", "bracketreg", "literal", "macode", "comment", "comment_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LITERAL", "BRACKETREG", "DIRCODE", "SECT", "CURLOC", "RELATIVE", 
			"REGISTER", "OPCODE", "MACODE", "STRING", "COMMSTRING", "QUOTE", "LONGCOM", 
			"INTEGER", "EOL", "COMMA", "WHITESPACE"
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
		public List<TerminalNode> EOL() { return getTokens(HLASMParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(HLASMParser.EOL, i);
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				line();
				setState(41);
				match(EOL);
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 141112L) != 0) );
			setState(47);
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
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
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
			int _alt;
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SECT:
				case OPCODE:
					{
					setState(49);
					instruction();
					}
					break;
				case DIRCODE:
					{
					setState(50);
					directive();
					}
					break;
				case MACODE:
					{
					setState(51);
					macro();
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
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(54);
					label();
					}
				}

				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					whitespace();
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHITESPACE );
				setState(65);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SECT:
				case OPCODE:
					{
					setState(62);
					instruction();
					}
					break;
				case DIRCODE:
					{
					setState(63);
					directive();
					}
					break;
				case MACODE:
					{
					setState(64);
					macro();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67);
					whitespace();
					}
					}
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHITESPACE );
				setState(72);
				comment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(74);
					label();
					}
				}

				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(77);
					whitespace();
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHITESPACE );
				setState(85);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SECT:
				case OPCODE:
					{
					setState(82);
					instruction();
					}
					break;
				case DIRCODE:
					{
					setState(83);
					directive();
					}
					break;
				case MACODE:
					{
					setState(84);
					macro();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(88); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(87);
						whitespace();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(90); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(92);
				comment_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(94);
					label();
					}
				}

				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					whitespace();
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHITESPACE );
				setState(105);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SECT:
				case OPCODE:
					{
					setState(102);
					instruction();
					}
					break;
				case DIRCODE:
					{
					setState(103);
					directive();
					}
					break;
				case MACODE:
					{
					setState(104);
					macro();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(107);
					whitespace();
					}
					}
					setState(110); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHITESPACE );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(112);
					label();
					}
				}

				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(115);
					whitespace();
					}
					}
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHITESPACE );
				setState(123);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SECT:
				case OPCODE:
					{
					setState(120);
					instruction();
					}
					break;
				case DIRCODE:
					{
					setState(121);
					directive();
					}
					break;
				case MACODE:
					{
					setState(122);
					macro();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				comment();
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
	public static class InstructionContext extends ParserRuleContext {
		public OpcodeContext opcode() {
			return getRuleContext(OpcodeContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public SectContext sect() {
			return getRuleContext(SectContext.class,0);
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
		enterRule(_localctx, 4, RULE_instruction);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPCODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				opcode();
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					whitespace();
					}
					}
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHITESPACE );
				setState(134);
				argument();
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(135);
					comma();
					}
					break;
				}
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(138);
					argument();
					}
					break;
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(141);
					comma();
					}
				}

				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1186L) != 0)) {
					{
					setState(144);
					argument();
					}
				}

				}
				break;
			case SECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				sect();
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
	public static class DirectiveContext extends ParserRuleContext {
		public DircodeContext dircode() {
			return getRuleContext(DircodeContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
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
		enterRule(_localctx, 6, RULE_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			dircode();
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				whitespace();
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(156);
			argument();
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(157);
				comma();
				}
				break;
			}
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(160);
				argument();
				}
				break;
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(163);
				comma();
				}
			}

			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1186L) != 0)) {
				{
				setState(166);
				argument();
				}
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
	public static class ArgumentContext extends ParserRuleContext {
		public CurlocContext curloc() {
			return getRuleContext(CurlocContext.class,0);
		}
		public RelativeContext relative() {
			return getRuleContext(RelativeContext.class,0);
		}
		public BracketregContext bracketreg() {
			return getRuleContext(BracketregContext.class,0);
		}
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argument);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURLOC:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				curloc();
				setState(172);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RELATIVE:
					{
					setState(170);
					relative();
					}
					break;
				case BRACKETREG:
					{
					setState(171);
					bracketreg();
					}
					break;
				case LITERAL:
				case CURLOC:
				case REGISTER:
				case STRING:
				case EOL:
				case COMMA:
				case WHITESPACE:
					break;
				default:
					break;
				}
				}
				break;
			case REGISTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				register();
				setState(177);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RELATIVE:
					{
					setState(175);
					relative();
					}
					break;
				case BRACKETREG:
					{
					setState(176);
					bracketreg();
					}
					break;
				case LITERAL:
				case CURLOC:
				case REGISTER:
				case STRING:
				case EOL:
				case COMMA:
				case WHITESPACE:
					break;
				default:
					break;
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				label();
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RELATIVE:
					{
					setState(180);
					relative();
					}
					break;
				case BRACKETREG:
					{
					setState(181);
					bracketreg();
					}
					break;
				case LITERAL:
				case CURLOC:
				case REGISTER:
				case STRING:
				case EOL:
				case COMMA:
				case WHITESPACE:
					break;
				default:
					break;
				}
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				literal();
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
	public static class MacroContext extends ParserRuleContext {
		public MacodeContext macode() {
			return getRuleContext(MacodeContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public List<WhitespaceContext> whitespace() {
			return getRuleContexts(WhitespaceContext.class);
		}
		public WhitespaceContext whitespace(int i) {
			return getRuleContext(WhitespaceContext.class,i);
		}
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
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				macode();
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(188);
					whitespace();
					}
					}
					setState(191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHITESPACE );
				setState(195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LITERAL:
					{
					setState(193);
					literal();
					}
					break;
				case STRING:
					{
					setState(194);
					label();
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
				setState(197);
				macode();
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
		enterRule(_localctx, 12, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		enterRule(_localctx, 14, RULE_whitespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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
	public static class CommaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(HLASMParser.COMMA, 0); }
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(COMMA);
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
		enterRule(_localctx, 18, RULE_opcode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
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
		enterRule(_localctx, 20, RULE_register);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
		enterRule(_localctx, 22, RULE_relative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
	public static class SectContext extends ParserRuleContext {
		public TerminalNode SECT() { return getToken(HLASMParser.SECT, 0); }
		public SectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterSect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitSect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitSect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectContext sect() throws RecognitionException {
		SectContext _localctx = new SectContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(SECT);
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
		enterRule(_localctx, 26, RULE_curloc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		enterRule(_localctx, 28, RULE_dircode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
	public static class BracketregContext extends ParserRuleContext {
		public TerminalNode BRACKETREG() { return getToken(HLASMParser.BRACKETREG, 0); }
		public BracketregContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketreg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterBracketreg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitBracketreg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitBracketreg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketregContext bracketreg() throws RecognitionException {
		BracketregContext _localctx = new BracketregContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bracketreg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(BRACKETREG);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(HLASMParser.LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HLASMVisitor ) return ((HLASMVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(LITERAL);
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
		enterRule(_localctx, 34, RULE_macode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		public TerminalNode LONGCOM() { return getToken(HLASMParser.LONGCOM, 0); }
		public TerminalNode CURLOC() { return getToken(HLASMParser.CURLOC, 0); }
		public List<TerminalNode> EOL() { return getTokens(HLASMParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(HLASMParser.EOL, i);
		}
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
		enterRule(_localctx, 36, RULE_comment);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LONGCOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(LONGCOM);
				}
				break;
			case CURLOC:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(CURLOC);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 229374L) != 0)) {
					{
					{
					setState(226);
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
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class Comment_Context extends ParserRuleContext {
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
		enterRule(_localctx, 38, RULE_comment_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 229374L) != 0)) {
				{
				{
				setState(234);
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
				setState(239);
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
		"\u0004\u0001\u0011\u00f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0004"+
		"\u0000,\b\u0000\u000b\u0000\f\u0000-\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00015\b\u0001\u0001\u0001\u0003\u0001"+
		"8\b\u0001\u0001\u0001\u0004\u0001;\b\u0001\u000b\u0001\f\u0001<\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0001\u0004"+
		"\u0001E\b\u0001\u000b\u0001\f\u0001F\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001L\b\u0001\u0001\u0001\u0004\u0001O\b\u0001\u000b\u0001\f\u0001"+
		"P\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001V\b\u0001\u0001\u0001"+
		"\u0004\u0001Y\b\u0001\u000b\u0001\f\u0001Z\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001`\b\u0001\u0001\u0001\u0004\u0001c\b\u0001\u000b\u0001"+
		"\f\u0001d\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001j\b\u0001\u0001"+
		"\u0001\u0004\u0001m\b\u0001\u000b\u0001\f\u0001n\u0001\u0001\u0003\u0001"+
		"r\b\u0001\u0001\u0001\u0004\u0001u\b\u0001\u000b\u0001\f\u0001v\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001|\b\u0001\u0001\u0001\u0003"+
		"\u0001\u007f\b\u0001\u0001\u0002\u0001\u0002\u0004\u0002\u0083\b\u0002"+
		"\u000b\u0002\f\u0002\u0084\u0001\u0002\u0001\u0002\u0003\u0002\u0089\b"+
		"\u0002\u0001\u0002\u0003\u0002\u008c\b\u0002\u0001\u0002\u0003\u0002\u008f"+
		"\b\u0002\u0001\u0002\u0003\u0002\u0092\b\u0002\u0001\u0002\u0003\u0002"+
		"\u0095\b\u0002\u0001\u0003\u0001\u0003\u0004\u0003\u0099\b\u0003\u000b"+
		"\u0003\f\u0003\u009a\u0001\u0003\u0001\u0003\u0003\u0003\u009f\b\u0003"+
		"\u0001\u0003\u0003\u0003\u00a2\b\u0003\u0001\u0003\u0003\u0003\u00a5\b"+
		"\u0003\u0001\u0003\u0003\u0003\u00a8\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00ad\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00b2\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00b7"+
		"\b\u0004\u0001\u0004\u0003\u0004\u00ba\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0004\u0005\u00be\b\u0005\u000b\u0005\f\u0005\u00bf\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00c4\b\u0005\u0001\u0005\u0003\u0005\u00c7\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00e4\b\u0012\n\u0012\f\u0012\u00e7\t\u0012\u0003\u0012\u00e9"+
		"\b\u0012\u0001\u0013\u0005\u0013\u00ec\b\u0013\n\u0013\f\u0013\u00ef\t"+
		"\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0001\u0001"+
		"\u0000\u000f\u000f\u0111\u0000+\u0001\u0000\u0000\u0000\u0002~\u0001\u0000"+
		"\u0000\u0000\u0004\u0094\u0001\u0000\u0000\u0000\u0006\u0096\u0001\u0000"+
		"\u0000\u0000\b\u00b9\u0001\u0000\u0000\u0000\n\u00c6\u0001\u0000\u0000"+
		"\u0000\f\u00c8\u0001\u0000\u0000\u0000\u000e\u00ca\u0001\u0000\u0000\u0000"+
		"\u0010\u00cc\u0001\u0000\u0000\u0000\u0012\u00ce\u0001\u0000\u0000\u0000"+
		"\u0014\u00d0\u0001\u0000\u0000\u0000\u0016\u00d2\u0001\u0000\u0000\u0000"+
		"\u0018\u00d4\u0001\u0000\u0000\u0000\u001a\u00d6\u0001\u0000\u0000\u0000"+
		"\u001c\u00d8\u0001\u0000\u0000\u0000\u001e\u00da\u0001\u0000\u0000\u0000"+
		" \u00dc\u0001\u0000\u0000\u0000\"\u00de\u0001\u0000\u0000\u0000$\u00e8"+
		"\u0001\u0000\u0000\u0000&\u00ed\u0001\u0000\u0000\u0000()\u0003\u0002"+
		"\u0001\u0000)*\u0005\u000f\u0000\u0000*,\u0001\u0000\u0000\u0000+(\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0005\u0000\u0000"+
		"\u00010\u0001\u0001\u0000\u0000\u000015\u0003\u0004\u0002\u000025\u0003"+
		"\u0006\u0003\u000035\u0003\n\u0005\u000041\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000043\u0001\u0000\u0000\u00005\u007f\u0001\u0000\u0000"+
		"\u000068\u0003\f\u0006\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u00008:\u0001\u0000\u0000\u00009;\u0003\u000e\u0007\u0000:9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=A\u0001\u0000\u0000\u0000>B\u0003\u0004\u0002\u0000"+
		"?B\u0003\u0006\u0003\u0000@B\u0003\n\u0005\u0000A>\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000"+
		"\u0000CE\u0003\u000e\u0007\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HI\u0003$\u0012\u0000I\u007f\u0001\u0000\u0000\u0000"+
		"JL\u0003\f\u0006\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LN\u0001\u0000\u0000\u0000MO\u0003\u000e\u0007\u0000NM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QU\u0001\u0000\u0000\u0000RV\u0003\u0004\u0002\u0000SV\u0003"+
		"\u0006\u0003\u0000TV\u0003\n\u0005\u0000UR\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000"+
		"WY\u0003\u000e\u0007\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\]\u0003&\u0013\u0000]\u007f\u0001\u0000\u0000\u0000^`\u0003"+
		"\f\u0006\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001"+
		"\u0000\u0000\u0000ac\u0003\u000e\u0007\u0000ba\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ei\u0001\u0000\u0000\u0000fj\u0003\u0004\u0002\u0000gj\u0003\u0006"+
		"\u0003\u0000hj\u0003\n\u0005\u0000if\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000km\u0003"+
		"\u000e\u0007\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u007f\u0001\u0000"+
		"\u0000\u0000pr\u0003\f\u0006\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rt\u0001\u0000\u0000\u0000su\u0003\u000e\u0007\u0000ts\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000w{\u0001\u0000\u0000\u0000x|\u0003\u0004\u0002"+
		"\u0000y|\u0003\u0006\u0003\u0000z|\u0003\n\u0005\u0000{x\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}\u007f\u0003$\u0012\u0000~4\u0001\u0000\u0000\u0000"+
		"~7\u0001\u0000\u0000\u0000~K\u0001\u0000\u0000\u0000~_\u0001\u0000\u0000"+
		"\u0000~q\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0003"+
		"\u0001\u0000\u0000\u0000\u0080\u0082\u0003\u0012\t\u0000\u0081\u0083\u0003"+
		"\u000e\u0007\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0003"+
		"\b\u0004\u0000\u0087\u0089\u0003\u0010\b\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000"+
		"\u0000\u0000\u008a\u008c\u0003\b\u0004\u0000\u008b\u008a\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000"+
		"\u0000\u008d\u008f\u0003\u0010\b\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000"+
		"\u0090\u0092\u0003\b\u0004\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093"+
		"\u0095\u0003\u0018\f\u0000\u0094\u0080\u0001\u0000\u0000\u0000\u0094\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0005\u0001\u0000\u0000\u0000\u0096\u0098"+
		"\u0003\u001c\u000e\u0000\u0097\u0099\u0003\u000e\u0007\u0000\u0098\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u0003\b\u0004\u0000\u009d\u009f\u0003"+
		"\u0010\b\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003\b\u0004"+
		"\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a5\u0003\u0010\b\u0000"+
		"\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a8\u0003\b\u0004\u0000\u00a7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u0007\u0001\u0000\u0000\u0000\u00a9\u00ac\u0003\u001a\r\u0000\u00aa\u00ad"+
		"\u0003\u0016\u000b\u0000\u00ab\u00ad\u0003\u001e\u000f\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ba\u0001\u0000\u0000\u0000\u00ae\u00b1"+
		"\u0003\u0014\n\u0000\u00af\u00b2\u0003\u0016\u000b\u0000\u00b0\u00b2\u0003"+
		"\u001e\u000f\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b6\u0003\f\u0006\u0000\u00b4\u00b7\u0003\u0016"+
		"\u000b\u0000\u00b5\u00b7\u0003\u001e\u000f\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00ba\u0003 \u0010"+
		"\u0000\u00b9\u00a9\u0001\u0000\u0000\u0000\u00b9\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b3\u0001\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000"+
		"\u0000\u00ba\t\u0001\u0000\u0000\u0000\u00bb\u00bd\u0003\"\u0011\u0000"+
		"\u00bc\u00be\u0003\u000e\u0007\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c4\u0003 \u0010\u0000\u00c2\u00c4\u0003\f\u0006\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c7\u0003\"\u0011\u0000\u00c6\u00bb"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u000b"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\n\u0000\u0000\u00c9\r\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0005\u0011\u0000\u0000\u00cb\u000f\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005\u0010\u0000\u0000\u00cd\u0011\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0005\b\u0000\u0000\u00cf\u0013\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0005\u0007\u0000\u0000\u00d1\u0015\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0005\u0006\u0000\u0000\u00d3\u0017\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0005\u0004\u0000\u0000\u00d5\u0019\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0005\u0005\u0000\u0000\u00d7\u001b\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0005\u0003\u0000\u0000\u00d9\u001d\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0005\u0002\u0000\u0000\u00db\u001f\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0005\u0001\u0000\u0000\u00dd!\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0005\t\u0000\u0000\u00df#\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e9\u0005\r\u0000\u0000\u00e1\u00e5\u0005\u0005\u0000\u0000\u00e2"+
		"\u00e4\b\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e0\u0001\u0000\u0000\u0000\u00e8\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e9%\u0001\u0000\u0000\u0000\u00ea\u00ec\b"+
		"\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\'\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000"+
		"\u0000\u0000\'-47<AFKPUZ_dinqv{~\u0084\u0088\u008b\u008e\u0091\u0094\u009a"+
		"\u009e\u00a1\u00a4\u00a7\u00ac\u00b1\u00b6\u00b9\u00bf\u00c3\u00c6\u00e5"+
		"\u00e8\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}