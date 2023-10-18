/**
 * OrderService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.paazl.soap.generated;

public interface OrderService extends javax.xml.rpc.Service {
    public String getOrderSoap11Address();

    public com.paazl.soap.generated.Order getOrderSoap11() throws javax.xml.rpc.ServiceException;

    public com.paazl.soap.generated.Order getOrderSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
