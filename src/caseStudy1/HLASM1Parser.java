// Generated from HLASM1.g4 by ANTLR 4.13.2
package caseStudy1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HLASM1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INSTRUCTION=3, MACRO=4, OPCODE=5, STRING=6, DYNCLENTH=7, 
		STORAGE=8, CLENGTH=9, PARMS=10, MPARM=11, EQUREGISTER=12, DISPLACEMENT=13, 
		LABEL=14, CHAR=15, REGISTER=16, NUM=17, SPEC=18, WHITESPACE=19, EOL=20, 
		LBRACKET=21, RBRACKET=22, ASTER=23, APOS=24;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_label = 2, RULE_instruction = 3, RULE_macro = 4, 
		RULE_operation = 5, RULE_parms = 6, RULE_moperands = 7, RULE_ooperands = 8, 
		RULE_register = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "label", "instruction", "macro", "operation", "parms", 
			"moperands", "ooperands", "register"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'='", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'('", "')'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "INSTRUCTION", "MACRO", "OPCODE", "STRING", "DYNCLENTH", 
			"STORAGE", "CLENGTH", "PARMS", "MPARM", "EQUREGISTER", "DISPLACEMENT", 
			"LABEL", "CHAR", "REGISTER", "NUM", "SPEC", "WHITESPACE", "EOL", "LBRACKET", 
			"RBRACKET", "ASTER", "APOS"
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
	public String getGrammarFileName() { return "HLASM1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HLASM1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HLASM1Parser.EOF, 0); }
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
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				line();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16440L) != 0) );
			setState(25);
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
		public TerminalNode EOL() { return getToken(HLASM1Parser.EOL, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public MacroContext macro() {
			return getRuleContext(MacroContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL) {
				{
				setState(27);
				label();
				}
			}

			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSTRUCTION:
				{
				setState(30);
				instruction();
				}
				break;
			case MACRO:
				{
				setState(31);
				macro();
				}
				break;
			case OPCODE:
				{
				setState(32);
				operation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(35);
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
		public TerminalNode LABEL() { return getToken(HLASM1Parser.LABEL, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(LABEL);
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
		public TerminalNode INSTRUCTION() { return getToken(HLASM1Parser.INSTRUCTION, 0); }
		public List<ParmsContext> parms() {
			return getRuleContexts(ParmsContext.class);
		}
		public ParmsContext parms(int i) {
			return getRuleContext(ParmsContext.class,i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(INSTRUCTION);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8406016L) != 0)) {
				{
				{
				setState(40);
				parms();
				}
				}
				setState(45);
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
	public static class MacroContext extends ParserRuleContext {
		public TerminalNode MACRO() { return getToken(HLASM1Parser.MACRO, 0); }
		public List<MoperandsContext> moperands() {
			return getRuleContexts(MoperandsContext.class);
		}
		public MoperandsContext moperands(int i) {
			return getRuleContext(MoperandsContext.class,i);
		}
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).enterMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).exitMacro(this);
		}
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_macro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(MACRO);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MPARM || _la==LBRACKET) {
				{
				{
				setState(47);
				moperands();
				}
				}
				setState(52);
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
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode OPCODE() { return getToken(HLASM1Parser.OPCODE, 0); }
		public List<OoperandsContext> ooperands() {
			return getRuleContexts(OoperandsContext.class);
		}
		public OoperandsContext ooperands(int i) {
			return getRuleContext(OoperandsContext.class,i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(OPCODE);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70528L) != 0)) {
				{
				{
				setState(54);
				ooperands();
				}
				}
				setState(59);
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
	public static class ParmsContext extends ParserRuleContext {
		public List<TerminalNode> PARMS() { return getTokens(HLASM1Parser.PARMS); }
		public TerminalNode PARMS(int i) {
			return getToken(HLASM1Parser.PARMS, i);
		}
		public TerminalNode ASTER() { return getToken(HLASM1Parser.ASTER, 0); }
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public TerminalNode LABEL() { return getToken(HLASM1Parser.LABEL, 0); }
		public ParmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).enterParms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).exitParms(this);
		}
	}

	public final ParmsContext parms() throws RecognitionException {
		ParmsContext _localctx = new ParmsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parms);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARMS:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(PARMS);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(61);
					match(T__0);
					setState(62);
					match(PARMS);
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(ASTER);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(69);
					match(T__0);
					setState(70);
					register();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LABEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(LABEL);
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
	public static class MoperandsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACKET() { return getTokens(HLASM1Parser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(HLASM1Parser.LBRACKET, i);
		}
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(HLASM1Parser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(HLASM1Parser.RBRACKET, i);
		}
		public List<TerminalNode> MPARM() { return getTokens(HLASM1Parser.MPARM); }
		public TerminalNode MPARM(int i) {
			return getToken(HLASM1Parser.MPARM, i);
		}
		public List<TerminalNode> NUM() { return getTokens(HLASM1Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(HLASM1Parser.NUM, i);
		}
		public MoperandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moperands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).enterMoperands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).exitMoperands(this);
		}
	}

	public final MoperandsContext moperands() throws RecognitionException {
		MoperandsContext _localctx = new MoperandsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moperands);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(LBRACKET);
				setState(80);
				register();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(81);
					match(T__0);
					setState(82);
					register();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(RBRACKET);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(89);
					match(T__0);
					setState(90);
					match(MPARM);
					setState(91);
					match(T__1);
					setState(98);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NUM:
						{
						setState(93); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(92);
							match(NUM);
							}
							}
							setState(95); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NUM );
						}
						break;
					case EQUREGISTER:
					case REGISTER:
						{
						setState(97);
						register();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case MPARM:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(MPARM);
				setState(106);
				match(T__1);
				setState(107);
				match(LBRACKET);
				setState(108);
				register();
				setState(109);
				match(RBRACKET);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(110);
					match(T__0);
					setState(111);
					match(MPARM);
					setState(112);
					match(T__1);
					setState(113);
					match(LBRACKET);
					setState(114);
					register();
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(115);
						match(T__0);
						setState(116);
						register();
						}
						}
						setState(121);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(122);
					match(RBRACKET);
					}
					}
					setState(128);
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
	public static class OoperandsContext extends ParserRuleContext {
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
		public List<TerminalNode> DISPLACEMENT() { return getTokens(HLASM1Parser.DISPLACEMENT); }
		public TerminalNode DISPLACEMENT(int i) {
			return getToken(HLASM1Parser.DISPLACEMENT, i);
		}
		public TerminalNode STORAGE() { return getToken(HLASM1Parser.STORAGE, 0); }
		public TerminalNode CLENGTH() { return getToken(HLASM1Parser.CLENGTH, 0); }
		public TerminalNode STRING() { return getToken(HLASM1Parser.STRING, 0); }
		public TerminalNode DYNCLENTH() { return getToken(HLASM1Parser.DYNCLENTH, 0); }
		public OoperandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ooperands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).enterOoperands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).exitOoperands(this);
		}
	}

	public final OoperandsContext ooperands() throws RecognitionException {
		OoperandsContext _localctx = new OoperandsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ooperands);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUREGISTER:
			case REGISTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				register();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(132);
					match(T__0);
					setState(141);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EQUREGISTER:
					case REGISTER:
						{
						setState(133);
						register();
						setState(135);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DISPLACEMENT) {
							{
							setState(134);
							match(DISPLACEMENT);
							}
						}

						}
						break;
					case LABEL:
						{
						setState(137);
						label();
						setState(139);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DISPLACEMENT) {
							{
							setState(138);
							match(DISPLACEMENT);
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STORAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(STORAGE);
				}
				break;
			case CLENGTH:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(CLENGTH);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(150);
					match(STRING);
					}
				}

				}
				break;
			case DYNCLENTH:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(DYNCLENTH);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(154);
					match(STRING);
					}
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
	public static class RegisterContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(HLASM1Parser.REGISTER, 0); }
		public TerminalNode EQUREGISTER() { return getToken(HLASM1Parser.EQUREGISTER, 0); }
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASM1Listener ) ((HLASM1Listener)listener).exitRegister(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_register);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==EQUREGISTER || _la==REGISTER) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u00a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0016\b\u0000"+
		"\u000b\u0000\f\u0000\u0017\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001"+
		"\u001d\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0005\u0003*\b\u0003\n\u0003\f\u0003-\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0005\u00041\b\u0004\n\u0004\f\u00044\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0005\u00058\b\u0005\n\u0005\f\u0005;\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006@\b\u0006\n\u0006\f\u0006C\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006H\b\u0006\n\u0006\f\u0006K\t\u0006"+
		"\u0001\u0006\u0003\u0006N\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007T\b\u0007\n\u0007\f\u0007W\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007^\b\u0007"+
		"\u000b\u0007\f\u0007_\u0001\u0007\u0003\u0007c\b\u0007\u0005\u0007e\b"+
		"\u0007\n\u0007\f\u0007h\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007v\b\u0007\n\u0007\f\u0007y\t"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007}\b\u0007\n\u0007\f\u0007\u0080"+
		"\t\u0007\u0003\u0007\u0082\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0088\b\b\u0001\b\u0001\b\u0003\b\u008c\b\b\u0003\b\u008e\b\b\u0005"+
		"\b\u0090\b\b\n\b\f\b\u0093\t\b\u0001\b\u0001\b\u0001\b\u0003\b\u0098\b"+
		"\b\u0001\b\u0001\b\u0003\b\u009c\b\b\u0003\b\u009e\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0000\u0001\u0002\u0000\f\f\u0010\u0010\u00b2\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004%\u0001\u0000\u0000"+
		"\u0000\u0006\'\u0001\u0000\u0000\u0000\b.\u0001\u0000\u0000\u0000\n5\u0001"+
		"\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000e\u0081\u0001\u0000"+
		"\u0000\u0000\u0010\u009d\u0001\u0000\u0000\u0000\u0012\u009f\u0001\u0000"+
		"\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0005\u0000\u0000\u0001\u001a\u0001\u0001\u0000"+
		"\u0000\u0000\u001b\u001d\u0003\u0004\u0002\u0000\u001c\u001b\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d!\u0001\u0000\u0000"+
		"\u0000\u001e\"\u0003\u0006\u0003\u0000\u001f\"\u0003\b\u0004\u0000 \""+
		"\u0003\n\u0005\u0000!\u001e\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0005"+
		"\u0014\u0000\u0000$\u0003\u0001\u0000\u0000\u0000%&\u0005\u000e\u0000"+
		"\u0000&\u0005\u0001\u0000\u0000\u0000\'+\u0005\u0003\u0000\u0000(*\u0003"+
		"\f\u0006\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0007\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000.2\u0005\u0004\u0000\u0000/1\u0003\u000e"+
		"\u0007\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u00003\t\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000059\u0005\u0005\u0000\u000068\u0003\u0010\b\u0000"+
		"76\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:\u000b\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000<A\u0005\n\u0000\u0000=>\u0005\u0001\u0000\u0000>@\u0005"+
		"\n\u0000\u0000?=\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BN\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000DI\u0005\u0017\u0000\u0000EF\u0005\u0001\u0000"+
		"\u0000FH\u0003\u0012\t\u0000GE\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JN\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0005\u000e\u0000\u0000M<\u0001"+
		"\u0000\u0000\u0000MD\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000"+
		"N\r\u0001\u0000\u0000\u0000OP\u0005\u0015\u0000\u0000PU\u0003\u0012\t"+
		"\u0000QR\u0005\u0001\u0000\u0000RT\u0003\u0012\t\u0000SQ\u0001\u0000\u0000"+
		"\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000Xf\u0005"+
		"\u0016\u0000\u0000YZ\u0005\u0001\u0000\u0000Z[\u0005\u000b\u0000\u0000"+
		"[b\u0005\u0002\u0000\u0000\\^\u0005\u0011\u0000\u0000]\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`c\u0001\u0000\u0000\u0000ac\u0003\u0012\t\u0000b]\u0001\u0000"+
		"\u0000\u0000ba\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000dY\u0001"+
		"\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000g\u0082\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000ij\u0005\u000b\u0000\u0000jk\u0005\u0002\u0000\u0000kl\u0005"+
		"\u0015\u0000\u0000lm\u0003\u0012\t\u0000m~\u0005\u0016\u0000\u0000no\u0005"+
		"\u0001\u0000\u0000op\u0005\u000b\u0000\u0000pq\u0005\u0002\u0000\u0000"+
		"qr\u0005\u0015\u0000\u0000rw\u0003\u0012\t\u0000st\u0005\u0001\u0000\u0000"+
		"tv\u0003\u0012\t\u0000us\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000z{\u0005\u0016\u0000\u0000{}\u0001\u0000"+
		"\u0000\u0000|n\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0082"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081O\u0001\u0000"+
		"\u0000\u0000\u0081i\u0001\u0000\u0000\u0000\u0082\u000f\u0001\u0000\u0000"+
		"\u0000\u0083\u0091\u0003\u0012\t\u0000\u0084\u008d\u0005\u0001\u0000\u0000"+
		"\u0085\u0087\u0003\u0012\t\u0000\u0086\u0088\u0005\r\u0000\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u008e\u0001\u0000\u0000\u0000\u0089\u008b\u0003\u0004\u0002\u0000\u008a"+
		"\u008c\u0005\r\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u0085"+
		"\u0001\u0000\u0000\u0000\u008d\u0089\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u0001\u0000\u0000\u0000\u008f\u0084\u0001\u0000\u0000\u0000\u0090\u0093"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u009e\u0001\u0000\u0000\u0000\u0093\u0091"+
		"\u0001\u0000\u0000\u0000\u0094\u009e\u0005\b\u0000\u0000\u0095\u0097\u0005"+
		"\t\u0000\u0000\u0096\u0098\u0005\u0006\u0000\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009e\u0001\u0000"+
		"\u0000\u0000\u0099\u009b\u0005\u0007\u0000\u0000\u009a\u009c\u0005\u0006"+
		"\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u0083\u0001\u0000"+
		"\u0000\u0000\u009d\u0094\u0001\u0000\u0000\u0000\u009d\u0095\u0001\u0000"+
		"\u0000\u0000\u009d\u0099\u0001\u0000\u0000\u0000\u009e\u0011\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0007\u0000\u0000\u0000\u00a0\u0013\u0001\u0000"+
		"\u0000\u0000\u0017\u0017\u001c!+29AIMU_bfw~\u0081\u0087\u008b\u008d\u0091"+
		"\u0097\u009b\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}