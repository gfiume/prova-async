package service;

import javax.jws.WebService;

@WebService(targetNamespace = "http://www.example.org/contract/DoubleIt",
            portName="DoubleItPort",
            serviceName = "DoubleItService",
            endpointInterface = "org.example.contract.doubleit.DoubleItPortType")
public class DoubleItPortTypeImpl {

    public int doubleIt(int numberToDouble) {
        return numberToDouble * 2;
    }
}
