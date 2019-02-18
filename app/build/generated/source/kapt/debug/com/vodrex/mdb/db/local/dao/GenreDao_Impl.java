package com.vodrex.mdb.db.local.dao;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.vodrex.mdb.db.entities.Genre;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public final class GenreDao_Impl implements GenreDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfGenre;

  public GenreDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGenre = new EntityInsertionAdapter<Genre>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Genre`(`id`,`name`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Genre value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
  }

  @Override
  public void insertGenres(List<Genre> example) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfGenre.insert(example);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Single<List<Genre>> getGenres() {
    final String _sql = "SELECT * FROM Genre";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Single.fromCallable(new Callable<List<Genre>>() {
      @Override
      public List<Genre> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final java.util.List<com.vodrex.mdb.db.entities.Genre> _result = new java.util.ArrayList<com.vodrex.mdb.db.entities.Genre>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final com.vodrex.mdb.db.entities.Genre _item;
            final java.lang.Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final java.lang.String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            _item = new com.vodrex.mdb.db.entities.Genre(_tmpId,_tmpName);
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
}
