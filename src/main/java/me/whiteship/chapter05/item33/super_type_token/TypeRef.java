package me.whiteship.chapter05.item33.super_type_token;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TypeRef<T>{

    private final Type type;

    public TypeRef() {
        ParameterizedType superclass = (ParameterizedType) getClass().getGenericSuperclass();
        type = superclass.getActualTypeArguments()[0];
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof TypeRef && ((TypeRef)o).type.equals(type);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Type getType() {
        return type;
    }
}
