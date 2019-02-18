package com.vodrex.mdb.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0002J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0002J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/vodrex/mdb/db/GenreRepository;", "", "remote", "Lcom/vodrex/mdb/db/remote/AppService;", "local", "Lcom/vodrex/mdb/db/local/AppDatabase;", "(Lcom/vodrex/mdb/db/remote/AppService;Lcom/vodrex/mdb/db/local/AppDatabase;)V", "getGenres", "Lio/reactivex/Observable;", "", "Lcom/vodrex/mdb/db/entities/Genre;", "getGenresFromApi", "getGenresFromDb", "storeGenresInDb", "", "genres", "app_debug"})
public final class GenreRepository {
    private final com.vodrex.mdb.db.remote.AppService remote = null;
    private final com.vodrex.mdb.db.local.AppDatabase local = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.vodrex.mdb.db.entities.Genre>> getGenres() {
        return null;
    }
    
    private final io.reactivex.Observable<java.util.List<com.vodrex.mdb.db.entities.Genre>> getGenresFromDb() {
        return null;
    }
    
    private final io.reactivex.Observable<java.util.List<com.vodrex.mdb.db.entities.Genre>> getGenresFromApi() {
        return null;
    }
    
    private final void storeGenresInDb(java.util.List<com.vodrex.mdb.db.entities.Genre> genres) {
    }
    
    public GenreRepository(@org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.db.remote.AppService remote, @org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.db.local.AppDatabase local) {
        super();
    }
}