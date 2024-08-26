// Generated from HLASM.g4 by ANTLR 4.13.2
package Antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HLASMLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DIRECTIVE=2, REGISTER=3, OPCODE=4, MACRO=5, STRING=6, INTEGER=7, 
		COMMENT=8, EOL=9, WHITESPACE=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "DIRECTIVE", "REGISTER", "OPCODE", "MACRO", "STRING", "INTEGER", 
			"COMMENT", "EOL", "WHITESPACE"
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
			null, null, "DIRECTIVE", "REGISTER", "OPCODE", "MACRO", "STRING", "INTEGER", 
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


	public HLASMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HLASM.g4"; }

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
		"\u0004\u0000\nq\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00016\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002H\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003N\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004V\b\u0004\u0001\u0005\u0001\u0005\u0005"+
		"\u0005Z\b\u0005\n\u0005\f\u0005]\t\u0005\u0001\u0006\u0004\u0006`\b\u0006"+
		"\u000b\u0006\f\u0006a\u0001\u0007\u0001\u0007\u0005\u0007f\b\u0007\n\u0007"+
		"\f\u0007i\t\u0007\u0001\b\u0004\bl\b\b\u000b\b\f\bm\u0001\t\u0001\t\u0000"+
		"\u0000\n\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0001\u0000\u0016\u0002\u0000U"+
		"Uuu\u0002\u0000SSss\u0002\u0000IIii\u0002\u0000NNnn\u0002\u0000GGgg\u0002"+
		"\u0000CCcc\u0002\u0000EEee\u0002\u0000TTtt\u0002\u0000LLll\u0002\u0000"+
		"OOoo\u0002\u0000RRrr\u0002\u0000QQqq\u0002\u0000DDdd\u0002\u0000AAaa\u0002"+
		"\u0000FFff\u0002\u0000AZaz\u0003\u000009AZaz\u0001\u000009\u0001\u0000"+
		"**\u0005\u0000  **09AZaz\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u0086\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0001\u0015"+
		"\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u0005G\u0001\u0000"+
		"\u0000\u0000\u0007M\u0001\u0000\u0000\u0000\tU\u0001\u0000\u0000\u0000"+
		"\u000bW\u0001\u0000\u0000\u0000\r_\u0001\u0000\u0000\u0000\u000fc\u0001"+
		"\u0000\u0000\u0000\u0011k\u0001\u0000\u0000\u0000\u0013o\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0005,\u0000\u0000\u0016\u0002\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0007\u0000\u0000\u0000\u0018\u0019\u0007\u0001\u0000\u0000"+
		"\u0019\u001a\u0007\u0002\u0000\u0000\u001a\u001b\u0007\u0003\u0000\u0000"+
		"\u001b6\u0007\u0004\u0000\u0000\u001c\u001d\u0007\u0005\u0000\u0000\u001d"+
		"\u001e\u0007\u0001\u0000\u0000\u001e\u001f\u0007\u0006\u0000\u0000\u001f"+
		" \u0007\u0005\u0000\u0000 6\u0007\u0007\u0000\u0000!\"\u0007\b\u0000\u0000"+
		"\"#\u0007\u0007\u0000\u0000#$\u0007\t\u0000\u0000$%\u0007\n\u0000\u0000"+
		"%6\u0007\u0004\u0000\u0000&\'\u0007\u0006\u0000\u0000\'(\u0007\u000b\u0000"+
		"\u0000(6\u0007\u0000\u0000\u0000)*\u0007\u0006\u0000\u0000*+\u0007\u000b"+
		"\u0000\u0000+,\u0007\u0000\u0000\u0000,-\u0005 \u0000\u0000-6\u0005*\u0000"+
		"\u0000./\u0007\u0006\u0000\u0000/0\u0007\u0003\u0000\u000006\u0007\f\u0000"+
		"\u000012\u0007\f\u0000\u000026\u0007\u0001\u0000\u000034\u0007\f\u0000"+
		"\u000046\u0007\u0005\u0000\u00005\u0017\u0001\u0000\u0000\u00005\u001c"+
		"\u0001\u0000\u0000\u00005!\u0001\u0000\u0000\u00005&\u0001\u0000\u0000"+
		"\u00005)\u0001\u0000\u0000\u00005.\u0001\u0000\u0000\u000051\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u00006\u0004\u0001\u0000\u0000\u0000"+
		"7H\u00051\u0000\u000089\u0007\n\u0000\u00009H\u00051\u0000\u0000:H\u0002"+
		"29\u0000;<\u00051\u0000\u0000<H\u00050\u0000\u0000=>\u00051\u0000\u0000"+
		">H\u00051\u0000\u0000?@\u00051\u0000\u0000@H\u00052\u0000\u0000AB\u0005"+
		"1\u0000\u0000BH\u00053\u0000\u0000CD\u00051\u0000\u0000DH\u00054\u0000"+
		"\u0000EF\u00051\u0000\u0000FH\u00055\u0000\u0000G7\u0001\u0000\u0000\u0000"+
		"G8\u0001\u0000\u0000\u0000G:\u0001\u0000\u0000\u0000G;\u0001\u0000\u0000"+
		"\u0000G=\u0001\u0000\u0000\u0000G?\u0001\u0000\u0000\u0000GA\u0001\u0000"+
		"\u0000\u0000GC\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000H\u0006"+
		"\u0001\u0000\u0000\u0000IN\u0007\b\u0000\u0000JK\u0007\b\u0000\u0000K"+
		"N\u0007\r\u0000\u0000LN\u0007\r\u0000\u0000MI\u0001\u0000\u0000\u0000"+
		"MJ\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000N\b\u0001\u0000\u0000"+
		"\u0000OP\u0007\u0002\u0000\u0000PV\u0007\u000e\u0000\u0000QR\u0007\b\u0000"+
		"\u0000RS\u0007\t\u0000\u0000ST\u0007\r\u0000\u0000TV\u0007\f\u0000\u0000"+
		"UO\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000V\n\u0001\u0000\u0000"+
		"\u0000W[\u0007\u000f\u0000\u0000XZ\u0007\u0010\u0000\u0000YX\u0001\u0000"+
		"\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\\f\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^`\u0007\u0011\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u000e\u0001"+
		"\u0000\u0000\u0000cg\u0007\u0012\u0000\u0000df\u0007\u0013\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000h\u0010\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000jl\u0007\u0014\u0000\u0000kj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000n\u0012\u0001\u0000\u0000\u0000op\u0007\u0015\u0000\u0000p\u0014"+
		"\u0001\u0000\u0000\u0000\t\u00005GMU[agm\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}