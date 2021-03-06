package compiler.semantics;

import compiler.syntax.Type;

public class VarData {
    public Type type;

    public VarData(Type type) {
        this.type = type;
    }

    public String toString() {
        return "("+type+")";
    }
}
