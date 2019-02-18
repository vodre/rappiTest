package com.vodrex.mdb.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/vodrex/mdb/ui/MovieViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/vodrex/mdb/databinding/ItemMovieBinding;", "(Lcom/vodrex/mdb/databinding/ItemMovieBinding;)V", "bind", "", "item", "Lcom/vodrex/mdb/db/entities/Movie;", "genres", "", "Lcom/vodrex/mdb/db/entities/Genre;", "listener", "Lcom/vodrex/mdb/ui/MoviesAdapter$OnClickListener;", "Companion", "app_debug"})
public final class MovieViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.vodrex.mdb.databinding.ItemMovieBinding itemBinding = null;
    public static final com.vodrex.mdb.ui.MovieViewHolder.Companion Companion = null;
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.db.entities.Movie item, @org.jetbrains.annotations.Nullable()
    java.util.List<com.vodrex.mdb.db.entities.Genre> genres, @org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.ui.MoviesAdapter.OnClickListener listener) {
    }
    
    public MovieViewHolder(@org.jetbrains.annotations.NotNull()
    com.vodrex.mdb.databinding.ItemMovieBinding itemBinding) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/vodrex/mdb/ui/MovieViewHolder$Companion;", "", "()V", "create", "Lcom/vodrex/mdb/ui/MovieViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.vodrex.mdb.ui.MovieViewHolder create(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}