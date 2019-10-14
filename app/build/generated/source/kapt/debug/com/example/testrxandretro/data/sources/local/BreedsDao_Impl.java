package com.example.testrxandretro.data.sources.local;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.testrxandretro.data.model.Breeds;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings("unchecked")
public final class BreedsDao_Impl implements BreedsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfBreeds;

  private final SharedSQLiteStatement __preparedStmtOfDeleteData;

  public BreedsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBreeds = new EntityInsertionAdapter<Breeds>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Breeds`(`id`,`breedName`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Breeds value) {
        stmt.bindLong(1, value.getId());
        if (value.getBreedName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBreedName());
        }
      }
    };
    this.__preparedStmtOfDeleteData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Breeds";
        return _query;
      }
    };
  }

  @Override
  public void insertBreed(Breeds breeds) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfBreeds.insert(breeds);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteData() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteData.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteData.release(_stmt);
    }
  }

  @Override
  public Breeds[] loadAllBreeds() {
    final String _sql = "SELECT * FROM Breeds";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfBreedName = _cursor.getColumnIndexOrThrow("breedName");
      final Breeds[] _result = new Breeds[_cursor.getCount()];
      int _index = 0;
      while(_cursor.moveToNext()) {
        final Breeds _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpBreedName;
        _tmpBreedName = _cursor.getString(_cursorIndexOfBreedName);
        _item = new Breeds(_tmpId,_tmpBreedName);
        _result[_index] = _item;
        _index ++;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
