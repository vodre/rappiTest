package com.vodrex.mdb.db.local.dao;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ensar.tmdbkotlin.db.GenreTypeConverters;
import com.vodrex.mdb.db.entities.Movie;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMovie;

  private final GenreTypeConverters __genreTypeConverters = new GenreTypeConverters();

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovie = new EntityInsertionAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Movie`(`id`,`title`,`voteAverage`,`genreIds`,`genres`,`backdropPath`,`releaseDate`,`overview`,`posterPath`,`listType`,`orderId`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getVoteAverage());
        }
        final String _tmp;
        _tmp = __genreTypeConverters.someObjectListToString(value.getGenreIds());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        if (value.getGenres() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getGenres());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBackdropPath());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getReleaseDate());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOverview());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getPosterPath());
        }
        if (value.getListType() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getListType());
        }
        stmt.bindLong(11, value.getOrderId());
      }
    };
  }

  @Override
  public void insertMovies(List<Movie> example) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovie.insert(example);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Single<List<Movie>> getMovies(String listType) {
    final String _sql = "SELECT * FROM Movie WHERE listType = ? ORDER BY orderId";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (listType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, listType);
    }
    return Single.fromCallable(new Callable<List<Movie>>() {
      @Override
      public List<Movie> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfVoteAverage = _cursor.getColumnIndexOrThrow("voteAverage");
          final int _cursorIndexOfGenreIds = _cursor.getColumnIndexOrThrow("genreIds");
          final int _cursorIndexOfGenres = _cursor.getColumnIndexOrThrow("genres");
          final int _cursorIndexOfBackdropPath = _cursor.getColumnIndexOrThrow("backdropPath");
          final int _cursorIndexOfReleaseDate = _cursor.getColumnIndexOrThrow("releaseDate");
          final int _cursorIndexOfOverview = _cursor.getColumnIndexOrThrow("overview");
          final int _cursorIndexOfPosterPath = _cursor.getColumnIndexOrThrow("posterPath");
          final int _cursorIndexOfListType = _cursor.getColumnIndexOrThrow("listType");
          final int _cursorIndexOfOrderId = _cursor.getColumnIndexOrThrow("orderId");
          final java.util.List<com.vodrex.mdb.db.entities.Movie> _result = new java.util.ArrayList<com.vodrex.mdb.db.entities.Movie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final com.vodrex.mdb.db.entities.Movie _item;
            final java.lang.Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final java.lang.String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final java.lang.String _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getString(_cursorIndexOfVoteAverage);
            final java.util.List<java.lang.Integer> _tmpGenreIds;
            final java.lang.String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfGenreIds);
            _tmpGenreIds = __genreTypeConverters.stringToSomeObjectList(_tmp);
            final java.lang.String _tmpGenres;
            _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
            final java.lang.String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final java.lang.String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final java.lang.String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final java.lang.String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final java.lang.String _tmpListType;
            _tmpListType = _cursor.getString(_cursorIndexOfListType);
            final int _tmpOrderId;
            _tmpOrderId = _cursor.getInt(_cursorIndexOfOrderId);
            _item = new com.vodrex.mdb.db.entities.Movie(_tmpId,_tmpTitle,_tmpVoteAverage,_tmpGenreIds,_tmpGenres,_tmpBackdropPath,_tmpReleaseDate,_tmpOverview,_tmpPosterPath,_tmpListType,_tmpOrderId);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Single<Movie> getMovie(long id) {
    final String _sql = "SELECT * FROM Movie WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return Single.fromCallable(new Callable<Movie>() {
      @Override
      public Movie call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfVoteAverage = _cursor.getColumnIndexOrThrow("voteAverage");
          final int _cursorIndexOfGenreIds = _cursor.getColumnIndexOrThrow("genreIds");
          final int _cursorIndexOfGenres = _cursor.getColumnIndexOrThrow("genres");
          final int _cursorIndexOfBackdropPath = _cursor.getColumnIndexOrThrow("backdropPath");
          final int _cursorIndexOfReleaseDate = _cursor.getColumnIndexOrThrow("releaseDate");
          final int _cursorIndexOfOverview = _cursor.getColumnIndexOrThrow("overview");
          final int _cursorIndexOfPosterPath = _cursor.getColumnIndexOrThrow("posterPath");
          final int _cursorIndexOfListType = _cursor.getColumnIndexOrThrow("listType");
          final int _cursorIndexOfOrderId = _cursor.getColumnIndexOrThrow("orderId");
          final com.vodrex.mdb.db.entities.Movie _result;
          if(_cursor.moveToFirst()) {
            final java.lang.Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final java.lang.String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final java.lang.String _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getString(_cursorIndexOfVoteAverage);
            final java.util.List<java.lang.Integer> _tmpGenreIds;
            final java.lang.String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfGenreIds);
            _tmpGenreIds = __genreTypeConverters.stringToSomeObjectList(_tmp);
            final java.lang.String _tmpGenres;
            _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
            final java.lang.String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final java.lang.String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final java.lang.String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final java.lang.String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final java.lang.String _tmpListType;
            _tmpListType = _cursor.getString(_cursorIndexOfListType);
            final int _tmpOrderId;
            _tmpOrderId = _cursor.getInt(_cursorIndexOfOrderId);
            _result = new com.vodrex.mdb.db.entities.Movie(_tmpId,_tmpTitle,_tmpVoteAverage,_tmpGenreIds,_tmpGenres,_tmpBackdropPath,_tmpReleaseDate,_tmpOverview,_tmpPosterPath,_tmpListType,_tmpOrderId);
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
