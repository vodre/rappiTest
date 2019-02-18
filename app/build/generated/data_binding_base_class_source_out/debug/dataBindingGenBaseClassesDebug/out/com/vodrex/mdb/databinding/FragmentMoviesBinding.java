package com.vodrex.mdb.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.lottie.LottieAnimationView;

public abstract class FragmentMoviesBinding extends ViewDataBinding {
  @NonNull
  public final LottieAnimationView animationView;

  @NonNull
  public final RecyclerView moviesRecyclerView;

  @NonNull
  public final SwipeRefreshLayout moviesSwipeRefreshLayout;

  protected FragmentMoviesBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LottieAnimationView animationView, RecyclerView moviesRecyclerView,
      SwipeRefreshLayout moviesSwipeRefreshLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.animationView = animationView;
    this.moviesRecyclerView = moviesRecyclerView;
    this.moviesSwipeRefreshLayout = moviesSwipeRefreshLayout;
  }

  @NonNull
  public static FragmentMoviesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentMoviesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentMoviesBinding>inflate(inflater, com.vodrex.mdb.R.layout.fragment_movies, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMoviesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentMoviesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentMoviesBinding>inflate(inflater, com.vodrex.mdb.R.layout.fragment_movies, null, false, component);
  }

  public static FragmentMoviesBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentMoviesBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentMoviesBinding)bind(component, view, com.vodrex.mdb.R.layout.fragment_movies);
  }
}
