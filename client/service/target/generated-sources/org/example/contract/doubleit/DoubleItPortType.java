package org.example.contract.doubleit;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-08-21T17:44:55.248+02:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://www.example.org/contract/DoubleIt", name = "DoubleItPortType")
@XmlSeeAlso({org.example.schema.doubleit.ObjectFactory.class})
public interface DoubleItPortType {

    @WebMethod(operationName = "DoubleIt")
    @RequestWrapper(localName = "DoubleIt", targetNamespace = "http://www.example.org/schema/DoubleIt", className = "org.example.schema.doubleit.DoubleIt")
    @ResponseWrapper(localName = "DoubleItResponse", targetNamespace = "http://www.example.org/schema/DoubleIt", className = "org.example.schema.doubleit.DoubleItResponse")
    @WebResult(name = "doubledNumber", targetNamespace = "")
    public int doubleIt(
        @WebParam(name = "numberToDouble", targetNamespace = "")
        int numberToDouble
    );
}