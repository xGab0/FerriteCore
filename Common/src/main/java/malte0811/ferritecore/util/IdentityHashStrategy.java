package malte0811.ferritecore.util;

import it.unimi.dsi.fastutil.Hash;

public enum IdentityHashStrategy implements Hash.Strategy<Object> {
    INSTANCE;

    private IdentityHashStrategy() {
    }

    public int hashCode(Object o) {
        return System.identityHashCode(o);
    }

    public boolean equals(Object o, Object o2) {
        return o == o2;
    }
}