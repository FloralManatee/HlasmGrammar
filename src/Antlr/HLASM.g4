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
    : opcode whitespace? register','(register | label)
    | opcode whitespace? register','register
    ;

opcode
    : OPCODE
    ;

register
    : REGISTER
    ;

directive
    : dircode whitespace? (curloc | STRING | INTEGER)?
    ;

curloc
    : CURLOC
    ;

dircode
    : DIRCODE
    ;

macro
    : macode (STRING | INTEGER)
    ;

macode
    : MACRO
    ;

comment
    : COMMENT
    ;

DIRCODE
    : 'USING'
    | 'CSECT'
    | 'LTORG'
    | 'EQU'
    | 'END'
    | 'DS'
    | 'DC'
    ;

CURLOC
    : '*'  /** aster represents current loc.
     when used it statements like EQU * it is a seperate token to the directive.
     */
    ;

REGISTER /** registeres equated to prefix R popular stylistic programming choice,
    Technically register names can be equated to any string but grammar will not cover that case.
    */
    : '1' | 'R1'
    | '2' | 'R2'
    | '3' | 'R3'
    | '4' | 'R4'
    | '5' | 'R5'
    | '6' | 'R6'
    | '7' | 'R7'
    | '8' | 'R8'
    | '9' | 'R9'
    | '10'| 'R10'
    | '11'| 'R11'
    | '12'| 'R12'
    | '13'| 'R13'
    | '14'| 'R14'
    | '15'| 'R15'
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