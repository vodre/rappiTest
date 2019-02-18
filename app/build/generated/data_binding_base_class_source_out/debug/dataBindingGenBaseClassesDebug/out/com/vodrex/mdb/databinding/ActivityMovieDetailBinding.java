package com.vodrex.mdb.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.vodrex.mdb.ui.viewmodel.MovieDetailViewModel;

public abstract class ActivityMovieDetailBinding extends ViewDataBinding {
  @NonNull
  public final ImageView avatarOwner;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final RelativeLayout mainview;

  @NonNull
  public final NestedScrollView movieDetailsScroll;

  @NonNull
  public final RelativeLayout viewA;

  @NonNull
  public final LinearLayout viewB;

  @Bindable
  protected View.OnClickListener mListener;

  @Bindable
  protected MovieDetailViewModel mViewModel;

  protected ActivityMovieDetailBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView avatarOwner, FloatingActionButton fab,
      RelativeLayout mainview, NestedScrollView movieDetailsScroll, RelativeLayout viewA,
      LinearLayout viewB) {
    super(_bindingComponent, _root, _localFieldCount);
    this.avatarOwner = avatarOwner;
    this.fab = fab;
    this.mainview = mainview;
    this.movieDetailsScroll = movieDetailsScroll;
    this.viewA = viewA;
    this.viewB = viewB;
  }

  public abstract void setListener(@Nullable View.OnClickListener listener);

  @Nullable
  public View.OnClickListener getListener() {
    return mListener;
  }

  public abstract void setViewModel(@Nullable MovieDetailViewModel viewModel);

  @Nullable
  public MovieDetailViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMovieDetailBinding>inflate(inflater, com.vodrex.mdb.R.layout.activity_movie_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMovieDetailBinding>inflate(inflater, com.vodrex.mdb.R.layout.activity_movie_detail, null, false, component);
  }

  public static ActivityMovieDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityMovieDetailBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityMovieDetailBinding)bind(component, view, com.vodrex.mdb.R.layout.activity_movie_detail);
  }
}
