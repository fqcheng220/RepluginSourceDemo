/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.qihoo360.loader2;
/**
 * @author RePlugin Team
 */
public interface IPluginHost extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.qihoo360.loader2.IPluginHost
{
private static final java.lang.String DESCRIPTOR = "com.qihoo360.loader2.IPluginHost";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.qihoo360.loader2.IPluginHost interface,
 * generating a proxy if needed.
 */
public static com.qihoo360.loader2.IPluginHost asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.qihoo360.loader2.IPluginHost))) {
return ((com.qihoo360.loader2.IPluginHost)iin);
}
return new com.qihoo360.loader2.IPluginHost.Stub.Proxy(obj);
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
case TRANSACTION_installBinder:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
this.installBinder(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_fetchBinder:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.IBinder _result = this.fetchBinder(_arg0);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
case TRANSACTION_fetchPersistentCookie:
{
data.enforceInterface(descriptor);
long _result = this.fetchPersistentCookie();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_startPluginProcess:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
com.qihoo360.loader2.PluginBinderInfo _arg2;
if ((0!=data.readInt())) {
_arg2 = com.qihoo360.loader2.PluginBinderInfo.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
com.qihoo360.loader2.IPluginClient _result = this.startPluginProcess(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
if ((_arg2!=null)) {
reply.writeInt(1);
_arg2.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_attachPluginProcess:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.os.IBinder _arg2;
_arg2 = data.readStrongBinder();
java.lang.String _arg3;
_arg3 = data.readString();
java.lang.String _result = this.attachPluginProcess(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_listPlugins:
{
data.enforceInterface(descriptor);
java.util.List<com.qihoo360.replugin.model.PluginInfo> _result = this.listPlugins();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_regActivity:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
this.regActivity(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_unregActivity:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
this.unregActivity(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_regService:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.regService(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_unregService:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.unregService(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_regPluginBinder:
{
data.enforceInterface(descriptor);
com.qihoo360.loader2.PluginBinderInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = com.qihoo360.loader2.PluginBinderInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
this.regPluginBinder(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_unregPluginBinder:
{
data.enforceInterface(descriptor);
com.qihoo360.loader2.PluginBinderInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = com.qihoo360.loader2.PluginBinderInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.IBinder _arg1;
_arg1 = data.readStrongBinder();
this.unregPluginBinder(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_regReceiver:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.Map _arg1;
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_arg1 = data.readHashMap(cl);
this.regReceiver(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_unregReceiver:
{
data.enforceInterface(descriptor);
this.unregReceiver();
reply.writeNoException();
return true;
}
case TRANSACTION_onReceive:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
android.content.Intent _arg2;
if ((0!=data.readInt())) {
_arg2 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.onReceive(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_sumBinders:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _result = this.sumBinders(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_updatePluginInfo:
{
data.enforceInterface(descriptor);
com.qihoo360.replugin.model.PluginInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = com.qihoo360.replugin.model.PluginInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.updatePluginInfo(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_pluginDownloaded:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
com.qihoo360.replugin.model.PluginInfo _result = this.pluginDownloaded(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_pluginUninstalled:
{
data.enforceInterface(descriptor);
com.qihoo360.replugin.model.PluginInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = com.qihoo360.replugin.model.PluginInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.pluginUninstalled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_pluginExtracted:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.pluginExtracted(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_sendIntent2Process:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.sendIntent2Process(_arg0, _arg1);
return true;
}
case TRANSACTION_sendIntent2Plugin:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.sendIntent2Plugin(_arg0, _arg1);
return true;
}
case TRANSACTION_sendIntent2ProcessSync:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.sendIntent2ProcessSync(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_sendIntent2PluginSync:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.Intent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.sendIntent2PluginSync(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isProcessAlive:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isProcessAlive(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_queryPluginBinder:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
android.os.IBinder _result = this.queryPluginBinder(_arg0, _arg1);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
case TRANSACTION_queryPluginsReceiverList:
{
data.enforceInterface(descriptor);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.util.List _result = this.queryPluginsReceiverList(_arg0);
reply.writeNoException();
reply.writeList(_result);
return true;
}
case TRANSACTION_fetchServiceServer:
{
data.enforceInterface(descriptor);
com.qihoo360.replugin.component.service.server.IPluginServiceServer _result = this.fetchServiceServer();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_fetchManagerServer:
{
data.enforceInterface(descriptor);
com.qihoo360.replugin.packages.IPluginManagerServer _result = this.fetchManagerServer();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getTaskAffinityGroupIndex:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getTaskAffinityGroupIndex(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPidByProcessName:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getPidByProcessName(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getProcessNameByPid:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getProcessNameByPid(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_dump:
{
data.enforceInterface(descriptor);
java.lang.String _result = this.dump();
reply.writeNoException();
reply.writeString(_result);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements com.qihoo360.loader2.IPluginHost
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
@Override public void installBinder(java.lang.String name, android.os.IBinder binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeStrongBinder(binder);
mRemote.transact(Stub.TRANSACTION_installBinder, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.os.IBinder fetchBinder(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_fetchBinder, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long fetchPersistentCookie() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_fetchPersistentCookie, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public com.qihoo360.loader2.IPluginClient startPluginProcess(java.lang.String plugin, int process, com.qihoo360.loader2.PluginBinderInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.qihoo360.loader2.IPluginClient _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(plugin);
_data.writeInt(process);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startPluginProcess, _data, _reply, 0);
_reply.readException();
_result = com.qihoo360.loader2.IPluginClient.Stub.asInterface(_reply.readStrongBinder());
if ((0!=_reply.readInt())) {
info.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String attachPluginProcess(java.lang.String process, int index, android.os.IBinder binder, java.lang.String def) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(process);
_data.writeInt(index);
_data.writeStrongBinder(binder);
_data.writeString(def);
mRemote.transact(Stub.TRANSACTION_attachPluginProcess, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<com.qihoo360.replugin.model.PluginInfo> listPlugins() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<com.qihoo360.replugin.model.PluginInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_listPlugins, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(com.qihoo360.replugin.model.PluginInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void regActivity(int index, java.lang.String plugin, java.lang.String container, java.lang.String activity) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
_data.writeString(plugin);
_data.writeString(container);
_data.writeString(activity);
mRemote.transact(Stub.TRANSACTION_regActivity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregActivity(int index, java.lang.String plugin, java.lang.String container, java.lang.String activity) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
_data.writeString(plugin);
_data.writeString(container);
_data.writeString(activity);
mRemote.transact(Stub.TRANSACTION_unregActivity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void regService(int index, java.lang.String plugin, java.lang.String service) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
_data.writeString(plugin);
_data.writeString(service);
mRemote.transact(Stub.TRANSACTION_regService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregService(int index, java.lang.String plugin, java.lang.String service) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
_data.writeString(plugin);
_data.writeString(service);
mRemote.transact(Stub.TRANSACTION_unregService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void regPluginBinder(com.qihoo360.loader2.PluginBinderInfo info, android.os.IBinder binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((info!=null)) {
_da
