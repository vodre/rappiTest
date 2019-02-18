package com.vodrex.mdb.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.vodrex.mdb.db.entities.Movie;
import com.vodrex.mdb.ui.MoviesAdapter;

public abstract class ItemMovieBinding extends ViewDataBinding {
  @NonNull
  public final ImageView movieImage;

  @Bindable
  protected Movie mItem;

  @Bindable
  protected MoviesAdapter.OnClickListener mListener;

  protected ItemMovieBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView movieImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.movieImage = movieImage;
  }

  public abstract void setItem(@Nullable Movie item);

  @Nullable
  public Movie getItem() {
    return mItem;
  }

  public abstract void setListener(@Nullable MoviesAdapter.OnClickListener listener);

  @Nullable
  public MoviesAdapter.OnClickListener getListener() {
    return mListener;
  }

  @NonNull
  public static ItemMovieBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemMovieBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemMovieBinding>inflate(inflater, com.vodrex.mdb.R.layout.item_movie, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMovieBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemMovieBinding>inflate(inflater, com.vodrex.mdb.R.layout.item_movie, null, false, component);
  }

  public static ItemMovieBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemMovieBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemMovieBinding)bind(component, view, com.vodrex.mdb.R.layout.item_movie);
  }
}
