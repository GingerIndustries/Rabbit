lexer grammar RabbitLexer
	;

tokens {
	INDENT,
	DEDENT
}

@lexer::header {
  import com.yuvalshavit.antlr4.DenterHelper;
}

@lexer::members {
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
}

fragment SPACES: [ \t]+;

NEWLINE: ( '\r'? '\n' | '\r' | '\f') SPACES?;

WHITESPACE: SPACES -> channel(HIDDEN);

STRING: '"' .*? '"';
NUMBER: [0-9_]+ ('.' [0-9_]+)?;

IMPORT: 'import';
FROM: 'from';

PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';
INTERNAL: 'internal';
MAIN: 'main';
ACCESS_MODIFIER: PUBLIC | PRIVATE | PROTECTED | INTERNAL;

FUNCTION: 'function';
OPERATOR: 'operator';
CONSTRUCTOR: 'constructor';

STATIC: 'static';
OVERRIDE: 'override';
ABSTRACT: 'abstract';
DEFAULT: 'default';

STRUCT: 'struct';
TRAIT: 'trait';

EXTENDS: 'extends';
IMPLEMENTS: 'implements';

SELF: 'self';
SUPER: 'super';

IF: 'if';
ELSE: 'else';
USING: 'using';
WHILE: 'while';
FOR: 'for';
MATCH: 'match';
CASE: 'case';
ANY: 'any';
WITH: 'with';

BREAK: 'break';
CONTINUE: 'continue';
PROCEED: 'proceed';

IN: 'in';
AND: 'and';
OR: 'or';
NOT: 'not';

TRUE: 'true';
FALSE: 'false';
NOTHING: 'nothing';
NEVER: 'never';

PASS: 'pass';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LSQBRACKET: '[';
RSQBRACKET: ']';

DOT: '.';
ASSIGN: '=';
COLON: ':';
COMMA: ',';

PLUS: '+';
MINUS: '-';
ASTERISK: '*';
SLASH: '/';
MODULO: '%';

GREATERTHAN: '>';
LESSTHAN: '<';
GREATEREQUAL: '>=';
LESSEQUAL: '<=';
EQUAL: '==';

ARROW: '->';

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;