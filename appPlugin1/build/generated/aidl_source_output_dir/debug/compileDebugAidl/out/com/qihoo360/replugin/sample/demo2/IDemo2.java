/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.qihoo360.replugin.sample.demo2;
/**
 * @author RePlugin Team
 */
public interface IDemo2 extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.qihoo360.replugin.sample.demo2.IDemo2
{
private static final java.lang.String DESCRIPTOR = "com.qihoo360.replugin.sample.demo2.IDemo2";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.qihoo360.replugin.sample.demo2.IDemo2 interface,
 * generating a proxy if needed.
 */
public static com.qihoo360.replugin.sample.demo2.IDemo2 asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.qihoo360.replugin.sample.demo2.IDemo2))) {
return ((com.qihoo360.replugin.sample.demo2.IDemo2)iin);
}
return new com.qihoo360.replugin.sample.demo2.IDemo2.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
java.lang.String descriptor = DESCRIPTOR;
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(descriptor);
return true;
}
case TRANSACTION_hello:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
this.hello(_arg0);
reply.writeNoException();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements com.qihoo360.replugin.sample.demo2.IDemo2
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void hello(java.lang.String str) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(str);
mRemote.transact(Stub.TRANSACTION_hello, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_hello = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void hello(java.lang.String str) throws android.os.RemoteException;
}
