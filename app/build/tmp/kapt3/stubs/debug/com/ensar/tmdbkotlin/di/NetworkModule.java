package com.ensar.tmdbkotlin.di;

import java.lang.System;

/**
 * * Created by ebayhan on 22.01.2019.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/ensar/tmdbkotlin/di/NetworkModule;", "", "()V", "getApiKeyInterceptor", "Lokhttp3/Interceptor;", "getGson", "Lcom/google/gson/Gson;", "getHttpLoggingInterceptor", "getLocal", "Lcom/vodrex/mdb/db/local/AppDatabase;", "context", "Landroid/content/Context;", "getOkHttpClient", "Lokhttp3/OkHttpClient;", "getRemote", "Lcom/vodrex/mdb/db/remote/AppService;", "app_debug"})
public final class NetworkModule {
    public static final com.ensar.tmdbkotlin.di.NetworkModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vodrex.mdb.db.remote.AppService getRemote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vodrex.mdb.db.local.AppDatabase getLocal(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final okhttp3.Interceptor getApiKeyInterceptor() {
        return null;
    }
    
    private final okhttp3.Interceptor getHttpLoggingInterceptor() {
        return null;
    }
    
    private final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    private final com.google.gson.Gson getGson() {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
}