package com.vodrex.mdb;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.vodrex.mdb.databinding.ActivityMovieDetailBindingImpl;
import com.vodrex.mdb.databinding.FragmentMoviesBindingImpl;
import com.vodrex.mdb.databinding.ItemMovieBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMOVIEDETAIL = 1;

  private static final int LAYOUT_FRAGMENTMOVIES = 2;

  private static final int LAYOUT_ITEMMOVIE = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.vodrex.mdb.R.layout.activity_movie_detail, LAYOUT_ACTIVITYMOVIEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.vodrex.mdb.R.layout.fragment_movies, LAYOUT_FRAGMENTMOVIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.vodrex.mdb.R.layout.item_movie, LAYOUT_ITEMMOVIE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMOVIEDETAIL: {
          if ("layout/activity_movie_detail_0".equals(tag)) {
            return new ActivityMovieDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_movie_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMOVIES: {
          if ("layout/fragment_movies_0".equals(tag)) {
            return new FragmentMoviesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_movies is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMOVIE: {
          if ("layout/item_movie_0".equals(tag)) {
            return new ItemMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_movie is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "item");
      sKeys.put(2, "listener");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_movie_detail_0", com.vodrex.mdb.R.layout.activity_movie_detail);
      sKeys.put("layout/fragment_movies_0", com.vodrex.mdb.R.layout.fragment_movies);
      sKeys.put("layout/item_movie_0", com.vodrex.mdb.R.layout.item_movie);
    }
  }
}
