lexer grammar HLASM1Lexer;

options {
    caseInsensitive = true;
}

INSTRUCTION
    : 'PRINT'
    | 'CSECT'
    | 'USING'
    | 'END'
    ;

MACRO
    : 'SAVE'
    | 'RETURN'
    | 'WTO'
    | 'LTORG'
    ;

OPCODE
    : 'BASR'
    | 'LA'
    | 'ST'
    | 'L'
    | 'DS'
    | 'DC'
    ;

STRING
    : APOS (CHAR | NUM | WHITESPACE | SPEC)+ APOS
    ;

DYNCLENTH
    : CLENGTH LBRACKET 'L' APOS LABEL DISPLACEMENT RBRACKET
    ;

STORAGE
    : NUM+'F'
    ;

CLENGTH
    : NUM*'AL'NUM*
    | NUM*'CL'NUM*
    ;

PARMS
    : 'ON' | 'OFF'
    | 'GEN' | 'NOGEN'
    | 'DATA' | 'NODATA'
    ;

MPARM
    : 'TEXT'
    | 'ROUTCDE'
    | 'RC'
    ;

EQUREGISTER
    : 'R'REGISTER
    ;



DISPLACEMENT
    : '+'NUM*
    | '-'NUM*
    ;

LABEL
    : CHAR(CHAR|NUM|SPEC)*
    ;

CHAR
    : [A-Z]
    ;

REGISTER
    : '0' | '1' | '2' | '3'
    | '4' | '5' | '6' | '7'
    | '8' | '9' | '10' | '11'
    | '12' | '13' | '14' | '15'
    ;

NUM
    : [0-9]
    ;

SPEC
    : [@$&]
    ;

WHITESPACE
    : [ \t]+ -> channel(HIDDEN)
    ;

EOL
    : [\r\n]+
    | [\r]+
    ;

LBRACKET
    : '('
    ;

RBRACKET
    : ')'
    ;

ASTER
    : '*'
    ;

APOS
    : [']
    ;

COMMA
    : ','
    ;

EQUALS
    : '='
    ;

PLUS
    : '+'
    ;

