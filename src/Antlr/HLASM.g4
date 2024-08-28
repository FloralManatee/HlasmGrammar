grammar HLASM;

/**
    Lexer UPPER
    Parser lower
*/

options {
    caseInsensitive = true;
}

prog
    : line+ EOF
    ;

line
    : label? whitespace? (instruction | directive | macro) whitespace? comment? EOL
    | comment EOL
    ;

label
    : STRING
    ;

whitespace
    : WHITESPACE
    ;

instruction
    : OPCODE WHITESPACE? REGISTER','(REGISTER | label)
    | OPCODE WHITESPACE? REGISTER','REGISTER
    ;

directive
    : DIRECTIVE WHITESPACE? (STRING | INTEGER)?
    ;

macro
    : MACRO (STRING | INTEGER)
    ;

comment:
    : COMMENT
    ;

DIRECTIVE
    : 'USING'
    | 'CSECT'
    | 'LTORG'
    | 'EQU'
    | 'EQU *'
    | 'END'
    | 'DS'
    | 'DC'
    ;

REGISTER
    : '1' | 'R1'
    | '2'
    | '3'
    | '4'
    | '5'
    | '6'
    | '7'
    | '8'
    | '9'
    | '10'
    | '11'
    | '12'
    | '13'
    | '14'
    | '15'
    ;

OPCODE
    : 'L'
    | 'LA'
    | 'A'
    ;

MACRO
    : 'IF'
    | 'LOAD'
    ;

STRING
    : [A-Z][A-Z0-9]*
    ;

INTEGER
    : [0-9]+
    ;

COMMENT
    : [*][*A-Z0-9 ]*
    ;

EOL
    : [\r\n]+
    ;

WHITESPACE          
    : (' ' | '\t')
    ;