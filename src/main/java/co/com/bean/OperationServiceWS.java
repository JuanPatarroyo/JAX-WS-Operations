/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bean;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author jpatarroyo
 */
@WebService
public interface OperationServiceWS {
    
    @WebMethod
    @WebResult(name = "resultado")
    public int sum(@WebParam(name = "numeroA") int numA, @WebParam(name = "numeroB") int numB);
    @WebMethod
    @WebResult(name = "resultado")
    public int subtract(@WebParam(name = "numeroA") int numA, @WebParam(name = "numeroB") int numB);

}
