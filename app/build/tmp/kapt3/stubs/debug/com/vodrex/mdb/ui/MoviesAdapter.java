package com.vodrex.mdb.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0016R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/vodrex/mdb/ui/MoviesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/vodrex/mdb/db/entities/Movie;", "Lcom/vodrex/mdb/ui/MovieViewHolder;", "listener", "Lcom/vodrex/mdb/ui/MoviesAdapter$OnClickListener;", "(Lcom/vodrex/mdb/ui/MoviesAdapter$OnClickListener;)V", "genres", "", "Lcom/vodrex/mdb/db/entities/Genre;", "getGenres", "()Ljava/util/List;", "setGenres", "(Ljava/util/List;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnClickListener", "app_debug"})
public final class MoviesAdapter extends androidx.recyclerview.widget.ListAdapter<com.vodrex.mdb.db.entities.Movie, com.vodrex.mdb.ui.MovieViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.vodrex.mdb.db.entities.Genre> genres;
    private final com.vodrex.mdb.ui.MoviesAdapter.OnClickListener listener = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vodrex.mdb.db.entities.Genre> getGenres() {
        return null;
    }
    
    public final void setGenres(@org.jetbrains.annotations.Nullable()
    java.util.List<com.vodrex.mdb.db.entities.Genre> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vodrex.mdb.ui.MovieViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.ui.MovieViewHolder holder, int position) {
    }
    
    public MoviesAdapter(@org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.ui.MoviesAdapter.OnClickListener listener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/vodrex/mdb/ui/MoviesAdapter$OnClickListener;", "", "onItemClicked", "", "view", "Landroid/view/View;", "item", "Lcom/vodrex/mdb/db/entities/Movie;", "app_debug"})
    public static abstract interface OnClickListener {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.vodrex.mdb.db.entities.Movie item);
    }
}