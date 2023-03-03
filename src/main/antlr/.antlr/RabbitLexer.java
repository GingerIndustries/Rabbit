// Generated from /home/ginger/Rabbit/src/main/antlr/RabbitLexer.g4 by ANTLR 4.9.2

  import com.yuvalshavit.antlr4.DenterHelper;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RabbitLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, NEWLINE=3, WHITESPACE=4, STRING=5, NUMBER=6, IMPORT=7, 
		FROM=8, PUBLIC=9, PRIVATE=10, PROTECTED=11, INTERNAL=12, MAIN=13, ACCESS_MODIFIER=14, 
		FUNCTION=15, OPERATOR=16, CONSTRUCTOR=17, STATIC=18, OVERRIDE=19, ABSTRACT=20, 
		DEFAULT=21, STRUCT=22, TRAIT=23, EXTENDS=24, IMPLEMENTS=25, SELF=26, SUPER=27, 
		IF=28, ELSE=29, USING=30, WHILE=31, FOR=32, MATCH=33, CASE=34, ANY=35, 
		WITH=36, BREAK=37, CONTINUE=38, PROCEED=39, IN=40, AND=41, OR=42, NOT=43, 
		TRUE=44, FALSE=45, NOTHING=46, NEVER=47, PASS=48, LPAREN=49, RPAREN=50, 
		LBRACE=51, RBRACE=52, LSQBRACKET=53, RSQBRACKET=54, DOT=55, ASSIGN=56, 
		COLON=57, COMMA=58, PLUS=59, MINUS=60, ASTERISK=61, SLASH=62, MODULO=63, 
		GREATERTHAN=64, LESSTHAN=65, GREATEREQUAL=66, LESSEQUAL=67, EQUAL=68, 
		ARROW=69, IDENTIFIER=70;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SPACES", "NEWLINE", "WHITESPACE", "STRING", "NUMBER", "IMPORT", "FROM", 
			"PUBLIC", "PRIVATE", "PROTECTED", "INTERNAL", "MAIN", "ACCESS_MODIFIER", 
			"FUNCTION", "OPERATOR", "CONSTRUCTOR", "STATIC", "OVERRIDE", "ABSTRACT", 
			"DEFAULT", "STRUCT", "TRAIT", "EXTENDS", "IMPLEMENTS", "SELF", "SUPER", 
			"IF", "ELSE", "USING", "WHILE", "FOR", "MATCH", "CASE", "ANY", "WITH", 
			"BREAK", "CONTINUE", "PROCEED", "IN", "AND", "OR", "NOT", "TRUE", "FALSE", 
			"NOTHING", "NEVER", "PASS", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LSQBRACKET", 
			"RSQBRACKET", "DOT", "ASSIGN", "COLON", "COMMA", "PLUS", "MINUS", "ASTERISK", 
			"SLASH", "MODULO", "GREATERTHAN", "LESSTHAN", "GREATEREQUAL", "LESSEQUAL", 
			"EQUAL", "ARROW", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'import'", "'from'", "'public'", 
			"'private'", "'protected'", "'internal'", "'main'", null, "'function'", 
			"'operator'", "'constructor'", "'static'", "'override'", "'abstract'", 
			"'default'", "'struct'", "'trait'", "'extends'", "'implements'", "'self'", 
			"'super'", "'if'", "'else'", "'using'", "'while'", "'for'", "'match'", 
			"'case'", "'any'", "'with'", "'break'", "'continue'", "'proceed'", "'in'", 
			"'and'", "'or'", "'not'", "'true'", "'false'", "'nothing'", "'never'", 
			"'pass'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "'='", "':'", 
			"','", "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "NEWLINE", "WHITESPACE", "STRING", "NUMBER", 
			"IMPORT", "FROM", "PUBLIC", "PRIVATE", "PROTECTED", "INTERNAL", "MAIN", 
			"ACCESS_MODIFIER", "FUNCTION", "OPERATOR", "CONSTRUCTOR", "STATIC", "OVERRIDE", 
			"ABSTRACT", "DEFAULT", "STRUCT", "TRAIT", "EXTENDS", "IMPLEMENTS", "SELF", 
			"SUPER", "IF", "ELSE", "USING", "WHILE", "FOR", "MATCH", "CASE", "ANY", 
			"WITH", "BREAK", "CONTINUE", "PROCEED", "IN", "AND", "OR", "NOT", "TRUE", 
			"FALSE", "NOTHING", "NEVER", "PASS", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LSQBRACKET", "RSQBRACKET", "DOT", "ASSIGN", "COLON", "COMMA", "PLUS", 
			"MINUS", "ASTERISK", "SLASH", "MODULO", "GREATERTHAN", "LESSTHAN", "GREATEREQUAL", 
			"LESSEQUAL", "EQUAL", "ARROW", "IDENTIFIER"
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


	  private final DenterHelper denter = new DenterHelper(RabbitLexer.NEWLINE,
	                                                       RabbitLexer.INDENT,
	                                                       RabbitLexer.DEDENT)
	  {
	    @Override
	    public Token pullToken() {
	      return RabbitLexer.super.nextToken();
	    }
	  };

	  @Override
	  public Token nextToken() {
	    return denter.nextToken();
	  }


	public RabbitLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RabbitLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u01fd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\6\2\u008f\n"+
		"\2\r\2\16\2\u0090\3\3\5\3\u0094\n\3\3\3\3\3\5\3\u0098\n\3\3\3\5\3\u009b"+
		"\n\3\3\4\3\4\3\4\3\4\3\5\3\5\7\5\u00a3\n\5\f\5\16\5\u00a6\13\5\3\5\3\5"+
		"\3\6\6\6\u00ab\n\6\r\6\16\6\u00ac\3\6\3\6\6\6\u00b1\n\6\r\6\16\6\u00b2"+
		"\5\6\u00b5\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00ee\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3"+
		"B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\7F\u01f9\nF\fF\16F\u01fc\13F\3\u00a4"+
		"\2G\3\2\5\5\7\6\t\7\13\b\r\t\17\n\21\13\23\f\25\r\27\16\31\17\33\20\35"+
		"\21\37\22!\23#\24%\25\'\26)\27+\30-\31/\32\61\33\63\34\65\35\67\369\37"+
		"; =!?\"A#C$E%G&I\'K(M)O*Q+S,U-W.Y/[\60]\61_\62a\63c\64e\65g\66i\67k8m"+
		"9o:q;s<u=w>y?{@}A\177B\u0081C\u0083D\u0085E\u0087F\u0089G\u008bH\3\2\6"+
		"\4\2\13\13\"\"\4\2\62;aa\5\2C\\aac|\6\2\62;C\\aac|\2\u0207\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008e\3\2\2\2\5\u0097\3\2\2\2\7\u009c"+
		"\3\2\2\2\t\u00a0\3\2\2\2\13\u00aa\3\2\2\2\r\u00b6\3\2\2\2\17\u00bd\3\2"+
		"\2\2\21\u00c2\3\2\2\2\23\u00c9\3\2\2\2\25\u00d1\3\2\2\2\27\u00db\3\2\2"+
		"\2\31\u00e4\3\2\2\2\33\u00ed\3\2\2\2\35\u00ef\3\2\2\2\37\u00f8\3\2\2\2"+
		"!\u0101\3\2\2\2#\u010d\3\2\2\2%\u0114\3\2\2\2\'\u011d\3\2\2\2)\u0126\3"+
		"\2\2\2+\u012e\3\2\2\2-\u0135\3\2\2\2/\u013b\3\2\2\2\61\u0143\3\2\2\2\63"+
		"\u014e\3\2\2\2\65\u0153\3\2\2\2\67\u0159\3\2\2\29\u015c\3\2\2\2;\u0161"+
		"\3\2\2\2=\u0167\3\2\2\2?\u016d\3\2\2\2A\u0171\3\2\2\2C\u0177\3\2\2\2E"+
		"\u017c\3\2\2\2G\u0180\3\2\2\2I\u0185\3\2\2\2K\u018b\3\2\2\2M\u0194\3\2"+
		"\2\2O\u019c\3\2\2\2Q\u019f\3\2\2\2S\u01a3\3\2\2\2U\u01a6\3\2\2\2W\u01aa"+
		"\3\2\2\2Y\u01af\3\2\2\2[\u01b5\3\2\2\2]\u01bd\3\2\2\2_\u01c3\3\2\2\2a"+
		"\u01c8\3\2\2\2c\u01ca\3\2\2\2e\u01cc\3\2\2\2g\u01ce\3\2\2\2i\u01d0\3\2"+
		"\2\2k\u01d2\3\2\2\2m\u01d4\3\2\2\2o\u01d6\3\2\2\2q\u01d8\3\2\2\2s\u01da"+
		"\3\2\2\2u\u01dc\3\2\2\2w\u01de\3\2\2\2y\u01e0\3\2\2\2{\u01e2\3\2\2\2}"+
		"\u01e4\3\2\2\2\177\u01e6\3\2\2\2\u0081\u01e8\3\2\2\2\u0083\u01ea\3\2\2"+
		"\2\u0085\u01ed\3\2\2\2\u0087\u01f0\3\2\2\2\u0089\u01f3\3\2\2\2\u008b\u01f6"+
		"\3\2\2\2\u008d\u008f\t\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\4\3\2\2\2\u0092\u0094\7\17\2"+
		"\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098"+
		"\7\f\2\2\u0096\u0098\4\16\17\2\u0097\u0093\3\2\2\2\u0097\u0096\3\2\2\2"+
		"\u0098\u009a\3\2\2\2\u0099\u009b\5\3\2\2\u009a\u0099\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\6\3\2\2\2\u009c\u009d\5\3\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\b\4\2\2\u009f\b\3\2\2\2\u00a0\u00a4\7$\2\2\u00a1\u00a3\13\2\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7$\2\2\u00a8"+
		"\n\3\2\2\2\u00a9\u00ab\t\3\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2"+
		"\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b4\3\2\2\2\u00ae\u00b0"+
		"\7\60\2\2\u00af\u00b1\t\3\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ae"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\f\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7"+
		"\u00b8\7o\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7t\2\2"+
		"\u00bb\u00bc\7v\2\2\u00bc\16\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7"+
		"t\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7o\2\2\u00c1\20\3\2\2\2\u00c2\u00c3"+
		"\7r\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7e\2\2\u00c8\22\3\2\2\2\u00c9\u00ca\7r\2\2\u00ca"+
		"\u00cb\7t\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7x\2\2\u00cd\u00ce\7c\2\2"+
		"\u00ce\u00cf\7v\2\2\u00cf\u00d0\7g\2\2\u00d0\24\3\2\2\2\u00d1\u00d2\7"+
		"r\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6"+
		"\7g\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"\u00da\7f\2\2\u00da\26\3\2\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7p\2\2\u00dd"+
		"\u00de\7v\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7p\2\2"+
		"\u00e1\u00e2\7c\2\2\u00e2\u00e3\7n\2\2\u00e3\30\3\2\2\2\u00e4\u00e5\7"+
		"o\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7p\2\2\u00e8\32"+
		"\3\2\2\2\u00e9\u00ee\5\21\t\2\u00ea\u00ee\5\23\n\2\u00eb\u00ee\5\25\13"+
		"\2\u00ec\u00ee\5\27\f\2\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\34\3\2\2\2\u00ef\u00f0\7h\2\2"+
		"\u00f0\u00f1\7w\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4"+
		"\7v\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7p\2\2\u00f7"+
		"\36\3\2\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7r\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"\u00fc\7t\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7q\2\2"+
		"\u00ff\u0100\7t\2\2\u0100 \3\2\2\2\u0101\u0102\7e\2\2\u0102\u0103\7q\2"+
		"\2\u0103\u0104\7p\2\2\u0104\u0105\7u\2\2\u0105\u0106\7v\2\2\u0106\u0107"+
		"\7t\2\2\u0107\u0108\7w\2\2\u0108\u0109\7e\2\2\u0109\u010a\7v\2\2\u010a"+
		"\u010b\7q\2\2\u010b\u010c\7t\2\2\u010c\"\3\2\2\2\u010d\u010e\7u\2\2\u010e"+
		"\u010f\7v\2\2\u010f\u0110\7c\2\2\u0110\u0111\7v\2\2\u0111\u0112\7k\2\2"+
		"\u0112\u0113\7e\2\2\u0113$\3\2\2\2\u0114\u0115\7q\2\2\u0115\u0116\7x\2"+
		"\2\u0116\u0117\7g\2\2\u0117\u0118\7t\2\2\u0118\u0119\7t\2\2\u0119\u011a"+
		"\7k\2\2\u011a\u011b\7f\2\2\u011b\u011c\7g\2\2\u011c&\3\2\2\2\u011d\u011e"+
		"\7c\2\2\u011e\u011f\7d\2\2\u011f\u0120\7u\2\2\u0120\u0121\7v\2\2\u0121"+
		"\u0122\7t\2\2\u0122\u0123\7c\2\2\u0123\u0124\7e\2\2\u0124\u0125\7v\2\2"+
		"\u0125(\3\2\2\2\u0126\u0127\7f\2\2\u0127\u0128\7g\2\2\u0128\u0129\7h\2"+
		"\2\u0129\u012a\7c\2\2\u012a\u012b\7w\2\2\u012b\u012c\7n\2\2\u012c\u012d"+
		"\7v\2\2\u012d*\3\2\2\2\u012e\u012f\7u\2\2\u012f\u0130\7v\2\2\u0130\u0131"+
		"\7t\2\2\u0131\u0132\7w\2\2\u0132\u0133\7e\2\2\u0133\u0134\7v\2\2\u0134"+
		",\3\2\2\2\u0135\u0136\7v\2\2\u0136\u0137\7t\2\2\u0137\u0138\7c\2\2\u0138"+
		"\u0139\7k\2\2\u0139\u013a\7v\2\2\u013a.\3\2\2\2\u013b\u013c\7g\2\2\u013c"+
		"\u013d\7z\2\2\u013d\u013e\7v\2\2\u013e\u013f\7g\2\2\u013f\u0140\7p\2\2"+
		"\u0140\u0141\7f\2\2\u0141\u0142\7u\2\2\u0142\60\3\2\2\2\u0143\u0144\7"+
		"k\2\2\u0144\u0145\7o\2\2\u0145\u0146\7r\2\2\u0146\u0147\7n\2\2\u0147\u0148"+
		"\7g\2\2\u0148\u0149\7o\2\2\u0149\u014a\7g\2\2\u014a\u014b\7p\2\2\u014b"+
		"\u014c\7v\2\2\u014c\u014d\7u\2\2\u014d\62\3\2\2\2\u014e\u014f\7u\2\2\u014f"+
		"\u0150\7g\2\2\u0150\u0151\7n\2\2\u0151\u0152\7h\2\2\u0152\64\3\2\2\2\u0153"+
		"\u0154\7u\2\2\u0154\u0155\7w\2\2\u0155\u0156\7r\2\2\u0156\u0157\7g\2\2"+
		"\u0157\u0158\7t\2\2\u0158\66\3\2\2\2\u0159\u015a\7k\2\2\u015a\u015b\7"+
		"h\2\2\u015b8\3\2\2\2\u015c\u015d\7g\2\2\u015d\u015e\7n\2\2\u015e\u015f"+
		"\7u\2\2\u015f\u0160\7g\2\2\u0160:\3\2\2\2\u0161\u0162\7w\2\2\u0162\u0163"+
		"\7u\2\2\u0163\u0164\7k\2\2\u0164\u0165\7p\2\2\u0165\u0166\7i\2\2\u0166"+
		"<\3\2\2\2\u0167\u0168\7y\2\2\u0168\u0169\7j\2\2\u0169\u016a\7k\2\2\u016a"+
		"\u016b\7n\2\2\u016b\u016c\7g\2\2\u016c>\3\2\2\2\u016d\u016e\7h\2\2\u016e"+
		"\u016f\7q\2\2\u016f\u0170\7t\2\2\u0170@\3\2\2\2\u0171\u0172\7o\2\2\u0172"+
		"\u0173\7c\2\2\u0173\u0174\7v\2\2\u0174\u0175\7e\2\2\u0175\u0176\7j\2\2"+
		"\u0176B\3\2\2\2\u0177\u0178\7e\2\2\u0178\u0179\7c\2\2\u0179\u017a\7u\2"+
		"\2\u017a\u017b\7g\2\2\u017bD\3\2\2\2\u017c\u017d\7c\2\2\u017d\u017e\7"+
		"p\2\2\u017e\u017f\7{\2\2\u017fF\3\2\2\2\u0180\u0181\7y\2\2\u0181\u0182"+
		"\7k\2\2\u0182\u0183\7v\2\2\u0183\u0184\7j\2\2\u0184H\3\2\2\2\u0185\u0186"+
		"\7d\2\2\u0186\u0187\7t\2\2\u0187\u0188\7g\2\2\u0188\u0189\7c\2\2\u0189"+
		"\u018a\7m\2\2\u018aJ\3\2\2\2\u018b\u018c\7e\2\2\u018c\u018d\7q\2\2\u018d"+
		"\u018e\7p\2\2\u018e\u018f\7v\2\2\u018f\u0190\7k\2\2\u0190\u0191\7p\2\2"+
		"\u0191\u0192\7w\2\2\u0192\u0193\7g\2\2\u0193L\3\2\2\2\u0194\u0195\7r\2"+
		"\2\u0195\u0196\7t\2\2\u0196\u0197\7q\2\2\u0197\u0198\7e\2\2\u0198\u0199"+
		"\7g\2\2\u0199\u019a\7g\2\2\u019a\u019b\7f\2\2\u019bN\3\2\2\2\u019c\u019d"+
		"\7k\2\2\u019d\u019e\7p\2\2\u019eP\3\2\2\2\u019f\u01a0\7c\2\2\u01a0\u01a1"+
		"\7p\2\2\u01a1\u01a2\7f\2\2\u01a2R\3\2\2\2\u01a3\u01a4\7q\2\2\u01a4\u01a5"+
		"\7t\2\2\u01a5T\3\2\2\2\u01a6\u01a7\7p\2\2\u01a7\u01a8\7q\2\2\u01a8\u01a9"+
		"\7v\2\2\u01a9V\3\2\2\2\u01aa\u01ab\7v\2\2\u01ab\u01ac\7t\2\2\u01ac\u01ad"+
		"\7w\2\2\u01ad\u01ae\7g\2\2\u01aeX\3\2\2\2\u01af\u01b0\7h\2\2\u01b0\u01b1"+
		"\7c\2\2\u01b1\u01b2\7n\2\2\u01b2\u01b3\7u\2\2\u01b3\u01b4\7g\2\2\u01b4"+
		"Z\3\2\2\2\u01b5\u01b6\7p\2\2\u01b6\u01b7\7q\2\2\u01b7\u01b8\7v\2\2\u01b8"+
		"\u01b9\7j\2\2\u01b9\u01ba\7k\2\2\u01ba\u01bb\7p\2\2\u01bb\u01bc\7i\2\2"+
		"\u01bc\\\3\2\2\2\u01bd\u01be\7p\2\2\u01be\u01bf\7g\2\2\u01bf\u01c0\7x"+
		"\2\2\u01c0\u01c1\7g\2\2\u01c1\u01c2\7t\2\2\u01c2^\3\2\2\2\u01c3\u01c4"+
		"\7r\2\2\u01c4\u01c5\7c\2\2\u01c5\u01c6\7u\2\2\u01c6\u01c7\7u\2\2\u01c7"+
		"`\3\2\2\2\u01c8\u01c9\7*\2\2\u01c9b\3\2\2\2\u01ca\u01cb\7+\2\2\u01cbd"+
		"\3\2\2\2\u01cc\u01cd\7}\2\2\u01cdf\3\2\2\2\u01ce\u01cf\7\177\2\2\u01cf"+
		"h\3\2\2\2\u01d0\u01d1\7]\2\2\u01d1j\3\2\2\2\u01d2\u01d3\7_\2\2\u01d3l"+
		"\3\2\2\2\u01d4\u01d5\7\60\2\2\u01d5n\3\2\2\2\u01d6\u01d7\7?\2\2\u01d7"+
		"p\3\2\2\2\u01d8\u01d9\7<\2\2\u01d9r\3\2\2\2\u01da\u01db\7.\2\2\u01dbt"+
		"\3\2\2\2\u01dc\u01dd\7-\2\2\u01ddv\3\2\2\2\u01de\u01df\7/\2\2\u01dfx\3"+
		"\2\2\2\u01e0\u01e1\7,\2\2\u01e1z\3\2\2\2\u01e2\u01e3\7\61\2\2\u01e3|\3"+
		"\2\2\2\u01e4\u01e5\7\'\2\2\u01e5~\3\2\2\2\u01e6\u01e7\7@\2\2\u01e7\u0080"+
		"\3\2\2\2\u01e8\u01e9\7>\2\2\u01e9\u0082\3\2\2\2\u01ea\u01eb\7@\2\2\u01eb"+
		"\u01ec\7?\2\2\u01ec\u0084\3\2\2\2\u01ed\u01ee\7>\2\2\u01ee\u01ef\7?\2"+
		"\2\u01ef\u0086\3\2\2\2\u01f0\u01f1\7?\2\2\u01f1\u01f2\7?\2\2\u01f2\u0088"+
		"\3\2\2\2\u01f3\u01f4\7/\2\2\u01f4\u01f5\7@\2\2\u01f5\u008a\3\2\2\2\u01f6"+
		"\u01fa\t\4\2\2\u01f7\u01f9\t\5\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2"+
		"\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u008c\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\r\2\u0090\u0093\u0097\u009a\u00a4\u00ac\u00b2\u00b4\u00ed"+
		"\u01fa\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}