package com.vodrex.mdb.db.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.vodrex.mdb.db.local.dao.GenreDao;
import com.vodrex.mdb.db.local.dao.GenreDao_Impl;
import com.vodrex.mdb.db.local.dao.MovieDao;
import com.vodrex.mdb.db.local.dao.MovieDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class AppDatabase_Impl extends AppDatabase {
  private volatile MovieDao _movieDao;

  private volatile GenreDao _genreDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Movie` (`id` INTEGER, `title` TEXT, `voteAverage` TEXT, `genreIds` TEXT, `genres` TEXT, `backdropPath` TEXT, `releaseDate` TEXT, `overview` TEXT, `posterPath` TEXT, `listType` TEXT, `orderId` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Genre` (`id` INTEGER, `name` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"fff744791a63f5553f27a1c65373ad99\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Movie`");
        _db.execSQL("DROP TABLE IF EXISTS `Genre`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMovie = new HashMap<String, TableInfo.Column>(11);
        _columnsMovie.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsMovie.put("title", new TableInfo.Column("title", "TEXT", false, 0));
        _columnsMovie.put("voteAverage", new TableInfo.Column("voteAverage", "TEXT", false, 0));
        _columnsMovie.put("genreIds", new TableInfo.Column("genreIds", "TEXT", false, 0));
        _columnsMovie.put("genres", new TableInfo.Column("genres", "TEXT", false, 0));
        _columnsMovie.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0));
        _columnsMovie.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0));
        _columnsMovie.put("overview", new TableInfo.Column("overview", "TEXT", false, 0));
        _columnsMovie.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0));
        _columnsMovie.put("listType", new TableInfo.Column("listType", "TEXT", false, 0));
        _columnsMovie.put("orderId", new TableInfo.Column("orderId", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovie = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovie = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovie = new TableInfo("Movie", _columnsMovie, _foreignKeysMovie, _indicesMovie);
        final TableInfo _existingMovie = TableInfo.read(_db, "Movie");
        if (! _infoMovie.equals(_existingMovie)) {
          throw new IllegalStateException("Migration didn't properly handle Movie(com.vodrex.mdb.db.entities.Movie).\n"
                  + " Expected:\n" + _infoMovie + "\n"
                  + " Found:\n" + _existingMovie);
        }
        final HashMap<String, TableInfo.Column> _columnsGenre = new HashMap<String, TableInfo.Column>(2);
        _columnsGenre.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsGenre.put("name", new TableInfo.Column("name", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGenre = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGenre = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGenre = new TableInfo("Genre", _columnsGenre, _foreignKeysGenre, _indicesGenre);
        final TableInfo _existingGenre = TableInfo.read(_db, "Genre");
        if (! _infoGenre.equals(_existingGenre)) {
          throw new IllegalStateException("Migration didn't properly handle Genre(com.vodrex.mdb.db.entities.Genre).\n"
                  + " Expected:\n" + _infoGenre + "\n"
                  + " Found:\n" + _existingGenre);
        }
      }
    }, "fff744791a63f5553f27a1c65373ad99", "ef62ad24ec4e5a63d7b2b8f54d6fef94");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "Movie","Genre");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Movie`");
      _db.execSQL("DELETE FROM `Genre`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MovieDao movieDao() {
    if (_movieDao != null) {
      return _movieDao;
    } else {
      synchronized(this) {
        if(_movieDao == null) {
          _movieDao = new MovieDao_Impl(this);
        }
        return _movieDao;
      }
    }
  }

  @Override
  public GenreDao genreDao() {
    if (_genreDao != null) {
      return _genreDao;
    } else {
      synchronized(this) {
        if(_genreDao == null) {
          _genreDao = new GenreDao_Impl(this);
        }
        return _genreDao;
      }
    }
  }
}
