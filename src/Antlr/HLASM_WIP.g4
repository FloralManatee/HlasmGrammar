grammar HLASM_WIP;

/**
    Lexer UPPER
    Parser lower
*/

prog
    : line+ EOF
    ;

line
    : label? op operands? comment?
    ;

label
    : LABEL
    ;

 op
    : DIRCODE
    | OPCODE
    | MACODE
    ;

comment
    : COMMENT
    ;

operands
    : ((REGISTER RELATIVE?)|(LABEL RELATIVE?)|(CURLOC RELATIVE?)|RELATIVE) ',' ((REGISTER RELATIVE?)|(LABEL RELATIVE?)|(CURLOC RELATIVE?)|RELATIVE) (',' ((REGISTER RELATIVE?)|(LABEL RELATIVE?)|(CURLOC RELATIVE?)|RELATIVE))*?
    ;

DIRCODE
    : 'USING'
    | 'LTORG'
    | 'EQU'
    | 'END'
    | 'NOP'
    | 'DS'
    | 'DC'
    | 'TITLE'
    | 'PRINT'
    | 'DCB'
    | 'CSECT'
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
    : 'R'?[0-9]
    | 'R'?[1][0-5]
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
    | 'YREGS'
    | 'OPEN'
    | 'CLOSE'
    | 'GET'
    ;

LABEL
    : [A-Z0-9@$#&]+ /** chars allowed in labels */
    ;

COMMENT
    : [*][.\- ():/!_%`"'=><+?A-Z0-9@$#&]+
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