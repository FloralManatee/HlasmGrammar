// Generated from HLASM1.g4 by ANTLR 4.13.2
package caseStudy1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HLASM1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INSTRUCTION=2, PARMS=3, CHAR=4, NUM=5, SPEC=6, WHITESPACE=7, EOL=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "INSTRUCTION", "PARMS", "CHAR", "NUM", "SPEC", "WHITESPACE", 
			"EOL"
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
			null, null, "INSTRUCTION", "PARMS", "CHAR", "NUM", "SPEC", "WHITESPACE", 
			"EOL"
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


	public HLASM1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HLASM1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\bJ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006"+
		"@\b\u0006\u000b\u0006\f\u0006A\u0001\u0006\u0001\u0006\u0001\u0007\u0004"+
		"\u0007G\b\u0007\u000b\u0007\f\u0007H\u0000\u0000\b\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0001\u0000"+
		"\u0012\u0002\u0000PPpp\u0002\u0000RRrr\u0002\u0000IIii\u0002\u0000NNn"+
		"n\u0002\u0000TTtt\u0002\u0000CCcc\u0002\u0000SSss\u0002\u0000EEee\u0002"+
		"\u0000OOoo\u0002\u0000FFff\u0002\u0000GGgg\u0002\u0000DDdd\u0002\u0000"+
		"AAaa\u0002\u0000AZaz\u0001\u000009\u0003\u0000$$&&@@\u0002\u0000\t\t "+
		" \u0002\u0000\n\n\r\rQ\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0001\u0011\u0001\u0000\u0000\u0000\u0003\u001d\u0001\u0000"+
		"\u0000\u0000\u00056\u0001\u0000\u0000\u0000\u00078\u0001\u0000\u0000\u0000"+
		"\t:\u0001\u0000\u0000\u0000\u000b<\u0001\u0000\u0000\u0000\r?\u0001\u0000"+
		"\u0000\u0000\u000fF\u0001\u0000\u0000\u0000\u0011\u0012\u0005,\u0000\u0000"+
		"\u0012\u0002\u0001\u0000\u0000\u0000\u0013\u0014\u0007\u0000\u0000\u0000"+
		"\u0014\u0015\u0007\u0001\u0000\u0000\u0015\u0016\u0007\u0002\u0000\u0000"+
		"\u0016\u0017\u0007\u0003\u0000\u0000\u0017\u001e\u0007\u0004\u0000\u0000"+
		"\u0018\u0019\u0007\u0005\u0000\u0000\u0019\u001a\u0007\u0006\u0000\u0000"+
		"\u001a\u001b\u0007\u0007\u0000\u0000\u001b\u001c\u0007\u0005\u0000\u0000"+
		"\u001c\u001e\u0007\u0004\u0000\u0000\u001d\u0013\u0001\u0000\u0000\u0000"+
		"\u001d\u0018\u0001\u0000\u0000\u0000\u001e\u0004\u0001\u0000\u0000\u0000"+
		"\u001f \u0007\b\u0000\u0000 7\u0007\u0003\u0000\u0000!\"\u0007\b\u0000"+
		"\u0000\"#\u0007\t\u0000\u0000#7\u0007\t\u0000\u0000$%\u0007\n\u0000\u0000"+
		"%&\u0007\u0007\u0000\u0000&7\u0007\u0003\u0000\u0000\'(\u0007\u0003\u0000"+
		"\u0000()\u0007\b\u0000\u0000)*\u0007\n\u0000\u0000*+\u0007\u0007\u0000"+
		"\u0000+7\u0007\u0003\u0000\u0000,-\u0007\u000b\u0000\u0000-.\u0007\f\u0000"+
		"\u0000./\u0007\u0004\u0000\u0000/7\u0007\f\u0000\u000001\u0007\u0003\u0000"+
		"\u000012\u0007\b\u0000\u000023\u0007\u000b\u0000\u000034\u0007\f\u0000"+
		"\u000045\u0007\u0004\u0000\u000057\u0007\f\u0000\u00006\u001f\u0001\u0000"+
		"\u0000\u00006!\u0001\u0000\u0000\u00006$\u0001\u0000\u0000\u00006\'\u0001"+
		"\u0000\u0000\u00006,\u0001\u0000\u0000\u000060\u0001\u0000\u0000\u0000"+
		"7\u0006\u0001\u0000\u0000\u000089\u0007\r\u0000\u00009\b\u0001\u0000\u0000"+
		"\u0000:;\u0007\u000e\u0000\u0000;\n\u0001\u0000\u0000\u0000<=\u0007\u000f"+
		"\u0000\u0000=\f\u0001\u0000\u0000\u0000>@\u0007\u0010\u0000\u0000?>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0006\u0006\u0000"+
		"\u0000D\u000e\u0001\u0000\u0000\u0000EG\u0007\u0011\u0000\u0000FE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000I\u0010\u0001\u0000\u0000\u0000\u0005\u0000"+
		"\u001d6AH\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}