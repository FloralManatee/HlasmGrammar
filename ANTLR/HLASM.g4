grammar HLASM;

options {
    caseInsensitive = true;
}

prog
    : line+ EOF
    ;

line
    : lbl? (instruction | directive) comment? EOL
    | comment EOL
    ;

instruction
    : opcode WHITESPACE? register_','constant
    | opcode WHITESPACE? register_','register_
    ;

opcode
    : OPCODE
    ;

register_
    : REGISTER
    ;

directive
    : assemblerdirective
    ;

assemblerdirective
    : ASSEMBLER_DIRECTIVE
    ;

lbl
    : label
    ;

label
    : name
    ;

constant
    : name
    ;

name
    : NAME
    ;

number
    : NUMBER
    ;

comment
    : COMMENT
    ;

ASSEMBLER_DIRECTIVE
    : 'USING'
    | 'CSECT'
    | 'LTORG'
    | 'END'
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
    | 'EQU'
    ;

NAME
    : [A-Z] [A-Z0-9."]*
    ;

NUMBER
    : [0-9]+
    ;

COMMENT
    : [*][A-Z ]*
    ;

EOL
    : [\r\n]+
    ;

WHITESPACE          
    : (' ' | '\t')
    ;