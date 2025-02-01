grammar HLASM1;

options {
    caseInsensitive = true;
}

prog
    : (line)+ EOF
    ;

line
    : label? instruction EOL
    ;

label
    : CHAR(CHAR|NUM|SPEC)*
    ;

instruction
    : INSTRUCTION parms*
    ;

parms
    : PARMS (','PARMS)*
    ;

INSTRUCTION
    : 'PRINT'
    | 'CSECT'
    ;

PARMS
    : 'ON' | 'OFF'
    | 'GEN' | 'NOGEN'
    | 'DATA' | 'NODATA'
    ;

CHAR
    : [A-Z]
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
    ;