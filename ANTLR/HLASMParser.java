// Generated from HLASM.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HLASMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ASSEMBLER_DIRECTIVE=2, REGISTER=3, OPCODE=4, NAME=5, NUMBER=6, 
		COMMENT=7, EOL=8, WHITESPACE=9;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_instruction = 2, RULE_opcode = 3, RULE_register_ = 4, 
		RULE_directive = 5, RULE_assemblerdirective = 6, RULE_lbl = 7, RULE_label = 8, 
		RULE_constant = 9, RULE_name = 10, RULE_number = 11, RULE_comment = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "instruction", "opcode", "register_", "directive", "assemblerdirective", 
			"lbl", "label", "constant", "name", "number", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ASSEMBLER_DIRECTIVE", "REGISTER", "OPCODE", "NAME", "NUMBER", 
			"COMMENT", "EOL", "WHITESPACE"
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				line();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 180L) != 0) );
			setState(31);
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
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
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
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSEMBLER_DIRECTIVE:
			case OPCODE:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(33);
					lbl();
					}
				}

				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPCODE:
					{
					setState(36);
					instruction();
					}
					break;
				case ASSEMBLER_DIRECTIVE:
					{
					setState(37);
					directive();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(40);
					comment();
					}
				}

				setState(43);
				match(EOL);
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				comment();
				setState(46);
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
	public static class InstructionContext extends ParserRuleContext {
		public OpcodeContext opcode() {
			return getRuleContext(OpcodeContext.class,0);
		}
		public List<Register_Context> register_() {
			return getRuleContexts(Register_Context.class);
		}
		public Register_Context register_(int i) {
			return getRuleContext(Register_Context.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(HLASMParser.WHITESPACE, 0); }
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
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				opcode();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(51);
					match(WHITESPACE);
					}
				}

				setState(54);
				register_();
				setState(55);
				match(T__0);
				setState(56);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				opcode();
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(59);
					match(WHITESPACE);
					}
				}

				setState(62);
				register_();
				setState(63);
				match(T__0);
				setState(64);
				register_();
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
	}

	public final OpcodeContext opcode() throws RecognitionException {
		OpcodeContext _localctx = new OpcodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_opcode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
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
	public static class Register_Context extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(HLASMParser.REGISTER, 0); }
		public Register_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterRegister_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitRegister_(this);
		}
	}

	public final Register_Context register_() throws RecognitionException {
		Register_Context _localctx = new Register_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_register_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
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
		public AssemblerdirectiveContext assemblerdirective() {
			return getRuleContext(AssemblerdirectiveContext.class,0);
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
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			assemblerdirective();
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
	public static class AssemblerdirectiveContext extends ParserRuleContext {
		public TerminalNode ASSEMBLER_DIRECTIVE() { return getToken(HLASMParser.ASSEMBLER_DIRECTIVE, 0); }
		public AssemblerdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterAssemblerdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitAssemblerdirective(this);
		}
	}

	public final AssemblerdirectiveContext assemblerdirective() throws RecognitionException {
		AssemblerdirectiveContext _localctx = new AssemblerdirectiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assemblerdirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(ASSEMBLER_DIRECTIVE);
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
	public static class LblContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LblContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterLbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitLbl(this);
		}
	}

	public final LblContext lbl() throws RecognitionException {
		LblContext _localctx = new LblContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lbl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			label();
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
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
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			name();
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
	public static class ConstantContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			name();
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
	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HLASMParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(NAME);
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
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(HLASMParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HLASMListener ) ((HLASMListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(NUMBER);
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
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
		"\u0004\u0001\tY\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001#\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\'\b\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0003\u00025\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002=\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u0000\u0000S\u0000\u001b\u0001\u0000\u0000\u0000\u0002"+
		"0\u0001\u0000\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006D\u0001"+
		"\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000"+
		"\fJ\u0001\u0000\u0000\u0000\u000eL\u0001\u0000\u0000\u0000\u0010N\u0001"+
		"\u0000\u0000\u0000\u0012P\u0001\u0000\u0000\u0000\u0014R\u0001\u0000\u0000"+
		"\u0000\u0016T\u0001\u0000\u0000\u0000\u0018V\u0001\u0000\u0000\u0000\u001a"+
		"\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f"+
		" \u0005\u0000\u0000\u0001 \u0001\u0001\u0000\u0000\u0000!#\u0003\u000e"+
		"\u0007\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#&\u0001"+
		"\u0000\u0000\u0000$\'\u0003\u0004\u0002\u0000%\'\u0003\n\u0005\u0000&"+
		"$\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000"+
		"\u0000(*\u0003\u0018\f\u0000)(\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+,\u0005\b\u0000\u0000,1\u0001\u0000\u0000"+
		"\u0000-.\u0003\u0018\f\u0000./\u0005\b\u0000\u0000/1\u0001\u0000\u0000"+
		"\u00000\"\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u00001\u0003\u0001"+
		"\u0000\u0000\u000024\u0003\u0006\u0003\u000035\u0005\t\u0000\u000043\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"67\u0003\b\u0004\u000078\u0005\u0001\u0000\u000089\u0003\u0012\t\u0000"+
		"9C\u0001\u0000\u0000\u0000:<\u0003\u0006\u0003\u0000;=\u0005\t\u0000\u0000"+
		"<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>?\u0003\b\u0004\u0000?@\u0005\u0001\u0000\u0000@A\u0003\b\u0004"+
		"\u0000AC\u0001\u0000\u0000\u0000B2\u0001\u0000\u0000\u0000B:\u0001\u0000"+
		"\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005\u0004\u0000\u0000"+
		"E\u0007\u0001\u0000\u0000\u0000FG\u0005\u0003\u0000\u0000G\t\u0001\u0000"+
		"\u0000\u0000HI\u0003\f\u0006\u0000I\u000b\u0001\u0000\u0000\u0000JK\u0005"+
		"\u0002\u0000\u0000K\r\u0001\u0000\u0000\u0000LM\u0003\u0010\b\u0000M\u000f"+
		"\u0001\u0000\u0000\u0000NO\u0003\u0014\n\u0000O\u0011\u0001\u0000\u0000"+
		"\u0000PQ\u0003\u0014\n\u0000Q\u0013\u0001\u0000\u0000\u0000RS\u0005\u0005"+
		"\u0000\u0000S\u0015\u0001\u0000\u0000\u0000TU\u0005\u0006\u0000\u0000"+
		"U\u0017\u0001\u0000\u0000\u0000VW\u0005\u0007\u0000\u0000W\u0019\u0001"+
		"\u0000\u0000\u0000\b\u001d\"&)04<B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}