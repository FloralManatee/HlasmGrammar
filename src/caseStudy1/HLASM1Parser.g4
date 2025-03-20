parser grammar HLASM1Parser;

options {
    tokenVocab = HLASM1Lexer;
    caseInsensitive = true;
}

prog
    : (line)+ EOF
    ;

line
    : label? (instruction | macro | operation) EOL
    ;

label
    : LABEL
    ;

instruction
    : INSTRUCTION parms*
    ;

macro
    : MACRO moperands*
    ;

operation
    : OPCODE ooperands*
    ;

parms
    : PARMS (COMMA PARMS)*
    | ASTER (COMMA register)*
    | LABEL
    ;

moperands
    : LBRACKET register (COMMA register)* RBRACKET (COMMA MPARM EQUALS ((NUM)+ | register))*
    | MPARM EQUALS LBRACKET register RBRACKET (COMMA MPARM EQUALS LBRACKET register (COMMA register)* RBRACKET)*
    ;

ooperands
    : register (COMMA(register DISPLACEMENT? | label DISPLACEMENT?))*
    | STORAGE
    | CLENGTH STRING?
    | DYNCLENTH STRING?
    ;

register
    : REGISTER | EQUREGISTER
    ;