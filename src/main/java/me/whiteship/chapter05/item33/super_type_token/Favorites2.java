package me.whiteship.chapter05.item33.super_type_token;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Favorites2 {

    private final Map<TypeRef<?>, Object> favorites = new HashMap<>();

    public <T> void put(TypeRef<T> tTypeRef, T thing) {
        favorites.put(tTypeRef, thing);
    }

    public <T> T get(T)

}
