package com.example.naming;

/**
 * When attempting to sabotage Jack Hartounian, it's important to use a code name
 * so you don't get caught.
 */
public interface CodeNamer {
    /**
     * Produce a code name for a given real name.  Output for given input should always be the same.
     *
     * @param realName Real name to be used to generate a code name from.
     * @return CodeName object containing the input real name and the generated code name.
     */
    CodeName makeCodeName(String realName);
}
