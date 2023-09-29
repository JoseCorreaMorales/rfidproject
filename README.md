# Jag Pay Transit 🐯💳



## Problem statement

The Higher Technological Institute of Ciudad Hidalgo offers the service of public transportation along the 18 de Marzo route, which is commonly used by the majority of students to reach the institute's facilities.

As the primary transportation route for most students, it faces some inconveniences, such as the payment system. This route continues to charge its service in the traditional way, requiring cash payment. Over the years, this has presented several issues.




One of the main problems is that students often do not pay with the exact amount, and they sometimes use high-denomination bills. This can result in the first passengers receiving change for their fare, but as more students or people unrelated to the institution use the route, the combi (shared van) may run out of sufficient change to return to the majority of passengers. This creates a bottleneck in paying for transportation, leading to a loss of time in reaching the school on time.



Another issue arises from the perspective of the combi drivers, who encourage everyone using the route to pay their fare upon boarding to maintain better control during fare collection. In many instances, students and external individuals using the route pay their fare only when they are about to exit the combi. This lack of synchronization creates a challenge for the drivers as they need to focus on driving safely with passengers on board. Often, they forget who paid upon boarding or who is yet to pay upon exiting. This reliance on passengers to pay results in some individuals taking advantage of the situation, avoiding payment and causing financial losses for both the drivers and the route in general.

&nbsp; 
&nbsp; 

<p align="center">
  <img src="https://img.shields.io/badge/-Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin Icon" />
  <img src="https://img.shields.io/badge/-Android%20Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white" alt="Android Studio Icon" />
  <img src="https://img.shields.io/badge/-Volley-4285F4?style=for-the-badge" alt="Volley Icon" />
  <img src="https://img.shields.io/badge/-PHP-777BB4?style=for-the-badge&logo=php&logoColor=white" alt="PHP Icon" />
  <img src="https://img.shields.io/badge/-REST%20API-FF6C37?style=for-the-badge" alt="REST API Icon" />
  <img src="https://img.shields.io/badge/-MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL Icon" />
  <img src="https://img.shields.io/badge/-RFID%20Cards-009688?style=for-the-badge" alt="RFID Cards Icon" />
  <img src="https://img.shields.io/badge/-RFID%20Sensors-009688?style=for-the-badge" alt="RFID Sensors Icon" />
  <img src="https://img.shields.io/badge/-Arduino-00979D?style=for-the-badge&logo=arduino&logoColor=white" alt="Arduino Icon" />
</p>

## Goal 
Develop a payment system with RFID cards using PHP for the server and Kotlin for the mobile application.

<p align="center">
  <img src="./app/src/main/res/drawable/card_payment.png" alt="Pay icon" width="120" height="120" />
</p>

## Features

* Use a rfid card to pay for the service in a sensor located in each combi
* User authentication
* Show payment history

&nbsp; 
&nbsp;

## Design 
<p align="center">
  <img src="./app/src/main/res/drawable/mockup.png" alt="Jag Pay Transit"  />
</p>




## REST API, database and Arduino code
[RFID API ](https://github.com/JoseCorreaMorales/rfidAPI)




## Technologies/Tools Used
* Kotlin
* Android Studio
* Volley for HTTP requests
* PHP REST API
* ESP32
* MySQL
* RFID cards
* RFID sensors
* Arduino


## Circuit Diagram

Connection diagram of the ESP32 with the RFID reader and the screen where various messages will be displayed every time an action is performed with the reader.

<p align="center">
  <img src="./app/src/main/res/drawable/circuit_diagram.png" alt="Circuit Diagram" width="500"  />
</p>

## Installation
* Configure the base API URL in Config.kt.
* Compile and install the app on an Android device.
* Usage
* Register and log in.
* Check the list of registered transactions.

## Requirements
* Android 5.0 or higher
