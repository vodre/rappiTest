package com.vodrex.mdb.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b2\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/vodrex/mdb/ui/MoviesRepository;", "", "movieRepository", "Lcom/vodrex/mdb/db/MovieRepository;", "genreRepository", "Lcom/vodrex/mdb/db/GenreRepository;", "(Lcom/vodrex/mdb/db/MovieRepository;Lcom/vodrex/mdb/db/GenreRepository;)V", "getGenres", "Lio/reactivex/Observable;", "", "Lcom/vodrex/mdb/db/entities/Genre;", "getMovieDetails", "Lcom/vodrex/mdb/db/entities/Movie;", "id", "", "getMovieList", "type", "Lcom/vodrex/mdb/utils/MovieListType;", "getTrailers", "Lcom/vodrex/mdb/db/entities/Trailer;", "app_debug"})
public final class MoviesRepository {
    private final com.vodrex.mdb.db.MovieRepository movieRepository = null;
    private final com.vodrex.mdb.db.GenreRepository genreRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.vodrex.mdb.db.entities.Movie>> getMovieList(@org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.utils.MovieListType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.vodrex.mdb.db.entities.Genre>> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.vodrex.mdb.db.entities.Movie> getMovieDetails(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.vodrex.mdb.db.entities.Trailer>> getTrailers(long id) {
        return null;
    }
    
    public MoviesRepository(@org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.db.MovieRepository movieRepository, @org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.db.GenreRepository genreRepository) {
        super();
    }
}