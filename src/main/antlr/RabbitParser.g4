parser grammar RabbitParser
	;

options {
	tokenVocab = RabbitLexer;
}

program
	: (
		function_declaration
		| struct_declaration
		| trait_declaration
		| trait_implementation
	)+
	;

import_line
	: IMPORT full_identifier
	| FROM full_identifier IMPORT full_identifier (
		NEWLINE* COMMA NEWLINE* full_identifier
	)*
	;

statements: statement (NEWLINE+ statement)*;
block: COLON NEWLINE* INDENT (statements | PASS) NEWLINE* DEDENT;

statement
	: assignment
	| function_declaration
	| struct_declaration
	| trait_declaration
	| trait_implementation
	| if_statement
	| if_while_statement
	| while_statement
	| for_statement
	| BREAK
	| CONTINUE
	| PROCEED
	| expression
	;

assignment_op: ASSIGN;

assignment
	: full_identifier NEWLINE* assignment_op NEWLINE* expression
	;

struct_declaration
	: ACCESS_MODIFIER? STRUCT identifier COLON INDENT struct_body DEDENT
	;
struct_body: struct_item (NEWLINE+ struct_item)*;
struct_item
	: struct_property
	| function_declaration
	| struct_declaration_trait_implementation
	;
struct_property: type identifier;
struct_declaration_trait_implementation
	: TRAIT full_identifier COLON INDENT trait_implementation_body DEDENT
	;

trait_declaration
	: ACCESS_MODIFIER? TRAIT identifier (EXTENDS extends_ident=full_identifier) COLON INDENT
		trait_declaration_body DEDENT
	;
trait_declaration_body
	: trait_declaration_item (NEWLINE+ trait_declaration_item)*
	;
trait_declaration_item: function_declaration;

trait_implementation
	: TRAIT full_identifier FOR full_identifier COLON INDENT trait_implementation_body
		DEDENT
	;
trait_implementation_body
	: trait_implementation_item (
		NEWLINE+ trait_implementation_item
	)*
	;
trait_implementation_item: function_declaration;

function_declaration
	: ACCESS_MODIFIER? type_params? function_modifier* functionType = (
		FUNCTION
		| OPERATOR
	) identifier argument_list return_type? NEWLINE* block
	;
function_modifier: modifier=(STATIC | OVERRIDE | ABSTRACT | MAIN);

if_statement
	: IF expression block else_if_block* else_block?
	;
else_if_block: (ELSE IF expression block);
else_block: ELSE block;
if_while_statement: IF expression WHILE block else_block?;
while_statement: WHILE expression block;
for_statement
	: FOR identifier (NEWLINE* COMMA NEWLINE* identifier)* IN expression block
	;

return_type: ARROW type;
argument_list
	: LPAREN NEWLINE* (
		argument (NEWLINE* COMMA NEWLINE* argument)*
	)? NEWLINE* RPAREN
	;
argument: type identifier;

expression
	: atom
	| expression NEWLINE* DOT NEWLINE* expression
	| expression NEWLINE* LPAREN NEWLINE* (
		args += expression (
			NEWLINE* COMMA NEWLINE* args += expression
		)*
	)? NEWLINE* RPAREN
	| prefixOp = NOT expression
	| expression NEWLINE* op = (ASTERISK | SLASH | MODULO) NEWLINE* expression
	| expression NEWLINE* op = (PLUS | MINUS) NEWLINE* expression
	| expression NEWLINE* op = (
		LESSTHAN
		| GREATERTHAN
		| LESSEQUAL
		| GREATEREQUAL
		| EQUAL
	) NEWLINE* expression
	| expression NEWLINE* op = AND NEWLINE* expression
	| expression NEWLINE* op = OR NEWLINE* expression
	| expression NEWLINE* customOp = identifier expression
	;

atom
	: LPAREN NEWLINE* expression NEWLINE* RPAREN
	| number
	| boolean_literal
	| STRING
	| full_identifier
	;

boolean_literal: value=(TRUE | FALSE);
number: NUMBER;

type_params
	: LESSTHAN type_param (COMMA type_param)* GREATERTHAN
	;
type_param
	: identifier (
		WITH TRAIT full_identifier (AND full_identifier)*
	)?
	;
type
	: full_identifier (
		LESSTHAN NEWLINE* type (NEWLINE* COMMA NEWLINE* type)* NEWLINE* GREATERTHAN
	)?
	| NOTHING
	| NEVER
	;

full_identifier
	: (packageName = IDENTIFIER COLON)? ident = IDENTIFIER
	| full_identifier NEWLINE* DOT NEWLINE* ident = IDENTIFIER
	;

identifier
	: (packageName = IDENTIFIER COLON)? ident = IDENTIFIER
	;