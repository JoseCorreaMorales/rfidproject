package com.example.rfidproject

/**import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}*/

import android.content.Context
import android.content.SharedPreferences
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MainActivityUnitTest {

    @Mock
    private lateinit var mockContext: Context

    @Mock
    private lateinit var mockSharedPreferences: SharedPreferences

    @Mock
    private lateinit var mockEditor: SharedPreferences.Editor

    private lateinit var mainActivity: MainActivity

    @Before
    fun setup() {
        mainActivity = MainActivity()

        // Mock SharedPreferences
        `when`(mockContext.getSharedPreferences("sesion", 0)).thenReturn(mockSharedPreferences)
        `when`(mockSharedPreferences.edit()).thenReturn(mockEditor)

        // Initialize views
        mainActivity.btnLogin = Button(mockContext)
        mainActivity.username = EditText(mockContext)
        mainActivity.password = TextInputLayout(mockContext)
    }

    @Test
    fun testLoginValidationEmptyUser() {
        mainActivity.username.text = null
        mainActivity.password.editText?.setText("password")

        mainActivity.login()

        assertEquals("Ingresa el usuario", mainActivity.username.error)
    }

    @Test
    fun testLoginValidationEmptyPassword() {
        mainActivity.username.setText("username")
        mainActivity.password.editText?.setText(null)

        mainActivity.login()

        assertEquals("Ingresa la clave", mainActivity.username.error)
    }

    @Test
    fun testLoginSuccess() {
        mainActivity.username.setText("username")
        mainActivity.password.editText?.setText("password")

        mainActivity.login()

        // Add assertions for the expected behavior after successful login
    }

    @Test
    fun testLoginFailure() {
        mainActivity.username.setText("username")
        mainActivity.password.editText?.setText("wrong_password")

        mainActivity.login()

        // Add assertions for the expected behavior after failed login
    }
}