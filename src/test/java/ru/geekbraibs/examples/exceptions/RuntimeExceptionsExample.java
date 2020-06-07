package ru.geekbraibs.examples.exceptions;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.ElementNotVisibleException;


public class RuntimeExceptionsExample {
    public static void main(String[] args) {
//         Деление на ноль
//        try {
//            System.out.println(arithmeticExceptionExample(5, 0));
//        } catch (ArithmeticException exception) {
//            exception.printStackTrace();
//            System.out.println("I'm fine!");
//        }
//
//         Доступ к несуществующему элементу массива
//        int[] a = {1, 2, 3, 4, 5};
//        System.out.println(getElementByIndex(a, 10));
//
//         Ошибка приведения типов
//        Object object = 1;
//        System.out.println((String) object);
//
//         ObjectUtils.Null Pointer exception
//        Object o = null;
//        System.out.println(o.hashCode());
//
//        String index out of bounds
//        char a = getByIndex(12);
        throw new ElementNotVisibleException("123");
    }

    public static double arithmeticExceptionExample(int a, int b) {
        return a / b;
    }

    public static int getElementByIndex(int[] a, int i) {
        return a[i];
    }

    public static char getByIndex(int index)  {
        return "Бармаглот".charAt(index);
    }
}
