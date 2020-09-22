package net.inaru.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public final class StreamUtils {

    public static <T> Stream<T> collectionStream(Collection<T> collection) {
        return collection == null || collection.isEmpty() ? Stream.empty() : collection.stream();
    }

    public static <T> T[] merge(T[]... arrays) {
        List<T> merged = new ArrayList<>();
        Stream.of(arrays).flatMap(Stream::of).forEach(merged::add);
        return (T[]) merged.toArray();
    }

}
