# RFID Project

Este proyecto tiene como objetivo implementar un sistema de identificación por radiofrecuencia (RFID) utilizando un lector RFID y una tarjeta de desarrollo ESP32. La intención con este proyecto es facilitar la implementación de sistemas de control de acceso a diferentes entornos, tales como edificios, oficinas, centros de datos, laboratorios, entre otros.

## Componentes

* Lector RFID serie: modelo AH-064
* Tarjeta de desarrollo: ESP32
* Antena RFID de frecuencia de 13.56 MHz
* Conexión a Internet

## Instalación y configuración

1. Clonar este repositorio: git clone https://github.com/JoseCorreaMorales/rfidproject.git
2. Instalar las librerías necesarias: pip install -r requirements.txt
3. Conectar el lector RFID serie y la antena a la tarjeta de desarrollo ESP32
4. Configurar la conexión a Internet en la placa ESP32 usando las credenciales de la red WiFi, si se desea guardar los logs en una base de datos remota
5. En caso de almacenar los logs en la tarjeta de desarrollo, usar la plataforma Arduino IDE para cargar el archivo esp32_code.ino en la ESP32
6. Ejecutar el archivo read_rfid.py en una terminal y verificar que el lector de RFID está leyendo las etiquetas correctamente


```grade
 defaultConfig {
        applicationId "com.example.rfidproject"
        minSdk 21
        targetSdk 33 //bf 32
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }
```
### Dependencias
```kotlin
dependencies {

    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.9.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'androidx.navigation:navigation-fragment-ktx:2.5.3'
    implementation 'androidx.navigation:navigation-ui-ktx:2.5.3'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
    implementation 'com.android.volley:volley:1.2.1'
}
```
### Volley usando el patron Singlenton 
https://guides.codepath.com/android/networking-with-the-volley-library

## Contribuir

Para contribuir a este proyecto, por favor seguir los siguientes pasos:

1. Abre un pull request describiendo en detalle los cambios propuestos
2. Después de la revisión, el pull request será fusionado al proyecto

## Licencia
Este proyecto está bajo la licencia MIT - ver LICENSE para detalles.

## Autor
José Correa Morales - GitHub
