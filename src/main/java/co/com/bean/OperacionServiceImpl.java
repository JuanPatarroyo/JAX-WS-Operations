/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bean;

import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author jpatarroyo
 */
@Stateless
@WebService(endpointInterface = "co.com.bean.OperationServiceWS")
public class OperacionServiceImpl implements OperationServiceWS {

    @Override
    public int sum(int numA, int numB) {
        return numA+numB;
    }

    @Override
    public int subtract(int numA, int numB) {
        return numA-numB;
    }
    
}
