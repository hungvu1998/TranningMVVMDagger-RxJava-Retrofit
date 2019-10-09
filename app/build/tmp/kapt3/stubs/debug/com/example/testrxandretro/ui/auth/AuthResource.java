package com.example.testrxandretro.ui.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u0011*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0010\u0011B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/example/testrxandretro/ui/auth/AuthResource;", "T", "", "status", "Lcom/example/testrxandretro/ui/auth/AuthResource$AuthStatus;", "data", "message", "", "(Lcom/example/testrxandretro/ui/auth/AuthResource$AuthStatus;Ljava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getStatus", "()Lcom/example/testrxandretro/ui/auth/AuthResource$AuthStatus;", "AuthStatus", "Companion", "app_debug"})
public final class AuthResource<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.testrxandretro.ui.auth.AuthResource.AuthStatus status = null;
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    public static final com.example.testrxandretro.ui.auth.AuthResource.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testrxandretro.ui.auth.AuthResource.AuthStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public AuthResource(@org.jetbrains.annotations.NotNull()
    com.example.testrxandretro.ui.auth.AuthResource.AuthStatus status, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/testrxandretro/ui/auth/AuthResource$AuthStatus;", "", "(Ljava/lang/String;I)V", "AUTHENTICATED", "ERROR", "LOADING", "NOT_AUTHENTICATED", "app_debug"})
    public static enum AuthStatus {
        /*public static final*/ AUTHENTICATED /* = new AUTHENTICATED() */,
        /*public static final*/ ERROR /* = new ERROR() */,
        /*public static final*/ LOADING /* = new LOADING() */,
        /*public static final*/ NOT_AUTHENTICATED /* = new NOT_AUTHENTICATED() */;
        
        AuthStatus() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\u0007J)\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005\u00a8\u0006\u000e"}, d2 = {"Lcom/example/testrxandretro/ui/auth/AuthResource$Companion;", "", "()V", "authenticated", "Lcom/example/testrxandretro/ui/auth/AuthResource;", "T", "data", "(Ljava/lang/Object;)Lcom/example/testrxandretro/ui/auth/AuthResource;", "error", "msg", "", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/example/testrxandretro/ui/auth/AuthResource;", "loading", "logout", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.testrxandretro.ui.auth.AuthResource<T> authenticated(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.testrxandretro.ui.auth.AuthResource<T> error(@org.jetbrains.annotations.NotNull()
        java.lang.String msg, @org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.testrxandretro.ui.auth.AuthResource<T> loading(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.testrxandretro.ui.auth.AuthResource<T> logout() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}