// **********************************************************************
//
// Copyright (c) 2003-2018 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.4
//
// <auto-generated>
//
// Generated from file `jugo_node_service.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package net.platon.vm.slice.node.service;

public interface NodeSessionPrx extends Ice.ObjectPrx
{
    public void inputData(String taskId, String fromUser, byte[] data);

    public void inputData(String taskId, String fromUser, byte[] data, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_inputData(String taskId, String fromUser, byte[] data);

    public Ice.AsyncResult begin_inputData(String taskId, String fromUser, byte[] data, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_inputData(String taskId, String fromUser, byte[] data, Ice.Callback __cb);

    public Ice.AsyncResult begin_inputData(String taskId, String fromUser, byte[] data, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_inputData(String taskId, String fromUser, byte[] data, Callback_NodeSession_inputData __cb);

    public Ice.AsyncResult begin_inputData(String taskId, String fromUser, byte[] data, java.util.Map<String, String> __ctx, Callback_NodeSession_inputData __cb);

    public Ice.AsyncResult begin_inputData(String taskId, 
                                           String fromUser, 
                                           byte[] data, 
                                           IceInternal.Functional_VoidCallback __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_inputData(String taskId, 
                                           String fromUser, 
                                           byte[] data, 
                                           IceInternal.Functional_VoidCallback __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_inputData(String taskId, 
                                           String fromUser, 
                                           byte[] data, 
                                           java.util.Map<String, String> __ctx, 
                                           IceInternal.Functional_VoidCallback __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_inputData(String taskId, 
                                           String fromUser, 
                                           byte[] data, 
                                           java.util.Map<String, String> __ctx, 
                                           IceInternal.Functional_VoidCallback __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb);

    public void end_inputData(Ice.AsyncResult __result);
}