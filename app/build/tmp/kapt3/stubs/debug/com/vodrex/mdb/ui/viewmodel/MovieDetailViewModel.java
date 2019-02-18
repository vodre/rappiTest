package com.vodrex.mdb.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001f\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lcom/vodrex/mdb/ui/viewmodel/MovieDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/vodrex/mdb/ui/MoviesRepository;", "(Lcom/vodrex/mdb/ui/MoviesRepository;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "isVisibleFAB", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "movieId", "Landroidx/databinding/ObservableInt;", "getMovieId", "()Landroidx/databinding/ObservableInt;", "posterUrl", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getPosterUrl", "()Landroidx/databinding/ObservableField;", "textOverview", "getTextOverview", "title", "getTitle", "trailerId", "getTrailerId", "getMovieDetails", "", "id", "", "getTrailers", "app_debug"})
public final class MovieDetailViewModel extends androidx.lifecycle.ViewModel {
    private io.reactivex.disposables.CompositeDisposable disposable;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> posterUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> textOverview = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> title = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableInt movieId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean isVisibleFAB = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> trailerId = null;
    private final com.vodrex.mdb.ui.MoviesRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getPosterUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTextOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableInt getMovieId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isVisibleFAB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTrailerId() {
        return null;
    }
    
    public final void getMovieDetails(long id) {
    }
    
    public final void getTrailers(long id) {
    }
    
    public MovieDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.ui.MoviesRepository repository) {
        super();
    }
}