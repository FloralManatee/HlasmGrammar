@echo off
setlocal enabledelayedexpansion

rem Specify the list of Java files (space-separated)
set "fileList=HLASMVisitor.java HLASMParser.java HLASMListener.java HLASMLexer.java HLASMBaseVisitor.java HLASMBaseListener.java"

rem Loop through each specified Java file
for %%f in (%fileList%) do (
    rem Check if the file exists
    if exist "%%f" (
        rem Create a temporary file
        set "tempfile=%%f.tmp"

        rem Write the package line to the temporary file
        echo package Antlr; > "!tempfile!"

        rem Append the original file's contents to the temporary file
        type "%%f" >> "!tempfile!"

        rem Replace the original file with the temporary file
        move /y "!tempfile!" "%%f"
    ) else (
        echo File %%f does not exist.
    )
)

endlocal
