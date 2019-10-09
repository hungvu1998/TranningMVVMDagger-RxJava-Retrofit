package com.example.testrxandretro.network.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/testrxandretro/network/auth/AuthApi;", "", "getUser", "Lio/reactivex/Flowable;", "Lcom/example/testrxandretro/model/User;", "id", "", "app_debug"})
public abstract interface AuthApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{id}")
    public abstract io.reactivex.Flowable<com.example.testrxandretro.model.User> getUser(@retrofit2.http.Path(value = "id")
    int id);
}