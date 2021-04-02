# currencyconverter

CurrencyConverter is a K-tor backend project written in kotlin. This is based on educational currency convertion inspired by revolut currency converter application. 
This project is for those who are willing to develop currency convertor mobile application and need a backend support. This API, returns educational data every new second for the app to respond accordingly.

Practical implementation of this project can be found here below: 
https://github.com/devesh-bhardwaj-21/CurrencyConverterApp 

Pre-requisite:
Intellij idea

Use http://localhost:8080/ as a base url to use it in your frontend project.

Endpoints: 
@GET("currency")
@GET("currency/{base}") => @Path("base") base: String
