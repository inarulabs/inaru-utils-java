package net.inaru.utils.contracts;

public interface EnumHelper {

    default boolean equals(String name) {
        return toString().equalsIgnoreCase(name);
    }

}