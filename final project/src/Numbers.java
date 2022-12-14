package org.javapractices.project;

public class Numbers {
    private static final String TYPE_IS_NOT_SUPPORTED = "given type is not supported";

    public static <T extends Number> T add(Class<T> type, T first, T second) {
        if (Integer.class.equals(type)) {
            return (T) Integer.valueOf(first.intValue() + second.intValue());
        } else if (Long.class.equals(type)) {
            return (T) Long.valueOf(first.longValue() + second.longValue());
        } else if (Float.class.equals(type)) {
            return (T) Float.valueOf(first.floatValue() + second.floatValue());
        } else if (Double.class.equals(type)) {
            return (T) Double.valueOf(first.doubleValue() + second.doubleValue());
        } else if (Byte.class.equals(type)) {
            return (T) Byte.valueOf((byte) (first.byteValue() + second.byteValue()));
        } else if (Short.class.equals(type)) {
            return (T) Short.valueOf((short) (first.shortValue() + second.shortValue()));
        }
        throw new IllegalArgumentException(TYPE_IS_NOT_SUPPORTED);
    }

    public static <T extends Number> T minus(Class<T> type, T first, T second) {
        if (Integer.class.equals(type)) {
            return (T) Integer.valueOf(first.intValue() - second.intValue());
        } else if (Long.class.equals(type)) {
            return (T) Long.valueOf(first.longValue() - second.longValue());
        } else if (Float.class.equals(type)) {
            return (T) Float.valueOf(first.floatValue() - second.floatValue());
        } else if (Double.class.equals(type)) {
            return (T) Double.valueOf(first.doubleValue() - second.doubleValue());
        } else if (Byte.class.equals(type)) {
            return (T) Byte.valueOf((byte) (first.byteValue() - second.byteValue()));
        } else if (Short.class.equals(type)) {
            return (T) Short.valueOf((short) (first.shortValue() - second.shortValue()));
        }
        throw new IllegalArgumentException(TYPE_IS_NOT_SUPPORTED);
    }

    public static <T extends Number> T multiply(Class<T> type, T first, T second) {
        if (Integer.class.equals(type)) {
            return (T) Integer.valueOf(first.intValue() * second.intValue());
        } else if (Long.class.equals(type)) {
            return (T) Long.valueOf(first.longValue() * second.longValue());
        } else if (Float.class.equals(type)) {
            return (T) Float.valueOf(first.floatValue() * second.floatValue());
        } else if (Double.class.equals(type)) {
            return (T) Double.valueOf(first.doubleValue() * second.doubleValue());
        } else if (Byte.class.equals(type)) {
            return (T) Byte.valueOf((byte) (first.byteValue() * second.byteValue()));
        } else if (Short.class.equals(type)) {
            return (T) Short.valueOf((short) (first.shortValue() * second.shortValue()));
        }
        throw new IllegalArgumentException(TYPE_IS_NOT_SUPPORTED);
    }

    public static <T extends Number> T divide(Class<T> type, T first, T second) {
        if (Integer.class.equals(type)) {
            return (T) Integer.valueOf(first.intValue() / second.intValue());
        } else if (Long.class.equals(type)) {
            return (T) Long.valueOf(first.longValue() / second.longValue());
        } else if (Float.class.equals(type)) {
            return (T) Float.valueOf(first.floatValue() / second.floatValue());
        } else if (Double.class.equals(type)) {
            return (T) Double.valueOf(first.doubleValue() / second.doubleValue());
        } else if (Byte.class.equals(type)) {
            return (T) Byte.valueOf((byte) (first.byteValue() / second.byteValue()));
        } else if (Short.class.equals(type)) {
            return (T) Short.valueOf((short) (first.shortValue() / second.shortValue()));
        }
        throw new IllegalArgumentException(TYPE_IS_NOT_SUPPORTED);
    }

    public static <T extends Number> T mod(Class<T> type, T first, T second) {
        if (Integer.class.equals(type)) {
            return (T) Integer.valueOf(first.intValue() % second.intValue());
        } else if (Long.class.equals(type)) {
            return (T) Long.valueOf(first.longValue() % second.longValue());
        } else if (Float.class.equals(type)) {
            return (T) Float.valueOf(first.floatValue() % second.floatValue());
        } else if (Double.class.equals(type)) {
            return (T) Double.valueOf(first.doubleValue() % second.doubleValue());
        } else if (Byte.class.equals(type)) {
            return (T) Byte.valueOf((byte) (first.byteValue() % second.byteValue()));
        } else if (Short.class.equals(type)) {
            return (T) Short.valueOf((short) (first.shortValue() % second.shortValue()));
        }
        throw new IllegalArgumentException(TYPE_IS_NOT_SUPPORTED);
    }

    public static <T extends Number> T zero(Class<T> type) {
        if (Integer.class.equals(type)) {
            return (T) Integer.valueOf(0);
        } else if (Long.class.equals(type)) {
            return (T) Long.valueOf(0);
        } else if (Float.class.equals(type)) {
            return (T) Float.valueOf(0F);
        } else if (Double.class.equals(type)) {
            return (T) Double.valueOf(0.0);
        } else if (Byte.class.equals(type)) {
            return (T) Byte.valueOf((byte) 0);
        } else if (Short.class.equals(type)) {
            return (T) Short.valueOf((short) 0);
        }
        throw new IllegalArgumentException(TYPE_IS_NOT_SUPPORTED);
    }

    public static <T extends Number> T one(Class<T> type) {
        if (Integer.class.equals(type)) {
            return (T) Integer.valueOf(1);
        } else if (Long.class.equals(type)) {
            return (T) Long.valueOf(1);
        } else if (Float.class.equals(type)) {
            return (T) Float.valueOf(1F);
        } else if (Double.class.equals(type)) {
            return (T) Double.valueOf(1.0);
        } else if (Byte.class.equals(type)) {
            return (T) Byte.valueOf((byte) 1);
        } else if (Short.class.equals(type)) {
            return (T) Short.valueOf((short) 1);
        }
        throw new IllegalArgumentException(TYPE_IS_NOT_SUPPORTED);
    }
    
    public static Object getType(String type) {
        if ("Integer".equals(type)) {
            return Integer.class;
        } else if ("Long".equals(type)) {
            return Long.TYPE;
        } else if ("Float".equals(type)) {
            return Float.TYPE;
        } else if ("Double".equals(type)) {
            return Double.TYPE;
        } else if ("Byte".equals(type)) {
            return Byte.TYPE;
        } else if ("Short".equals(type)) {
            return Short.TYPE;
        }
        throw new IllegalArgumentException(TYPE_IS_NOT_SUPPORTED);
    }
    
    public static <T extends Number> String toStr(Class<T> type, T num) {
        if (Integer.class.equals(type)) {
            return Integer.toString((int) num);
        } else if (Long.class.equals(type)) {
            return Long.toString((long) num);
        } else if (Float.class.equals(type)) {
            return Float.toString((float) num);
        } else if (Double.class.equals(type)) {
            return Double.toString((double) num);
        } else if (Byte.class.equals(type)) {
            return Byte.toString((byte) num);
        } else if (Short.class.equals(type)) {
            return Short.toString((short) num);
        }
        throw new IllegalArgumentException(TYPE_IS_NOT_SUPPORTED);
    }
    
    public static <T extends Number> T fromStr(Class<T> type, String num) {
        if (Integer.class.equals(type)) {
            return (T) Integer.valueOf(Integer.parseInt(num));
        } else if (Long.class.equals(type)) {
            return (T) Long.valueOf(Long.parseLong(num));
        } else if (Float.class.equals(type)) {
            return (T) Float.valueOf(Float.parseFloat(num));
        } else if (Double.class.equals(type)) {
            return (T) Double.valueOf(Double.parseDouble(num));
        } else if (Short.class.equals(type)) {
            return (T) Short.valueOf((short) Short.parseShort(num));
        } else if (Byte.class.equals(type)) {
            return (T) Byte.valueOf((byte) Byte.parseByte(num));
        }
        throw new IllegalArgumentException(TYPE_IS_NOT_SUPPORTED);
    }
}
