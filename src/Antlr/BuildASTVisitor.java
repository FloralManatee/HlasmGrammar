package Antlr;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import Antlr.HLASMParser.*;

class BuildASTVisitor extends HLASMBaseVisitor<Void> {
    @Override
    public Void visitProg(HLASMParser.ProgContext context) {
        for (HLASMParser.LineContext lineContext : context.line()) {
            visit(lineContext);
        }
        return null;
    }

    @Override
    public Void visitLine(HLASMParser.LineContext context) {
        if (context.label() != null) {
            visit(context.label());
        }
        if (context.instruction() != null) {
            visit(context.instruction());
        } else if (context.directive() != null) {
            visit(context.directive());
        } else if (context.macro() != null) {
            visit(context.macro());
        } else if (context.comment() != null) {
            visit(context.comment());
        }
        return null;
    }

    @Override
    public Void visitLabel(HLASMParser.LabelContext context) {
        String label = context.STRING().getText();
        return null;
    }

    @Override
    public Void visitInstruction(HLASMParser.InstructionContext context) {
        String opcode = context.opcode().getText();
        String register = context.register().toString();
        return null;
    }

    @Override
    public Void visitDirective(HLASMParser.DirectiveContext context) {
        String dircode = context.dircode().getText();
        return null;
    }

    @Override
    public Void visitMacro(HLASMParser.MacroContext context) {
        String macode = context.macode().getText();
        String argument = context.STRING() != null ? context.STRING().getText() : context.INTEGER().getText();
        return null;
    }

    @Override
    public Void visitComment(HLASMParser.CommentContext context) {
        String commentText = context.getText();
        return null;
    }
}
