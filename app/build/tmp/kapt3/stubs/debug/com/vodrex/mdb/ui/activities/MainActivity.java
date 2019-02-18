package com.vodrex.mdb.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/vodrex/mdb/ui/activities/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "fragment", "Lcom/vodrex/mdb/ui/fragments/MoviesFragment;", "listType", "Landroidx/lifecycle/MutableLiveData;", "Lcom/vodrex/mdb/utils/MovieListType;", "mOnNavigationItemSelectedListener", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "addFiltersButton", "", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getMovieList", "type", "lookCategories", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.vodrex.mdb.ui.fragments.MoviesFragment fragment;
    private androidx.lifecycle.MutableLiveData<com.vodrex.mdb.utils.MovieListType> listType;
    private final com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addFiltersButton(androidx.appcompat.widget.Toolbar toolbar) {
    }
    
    private final void lookCategories() {
    }
    
    private final void getMovieList(com.vodrex.mdb.utils.MovieListType type) {
    }
    
    public MainActivity() {
        super();
    }
}