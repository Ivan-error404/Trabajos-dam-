package com.dam;

import java.util.regex.Pattern;

public class PasswordValidator
{

    // Regex: Al menos una mayúscula, una minúscula y un número
    private static final String COMPLEX_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).+$";

    public boolean isValid(String password)
    {
        if (password == null)
            return false;

        // Regla 1: Longitud mínima de 8
        if (password.length() < 8)
        {
            throw new IllegalArgumentException("La contraseña es demasiado corta");
        }

        // Regla 2: Patrón de complejidad
        return Pattern.compile(COMPLEX_PATTERN).matcher(password).matches();
    }

    public boolean isValidComplex(String password)
    {
        if (password == null)
            return false;

        // Regla 1: Longitud mínima de 12
        if (password.length() < 12)
        {
            throw new IllegalArgumentException("La contraseña es demasiado corta");
        }

        // Regla 2: Patrón de complejidad con símbolos
        String complexPatternWithSymbols = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).+$";
        return Pattern.compile(complexPatternWithSymbols).matcher(password).matches();
    }
    
}
//FIn 