grammar HLASM;

/**
    Lexer UPPER
    Parser lower
*/

options {
    caseInsensitive = true;
}

prog
    : (line EOL)+ EOF
    ;

line
    : (instruction | directive | macro) /* testing purposes */
    | (label | register)? whitespace+ (instruction | directive | macro) whitespace+ comment
    | (label | register)? whitespace+ (instruction | directive | macro) whitespace+ comment_
    | (label | register)? whitespace+ (instruction | directive | macro) whitespace+
    | (label | register)? whitespace+ (instruction | directive | macro)
    | comment
    ;

instruction
    : opcode whitespace+ argument comma? argument? comma? argument?
    | opcode whitespace+ argument comma argument argument
    | sect
    ;

directive
    : dircode whitespace+ argument comma? argument? comma? argument?
    | dircode whitespace+ argument comma argument argument
    | dircode
    ;

argument
    : curloc (relative | bracketarg)?
    | register (relative | bracketarg)?
    | label (relative | bracketarg)?
    | bracketarg
    | literal
    ;

macro
    : macode whitespace+ (literal | label)
    | macode
    ;

label
    : STRING
    ;

whitespace
    : WHITESPACE
    ;

comma
    : COMMA
    ;

opcode
    : OPCODE
    ;

register
    : REGISTER
    ;

relative
    : RELATIVE
    ;

sect
    : SECT
    ;

curloc
    : CURLOC
    ;

dircode
    : DIRCODE
    ;

bracketarg
    : BRACKETREG
    | BRACKETLEN
    ;

literal
    : LITERAL
    ;

macode
    : MACODE
    ;

comment
    : LONGCOM
    | '*'~EOL*
    ;

comment_
    : ~EOL*
    ;

LITERAL
    : '=X' QUOTE (STRING | INTEGER)+ QUOTE
    | ('X' | 'H') QUOTE (STRING | INTEGER)+ QUOTE
    | 'C' QUOTE (WHITESPACE | COMMA | STRING | COMMSTRING)+ QUOTE
    | INTEGER? 'XL' INTEGER+ QUOTE (STRING | INTEGER)+ QUOTE
    | INTEGER? 'CL' INTEGER+ QUOTE (WHITESPACE | COMMA | STRING | COMMSTRING)+ QUOTE
    ;

BRACKETREG
    : '(' COMMA? REGISTER ')'
    ;

BRACKETLEN
    : '(' INTEGER+ ')'
    ;

DIRCODE
    : 'USING'
    | 'LTORG'
    | 'EQU'
    | 'END'
    | 'NOP'
    | 'DS'
    | 'DC'
    ;

SECT
    : 'CSECT'
    | 'DSECT'
    ;

CURLOC
    : '*'  /** aster represents current loc.
     when used it statements like EQU * it is a seperate token to the directive.
     */
    ;

RELATIVE
    : '+'INTEGER /** relative addresses can be used, e.g., +4 */
    ;

REGISTER /** registeres equated to prefix R popular stylistic programming choice,
    Technically register names can be equated to any string but grammar will not cover that case.
    */
    : '0' | 'R0'
    | '1' | 'R1'
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
    | 'BE'
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
    | 'MP'
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
    : [A-Z0-9@$#&]+ /** chars allowed in labels */
    ;

COMMSTRING
    : [.\-():/!_%`"'=><+?]+ /** chars not allowed in labels but allowed in comments */
    ;

QUOTE
    : ["']
    ;

LONGCOM
    : [*][*]+
    ;

INTEGER
    : [0-9]+
    ;

EOL
    : [\r\n]+
    ;

COMMA
    : [,]
    ;

WHITESPACE
    : [ \t]+
    ;