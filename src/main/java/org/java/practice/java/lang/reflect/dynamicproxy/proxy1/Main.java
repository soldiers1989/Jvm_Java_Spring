package org.java.practice.java.lang.reflect.dynamicproxy.proxy1;

public class Main {

    public static void main(String[] args) {
        FontProvider fontProvider = ProviderFactory.getFontProvider();
        Font font = fontProvider.getFont("微软雅黑");
    }

}
