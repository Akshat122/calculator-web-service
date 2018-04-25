/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akshatkhanna.javawebservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Akshat
 */
@WebService(serviceName = "CalculatorWebService")
public class CalculatorWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "add")
    public int addTwo(@WebParam(name = "num1") int a, @WebParam(name = "num2") int b) {
        return a + b;
    }

    @WebMethod(operationName = "subtract")
    public int subTwo(@WebParam(name = "num1") int a, @WebParam(name = "num2") int b) {
        return a - b;
    }

    @WebMethod(operationName = "muliply")
    public int mulTwo(@WebParam(name = "num1") int a, @WebParam(name = "num2") int b) {
        return a * b;
    }

    @WebMethod(operationName = "divide")
    public int divTwo(@WebParam(name = "num1") int a, @WebParam(name = "num2") int b) {
        return a / b;
    }
}
