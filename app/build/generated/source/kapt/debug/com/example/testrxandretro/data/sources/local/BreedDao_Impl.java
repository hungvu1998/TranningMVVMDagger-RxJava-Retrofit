package com.example.testrxandretro.data.sources.local;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.testrxandretro.data.model.BreedModel;
import io.reactivex.Observable;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public final class BreedDao_Impl implements BreedDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfBreedModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteData;

  public BreedDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBreedModel = new EntityInsertionAdapter<BreedModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `BreedModel`(`id`,`breedName`,`img`,`imgbyte`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BreedModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getBreedName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBreedName());
        }
        if (value.getImg() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImg());
        }
        if (value.getImgbyte() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindBlob(4, value.getImgbyte());
        }
      }
    };
    this.__preparedStmtOfDeleteData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM BreedModel";
        return _query;
      }
    };
  }

  @Override
  public void insertModel(BreedModel breedModel) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfBreedModel.insert(breedModel);
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
  public Observable<BreedModel> selectOne(int i_d) {
    final String _sql = "SELECT * FROM BreedModel where id =? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, i_d);
    return RxRoom.createObservable(__db, new String[]{"BreedModel"}, new Callable<BreedModel>() {
      @Override
      public BreedModel call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfBreedName = _cursor.getColumnIndexOrThrow("breedName");
          final int _cursorIndexOfImg = _cursor.getColumnIndexOrThrow("img");
          final int _cursorIndexOfImgbyte = _cursor.getColumnIndexOrThrow("imgbyte");
          final BreedModel _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpBreedName;
            _tmpBreedName = _cursor.getString(_cursorIndexOfBreedName);
            final String _tmpImg;
            _tmpImg = _cursor.getString(_cursorIndexOfImg);
            final byte[] _tmpImgbyte;
            _tmpImgbyte = _cursor.getBlob(_cursorIndexOfImgbyte);
            _result = new BreedModel(_tmpId,_tmpBreedName,_tmpImg,_tmpImgbyte);
          } else {
            _result = null;
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
  public BreedModel[] loadAllUsers() {
    final String _sql = "SELECT * FROM BreedModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfBreedName = _cursor.getColumnIndexOrThrow("breedName");
      final int _cursorIndexOfImg = _cursor.getColumnIndexOrThrow("img");
      final int _cursorIndexOfImgbyte = _cursor.getColumnIndexOrThrow("imgbyte");
      final BreedModel[] _result = new BreedModel[_cursor.getCount()];
      int _index = 0;
      while(_cursor.moveToNext()) {
        final BreedModel _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpBreedName;
        _tmpBreedName = _cursor.getString(_cursorIndexOfBreedName);
        final String _tmpImg;
        _tmpImg = _cursor.getString(_cursorIndexOfImg);
        final byte[] _tmpImgbyte;
        _tmpImgbyte = _cursor.getBlob(_cursorIndexOfImgbyte);
        _item = new BreedModel(_tmpId,_tmpBreedName,_tmpImg,_tmpImgbyte);
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
