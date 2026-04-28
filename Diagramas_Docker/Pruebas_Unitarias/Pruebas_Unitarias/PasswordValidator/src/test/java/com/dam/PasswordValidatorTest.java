package com.dam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PasswordValidatorTest
{

    private final PasswordValidator validator = new PasswordValidator();

    @Test
    @DisplayName("Debería lanzar excepción si la contraseña es muy corta")
    void testExceptionLongitud()
    {
        // Verificamos que el código EXPLOTE cuando debe
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            validator.isValid("123Abc");
        });

        assertEquals("La contraseña es demasiado corta", exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings =
    { "solominis1", "SOLOMAYUS1", "SinNumeroAbc", "123456789" })
    @DisplayName("Debería rechazar contraseñas que no cumplen el patrón de complejidad")
    void testComplejidadInvalida(String passwordInvalida)
    {
        assertFalse(validator.isValid(passwordInvalida), "Falló al rechazar: " + passwordInvalida);
    }

    @Test
    @DisplayName("Debería aceptar una contraseña perfectamente válida")
    void testPasswordValida()
    {
        assertTrue(validator.isValid("Segura123"), "Debería ser válida (Mayús, Minús, Núm y +8)");
    }

    @Test
    @DisplayName("Debería retornar false si es nula (sin lanzar excepción)")
    void testNull()
    {
        assertFalse(validator.isValid(null));
    }
}
