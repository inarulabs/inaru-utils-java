package net.inaru.utils.contracts;

public interface EnumEquals {

    default boolean equals(String name) {
        return toString().equalsIgnoreCase(name);
    }

}