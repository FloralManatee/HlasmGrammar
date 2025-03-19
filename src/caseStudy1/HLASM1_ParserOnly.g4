parser grammar HLASM1_ParserOnly;

options {
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
    : LBRACKET register (COMMA register)* RBRACKET (COMMA MPARM EQUAL ((NUM)+ | register))*
    | MPARM EQUAL LBRACKET register RBRACKET (COMMA MPARM EQUAL LBRACKET register (COMMA register)* RBRACKET)*
    ;

ooperands
    : register (COMMA (register DISPLACEMENT? | label DISPLACEMENT?))*
    | STORAGE
    | CLENGTH (STRING)?
    | DYNCLENTH (STRING)?
    ;

register
    : REGISTER | EQUREGISTER
    ;