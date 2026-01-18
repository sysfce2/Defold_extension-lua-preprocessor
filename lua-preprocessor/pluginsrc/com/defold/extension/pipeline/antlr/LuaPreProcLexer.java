// Generated from lua-preprocessor/pluginsrc/com/defold/extension/pipeline/antlr/LuaPreProcLexer.g4 by ANTLR 4.9.3
package com.dynamo.bob.pipeline.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaPreProcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EMPTY_LINE=1, MODE_PP=2, MODE_LINE=3, PP_IFDEF=4, PP_ELSE=5, PP_ENDIF=6, 
		PP_PARAM_RELEASE=7, PP_PARAM_DEBUG=8, PP_PARAM_HEADLESS=9, PP_TEXT=10, 
		PP_EOL=11, PP_WS=12, DEBUG_ASSERT_LINE=13, TEXT=14, EOL=15;
	public static final int
		PreProc=1, LineMode=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "PreProc", "LineMode"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EMPTY_LINE", "MODE_PP", "MODE_LINE", "PP_IFDEF", "PP_ELSE", "PP_ENDIF", 
			"PP_PARAM_RELEASE", "PP_PARAM_DEBUG", "PP_PARAM_HEADLESS", "PP_TEXT", 
			"PP_EOL", "PP_WS", "DEBUG_ASSERT_LINE", "TEXT", "EOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'IF'", "'ELSE'", "'ENDIF'", "'RELEASE'", "'DEBUG'", 
			"'HEADLESS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EMPTY_LINE", "MODE_PP", "MODE_LINE", "PP_IFDEF", "PP_ELSE", "PP_ENDIF", 
			"PP_PARAM_RELEASE", "PP_PARAM_DEBUG", "PP_PARAM_HEADLESS", "PP_TEXT", 
			"PP_EOL", "PP_WS", "DEBUG_ASSERT_LINE", "TEXT", "EOL"
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


	public LuaPreProcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LuaPreProcLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u009d\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\5\2"+
		"%\n\2\3\2\3\2\3\2\3\2\3\3\5\3,\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\7\4"+
		"\66\n\4\f\4\16\49\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13d\n\13\r\13\16\13"+
		"e\3\f\5\fi\n\f\3\f\3\f\3\f\3\f\3\r\6\rp\n\r\r\r\16\rq\3\r\3\r\3\16\7\16"+
		"w\n\16\f\16\16\16z\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u008d\n\16\f\16\16\16\u0090"+
		"\13\16\3\17\6\17\u0093\n\17\r\17\16\17\u0094\3\20\5\20\u0098\n\20\3\20"+
		"\3\20\3\20\3\20\2\2\21\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f"+
		"\31\r\33\16\35\17\37\20!\21\5\2\3\4\5\4\2\f\f\17\17\7\2//\62;C\\aac|\4"+
		"\2\13\13\"\"\2\u00a4\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\13\3\2\2\2"+
		"\3\r\3\2\2\2\3\17\3\2\2\2\3\21\3\2\2\2\3\23\3\2\2\2\3\25\3\2\2\2\3\27"+
		"\3\2\2\2\3\31\3\2\2\2\3\33\3\2\2\2\4\35\3\2\2\2\4\37\3\2\2\2\4!\3\2\2"+
		"\2\5$\3\2\2\2\7+\3\2\2\2\t\67\3\2\2\2\13=\3\2\2\2\r@\3\2\2\2\17E\3\2\2"+
		"\2\21K\3\2\2\2\23S\3\2\2\2\25Y\3\2\2\2\27c\3\2\2\2\31h\3\2\2\2\33o\3\2"+
		"\2\2\35x\3\2\2\2\37\u0092\3\2\2\2!\u0097\3\2\2\2#%\7\17\2\2$#\3\2\2\2"+
		"$%\3\2\2\2%&\3\2\2\2&\'\7\f\2\2\'(\3\2\2\2()\b\2\2\2)\6\3\2\2\2*,\5\33"+
		"\r\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7/\2\2./\7/\2\2/\60\7%\2\2\60\61"+
		"\3\2\2\2\61\62\b\3\3\2\62\63\b\3\4\2\63\b\3\2\2\2\64\66\t\2\2\2\65\64"+
		"\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:"+
		";\b\4\3\2;<\b\4\5\2<\n\3\2\2\2=>\7K\2\2>?\7H\2\2?\f\3\2\2\2@A\7G\2\2A"+
		"B\7N\2\2BC\7U\2\2CD\7G\2\2D\16\3\2\2\2EF\7G\2\2FG\7P\2\2GH\7F\2\2HI\7"+
		"K\2\2IJ\7H\2\2J\20\3\2\2\2KL\7T\2\2LM\7G\2\2MN\7N\2\2NO\7G\2\2OP\7C\2"+
		"\2PQ\7U\2\2QR\7G\2\2R\22\3\2\2\2ST\7F\2\2TU\7G\2\2UV\7D\2\2VW\7W\2\2W"+
		"X\7I\2\2X\24\3\2\2\2YZ\7J\2\2Z[\7G\2\2[\\\7C\2\2\\]\7F\2\2]^\7N\2\2^_"+
		"\7G\2\2_`\7U\2\2`a\7U\2\2a\26\3\2\2\2bd\t\3\2\2cb\3\2\2\2de\3\2\2\2ec"+
		"\3\2\2\2ef\3\2\2\2f\30\3\2\2\2gi\7\17\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2"+
		"\2jk\7\f\2\2kl\3\2\2\2lm\b\f\6\2m\32\3\2\2\2np\t\4\2\2on\3\2\2\2pq\3\2"+
		"\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b\r\3\2t\34\3\2\2\2uw\t\4\2\2vu\3"+
		"\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7/\2\2|}\7"+
		"/\2\2}~\7F\2\2~\177\7G\2\2\177\u0080\7D\2\2\u0080\u0081\7W\2\2\u0081\u0082"+
		"\7I\2\2\u0082\u0083\7a\2\2\u0083\u0084\7C\2\2\u0084\u0085\7U\2\2\u0085"+
		"\u0086\7U\2\2\u0086\u0087\7G\2\2\u0087\u0088\7T\2\2\u0088\u0089\7V\2\2"+
		"\u0089\u008a\7*\2\2\u008a\u008e\3\2\2\2\u008b\u008d\n\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\36\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\n\2\2\2\u0092\u0091\3\2\2"+
		"\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095 "+
		"\3\2\2\2\u0096\u0098\7\17\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u009a\7\f\2\2\u009a\u009b\3\2\2\2\u009b\u009c"+
		"\b\20\6\2\u009c\"\3\2\2\2\17\2\3\4$+\67ehqx\u008e\u0094\u0097\7\b\2\2"+
		"\2\3\2\7\3\2\7\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}