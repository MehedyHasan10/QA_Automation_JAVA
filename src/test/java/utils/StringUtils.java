package utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class StringUtils {
    private final String DOUBLE_REGEX = "[^\\d.]";

    public Double getDoubleFromString(String text) {
        return Double.parseDouble(text.replaceAll(DOUBLE_REGEX, ""));
    }
}
