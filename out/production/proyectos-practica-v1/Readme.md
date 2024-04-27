Descripción
Convierte una cadena de texto en un número entero.

Sintaxis
public static int parseInt(CharSequence s, int beginIndex, int endIndex, int radix) throws NumberFormatException
public static int parseInt(String s) throws NumberFormatException
public static int parseInt(String s, int radix) throws NumberFormatException
Parámetros
String s,
int beginIndex,
int radix,
CharSequence s,
int endIndex,
Excepciones
IndexOutOfBoundsException, NumberFormatException, NullPointerException

Clase Padre
Integer

Ejemplo
Integer numero = Integer.parseInt("12");