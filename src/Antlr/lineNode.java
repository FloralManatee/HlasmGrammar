package Antlr;

abstract class LineNode {
}

abstract class execLineNode extends LineNode {
    private LineNode left;
    private LineNode right;

    public LineNode getLeft() {
        return left;
    }

    public void setLeft(LineNode left) {
        this.left = left;
    }

    public LineNode getRight() {
        return right;
    }

    public void setRight(LineNode right) {
        this.right = right;
    }
}

class LabelNode extends execLineNode {
}

class WhitespaceNode extends execLineNode {
}

class InstructionNode extends execLineNode {
}

class DirectiveNode extends execLineNode {
}

class MacroNode extends execLineNode {
}

class CommentNode extends execLineNode {
}

class NegateNode extends LineNode {
    private LineNode innerNode;

    public LineNode getInnerNode() {
        return innerNode;
    }

    public void setInnerNode(LineNode innerNode) {
        this.innerNode = innerNode;
    }
}

class CommNode extends LineNode {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}