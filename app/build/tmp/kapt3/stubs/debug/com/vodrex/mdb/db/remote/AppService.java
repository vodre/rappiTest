package com.vodrex.mdb.db.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH\'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/vodrex/mdb/db/remote/AppService;", "", "getGenres", "Lio/reactivex/Observable;", "Lcom/vodrex/mdb/db/entities/GenresResponse;", "getMovie", "Lcom/vodrex/mdb/db/entities/Movie;", "id", "", "getMovieList", "Lcom/vodrex/mdb/db/entities/MoviesResponse;", "type", "", "getTrailers", "Lcom/vodrex/mdb/db/entities/TrailersResponse;", "app_debug"})
public abstract interface AppService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{id}")
    public abstract io.reactivex.Observable<com.vodrex.mdb.db.entities.Movie> getMovie(@retrofit2.http.Path(value = "id")
    long id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{type}")
    public abstract io.reactivex.Observable<com.vodrex.mdb.db.entities.MoviesResponse> getMovieList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "type", encoded = true)
    java.lang.String type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "genre/movie/list")
    public abstract io.reactivex.Observable<com.vodrex.mdb.db.entities.GenresResponse> getGenres();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{id}/videos")
    public abstract io.reactivex.Observable<com.vodrex.mdb.db.entities.TrailersResponse> getTrailers(@retrofit2.http.Path(value = "id", encoded = true)
    long id);
}