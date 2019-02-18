package com.vodrex.mdb.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\u0006\u0010\u0016\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/vodrex/mdb/ui/viewmodel/MoviesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/vodrex/mdb/ui/MoviesRepository;", "(Lcom/vodrex/mdb/ui/MoviesRepository;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "genresLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/vodrex/mdb/db/entities/Genre;", "getGenresLiveData", "()Landroidx/lifecycle/MutableLiveData;", "moviesLiveData", "Lcom/vodrex/mdb/db/entities/Movie;", "getMoviesLiveData", "getGenres", "", "getMovieList", "type", "Lcom/vodrex/mdb/utils/MovieListType;", "onCleared", "refreshData", "app_debug"})
public final class MoviesViewModel extends androidx.lifecycle.ViewModel {
    private io.reactivex.disposables.CompositeDisposable disposable;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.vodrex.mdb.db.entities.Movie>> moviesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.vodrex.mdb.db.entities.Genre>> genresLiveData = null;
    private final com.vodrex.mdb.ui.MoviesRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.vodrex.mdb.db.entities.Movie>> getMoviesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.vodrex.mdb.db.entities.Genre>> getGenresLiveData() {
        return null;
    }
    
    public final void getMovieList(@org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.utils.MovieListType type) {
    }
    
    private final void getGenres() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void refreshData() {
    }
    
    public MoviesViewModel(@org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.ui.MoviesRepository repository) {
        super();
    }
}