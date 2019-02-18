package com.vodrex.mdb.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/vodrex/mdb/db/MovieRepository;", "", "remote", "Lcom/vodrex/mdb/db/remote/AppService;", "local", "Lcom/vodrex/mdb/db/local/AppDatabase;", "(Lcom/vodrex/mdb/db/remote/AppService;Lcom/vodrex/mdb/db/local/AppDatabase;)V", "getMovie", "Lio/reactivex/Observable;", "Lcom/vodrex/mdb/db/entities/Movie;", "id", "", "getMovieList", "", "listType", "Lcom/vodrex/mdb/utils/MovieListType;", "getMoviesFromApi", "getMoviesFromDb", "getTrailers", "Lcom/vodrex/mdb/db/entities/Trailer;", "storeMoviesInDb", "", "movies", "app_debug"})
public final class MovieRepository {
    private final com.vodrex.mdb.db.remote.AppService remote = null;
    private final com.vodrex.mdb.db.local.AppDatabase local = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.vodrex.mdb.db.entities.Movie> getMovie(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.vodrex.mdb.db.entities.Movie>> getMovieList(@org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.utils.MovieListType listType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.vodrex.mdb.db.entities.Trailer>> getTrailers(long id) {
        return null;
    }
    
    private final io.reactivex.Observable<java.util.List<com.vodrex.mdb.db.entities.Movie>> getMoviesFromApi(com.vodrex.mdb.utils.MovieListType listType) {
        return null;
    }
    
    private final io.reactivex.Observable<java.util.List<com.vodrex.mdb.db.entities.Movie>> getMoviesFromDb(com.vodrex.mdb.utils.MovieListType listType) {
        return null;
    }
    
    private final void storeMoviesInDb(java.util.List<com.vodrex.mdb.db.entities.Movie> movies) {
    }
    
    public MovieRepository(@org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.db.remote.AppService remote, @org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.db.local.AppDatabase local) {
        super();
    }
}