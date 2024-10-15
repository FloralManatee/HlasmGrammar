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
    : label? whitespace*? (instruction | directive | macro)? whitespace*? comment? EOL /* ExecLine */
    ;

label
    : STRING
    ;

whitespace
    : WHITESPACE
    ;

instruction
    : opcode whitespace*? register','(register | label | relative | curloc)
    | opcode whitespace*? register','register
    ;

opcode
    : OPCODE
    ;

register
    : REGISTER
    ;

directive
    : dircode whitespace? (curloc | STRING | INTEGER | relative | register | label) ','? (curloc | STRING | INTEGER | relative | register | label)?
    ;

relative
    : RELATIVE
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
    : MACODE
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
    | 'NOP'
    | 'DS'
    | 'DC'
    ;

CURLOC
    : '*'  /** aster represents current loc.
     when used it statements like EQU * it is a seperate token to the directive.
     */
    ;

RELATIVE
    : '+'INTEGER /** rative addresses can be used, e.g., +4 */
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

OPCODE /** 370 instruction set from http://www.simotime.com/simoi370.htm */
    : 'L'
    | 'LA'
    | 'A'
    | 'AL'
    | 'AH'
    | 'ALR'
    | 'AP'
    | 'AR'
    | 'BAL'
    | 'BALR'
    | 'BAS'
    | 'BASR'
    | 'BC'
    | 'B'
    | 'BCR'
    | 'BR'
    | 'BCT'
    | 'BCTR'
    | 'BXH'
    | 'BXLE'
    | 'BNL'
    | 'BNE'
    | 'BNH'
    | 'C'
    | 'CDS'
    | 'CH'
    | 'CL'
    | 'CLC'
    | 'CLCL'
    | 'CLI'
    | 'CLM'
    | 'CLR'
    | 'CP'
    | 'CR'
    | 'CS'
    | 'CVB'
    | 'CVD'
    | 'D'
    | 'DP'
    | 'DR'
    | 'ED'
    | 'EDMK'
    | 'EX'
    | 'IC'
    | 'ICM'
    | 'LCR'
    | 'LH'
    | 'LM'
    | 'LNR'
    | 'LPR'
    | 'LR'
    | 'LTR'
    | 'M'
    | 'MH'
    | 'MVC'
    | 'MR'
    | 'MVCIN'
    | 'MVCL'
    | 'MVI'
    | 'MVN'
    | 'MVO'
    | 'MVZ'
    | 'N'
    | 'NC'
    | 'NI'
    | 'NR'
    | 'O'
    | 'OC'
    | 'OI'
    | 'OR'
    | 'PACK'
    | 'S'
    | 'SH'
    | 'SL'
    | 'SLA'
    | 'SLDA'
    | 'SLDL'
    | 'SLL'
    | 'SLR'
    | 'SP'
    | 'SPM'
    | 'SR'
    | 'SRA'
    | 'SRDA'
    | 'SRDL'
    | 'SRL'
    | 'SRP'
    | 'ST'
    | 'STC'
    | 'STCK'
    | 'STCM'
    | 'STH'
    | 'STM'
    | 'SVC'
    | 'TM'
    | 'TR'
    | 'TRT'
    | 'UNPK'
    | 'X'
    | 'XC'
    | 'XI'
    | 'XR'
    | 'ZAP'
    ;

MACODE
    : 'IF'
    | 'LOAD'
    | 'WTO'
    ;

STRING
    : [A-Z][A-Z0-9@]*
    ;

INTEGER
    : [0-9]+
    ;

COMMENT
    : [*][*A-Z0-9 .\-():/,@$#!_%`"'=]*
    ;

EOL
    : [\r\n]+
    ;

WHITESPACE
    : [ \t] -> channel(HIDDEN)
    ;