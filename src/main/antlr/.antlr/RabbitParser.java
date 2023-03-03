// Generated from /home/ginger/Rabbit/src/main/antlr/RabbitParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RabbitParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_import_line = 1, RULE_statements = 2, RULE_block = 3, 
		RULE_statement = 4, RULE_assignment_op = 5, RULE_assignment = 6, RULE_struct_declaration = 7, 
		RULE_struct_body = 8, RULE_struct_item = 9, RULE_struct_property = 10, 
		RULE_struct_declaration_trait_implementation = 11, RULE_trait_declaration = 12, 
		RULE_trait_declaration_body = 13, RULE_trait_declaration_item = 14, RULE_trait_implementation = 15, 
		RULE_trait_implementation_body = 16, RULE_trait_implementation_item = 17, 
		RULE_function_declaration = 18, RULE_function_modifier = 19, RULE_if_statement = 20, 
		RULE_else_if_block = 21, RULE_else_block = 22, RULE_if_while_statement = 23, 
		RULE_while_statement = 24, RULE_for_statement = 25, RULE_return_type = 26, 
		RULE_argument_list = 27, RULE_argument = 28, RULE_expression = 29, RULE_atom = 30, 
		RULE_boolean_literal = 31, RULE_number = 32, RULE_type_params = 33, RULE_type_param = 34, 
		RULE_type = 35, RULE_full_identifier = 36, RULE_identifier = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "import_line", "statements", "block", "statement", "assignment_op", 
			"assignment", "struct_declaration", "struct_body", "struct_item", "struct_property", 
			"struct_declaration_trait_implementation", "trait_declaration", "trait_declaration_body", 
			"trait_declaration_item", "trait_implementation", "trait_implementation_body", 
			"trait_implementation_item", "function_declaration", "function_modifier", 
			"if_statement", "else_if_block", "else_block", "if_while_statement", 
			"while_statement", "for_statement", "return_type", "argument_list", "argument", 
			"expression", "atom", "boolean_literal", "number", "type_params", "type_param", 
			"type", "full_identifier", "identifier"
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

	@Override
	public String getGrammarFileName() { return "RabbitParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RabbitParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public List<Trait_declarationContext> trait_declaration() {
			return getRuleContexts(Trait_declarationContext.class);
		}
		public Trait_declarationContext trait_declaration(int i) {
			return getRuleContext(Trait_declarationContext.class,i);
		}
		public List<Trait_implementationContext> trait_implementation() {
			return getRuleContexts(Trait_implementationContext.class);
		}
		public Trait_implementationContext trait_implementation(int i) {
			return getRuleContext(Trait_implementationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(76);
					function_declaration();
					}
					break;
				case 2:
					{
					setState(77);
					struct_declaration();
					}
					break;
				case 3:
					{
					setState(78);
					trait_declaration();
					}
					break;
				case 4:
					{
					setState(79);
					trait_implementation();
					}
					break;
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (MAIN - 13)) | (1L << (ACCESS_MODIFIER - 13)) | (1L << (FUNCTION - 13)) | (1L << (OPERATOR - 13)) | (1L << (STATIC - 13)) | (1L << (OVERRIDE - 13)) | (1L << (ABSTRACT - 13)) | (1L << (STRUCT - 13)) | (1L << (TRAIT - 13)) | (1L << (LESSTHAN - 13)))) != 0) );
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

	public static class Import_lineContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(RabbitParser.IMPORT, 0); }
		public List<Full_identifierContext> full_identifier() {
			return getRuleContexts(Full_identifierContext.class);
		}
		public Full_identifierContext full_identifier(int i) {
			return getRuleContext(Full_identifierContext.class,i);
		}
		public TerminalNode FROM() { return getToken(RabbitParser.FROM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RabbitParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RabbitParser.COMMA, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RabbitParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RabbitParser.NEWLINE, i);
		}
		public Import_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_line; }
	}

	public final Import_lineContext import_line() throws RecognitionException {
		Import_lineContext _localctx = new Import_lineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_import_line);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(IMPORT);
				setState(85);
				full_identifier(0);
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(FROM);
				setState(87);
				full_identifier(0);
				setState(88);
				match(IMPORT);
				setState(89);
				full_identifier(0);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE || _la==COMMA) {
					{
					{
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(90);
						match(NEWLINE);
						}
						}
						setState(95);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(96);
					match(COMMA);
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(97);
						match(NEWLINE);
						}
						}
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(103);
					full_identifier(0);
					}
					}
					setState(108);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RabbitParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RabbitParser.NEWLINE, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			statement();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(112);
						match(NEWLINE);
						}
						}
						setState(115); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(117);
					statement();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(RabbitParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(RabbitParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(RabbitParser.DEDENT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode PASS() { return getToken(RabbitParser.PASS, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(RabbitParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RabbitParser.NEWLINE, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(COLON);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(124);
				match(NEWLINE);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(INDENT);
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case MAIN:
			case ACCESS_MODIFIER:
			case FUNCTION:
			case OPERATOR:
			case STATIC:
			case OVERRIDE:
			case ABSTRACT:
			case STRUCT:
			case TRAIT:
			case IF:
			case WHILE:
			case FOR:
			case BREAK:
			case CONTINUE:
			case PROCEED:
			case NOT:
			case TRUE:
			case FALSE:
			case LPAREN:
			case LESSTHAN:
			case IDENTIFIER:
				{
				setState(131);
				statements();
				}
				break;
			case PASS:
				{
				setState(132);
				match(PASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(135);
				match(NEWLINE);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(DEDENT);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Trait_declarationContext trait_declaration() {
			return getRuleContext(Trait_declarationContext.class,0);
		}
		public Trait_implementationContext trait_implementation() {
			return getRuleContext(Trait_implementationContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public If_while_statementContext if_while_statement() {
			return getRuleContext(If_while_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(RabbitParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(RabbitParser.CONTINUE, 0); }
		public TerminalNode PROCEED() { return getToken(RabbitParser.PROCEED, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				function_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				struct_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				trait_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				trait_implementation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				if_while_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(150);
				while_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
				for_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(152);
				match(BREAK);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(153);
				match(CONTINUE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(154);
				match(PROCEED);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(155);
				expression(0);
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

	public static class Assignment_opContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(RabbitParser.ASSIGN, 0); }
		public Assignment_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_op; }
	}

	public final Assignment_opContext assignment_op() throws RecognitionException {
		Assignment_opContext _localctx = new Assignment_opContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ASSIGN);
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

	public static class AssignmentContext extends ParserRuleContext {
		public Full_identifierContext full_identifier() {
			return getRuleContext(Full_identifierContext.class,0);
		}
		public Assignment_opContext assignment_op() {
			return getRuleContext(Assignment_opContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RabbitParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RabbitParser.NEWLINE, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			full_identifier(0);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(161);
				match(NEWLINE);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			assignment_op();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(168);
				match(NEWLINE);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			expression(0);
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

	public static class Struct_declarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(RabbitParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RabbitParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(RabbitParser.INDENT, 0); }
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(RabbitParser.DEDENT, 0); }
		public TerminalNode ACCESS_MODIFIER() { return getToken(RabbitParser.ACCESS_MODIFIER, 0); }
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS_MODIFIER) {
				{
				setState(176);
				match(ACCESS_MODIFIER);
				}
			}

			setState(179);
			match(STRUCT);
			setState(180);
			identifier();
			setState(181);
			match(COLON);
			setState(182);
			match(INDENT);
			setState(183);
			struct_body();
			setState(184);
			match(DEDENT);
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

	public static class Struct_bodyContext extends ParserRuleContext {
		public List<Struct_itemContext> struct_item() {
			return getRuleContexts(Struct_itemContext.class);
		}
		public Struct_itemContext struct_item(int i) {
			return getRuleContext(Struct_itemContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RabbitParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RabbitParser.NEWLINE, i);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			struct_item();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(187);
					match(NEWLINE);
					}
					}
					setState(190); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(192);
				struct_item();
				}
				}
				setState(197);
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

	public static class Struct_itemContext extends ParserRuleContext {
		public Struct_propertyContext struct_property() {
			return getRuleContext(Struct_propertyContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Struct_declaration_trait_implementationContext struct_declaration_trait_implementation() {
			return getRuleContext(Struct_declaration_trait_implementationContext.class,0);
		}
		public Struct_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_item; }
	}

	public final Struct_itemContext struct_item() throws RecognitionException {
		Struct_itemContext _localctx = new Struct_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_struct_item);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTHING:
			case NEVER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				struct_property();
				}
				break;
			case MAIN:
			case ACCESS_MODIFIER:
			case FUNCTION:
			case OPERATOR:
			case STATIC:
			case OVERRIDE:
			case ABSTRACT:
			case LESSTHAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				function_declaration();
				}
				break;
			case TRAIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				struct_declaration_trait_implementation();
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

	public static class Struct_propertyContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Struct_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_property; }
	}

	public final Struct_propertyContext struct_property() throws RecognitionException {
		Struct_propertyContext _localctx = new Struct_propertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_struct_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			type();
			setState(204);
			identifier();
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

	public static class Struct_declaration_trait_implementationContext extends ParserRuleContext {
		public TerminalNode TRAIT() { return getToken(RabbitParser.TRAIT, 0); }
		public Full_identifierContext full_identifier() {
			return getRuleContext(Full_identifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RabbitParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(RabbitParser.INDENT, 0); }
		public Trait_implementation_bodyContext trait_implementation_body() {
			return getRuleContext(Trait_implementation_bodyContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(RabbitParser.DEDENT, 0); }
		public Struct_declaration_trait_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration_trait_implementation; }
	}

	public final Struct_declaration_trait_implementationContext struct_declaration_trait_implementation() throws RecognitionException {
		Struct_declaration_trait_implementationContext _localctx = new Struct_declaration_trait_implementationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_struct_declaration_trait_implementation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(TRAIT);
			setState(207);
			full_identifier(0);
			setState(208);
			match(COLON);
			setState(209);
			match(INDENT);
			setState(210);
			trait_implementation_body();
			setState(211);
			match(DEDENT);
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

	public static class Trait_declarationContext extends ParserRuleContext {
		public Full_identifierContext extends_ident;
		public TerminalNode TRAIT() { return getToken(RabbitParser.TRAIT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RabbitParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(RabbitParser.INDENT, 0); }
		public Trait_declaration_bodyContext trait_declaration_body() {
			return getRuleContext(Trait_declaration_bodyContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(RabbitParser.DEDENT, 0); }
		public TerminalNode EXTENDS() { return getToken(RabbitParser.EXTENDS, 0); }
		public TerminalNode ACCESS_MODIFIER() { return getToken(RabbitParser.ACCESS_MODIFIER, 0); }
		public Full_identifierContext full_identifier() {
			return getRuleContext(Full_identifierContext.class,0);
		}
		public Trait_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_declaration; }
	}

	public final Trait_declarationContext trait_declaration() throws RecognitionException {
		Trait_declarationContext _localctx = new Trait_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_trait_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS_MODIFIER) {
				{
				setState(213);
				match(ACCESS_MODIFIER);
				}
			}

			setState(216);
			match(TRAIT);
			setState(217);
			identifier();
			{
			setState(218);
			match(EXTENDS);
			setState(219);
			((Trait_declarationContext)_localctx).extends_ident = full_identifier(0);
			}
			setState(221);
			match(COLON);
			setState(222);
			match(INDENT);
			setState(223);
			trait_declaration_body();
			setState(224);
			match(DEDENT);
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

	public static class Trait_declaration_bodyContext extends ParserRuleContext {
		public List<Trait_declaration_itemContext> trait_declaration_item() {
			return getRuleContexts(Trait_declaration_itemContext.class);
		}
		public Trait_declaration_itemContext trait_declaration_item(int i) {
			return getRuleContext(Trait_declaration_itemContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RabbitParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RabbitParser.NEWLINE, i);
		}
		public Trait_declaration_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_declaration_body; }
	}

	public final Trait_declaration_bodyContext trait_declaration_body() throws RecognitionException {
		Trait_declaration_bodyContext _localctx = new Trait_declaration_bodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_trait_declaration_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			trait_declaration_item();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(227);
					match(NEWLINE);
					}
					}
					setState(230); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(232);
				trait_declaration_item();
				}
				}
				setState(237);
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

	public static class Trait_declaration_itemContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Trait_declaration_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_declaration_item; }
	}

	public final Trait_declaration_itemContext trait_declaration_item() throws RecognitionException {
		Trait_declaration_itemContext _localctx = new Trait_declaration_itemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_trait_declaration_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			function_declaration();
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

	public static class Trait_implementationContext extends ParserRuleContext {
		public TerminalNode TRAIT() { return getToken(RabbitParser.TRAIT, 0); }
		public List<Full_identifierContext> full_identifier() {
			return getRuleContexts(Full_identifierContext.class);
		}
		public Full_identifierContext full_identifier(int i) {
			return getRuleContext(Full_identifierContext.class,i);
		}
		public TerminalNode FOR() { return getToken(RabbitParser.FOR, 0); }
		public TerminalNode COLON() { return getToken(RabbitParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(RabbitParser.INDENT, 0); }
		public Trait_implementation_bodyContext trait_implementation_body() {
			return getRuleContext(Trait_implementation_bodyContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(RabbitParser.DEDENT, 0); }
		public Trait_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_implementation; }
	}

	public final Trait_implementationContext trait_implementation() throws RecognitionException {
		Trait_implementationContext _localctx = new Trait_implementationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_trait_implementation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(TRAIT);
			setState(241);
			full_identifier(0);
			setState(242);
			match(FOR);
			setState(243);
			full_identifier(0);
			setState(244);
			match(COLON);
			setState(245);
			match(INDENT);
			setState(246);
			trait_implementation_body();
			setState(247);
			match(DEDENT);
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

	public static class Trait_implementation_bodyContext extends ParserRuleContext {
		public List<Trait_implementation_itemContext> trait_implementation_item() {
			return getRuleContexts(Trait_implementation_itemContext.class);
		}
		public Trait_implementation_itemContext trait_implementation_item(int i) {
			return getRuleContext(Trait_implementation_itemContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RabbitParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RabbitParser.NEWLINE, i);
		}
		public Trait_implementation_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_implementation_body; }
	}

	public final Trait_implementation_bodyContext trait_implementation_body() throws RecognitionException {
		Trait_implementation_bodyContext _localctx = new Trait_implementation_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_trait_implementation_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			trait_implementation_item();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(250);
					match(NEWLINE);
					}
					}
					setState(253); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(255);
				trait_implementation_item();
				}
				}
				setState(260);
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

	public static class Trait_implementation_itemContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Trait_implementation_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_implementation_item; }
	}

	public final Trait_implementation_itemContext trait_implementation_item() throws RecognitionException {
		Trait_implementation_itemContext _localctx = new Trait_implementation_itemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_trait_implementation_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			function_declaration();
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Token functionType;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(RabbitParser.FUNCTION, 0); }
		public TerminalNode OPERATOR() { return getToken(RabbitParser.OPERATOR, 0); }
		public TerminalNode ACCESS_MODIFIER() { return getToken(RabbitParser.ACCESS_MODIFIER, 0); }
		public Type_paramsContext type_params() {
			return getRuleContext(Type_paramsContext.class,0);
		}
		public List<Function_modifierContext> function_modifier() {
			return getRuleContexts(Function_modifierContext.class);
		}
		public Function_modifierContext function_modifier(int i) {
			return getRuleContext(Function_modifierContext.class,i);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RabbitParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RabbitParser.NEWLINE, i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS_MODIFIER) {
				{
				setState(263);
				match(ACCESS_MODIFIER);
				}
			}

			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(266);
				type_params();
				}
			}

			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIN) | (1L << STATIC) | (1L << OVERRIDE) | (1L << ABSTRACT))) != 0)) {
				{
				{
				setState(269);
				function_modifier();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			((Function_declarationContext)_localctx).functionType = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==FUNCTION || _la==OPERATOR) ) {
				((Function_declarationContext)_localctx).functionType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(276);
			identifier();
			setState(277);
			argument_list();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(278);
				return_type();
				}
			}

			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(281);
				match(NEWLINE);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			block();
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

	public static class Function_modifierContext extends ParserRuleContext {
		public Token modifier;
		public TerminalNode STATIC() { return getToken(RabbitParser.STATIC, 0); }
		public TerminalNode OVERRIDE() { return getToken(RabbitParser.OVERRIDE, 0); }
		public TerminalNode ABSTRACT() { return getToken(RabbitParser.ABSTRACT, 0); }
		public TerminalNode MAIN() { return getToken(RabbitParser.MAIN, 0); }
		public Function_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_modifier; }
	}

	public final Function_modifierContext function_modifier() throws RecognitionException {
		Function_modifierContext _localctx = new Function_modifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			((Function_modifierContext)_localctx).modifier = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIN) | (1L << STATIC) | (1L << OVERRIDE) | (1L << ABSTRACT))) != 0)) ) {
				((Function_modifierContext)_localctx).modifier = (Token)_errHandler.recoverInline(this);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RabbitParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Else_if_blockContext> else_if_block() {
			return getRuleContexts(Else_if_blockContext.class);
		}
		public Else_if_blockContext else_if_block(int i) {
			return getRuleContext(Else_if_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(IF);
			setState(292);
			expression(0);
			setState(293);
			block();
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(294);
					else_if_block();
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(300);
				else_block();
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

	public static class Else_if_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(RabbitParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(RabbitParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_if_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_block; }
	}

	public final Else_if_blockContext else_if_block() throws RecognitionException {
		Else_if_blockContext _localctx = new Else_if_blockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_else_if_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(303);
			match(ELSE);
			setState(304);
			match(IF);
			setState(305);
			expression(0);
			setState(306);
			block();
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

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(RabbitParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(ELSE);
			setState(309);
			block();
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

	public static class If_while_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RabbitParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(RabbitParser.WHILE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_while_statement; }
	}

	public final If_while_statementContext if_while_statement() throws RecognitionException {
		If_while_statementContext _localctx = new If_while_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_if_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(IF);
			setState(312);
			expression(0);
			setState(313);
			match(WHILE);
			setState(314);
			block();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(315);
				else_block();
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RabbitParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(WHILE);
			setState(319);
			expression(0);
			setState(320);
			block();
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(RabbitParser.FOR, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IN() { return getToken(RabbitParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RabbitParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RabbitParser.COMMA, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RabbitParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RabbitParser.NEWLINE, i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(FOR);
			setState(323);
			identifier();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==COMMA) {
				{
				{
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(324);
					match(NEWLINE);
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				match(COMMA);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(331);
					match(NEWLINE);
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(337);
				identifier();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			match(IN);
			setState(344);
			expression(0);
			setState(345);
			block();
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

	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(RabbitParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_return_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(ARROW);
			setState(348);
			type();
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

	public static class Argument_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RabbitParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RabbitParser.RPAREN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(RabbitParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RabbitParser.NEWLINE, i);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RabbitParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RabbitParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_argument_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(LPAREN);
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(351);
					match(NEWLINE);
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (NOTHING - 46)) | (1L << (NEVER - 46)) | (1L << (IDENTIFIER - 46)))) != 0)) {
				{
				setState(357);
				argument();
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(361);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(358);
							match(NEWLINE);
							}
							}
							setState(363);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(364);
						match(COMMA);
						setState(368);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(365);
							match(NEWLINE);
							}
							}
							setState(370);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(371);
						argument();
						}
						} 
					}
					setState(376);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
			}

			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(379);
				match(NEWLINE);
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385);
			match(RPAREN);
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

	public static class ArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			type();
			setState(388);
			identifier();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefixOp;
		public Token op;
		public IdentifierContext customOp;
		public ExpressionContext expression;
		public List<ExpressionContext> args = new ArrayList<ExpressionContext>();
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(RabbitParser.NOT, 0); }
		public TerminalNode DOT() { return getToken(RabbitParser.DOT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(RabbitParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RabbitParser.NEWLINE, i);
		}
		public TerminalNode ASTERISK() { return getToken(RabbitParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(RabbitParser.SLASH, 0); }
		public TerminalNode MODULO() { return getToken(RabbitParser.MODULO, 0); }
		public TerminalNode PLUS() { return getToken(RabbitParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RabbitParser.MINUS, 0); }
		public TerminalNode LESSTHAN() { return getToken(RabbitParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(RabbitParser.GREATERTHAN, 0); }
		public TerminalNode LESSEQUAL() { return getToken(RabbitParser.LESSEQUAL, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(RabbitParser.GREATEREQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(RabbitParser.EQUAL, 0); }
		public TerminalNode AND() { return getToken(RabbitParser.AND, 0); }
		public TerminalNode OR() { return getToken(RabbitParser.OR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RabbitParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RabbitParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RabbitParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RabbitParser.COMMA, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case TRUE:
			case FALSE:
			case LPAREN:
			case IDENTIFIER:
				{
				setState(391);
				atom();
				}
				break;
			case NOT:
				{
				setState(392);
				((ExpressionContext)_localctx).prefixOp = match(NOT);
				setState(393);
				expression(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(539);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(396);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(400);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(397);
							match(NEWLINE);
							}
							}
							setState(402);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(403);
						match(DOT);
						setState(407);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(404);
							match(NEWLINE);
							}
							}
							setState(409);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(410);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(411);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(415);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(412);
							match(NEWLINE);
							}
							}
							setState(417);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(418);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASTERISK) | (1L << SLASH) | (1L << MODULO))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(422);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(419);
							match(NEWLINE);
							}
							}
							setState(424);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(425);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(426);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(430);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(427);
							match(NEWLINE);
							}
							}
							setState(432);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(433);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(437);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(434);
							match(NEWLINE);
							}
							}
							setState(439);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(440);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(441);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(445);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(442);
							match(NEWLINE);
							}
							}
							setState(447);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(448);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (GREATERTHAN - 64)) | (1L << (LESSTHAN - 64)) | (1L << (GREATEREQUAL - 64)) | (1L << (LESSEQUAL - 64)) | (1L << (EQUAL - 64)))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(452);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(449);
							match(NEWLINE);
							}
							}
							setState(454);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(455);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(456);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(460);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(457);
							match(NEWLINE);
							}
							}
							setState(462);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(463);
						((ExpressionContext)_localctx).op = match(AND);
						setState(467);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(464);
							match(NEWLINE);
							}
							}
							setState(469);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(470);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(471);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(475);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(472);
							match(NEWLINE);
							}
							}
							setState(477);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(478);
						((ExpressionContext)_localctx).op = match(OR);
						setState(482);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(479);
							match(NEWLINE);
							}
							}
							setState(484);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(485);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(486);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(490);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(487);
							match(NEWLINE);
							}
							}
							setState(492);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(493);
						((ExpressionContext)_localctx).customOp = identifier();
						setState(494);
						expression(2);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(496);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(500);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(497);
							match(NEWLINE);
							}
							}
							setState(502);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(503);
						match(LPAREN);
						setState(507);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(504);
								match(NEWLINE);
								}
								} 
							}
							setState(509);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
						}
						setState(530);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN))) != 0) || _la==IDENTIFIER) {
							{
							setState(510);
							((ExpressionContext)_localctx).expression = expression(0);
							((ExpressionContext)_localctx).args.add(((ExpressionContext)_localctx).expression);
							setState(527);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(514);
									_errHandler.sync(this);
									_la = _input.LA(1);
									while (_la==NEWLINE) {
										{
										{
										setState(511);
										match(NEWLINE);
										}
										}
										setState(516);
										_errHandler.sync(this);
										_la = _input.LA(1);
									}
									setState(517);
									match(COMMA);
									setState(521);
									_errHandler.sync(this);
									_la = _input.LA(1);
									while (_la==NEWLINE) {
										{
										{
										setState(518);
										match(NEWLINE);
										}
										}
										setState(523);
										_errHandler.sync(this);
										_la = _input.LA(1);
									}
									setState(524);
									((ExpressionContext)_localctx).expression = expression(0);
									((ExpressionContext)_localctx).args.add(((ExpressionContext)_localctx).expression);
									}
									} 
								}
								setState(529);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
							}
							}
						}

						setState(535);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(532);
							match(NEWLINE);
							}
							}
							setState(537);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(538);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RabbitParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RabbitParser.RPAREN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(RabbitParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RabbitParser.NEWLINE, i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode STRING() { return getToken(RabbitParser.STRING, 0); }
		public Full_identifierContext full_identifier() {
			return getRuleContext(Full_identifierContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_atom);
		int _la;
		try {
			setState(564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				match(LPAREN);
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(545);
					match(NEWLINE);
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(551);
				expression(0);
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(552);
					match(NEWLINE);
					}
					}
					setState(557);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(558);
				match(RPAREN);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(561);
				boolean_literal();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(562);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(563);
				full_identifier(0);
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public Token value;
		public TerminalNode TRUE() { return getToken(RabbitParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RabbitParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			((Boolean_literalContext)_localctx).value = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
				((Boolean_literalContext)_localctx).value = (Token)_errHandler.recoverInline(this);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(RabbitParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
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

	public static class Type_paramsContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(RabbitParser.LESSTHAN, 0); }
		public List<Type_paramContext> type_param() {
			return getRuleContexts(Type_paramContext.class);
		}
		public Type_paramContext type_param(int i) {
			return getRuleContext(Type_paramContext.class,i);
		}
		public TerminalNode GREATERTHAN() { return getToken(RabbitParser.GREATERTHAN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RabbitParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RabbitParser.COMMA, i);
		}
		public Type_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_params; }
	}

	public final Type_paramsContext type_params() throws RecognitionException {
		Type_paramsContext _localctx = new Type_paramsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_type_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(LESSTHAN);
			setState(571);
			type_param();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(572);
				match(COMMA);
				setState(573);
				type_param();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579);
			match(GREATERTHAN);
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

	public static class Type_paramContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(RabbitParser.WITH, 0); }
		public TerminalNode TRAIT() { return getToken(RabbitParser.TRAIT, 0); }
		public List<Full_identifierContext> full_identifier() {
			return getRuleContexts(Full_identifierContext.class);
		}
		public Full_identifierContext full_identifier(int i) {
			return getRuleContext(Full_identifierContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(RabbitParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(RabbitParser.AND, i);
		}
		public Type_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_param; }
	}

	public final Type_paramContext type_param() throws RecognitionException {
		Type_paramContext _localctx = new Type_paramContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			identifier();
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(582);
				match(WITH);
				setState(583);
				match(TRAIT);
				setState(584);
				full_identifier(0);
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(585);
					match(AND);
					setState(586);
					full_identifier(0);
					}
					}
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class TypeContext extends ParserRuleContext {
		public Full_identifierContext full_identifier() {
			return getRuleContext(Full_identifierContext.class,0);
		}
		public TerminalNode LESSTHAN() { return getToken(RabbitParser.LESSTHAN, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode GREATERTHAN() { return getToken(RabbitParser.GREATERTHAN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(RabbitParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RabbitParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RabbitParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RabbitParser.COMMA, i);
		}
		public TerminalNode NOTHING() { return getToken(RabbitParser.NOTHING, 0); }
		public TerminalNode NEVER() { return getToken(RabbitParser.NEVER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_type);
		int _la;
		try {
			int _alt;
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				full_identifier(0);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESSTHAN) {
					{
					setState(595);
					match(LESSTHAN);
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(596);
						match(NEWLINE);
						}
						}
						setState(601);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(602);
					type();
					setState(619);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(606);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NEWLINE) {
								{
								{
								setState(603);
								match(NEWLINE);
								}
								}
								setState(608);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(609);
							match(COMMA);
							setState(613);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NEWLINE) {
								{
								{
								setState(610);
								match(NEWLINE);
								}
								}
								setState(615);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(616);
							type();
							}
							} 
						}
						setState(621);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
					}
					setState(625);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(622);
						match(NEWLINE);
						}
						}
						setState(627);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(628);
					match(GREATERTHAN);
					}
				}

				}
				break;
			case NOTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				match(NOTHING);
				}
				break;
			case NEVER:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
				match(NEVER);
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

	public static class Full_identifierContext extends ParserRuleContext {
		public Token packageName;
		public Token ident;
		public List<TerminalNode> IDENTIFIER() { return getTokens(RabbitParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RabbitParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(RabbitParser.COLON, 0); }
		public Full_identifierContext full_identifier() {
			return getRuleContext(Full_identifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RabbitParser.DOT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(RabbitParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RabbitParser.NEWLINE, i);
		}
		public Full_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_identifier; }
	}

	public final Full_identifierContext full_identifier() throws RecognitionException {
		return full_identifier(0);
	}

	private Full_identifierContext full_identifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Full_identifierContext _localctx = new Full_identifierContext(_ctx, _parentState);
		Full_identifierContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_full_identifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(637);
				((Full_identifierContext)_localctx).packageName = match(IDENTIFIER);
				setState(638);
				match(COLON);
				}
				break;
			}
			setState(641);
			((Full_identifierContext)_localctx).ident = match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Full_identifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_full_identifier);
					setState(643);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(644);
						match(NEWLINE);
						}
						}
						setState(649);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(650);
					match(DOT);
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(651);
						match(NEWLINE);
						}
						}
						setState(656);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(657);
					((Full_identifierContext)_localctx).ident = match(IDENTIFIER);
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public Token packageName;
		public Token ident;
		public List<TerminalNode> IDENTIFIER() { return getTokens(RabbitParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RabbitParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(RabbitParser.COLON, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(663);
				((IdentifierContext)_localctx).packageName = match(IDENTIFIER);
				setState(664);
				match(COLON);
				}
				break;
			}
			setState(667);
			((IdentifierContext)_localctx).ident = match(IDENTIFIER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 36:
			return full_identifier_sempred((Full_identifierContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		case 7:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean full_identifier_sempred(Full_identifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u02a0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\6\2S\n\2\r"+
		"\2\16\2T\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3^\n\3\f\3\16\3a\13\3\3\3\3\3\7"+
		"\3e\n\3\f\3\16\3h\13\3\3\3\7\3k\n\3\f\3\16\3n\13\3\5\3p\n\3\3\4\3\4\6"+
		"\4t\n\4\r\4\16\4u\3\4\7\4y\n\4\f\4\16\4|\13\4\3\5\3\5\7\5\u0080\n\5\f"+
		"\5\16\5\u0083\13\5\3\5\3\5\3\5\5\5\u0088\n\5\3\5\7\5\u008b\n\5\f\5\16"+
		"\5\u008e\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u009f\n\6\3\7\3\7\3\b\3\b\7\b\u00a5\n\b\f\b\16\b\u00a8\13\b\3"+
		"\b\3\b\7\b\u00ac\n\b\f\b\16\b\u00af\13\b\3\b\3\b\3\t\5\t\u00b4\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\6\n\u00bf\n\n\r\n\16\n\u00c0\3\n\7\n"+
		"\u00c4\n\n\f\n\16\n\u00c7\13\n\3\13\3\13\3\13\5\13\u00cc\n\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\5\16\u00d9\n\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\6\17\u00e7\n\17\r\17\16\17"+
		"\u00e8\3\17\7\17\u00ec\n\17\f\17\16\17\u00ef\13\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\6\22\u00fe\n\22\r\22\16"+
		"\22\u00ff\3\22\7\22\u0103\n\22\f\22\16\22\u0106\13\22\3\23\3\23\3\24\5"+
		"\24\u010b\n\24\3\24\5\24\u010e\n\24\3\24\7\24\u0111\n\24\f\24\16\24\u0114"+
		"\13\24\3\24\3\24\3\24\3\24\5\24\u011a\n\24\3\24\7\24\u011d\n\24\f\24\16"+
		"\24\u0120\13\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u012a\n\26"+
		"\f\26\16\26\u012d\13\26\3\26\5\26\u0130\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u013f\n\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\7\33\u0148\n\33\f\33\16\33\u014b\13\33\3\33\3\33"+
		"\7\33\u014f\n\33\f\33\16\33\u0152\13\33\3\33\7\33\u0155\n\33\f\33\16\33"+
		"\u0158\13\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\7\35\u0163\n"+
		"\35\f\35\16\35\u0166\13\35\3\35\3\35\7\35\u016a\n\35\f\35\16\35\u016d"+
		"\13\35\3\35\3\35\7\35\u0171\n\35\f\35\16\35\u0174\13\35\3\35\7\35\u0177"+
		"\n\35\f\35\16\35\u017a\13\35\5\35\u017c\n\35\3\35\7\35\u017f\n\35\f\35"+
		"\16\35\u0182\13\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u018d"+
		"\n\37\3\37\3\37\7\37\u0191\n\37\f\37\16\37\u0194\13\37\3\37\3\37\7\37"+
		"\u0198\n\37\f\37\16\37\u019b\13\37\3\37\3\37\3\37\7\37\u01a0\n\37\f\37"+
		"\16\37\u01a3\13\37\3\37\3\37\7\37\u01a7\n\37\f\37\16\37\u01aa\13\37\3"+
		"\37\3\37\3\37\7\37\u01af\n\37\f\37\16\37\u01b2\13\37\3\37\3\37\7\37\u01b6"+
		"\n\37\f\37\16\37\u01b9\13\37\3\37\3\37\3\37\7\37\u01be\n\37\f\37\16\37"+
		"\u01c1\13\37\3\37\3\37\7\37\u01c5\n\37\f\37\16\37\u01c8\13\37\3\37\3\37"+
		"\3\37\7\37\u01cd\n\37\f\37\16\37\u01d0\13\37\3\37\3\37\7\37\u01d4\n\37"+
		"\f\37\16\37\u01d7\13\37\3\37\3\37\3\37\7\37\u01dc\n\37\f\37\16\37\u01df"+
		"\13\37\3\37\3\37\7\37\u01e3\n\37\f\37\16\37\u01e6\13\37\3\37\3\37\3\37"+
		"\7\37\u01eb\n\37\f\37\16\37\u01ee\13\37\3\37\3\37\3\37\3\37\3\37\7\37"+
		"\u01f5\n\37\f\37\16\37\u01f8\13\37\3\37\3\37\7\37\u01fc\n\37\f\37\16\37"+
		"\u01ff\13\37\3\37\3\37\7\37\u0203\n\37\f\37\16\37\u0206\13\37\3\37\3\37"+
		"\7\37\u020a\n\37\f\37\16\37\u020d\13\37\3\37\7\37\u0210\n\37\f\37\16\37"+
		"\u0213\13\37\5\37\u0215\n\37\3\37\7\37\u0218\n\37\f\37\16\37\u021b\13"+
		"\37\3\37\7\37\u021e\n\37\f\37\16\37\u0221\13\37\3 \3 \7 \u0225\n \f \16"+
		" \u0228\13 \3 \3 \7 \u022c\n \f \16 \u022f\13 \3 \3 \3 \3 \3 \3 \5 \u0237"+
		"\n \3!\3!\3\"\3\"\3#\3#\3#\3#\7#\u0241\n#\f#\16#\u0244\13#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\7$\u024e\n$\f$\16$\u0251\13$\5$\u0253\n$\3%\3%\3%\7%\u0258"+
		"\n%\f%\16%\u025b\13%\3%\3%\7%\u025f\n%\f%\16%\u0262\13%\3%\3%\7%\u0266"+
		"\n%\f%\16%\u0269\13%\3%\7%\u026c\n%\f%\16%\u026f\13%\3%\7%\u0272\n%\f"+
		"%\16%\u0275\13%\3%\3%\5%\u0279\n%\3%\3%\5%\u027d\n%\3&\3&\3&\5&\u0282"+
		"\n&\3&\3&\3&\3&\7&\u0288\n&\f&\16&\u028b\13&\3&\3&\7&\u028f\n&\f&\16&"+
		"\u0292\13&\3&\7&\u0295\n&\f&\16&\u0298\13&\3\'\3\'\5\'\u029c\n\'\3\'\3"+
		"\'\3\'\2\4<J(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJL\2\b\3\2\21\22\4\2\17\17\24\26\3\2?A\3\2=>\3\2BF\3\2./\2"+
		"\u02e2\2R\3\2\2\2\4o\3\2\2\2\6q\3\2\2\2\b}\3\2\2\2\n\u009e\3\2\2\2\f\u00a0"+
		"\3\2\2\2\16\u00a2\3\2\2\2\20\u00b3\3\2\2\2\22\u00bc\3\2\2\2\24\u00cb\3"+
		"\2\2\2\26\u00cd\3\2\2\2\30\u00d0\3\2\2\2\32\u00d8\3\2\2\2\34\u00e4\3\2"+
		"\2\2\36\u00f0\3\2\2\2 \u00f2\3\2\2\2\"\u00fb\3\2\2\2$\u0107\3\2\2\2&\u010a"+
		"\3\2\2\2(\u0123\3\2\2\2*\u0125\3\2\2\2,\u0131\3\2\2\2.\u0136\3\2\2\2\60"+
		"\u0139\3\2\2\2\62\u0140\3\2\2\2\64\u0144\3\2\2\2\66\u015d\3\2\2\28\u0160"+
		"\3\2\2\2:\u0185\3\2\2\2<\u018c\3\2\2\2>\u0236\3\2\2\2@\u0238\3\2\2\2B"+
		"\u023a\3\2\2\2D\u023c\3\2\2\2F\u0247\3\2\2\2H\u027c\3\2\2\2J\u027e\3\2"+
		"\2\2L\u029b\3\2\2\2NS\5&\24\2OS\5\20\t\2PS\5\32\16\2QS\5 \21\2RN\3\2\2"+
		"\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\3\3\2"+
		"\2\2VW\7\t\2\2Wp\5J&\2XY\7\n\2\2YZ\5J&\2Z[\7\t\2\2[l\5J&\2\\^\7\5\2\2"+
		"]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bf\7<\2\2"+
		"ce\7\5\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2"+
		"ik\5J&\2j_\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2o"+
		"V\3\2\2\2oX\3\2\2\2p\5\3\2\2\2qz\5\n\6\2rt\7\5\2\2sr\3\2\2\2tu\3\2\2\2"+
		"us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\5\n\6\2xs\3\2\2\2y|\3\2\2\2zx\3\2\2\2"+
		"z{\3\2\2\2{\7\3\2\2\2|z\3\2\2\2}\u0081\7;\2\2~\u0080\7\5\2\2\177~\3\2"+
		"\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0087\7\3\2\2\u0085\u0088\5\6\4\2\u0086"+
		"\u0088\7\62\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008c\3"+
		"\2\2\2\u0089\u008b\7\5\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0090\7\4\2\2\u0090\t\3\2\2\2\u0091\u009f\5\16\b\2\u0092\u009f"+
		"\5&\24\2\u0093\u009f\5\20\t\2\u0094\u009f\5\32\16\2\u0095\u009f\5 \21"+
		"\2\u0096\u009f\5*\26\2\u0097\u009f\5\60\31\2\u0098\u009f\5\62\32\2\u0099"+
		"\u009f\5\64\33\2\u009a\u009f\7\'\2\2\u009b\u009f\7(\2\2\u009c\u009f\7"+
		")\2\2\u009d\u009f\5<\37\2\u009e\u0091\3\2\2\2\u009e\u0092\3\2\2\2\u009e"+
		"\u0093\3\2\2\2\u009e\u0094\3\2\2\2\u009e\u0095\3\2\2\2\u009e\u0096\3\2"+
		"\2\2\u009e\u0097\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u0099\3\2\2\2\u009e"+
		"\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2"+
		"\2\2\u009f\13\3\2\2\2\u00a0\u00a1\7:\2\2\u00a1\r\3\2\2\2\u00a2\u00a6\5"+
		"J&\2\u00a3\u00a5\7\5\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a9\u00ad\5\f\7\2\u00aa\u00ac\7\5\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\5<\37\2\u00b1\17\3\2\2\2\u00b2\u00b4"+
		"\7\20\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2"+
		"\u00b5\u00b6\7\30\2\2\u00b6\u00b7\5L\'\2\u00b7\u00b8\7;\2\2\u00b8\u00b9"+
		"\7\3\2\2\u00b9\u00ba\5\22\n\2\u00ba\u00bb\7\4\2\2\u00bb\21\3\2\2\2\u00bc"+
		"\u00c5\5\24\13\2\u00bd\u00bf\7\5\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\5\24\13\2\u00c3\u00be\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\23\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00cc\5\26\f\2\u00c9\u00cc\5&\24\2\u00ca\u00cc\5\30\r\2\u00cb\u00c8\3"+
		"\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\25\3\2\2\2\u00cd"+
		"\u00ce\5H%\2\u00ce\u00cf\5L\'\2\u00cf\27\3\2\2\2\u00d0\u00d1\7\31\2\2"+
		"\u00d1\u00d2\5J&\2\u00d2\u00d3\7;\2\2\u00d3\u00d4\7\3\2\2\u00d4\u00d5"+
		"\5\"\22\2\u00d5\u00d6\7\4\2\2\u00d6\31\3\2\2\2\u00d7\u00d9\7\20\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\31"+
		"\2\2\u00db\u00dc\5L\'\2\u00dc\u00dd\7\32\2\2\u00dd\u00de\5J&\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\7;\2\2\u00e0\u00e1\7\3\2\2\u00e1\u00e2\5\34\17\2"+
		"\u00e2\u00e3\7\4\2\2\u00e3\33\3\2\2\2\u00e4\u00ed\5\36\20\2\u00e5\u00e7"+
		"\7\5\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\5\36\20\2\u00eb\u00e6\3"+
		"\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\35\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\5&\24\2\u00f1\37\3\2\2\2\u00f2"+
		"\u00f3\7\31\2\2\u00f3\u00f4\5J&\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6\5J&"+
		"\2\u00f6\u00f7\7;\2\2\u00f7\u00f8\7\3\2\2\u00f8\u00f9\5\"\22\2\u00f9\u00fa"+
		"\7\4\2\2\u00fa!\3\2\2\2\u00fb\u0104\5$\23\2\u00fc\u00fe\7\5\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0103\5$\23\2\u0102\u00fd\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105#\3\2\2\2"+
		"\u0106\u0104\3\2\2\2\u0107\u0108\5&\24\2\u0108%\3\2\2\2\u0109\u010b\7"+
		"\20\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u010e\5D#\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0112\3\2\2"+
		"\2\u010f\u0111\5(\25\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0116\t\2\2\2\u0116\u0117\5L\'\2\u0117\u0119\58\35\2\u0118\u011a\5\66"+
		"\34\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011e\3\2\2\2\u011b"+
		"\u011d\7\5\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121"+
		"\u0122\5\b\5\2\u0122\'\3\2\2\2\u0123\u0124\t\3\2\2\u0124)\3\2\2\2\u0125"+
		"\u0126\7\36\2\2\u0126\u0127\5<\37\2\u0127\u012b\5\b\5\2\u0128\u012a\5"+
		",\27\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130\5."+
		"\30\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130+\3\2\2\2\u0131\u0132"+
		"\7\37\2\2\u0132\u0133\7\36\2\2\u0133\u0134\5<\37\2\u0134\u0135\5\b\5\2"+
		"\u0135-\3\2\2\2\u0136\u0137\7\37\2\2\u0137\u0138\5\b\5\2\u0138/\3\2\2"+
		"\2\u0139\u013a\7\36\2\2\u013a\u013b\5<\37\2\u013b\u013c\7!\2\2\u013c\u013e"+
		"\5\b\5\2\u013d\u013f\5.\30\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\61\3\2\2\2\u0140\u0141\7!\2\2\u0141\u0142\5<\37\2\u0142\u0143\5\b\5\2"+
		"\u0143\63\3\2\2\2\u0144\u0145\7\"\2\2\u0145\u0156\5L\'\2\u0146\u0148\7"+
		"\5\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u0150\7<"+
		"\2\2\u014d\u014f\7\5\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2"+
		"\2\2\u0153\u0155\5L\'\2\u0154\u0149\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0159\u015a\7*\2\2\u015a\u015b\5<\37\2\u015b\u015c\5\b\5\2\u015c"+
		"\65\3\2\2\2\u015d\u015e\7G\2\2\u015e\u015f\5H%\2\u015f\67\3\2\2\2\u0160"+
		"\u0164\7\63\2\2\u0161\u0163\7\5\2\2\u0162\u0161\3\2\2\2\u0163\u0166\3"+
		"\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u017b\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0167\u0178\5:\36\2\u0168\u016a\7\5\2\2\u0169\u0168\3\2"+
		"\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0172\7<\2\2\u016f\u0171\7\5"+
		"\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\5:"+
		"\36\2\u0176\u016b\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u0167\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\u0180\3\2\2\2\u017d\u017f\7\5\2\2\u017e"+
		"\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7\64\2\2\u0184"+
		"9\3\2\2\2\u0185\u0186\5H%\2\u0186\u0187\5L\'\2\u0187;\3\2\2\2\u0188\u0189"+
		"\b\37\1\2\u0189\u018d\5> \2\u018a\u018b\7-\2\2\u018b\u018d\5<\37\t\u018c"+
		"\u0188\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u021f\3\2\2\2\u018e\u0192\f\13"+
		"\2\2\u018f\u0191\7\5\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2"+
		"\2\2\u0195\u0199\79\2\2\u0196\u0198\7\5\2\2\u0197\u0196\3\2\2\2\u0198"+
		"\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2"+
		"\2\2\u019b\u0199\3\2\2\2\u019c\u021e\5<\37\f\u019d\u01a1\f\b\2\2\u019e"+
		"\u01a0\7\5\2\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a8\t\4\2\2\u01a5\u01a7\7\5\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2"+
		"\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u021e\5<\37\t\u01ac\u01b0\f\7\2\2\u01ad\u01af\7\5"+
		"\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b7\t\5"+
		"\2\2\u01b4\u01b6\7\5\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01ba\u021e\5<\37\b\u01bb\u01bf\f\6\2\2\u01bc\u01be\7\5\2\2\u01bd"+
		"\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c6\t\6\2\2\u01c3"+
		"\u01c5\7\5\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2"+
		"\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9"+
		"\u021e\5<\37\7\u01ca\u01ce\f\5\2\2\u01cb\u01cd\7\5\2\2\u01cc\u01cb\3\2"+
		"\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d5\7+\2\2\u01d2\u01d4\7\5"+
		"\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u021e\5<"+
		"\37\6\u01d9\u01dd\f\4\2\2\u01da\u01dc\7\5\2\2\u01db\u01da\3\2\2\2\u01dc"+
		"\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2"+
		"\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e4\7,\2\2\u01e1\u01e3\7\5\2\2\u01e2"+
		"\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u021e\5<\37\5\u01e8"+
		"\u01ec\f\3\2\2\u01e9\u01eb\7\5\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2"+
		"\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ef\u01f0\5L\'\2\u01f0\u01f1\5<\37\4\u01f1\u021e\3\2"+
		"\2\2\u01f2\u01f6\f\n\2\2\u01f3\u01f5\7\5\2\2\u01f4\u01f3\3\2\2\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2"+
		"\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fd\7\63\2\2\u01fa\u01fc\7\5\2\2\u01fb"+
		"\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u0214\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0211\5<\37\2\u0201"+
		"\u0203\7\5\2\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2"+
		"\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207"+
		"\u020b\7<\2\2\u0208\u020a\7\5\2\2\u0209\u0208\3\2\2\2\u020a\u020d\3\2"+
		"\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d"+
		"\u020b\3\2\2\2\u020e\u0210\5<\37\2\u020f\u0204\3\2\2\2\u0210\u0213\3\2"+
		"\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0215\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0214\u0200\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0219\3\2"+
		"\2\2\u0216\u0218\7\5\2\2\u0217\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219"+
		"\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0219\3\2"+
		"\2\2\u021c\u021e\7\64\2\2\u021d\u018e\3\2\2\2\u021d\u019d\3\2\2\2\u021d"+
		"\u01ac\3\2\2\2\u021d\u01bb\3\2\2\2\u021d\u01ca\3\2\2\2\u021d\u01d9\3\2"+
		"\2\2\u021d\u01e8\3\2\2\2\u021d\u01f2\3\2\2\2\u021e\u0221\3\2\2\2\u021f"+
		"\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220=\3\2\2\2\u0221\u021f\3\2\2\2"+
		"\u0222\u0226\7\63\2\2\u0223\u0225\7\5\2\2\u0224\u0223\3\2\2\2\u0225\u0228"+
		"\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0229\u022d\5<\37\2\u022a\u022c\7\5\2\2\u022b\u022a\3\2"+
		"\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u0230\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0231\7\64\2\2\u0231\u0237\3"+
		"\2\2\2\u0232\u0237\5B\"\2\u0233\u0237\5@!\2\u0234\u0237\7\7\2\2\u0235"+
		"\u0237\5J&\2\u0236\u0222\3\2\2\2\u0236\u0232\3\2\2\2\u0236\u0233\3\2\2"+
		"\2\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237?\3\2\2\2\u0238\u0239"+
		"\t\7\2\2\u0239A\3\2\2\2\u023a\u023b\7\b\2\2\u023bC\3\2\2\2\u023c\u023d"+
		"\7C\2\2\u023d\u0242\5F$\2\u023e\u023f\7<\2\2\u023f\u0241\5F$\2\u0240\u023e"+
		"\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0245\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0246\7B\2\2\u0246E\3\2\2\2\u0247"+
		"\u0252\5L\'\2\u0248\u0249\7&\2\2\u0249\u024a\7\31\2\2\u024a\u024f\5J&"+
		"\2\u024b\u024c\7+\2\2\u024c\u024e\5J&\2\u024d\u024b\3\2\2\2\u024e\u0251"+
		"\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0253\3\2\2\2\u0251"+
		"\u024f\3\2\2\2\u0252\u0248\3\2\2\2\u0252\u0253\3\2\2\2\u0253G\3\2\2\2"+
		"\u0254\u0278\5J&\2\u0255\u0259\7C\2\2\u0256\u0258\7\5\2\2\u0257\u0256"+
		"\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025c\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u026d\5H%\2\u025d\u025f\7\5\2"+
		"\2\u025e\u025d\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261"+
		"\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0267\7<\2\2\u0264"+
		"\u0266\7\5\2\2\u0265\u0264\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2"+
		"\2\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u0267\3\2\2\2\u026a"+
		"\u026c\5H%\2\u026b\u0260\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2"+
		"\2\u026d\u026e\3\2\2\2\u026e\u0273\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0272"+
		"\7\5\2\2\u0271\u0270\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0276\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0277\7B"+
		"\2\2\u0277\u0279\3\2\2\2\u0278\u0255\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027d\3\2\2\2\u027a\u027d\7\60\2\2\u027b\u027d\7\61\2\2\u027c\u0254\3"+
		"\2\2\2\u027c\u027a\3\2\2\2\u027c\u027b\3\2\2\2\u027dI\3\2\2\2\u027e\u0281"+
		"\b&\1\2\u027f\u0280\7H\2\2\u0280\u0282\7;\2\2\u0281\u027f\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\7H\2\2\u0284\u0296\3\2"+
		"\2\2\u0285\u0289\f\3\2\2\u0286\u0288\7\5\2\2\u0287\u0286\3\2\2\2\u0288"+
		"\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2"+
		"\2\2\u028b\u0289\3\2\2\2\u028c\u0290\79\2\2\u028d\u028f\7\5\2\2\u028e"+
		"\u028d\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2"+
		"\2\2\u0291\u0293\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0295\7H\2\2\u0294"+
		"\u0285\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2"+
		"\2\2\u0297K\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029a\7H\2\2\u029a\u029c"+
		"\7;\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d"+
		"\u029e\7H\2\2\u029eM\3\2\2\2SRT_flouz\u0081\u0087\u008c\u009e\u00a6\u00ad"+
		"\u00b3\u00c0\u00c5\u00cb\u00d8\u00e8\u00ed\u00ff\u0104\u010a\u010d\u0112"+
		"\u0119\u011e\u012b\u012f\u013e\u0149\u0150\u0156\u0164\u016b\u0172\u0178"+
		"\u017b\u0180\u018c\u0192\u0199\u01a1\u01a8\u01b0\u01b7\u01bf\u01c6\u01ce"+
		"\u01d5\u01dd\u01e4\u01ec\u01f6\u01fd\u0204\u020b\u0211\u0214\u0219\u021d"+
		"\u021f\u0226\u022d\u0236\u0242\u024f\u0252\u0259\u0260\u0267\u026d\u0273"+
		"\u0278\u027c\u0281\u0289\u0290\u0296\u029b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}