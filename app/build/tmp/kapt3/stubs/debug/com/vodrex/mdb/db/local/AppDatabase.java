package com.vodrex.mdb.db.local;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.ensar.tmdbkotlin.db.GenreTypeConverters.class})
@androidx.room.Database(entities = {com.vodrex.mdb.db.entities.Movie.class, com.vodrex.mdb.db.entities.Genre.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/vodrex/mdb/db/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "genreDao", "Lcom/vodrex/mdb/db/local/dao/GenreDao;", "movieDao", "Lcom/vodrex/mdb/db/local/dao/MovieDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vodrex.mdb.db.local.dao.MovieDao movieDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vodrex.mdb.db.local.dao.GenreDao genreDao();
    
    public AppDatabase() {
        super();
    }
}