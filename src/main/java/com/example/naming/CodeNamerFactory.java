package com.example.naming;

public class CodeNamerFactory {
    public static CodeNamer getCodeNamer(boolean likeCaddyShackTwo) {
        if (likeCaddyShackTwo) {
            return new CaddyshackCodeNamer();
        } else {
            return new CodeNamer() {
                @Override
                public CodeName makeCodeName(String realName) {
                    return new CodeName();
                }
            };
        }
    }
}
